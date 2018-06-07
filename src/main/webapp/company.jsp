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
            <div v-if="!loginFlag" class="nologin">
                <mu-icon-button tooltip="登录" icon="person" @click="loginDialogOpen"></mu-icon-button>
                <mu-icon-button tooltip="注册" icon="edit" @click="registerDialogOpen"></mu-icon-button>
            </div>
            <div v-if="loginFlag" class="login">
                <mu-icon-menu
                        icon="person"
                        anchorOrigin="horizontal: 'right', vertical: 'top'"
                        targetOrigin="horizontal: 'right', vertical: 'top'"
                >
                    <mu-menu-item :title="permissionFlag ? '公司信息' : '个人信息'" @click="infoDialogOpen"></mu-menu-item>
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
                <h2 v-show="permissionFlag" class="one-title">企业管理员</h2>
                <h2 v-show="!permissionFlag" class="one-title">{{ user ? user.name : 'no login' }}</h2>
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
                <mu-list-item v-if="permissionFlag" title="楼盘" @click="estatePage"  :title-class="{ 'active-color': pageState == 'estate' }">
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
                    <input type="text" placeholder="楼盘名" v-model="estate_input" /><button @click="estateSearch">查询</button>
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
                    <li><input id="type_0" type="radio" name="housetype" value="全部" v-model="estate_type" /><label for="type_0">全部</label></li>
                    <li><input id="type_1" type="radio" name="housetype" value="平房" v-model="estate_type" /><label for="type_1">平房</label></li>
                    <li><input id="type_2" type="radio" name="housetype" value="多层" v-model="estate_type" /><label for="type_2">多层</label></li>
                    <li><input id="type_3" type="radio" name="housetype" value="高层" v-model="estate_type" /><label for="type_3">高层</label></li>
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
                    <li class="type-select-name">租/售：</li>
                    <li><input id="trade_0" type="radio" name="trade" value="全部" v-model="property_trade" /><label for="trade_0">全部</label></li>
                    <li><input id="trade_1" type="radio" name="trade" value="毛坯" v-model="property_trade" /><label for="trade_1">出租</label></li>
                    <li><input id="trade_2" type="radio" name="trade" value="毛坯" v-model="property_trade" /><label for="trade_2">出售</label></li>
                </ul>
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
                    <li><input id="direction_2" type="radio" name="direction" value="西" v-model="property_direction" /><label for="direction_2">西</label></li>
                    <li><input id="direction_3" type="radio" name="direction" value="南" v-model="property_direction" /><label for="direction_3">南</label></li>
                    <li><input id="direction_4" type="radio" name="direction" value="北" v-model="property_direction" /><label for="direction_4">北</label></li>
                    <li><input id="direction_5" type="radio" name="direction" value="东西" v-model="property_direction" /><label for="direction_5">东西</label></li>
                    <li><input id="direction_6" type="radio" name="direction" value="南北" v-model="property_direction" /><label for="direction_6">南北</label></li>
                </ul>
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">室数：</li>
                    <li><input id="room_0" type="radio" name="room" value="全部" v-model="property_room" /><label for="room_0">全部</label></li>
                    <li><input id="room_1" type="radio" name="room" value="1" v-model="property_room" /><label for="room_1">一室</label></li>
                    <li><input id="room_2" type="radio" name="room" value="2" v-model="property_room" /><label for="room_2">两室</label></li>
                    <li><input id="room_3" type="radio" name="room" value="3" v-model="property_room" /><label for="room_3">三室</label></li>
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
                                <mu-icon-button icon="place" background-color="#a4c639" color="#FFF" @click.stop="propertyAddressEdit(item)"></mu-icon-button>
                            </mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="palette" background-color="#a4c639" color="#FFF" @click.stop="propertyPhotoEdit(item)"></mu-icon-button>
                            </mu-td>
                            <mu-td @click.stop="">
                                <mu-icon-button icon="account_circle" background-color="#a4c639" color="#FFF" @click.stop="propertyOwnerEdit(item)"></mu-icon-button>
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
            <mu-text-field label="账号" hint-text="账号" type="text" full-width v-model="employeeNo" ></mu-text-field>
            <mu-text-field label="密码" hint-text="密码" type="password" full-width v-model="webPassword"></mu-text-field>
            <input id="administrator" type="checkbox" name="administrator" v-model="adminFlag" /><label for="Administrator">企业管理员</label>
        </div>
        <mu-flat-button slot="actions" primary @click="loginDialogOk" label="登录"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="registerDialog" title="注册" @close="registerDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="输入账号" hint-text="账号" type="text" full-width v-model="reemployeeNo" ></mu-text-field>
            <mu-text-field label="输入密码" hint-text="密码" type="password" full-width v-model="rewebPassword"></mu-text-field>
            <mu-text-field label="再次输入密码" hint-text="密码" type="password" full-width v-model="rerewebPassword"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="registerDialogOk" label="注册"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="employeeAddDialog" title="员工添加" @close="employeeAddDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="账号" hint-text="账号" type="text" full-width v-model="addempno" ></mu-text-field>
            <mu-text-field label="密码" hint-text="密码" type="text" full-width v-model="addpasswordweb"></mu-text-field>
            <mu-text-field label="姓名" hint-text="姓名" type="text" full-width v-model="addempname"></mu-text-field>
            <mu-text-field label="性别" hint-text="性别" type="text" full-width v-model="addsex"></mu-text-field>
            <mu-text-field label="联系电话" hint-text="联系电话" type="text" full-width v-model="addtel"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="employeeAddDialogOk" label="确认"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="estateAddDialog" title="楼盘添加" @close="estateAddDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="楼盘名" hint-text="楼盘名" type="text" full-width v-model="addestatename" ></mu-text-field>
            <mu-text-field label="建成年份" hint-text="1960-" type="text" full-width v-model="addcompleteyear"></mu-text-field>
            <mu-text-field label="使用类型" hint-text="住宅、商铺、商住、写字楼" type="text" full-width v-model="addpropertyusage"></mu-text-field>
            <mu-text-field label="房产类型" hint-text="平房、多层、高层" type="text" full-width v-model="addpropertytype"></mu-text-field>
            <mu-text-field label="物业公司名" hint-text="物业公司名" type="text" full-width v-model="addmgtcompany"></mu-text-field>
            <mu-text-field label="地址" hint-text="地址" type="text" full-width v-model="addestateaddress"></mu-text-field>
            <mu-text-field label="备注" hint-text="备注" type="text" full-width v-model="addestateremark"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="estateAddDialogOk" label="确认"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="estateEditDialog" title="楼盘信息维护" @close="estateEditDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="楼盘名" hint-text="楼盘名" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.estatename" ></mu-text-field>
            <mu-text-field label="建成年份" hint-text="1960-" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.completeyear"></mu-text-field>
            <mu-text-field label="使用类型" hint-text="住宅、商铺、商住、写字楼" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.propertyusage"></mu-text-field>
            <mu-text-field label="房产类型" hint-text="平房、多层、高层" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.propertytype"></mu-text-field>
            <mu-text-field label="物业公司名" hint-text="物业公司名" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.mgtcompany"></mu-text-field>
            <mu-text-field label="地址" hint-text="地址" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.address"></mu-text-field>
            <mu-text-field label="备注" hint-text="备注" type="text" full-width v-model="now_estateItem == null ? '' : now_estateItem.remark"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="estateEditDialogOk" label="确认"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="employeeEditDialog" title="员工信息维护" @close="employeeEditDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="账号" hint-text="账号" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.empno" disabled></mu-text-field>
            <mu-text-field label="密码" hint-text="密码" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.passwordweb"></mu-text-field>
            <mu-text-field label="姓名" hint-text="姓名" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.empname"></mu-text-field>
            <mu-text-field label="性别" hint-text="性别" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.sex"></mu-text-field>
            <mu-text-field label="联系电话" hint-text="联系电话" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.tel"></mu-text-field>
            <mu-text-field label="在职状态" hint-text="在职状态" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.status"></mu-text-field>
            <mu-text-field label="备注" hint-text="备注" type="text" full-width v-model="now_employeeItem == null ? '' : now_employeeItem.remark"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="employeeEditDialogOk" label="确认"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="propertyAddressDialog" title="房源地址" @close="propertyAddressDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="城市名" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.cityname" ></mu-text-field>
            <mu-text-field label="区域名" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.districtname"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="propertyAddressDialogOk" label="确认更新"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="propertyOwnerDialog" title="房源拥有者" @close="propertyOwnerDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="姓名" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.ownername" ></mu-text-field>
            <mu-text-field label="手机" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.ownermobile"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="propertyOwnerDialogOk" label="确认更新"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="propertyPhotoDialog" title="房源照片" @close="propertyPhotoDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-grid-list class="gridlist-demo">
                <mu-grid-tile v-for="tile, index in now_propertyItem.photourls" :key="index">
                    <img :src="tile" >
                    <mu-button slot="action" icon>
                        <mu-icon value="delete" @click.stop="propertyPhotoDialogDelete(index)"></mu-icon>
                    </mu-button>
                </mu-grid-tile>
            </mu-grid-list>
        </div>
        <mu-flat-button slot="actions" @click="propertyPhotoDialogAdd" label="上传图片"></mu-flat-button>
        <mu-flat-button slot="actions" primary @click="propertyPhotoDialogOk" label="确认更新"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="propertyAddDialog" title="房源添加" @close="propertyAddDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="网络标题" type="text" full-width v-model="addwebtitle" ></mu-text-field>
            <%--<mu-text-field label="装修" type="text" full-width v-model=adddec"></mu-text-field>--%>
            <mu-text-field label="朝向" type="text" full-width v-model="adddirection"></mu-text-field>
            <mu-text-field label="卧室数" type="text" full-width v-model="addcountf"></mu-text-field>
            <mu-text-field label="客厅数" type="text" full-width v-model="addcountt"></mu-text-field>
            <mu-text-field label="面积（平方米）" type="text" full-width v-model="addsquare"></mu-text-field>
            <mu-text-field label="租/售" type="text" full-width v-model="addtrade"></mu-text-field>
            <mu-text-field label="状态" type="text" full-width v-model="add_status"></mu-text-field>
            <mu-text-field v-show="addtrade == '出售'" label="售价（万元）" type="text" full-width v-model="add_price"></mu-text-field>
            <mu-text-field v-show="addtrade == '出租'" label="月租价（元）" type="text" full-width v-model="add_rentprice"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="propertyAddDialogOk" label="确认添加"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="propertyEditDialog" title="房源基本信息维护" @close="propertyEditDialogClose" v-cloak>
        <div class="dialog-contain">
            <mu-text-field label="网络标题" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.webtitle" ></mu-text-field>
            <mu-text-field label="装修" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.propertydecoration"></mu-text-field>
            <mu-text-field label="朝向" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.propertydirection"></mu-text-field>
            <%--<mu-text-field label="所属楼层" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.floor"></mu-text-field>--%>
            <%--<mu-text-field label="最高层数" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.floorall"></mu-text-field>--%>
            <mu-text-field label="卧室数" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.countf"></mu-text-field>
            <mu-text-field label="客厅数" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.countt"></mu-text-field>
            <%--<mu-text-field label="卫生间数" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.countw"></mu-text-field>--%>
            <%--<mu-text-field label="阳台数" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.county"></mu-text-field>--%>
            <mu-text-field label="面积（平方米）" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.square"></mu-text-field>
            <mu-text-field label="租/售" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.trade"></mu-text-field>
            <mu-text-field label="状态" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.status"></mu-text-field>
            <mu-text-field v-show="now_propertyItem.trade == '出售'" label="售价（万元）" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.price"></mu-text-field>
            <mu-text-field v-show="now_propertyItem.trade == '出租'" label="月租价（元）" type="text" full-width v-model="now_propertyItem == null ? '' : now_propertyItem.rentprice"></mu-text-field>
        </div>
        <mu-flat-button slot="actions" primary @click="propertyEditDialogOk" label="确认更新"></mu-flat-button>
    </mu-dialog>

    <mu-dialog :open="infoDialog" title="permissionFlag ? '公司信息' : '个人信息'" @close="infoDialogClose" v-cloak>
        <div class="dialog-contain">
            <div v-show="permissionFlag">
                <mu-text-field label="账户" type="text" full-width v-model="company.companyno" disabled ></mu-text-field>
                <mu-text-field label="数据库名" type="text" full-width v-model="company.dbname" disabled ></mu-text-field>
                <mu-text-field label="公司名" type="text" full-width v-model="company.companyname" ></mu-text-field>
                <mu-text-field label="联系电话" type="text" full-width v-model="company.tel" ></mu-text-field>
                <mu-text-field label="客服QQ" type="text" full-width v-model="company.qq" ></mu-text-field>
                <mu-text-field label="邮箱" type="text" full-width v-model="company.email" ></mu-text-field>
                <mu-text-field label="详细地址" type="text" full-width v-model="company.address" ></mu-text-field>
                <mu-text-field label="公司简介" type="text" full-width v-model="company.remark" ></mu-text-field>
            </div>

            <div v-show="!permissionFlag">
                <mu-text-field label="账户" type="text" full-width v-model="user == null ? '' :user.empno" disabled ></mu-text-field>
                <mu-text-field label="姓名" type="text" full-width v-model="user == null ? '' :user.empname"></mu-text-field>
                <mu-text-field label="性别" type="text" full-width v-model="user == null ? '' :user.sex" ></mu-text-field>
                <mu-text-field label="联系电话" type="text" full-width v-model="user == null ? '' :user.tel" ></mu-text-field>
                <mu-text-field label="状态" type="text" full-width v-model="user == null ? '' :user.stutas" ></mu-text-field>
                <mu-text-field label="备注" type="text" full-width v-model="user == null ? '' :user.brief" ></mu-text-field>
            </div>
        </div>
        <mu-flat-button slot="actions" primary @click="infoDialogOk" label="确认更新"></mu-flat-button>
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