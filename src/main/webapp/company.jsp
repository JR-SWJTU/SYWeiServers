<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>房屋租赁微信公众号SAAS平台</title>
    <link rel="shortcut icon" href="./source/icon.png" />
    <link rel="stylesheet" href="./css/cssreset.css" />
    <link rel="stylesheet" href="./lib/muse/fonts.css" />
    <link rel="stylesheet" href="./lib/muse/muse-ui.css" />
    <link rel="stylesheet" href="./lib/muse/theme-carbon.min.css" />
    <link rel="stylesheet" href="./css/share.css" />
    <link rel="stylesheet" href="./css/company.css"/>
</head>
<body>
<div id="app">
    <div class="mu-appbar example-appbar mu-paper-0" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="left">
            <mu-icon-button icon="menu" @click="navChange"></mu-icon-button>
        </div>
        <div class="mu-appbar-title">
            <span style="cursor: default">{{ company ? company.companyname : 'Title' }}</span>
        </div>
        <div class="right">
            <div v-if="!user" class="nologin">
                <mu-icon-button tooltip="登录" icon="person" @click="loginDialogOpen"></mu-icon-button>
                <mu-icon-button tooltip="注册" icon="edit" @click="registerDialogOpen"></mu-icon-button>
            </div>
            <div v-if="user" class="login">
                <mu-icon-menu
                        icon="person"
                        anchorOrigin="horizontal: 'right', vertical: 'top'"
                        targetOrigin="horizontal: 'right', vertical: 'top'"
                >
                    <mu-menu-item title="个人信息" @click="infoDialogOpen"></mu-menu-item>
                    <mu-menu-item title="主题" @click="themeDialogOpen"></mu-menu-item>
                    <mu-menu-item title="退出" @click="logoutConfirmOpen"></mu-menu-item>
                    <mu-menu-item title="帮助" @click="helpDialogOpen"></mu-menu-item>
                </mu-icon-menu>
            </div>
        </div>
    </div>

    <div class="mu-paper mu-drawer app-drawer mu-paper-round mu-paper-1" overlay="true"  :class="{ 'open': openFlag}" v-cloak>
        <div class="mu-appbar exmaples-nav-appbar mu-paper-0">
            <div class="left" style="line-height: 100%">
                <a href="./index.jsp">
                    <img src="./source/image/logo.png" alt="SAAS公司" style="height: 35px" />
                </a>
            </div>
            <div class="right"></div>
        </div>
        <mu-divider></mu-divider>
        <div class="exmaple-drawer-content">
            <div class="user-info-box">
                <span class="box-icon" @click="infoDialogOpen"><img :src="userInfoSrc" alt="头像" class="user-icon" /></span>
                <h2 class="one-title">{{ user ? user.name : 'no login' }}</h2>
                <h2 class="two-title">{{ user ? user.email : 'no login' }}</h2>
            </div>
            <mu-divider></mu-divider>
            <mu-list>
                <mu-list-item title="主页" @click="homePage" :title-class="{ 'active-color': pageState == 'home' }">
                    <mu-icon slot="left" value="home" :class="{ 'active-color': pageState == 'home' }"></mu-icon>
                    <mu-icon slot="right" value="keyboard_arrow_right" :class="{ 'active-color': pageState == 'home' }"></mu-icon>
                </mu-list-item>
            </mu-list>
            <mu-divider></mu-divider>
            <mu-list v-if="loginFlag">
                <mu-sub-header>信息管理</mu-sub-header>
                <mu-list-item v-if="permissionFlag" title="员工" @click="employeePage" :title-class="{ 'active-color': pageState == 'employee' }">
                    <mu-icon slot="left" value="group" :class="{ 'active-color': pageState == 'employee' }"></mu-icon>
                    <mu-icon slot="right" value="keyboard_arrow_right" :class="{ 'active-color': pageState == 'employee' }"></mu-icon>
                </mu-list-item>
                <mu-list-item title="楼盘" @click="estatePage"  :title-class="{ 'active-color': pageState == 'estate' }">
                    <mu-icon slot="left" value="domain" :class="{ 'active-color': pageState == 'estate' }"></mu-icon >
                    <mu-icon slot="right" value="keyboard_arrow_right" :class="{ 'active-color': pageState == 'estate' }"></mu-icon>
                </mu-list-item>
                <mu-list-item title="房源" @click="propertyPage"  :title-class="{ 'active-color': pageState == 'property' }">
                    <mu-icon slot="left" value="account_balance" :class="{ 'active-color': pageState == 'property' }"></mu-icon>
                    <mu-icon slot="right" value="keyboard_arrow_right" :class="{ 'active-color': pageState == 'property' }"></mu-icon>
                </mu-list-item>
            </mu-list>
            <div v-if="loginFlag && permissionFlag">
                <mu-divider></mu-divider>
                <mu-list >
                    <mu-list-item title="公众号链接" @click="weiXinLink">
                        <mu-icon slot="left" value="link"></mu-icon>
                        <mu-icon slot="right" value="reply"></mu-icon>
                    </mu-list-item>
                </mu-list>
            </div>
        </div>
    </div>

    <div v-if="pageState == 'home'" class="example-content home" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            <div class="bc-title">
                <div class="title">
                    <h2 class="one-title">{{ company ? company.companyname : 'NO LOGIN' }}</h2>
                    <h2 class="two-title">{{ company ? company.remark : 'NO LOGIN' }}</h2>
                </div>
            </div>
            <div class="content-top">
                <p>这里管理员可以舒畅滴管理员工信息、楼盘信息以及房源信息；这里员工可以舒畅滴管理自己实勘滴楼盘信息、房源信息。原来公司管理如此轻松快捷，原来员工管理也是如此方便，这一切皆是 <a
                        href="./index.jsp">房屋租赁微信公众号SAAS平台</a>。</p>
            </div>
            <div class="content-box">
                <ul>
                    <li>
                        <a class="item">
                            <h2 class="top">员工</h2>
                            <img src="./source/image/case_1.png" alt="case_1" class="item-contain" @click="employeePage"></img>
                        </a>
                    </li>
                    <li>
                        <a class="item">
                            <h2 class="top">楼盘</h2>
                            <img src="./source/image/case_2.png" alt="case_2" class="item-contain" @click="estatePage"></img>
                        </a>
                    </li>
                    <li>
                        <a class="item">
                            <h2 class="top">房源</h2>
                            <img src="./source/image/case_3.png" alt="case_3" class="item-contain" @click="propertyPage"></img>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="content-bottom">
                <p><a href="./index.jsp">房屋租赁微信公众号SAAS平台</a> 方便快捷</p>
            </div>
            <div class="foot">
                <p class="one-p">由工程师和我们出色的<a>贡献者</a>手工制作的手工制作的手工制作。</p>
                <a href="./index.jsp"><img src="./source/image/logo.png" alt="logo" /></a>
                <p class="two-p">&copy;2018 - 房屋租赁微信公众号SAAS平台</p>
            </div>
        </div>
    </div>

    <div v-if="pageState == 'employee'" class="example-content employee" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            <div class="head">
                <div class="input-box">
                    <input type="text" placeholder="员工姓名或手机号" v-model="employee_input" /><button @click="employeeSearch">查询</button>
                </div>
            </div>
            <form class="control-box">
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">性别：</li>
                    <li><input id="sex_0" type="radio" name="sex" value="全部" v-model="employee_sex" /><label for="sex_0">全部</label></li>
                    <li><input id="sex_1" type="radio" name="sex" value="男" v-model="employee_sex" /><label for="sex_1">男</label></li>
                    <li><input id="sex_2" type="radio" name="sex" value="女" v-model="employee_sex" /><label for="sex_2">女</label></li>
                </ul>
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">入职状态：</li>
                    <li><input id="status_0" type="radio" name="status" value="全部" v-model="employee_status" /><label for="status_0">全部</label></li>
                    <li><input id="status_1" type="radio" name="status" value="实习" v-model="employee_status" /><label for="status_1">实习</label></li>
                    <li><input id="status_2" type="radio" name="status" value="正式" v-model="employee_status" /><label for="status_2">正式</label></li>
                    <li><input id="status_3" type="radio" name="status" value="离职" v-model="employee_status" /><label for="status_3">离职</label></li>
                </ul>
                <div class="type-control-div">
                    <ul class="ul-left">
                        <li><input type="button" value="全选" @click="employeeSelectAll"/></li>
                        <li><input type="button" value="取消全选" @click="employeeNotSelectAll"/></li>
                    </ul>
                    <ul class="ul-right">
                        <li><input type="button" value="删除" @click="employeeDelete"/></li>
                        <li><input type="button" value="添加" @click="employeeAdd"/></li>
                    </ul>
                </div>
            </form>
            <div class="table-box">
                <mu-table multi-selectable enable-select-all ref="employee_table" @row-selection="employeeSelectChange">
                    <mu-thead>
                        <mu-tr>
                            <mu-th>账号</mu-th>
                            <mu-th>密码</mu-th>
                            <mu-th>姓名</mu-th>
                            <mu-th>性别</mu-th>
                            <mu-th>生日</mu-th>
                            <mu-th>手机号</mu-th>
                            <mu-th>状态</mu-th>
                            <mu-th>备注</mu-th>
                            <mu-th class="control-col">编辑</mu-th>
                        </mu-tr>
                    </mu-thead>
                    <mu-tbody>
                        <mu-tr v-for="item, index in employeeList"  :key="index" :selected="item.selected">
                            <mu-td @click.stop="">{{item.empno}}</mu-td>
                            <mu-td @click.stop="">{{item.passwordweb}}</mu-td>
                            <mu-td @click.stop="">{{item.empname}}</mu-td>
                            <mu-td @click.stop="">{{item.sex}}</mu-td>
                            <mu-td @click.stop="">{{item.birthday}}</mu-td>
                            <mu-td @click.stop="">{{item.tel}}</mu-td>
                            <mu-td @click.stop="">{{item.status}}</mu-td>
                            <mu-td @click.stop="">{{item.remark}}</mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="edit" background-color="#a4c639" color="#FFF" @click.stop="employeeEdit(item)"></mu-icon-button>
                            </mu-td>
                        </mu-tr>
                    </mu-tbody>
                </mu-table>
                <div class="page-select">
                    <mu-pagination :total="employeeTotal" page-size="10" :current="employeePageCurrent" @page-change="employeePageChange"></mu-pagination>
                </div>
            </div>
        </div>
    </div>

    <div v-if="pageState == 'estate'" class="example-content estate" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            <div class="head">
                <div class="input-box">
                    <input type="text" placeholder="楼盘名、物业公司或地址" v-model="estate_input" /><button @click="estateSearch">查询</button>
                </div>
            </div>
            <form class="control-box">
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">使用类型：</li>
                    <li><input id="usage_0" type="radio" name="usage" value="全部" v-model="estate_usage" /><label for="usage_0">全部</label></li>
                    <li><input id="usage_1" type="radio" name="usage" value="住宅" v-model="estate_usage" /><label for="usage_1">住宅</label></li>
                    <li><input id="usage_2" type="radio" name="usage" value="商铺" v-model="estate_usage" /><label for="usage_2">商铺</label></li>
                    <li><input id="usage_3" type="radio" name="usage" value="商住" v-model="estate_usage" /><label for="usage_3">商住</label></li>
                    <li><input id="usage_4" type="radio" name="usage" value="写字楼" v-model="estate_usage" /><label for="usage_4">写字楼</label></li>
                </ul>
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">房产类型：</li>
                    <li><input id="type_0" type="radio" name="type" value="全部" v-model="estate_type" /><label for="type_0">全部</label></li>
                    <%--<li><input id="status_internship" type="radio" name="type" value="实习" v-model="employee_status" /><label for="status_internship">实习</label></li>--%>
                    <%--<li><input id="status_official" type="radio" name="type" value="正式" v-model="employee_status" /><label for="status_official">正式</label></li>--%>
                    <%--<li><input id="status_dimission" type="radio" name="status" value="离职" v-model="employee_status" /><label for="status_dimission">离职</label></li>--%>
                </ul>
                <div class="type-control-div">
                    <ul class="ul-left">
                        <li><input type="button" value="全选" @click="estateSelectAll"/></li>
                        <li><input type="button" value="取消全选" @click="estateNotSelectAll"/></li>
                    </ul>
                    <ul class="ul-right">
                        <li><input type="button" value="删除" @click="estateDelete"/></li>
                        <li><input type="button" value="添加" @click="estateAdd"/></li>
                    </ul>
                </div>
            </form>
            <div class="table-box">
                <mu-table multi-selectable enable-select-all ref="estate_table" @row-selection="estateSelectChange">
                    <mu-thead>
                        <mu-tr>
                            <mu-th>楼盘名</mu-th>
                            <mu-th>建成年份</mu-th>
                            <mu-th>使用类型</mu-th>
                            <mu-th>房产类型</mu-th>
                            <mu-th>物业公司</mu-th>
                            <mu-th>地址</mu-th>
                            <mu-th>备注</mu-th>
                            <mu-th class="control-col">编辑</mu-th>
                        </mu-tr>
                    </mu-thead>
                    <mu-tbody>
                        <mu-tr v-for="item, index in estateList"  :key="index" :selected="item.selected">
                            <mu-td @click.stop="">{{item.estatename}}</mu-td>
                            <mu-td @click.stop="">{{item.completeyear}}</mu-td>
                            <mu-td @click.stop="">{{item.propertyusage}}</mu-td>
                            <mu-td @click.stop="">{{item.propertytype}}</mu-td>
                            <mu-td @click.stop="">{{item.mgtcompany}}</mu-td>
                            <mu-td @click.stop="">{{item.address}}</mu-td>
                            <mu-td @click.stop="">{{item.remark}}</mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="edit" background-color="#a4c639" color="#FFF" @click.stop="estateEdit(item)"></mu-icon-button>
                            </mu-td>
                        </mu-tr>
                    </mu-tbody>
                </mu-table>
                <div class="page-select">
                    <mu-pagination :total="estateTotal" page-size="10" :current="estatePageCurrent" @page-change="estatePageChange"></mu-pagination>
                </div>
            </div>
        </div>
    </div>

    <div v-if="pageState == 'property'" class="example-content property" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            <div class="head">
                <div class="input-box">
                    <input type="text" placeholder="房源编号、户主姓名或户主电话" v-model="property_input" /><button @click="propertySearch">查询</button>
                </div>
            </div>
            <form class="control-box">
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">装修：</li>
                    <li><input id="decoration_0" type="radio" name="decoration" value="全部" v-model="property_decoration" /><label for="decoration_0">全部</label></li>
                    <li><input id="decoration_1" type="radio" name="decoration" value="毛坯" v-model="property_decoration" /><label for="decoration_1">毛坯</label></li>
                    <li><input id="decoration_2" type="radio" name="decoration" value="清水" v-model="property_decoration" /><label for="decoration_2">清水</label></li>
                    <li><input id="decoration_3" type="radio" name="decoration" value="简装" v-model="property_decoration" /><label for="decoration_3">简装</label></li>
                    <li><input id="decoration_4" type="radio" name="decoration" value="中装" v-model="property_decoration" /><label for="decoration_4">中装</label></li>
                    <li><input id="decoration_5" type="radio" name="decoration" value="精装" v-model="property_decoration" /><label for="decoration_5">精装</label></li>
                </ul>
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">朝向：</li>
                    <li><input id="direction_0" type="radio" name="direction" value="全部" v-model="property_direction" /><label for="direction_0">全部</label></li>
                    <li><input id="direction_1" type="radio" name="direction" value="东" v-model="property_direction" /><label for="direction_1">东</label></li>
                    <%--<li><input id="status_official" type="radio" name="status" value="正式" v-model="employee_status" /><label for="status_official">正式</label></li>--%>
                    <%--<li><input id="status_dimission" type="radio" name="status" value="离职" v-model="employee_status" /><label for="status_dimission">离职</label></li>--%>
                </ul>
                <div class="type-control-div">
                    <ul class="ul-left">
                        <li><input type="button" value="全选" @click="propertySelectAll"/></li>
                        <li><input type="button" value="取消全选" @click="propertyNotSelectAll"/></li>
                    </ul>
                    <ul class="ul-right">
                        <li><input type="button" value="删除" @click="propertyDelete"/></li>
                        <li><input type="button" value="添加" @click="propertyAdd"/></li>
                    </ul>
                </div>
            </form>
            <div class="table-box">
                <mu-table multi-selectable enable-select-all ref="property_table" @row-selection="propertySelectChange">
                    <mu-thead>
                        <mu-tr>
                            <mu-th>房源编号</mu-th>
                            <mu-th>网络标题</mu-th>
                            <mu-th>装修</mu-th>
                            <mu-th>朝向</mu-th>
                            <mu-th>楼层</mu-th>
                            <mu-th>房型</mu-th>
                            <mu-th>面积（平方米）</mu-th>
                            <mu-th>租/售</mu-th>
                            <mu-th>租赁状态</mu-th>
                            <mu-th>出售价格（万元）</mu-th>
                            <mu-th>出租价格（元/月）</mu-th>
                            <mu-th>户主姓名</mu-th>
                            <mu-th>户主电话</mu-th>
                            <mu-th class="control-col">地址</mu-th>
                            <mu-th class="control-col">图片</mu-th>
                            <mu-th class="control-col">录入者</mu-th>
                            <mu-th class="control-col">编辑</mu-th>
                        </mu-tr>
                    </mu-thead>
                    <mu-tbody>
                        <mu-tr v-for="item, index in propertyList"  :key="index" :selected="item.selected">
                            <mu-td @click.stop="">{{item.propertyno}}</mu-td>
                            <mu-td @click.stop="">{{item.webtitle}}</mu-td>
                            <mu-td @click.stop="">{{item.propertydecoration}}</mu-td>
                            <mu-td @click.stop="">{{item.propertydirection}}</mu-td>
                            <mu-td @click.stop="">{{item.floor + '/' + item.floorall}}</mu-td>
                            <mu-td @click.stop="">{{(item.countf == '' ? 0 : item.countf) + '室' + (item.countt == '' ? 0 : item.countt) + '厅' + (item.countw == '' ? 0 : item.countw) + '卫' + (item.county == '' ? 0 : item.county) + '阳台'}}</mu-td>
                            <mu-td @click.stop="">{{item.square}}</mu-td>
                            <mu-td @click.stop="">{{item.trade}}</mu-td>
                            <mu-td @click.stop="">{{item.status}}</mu-td>
                            <mu-td @click.stop="">{{item.price}}</mu-td>
                            <mu-td @click.stop="">{{item.rentprice}}</mu-td>
                            <mu-td @click.stop="">{{item.ownername}}</mu-td>
                            <mu-td @click.stop="">{{item.ownermobile}}</mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="place" background-color="#a4c639" color="#FFF" @click.stop="propertyEdit(item)"></mu-icon-button>
                            </mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="palette" background-color="#a4c639" color="#FFF" @click.stop="propertyEdit(item)"></mu-icon-button>
                            </mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="account_circle" background-color="#a4c639" color="#FFF" @click.stop="propertyEdit(item)"></mu-icon-button>
                            </mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="edit" background-color="#a4c639" color="#FFF" @click.stop="propertyEdit(item)"></mu-icon-button>
                            </mu-td>
                        </mu-tr>
                    </mu-tbody>
                </mu-table>
                <div class="page-select">
                    <mu-pagination :total="propertyTotal" page-size="10" :current="propertyPageCurrent" @page-change="propertyPageChange"></mu-pagination>
                </div>
            </div>
        </div>
    </div>

    <%--wx dialog--%>
    <mu-dialog :open="wxLinkDialog" title="微信公众号链接" @close="wxLinkClose" v-cloak>
        <div class="dialog-contain">
            <mu-table :show-checkbox="false" :selectable="false">
                <mu-thead>
                    <mu-tr>
                        <mu-th style="width: 100px">编号</mu-th>
                        <mu-th style="width: 100px">页面名</mu-th>
                        <mu-th>页面链接</mu-th>
                    </mu-tr>
                </mu-thead>
                <mu-tbody>
                    <mu-tr>
                        <mu-td>1</mu-td>
                        <mu-td>主页</mu-td>
                        <mu-td>{{'https://bestleo.top/SYWeiServers/wx_home.jsp?no=' + (company ? company.companyno : '')}}</mu-td>
                    </mu-tr>
                    <mu-tr>
                        <mu-td>2</mu-td>
                        <mu-td>出售页</mu-td>
                        <mu-td>{{'https://bestleo.top/SYWeiServers/wx_sell.jsp?no=' + (company ? company.companyno : '')}}</mu-td>
                    </mu-tr>
                    <mu-tr>
                        <mu-td>3</mu-td>
                        <mu-td>出租页</mu-td>
                        <mu-td>{{'https://bestleo.top/SYWeiServers/wx_rent.jsp?no=' + (company ? company.companyno : '')}}</mu-td>
                    </mu-tr>
                    <mu-tr>
                        <mu-td>4</mu-td>
                        <mu-td>搜索页</mu-td>
                        <mu-td>{{'https://bestleo.top/SYWeiServers/wx_search.jsp?no=' + (company ? company.companyno : '')}}</mu-td>
                    </mu-tr>
                </mu-tbody>
            </mu-table>
        </div>
        <mu-flat-button slot="actions" primary @click="wxLinkClose" label="确定"></mu-flat-button>
    </mu-dialog>

    <%--login dialog--%>
    <mu-dialog :open="loginDialog" title="登录" @close="loginDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field hint-text="账号" type="text" icon="person" full-width v-model="employeeNo" ></mu-text-field>
            <mu-text-field hint-text="密码" type="password" icon="password" full-width v-model="webPassword"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="loginDialogOk" label="登录"></mu-flat-button>
    </mu-dialog>
</div>

<!--toast start-->
<div class="toast" style="display: none">
    <div></div>
</div>
<!--toast end-->

<script src="./lib/vue/vue.min.js"></script>
<script src="./lib/muse/muse-ui.js"></script>
<script src="./lib/axios/axios.min.js"></script>
<script src="./js/share.js"></script>
<script src="./js/company.js"></script>
</body>
</html>