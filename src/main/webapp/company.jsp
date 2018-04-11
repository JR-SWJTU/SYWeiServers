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
                <mu-icon-button tooltip="登录" icon="person" @click="loginDialog"></mu-icon-button>
                <mu-icon-button tooltip="注册" icon="edit" @click="registerDialog"></mu-icon-button>
            </div>
            <div v-if="user" class="login">
                <mu-icon-menu
                        icon="person"
                        anchorOrigin="horizontal: 'right', vertical: 'top'"
                        targetOrigin="horizontal: 'right', vertical: 'top'"
                >
                    <mu-menu-item title="个人信息" @click="infoDialog"></mu-menu-item>
                    <mu-menu-item title="主题" @click="themeDialog"></mu-menu-item>
                    <mu-menu-item title="退出" @click="logoutConfirm"></mu-menu-item>
                    <mu-menu-item title="帮助" @click="helpDialog"></mu-menu-item>
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
                <span class="box-icon" @click="infoDialog"><img :src="userInfoSrc" alt="头像" class="user-icon" /></span>
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
            <mu-list>
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
                    <input type="text" placeholder="员工姓名或手机号" v-model="employeeCondition.input" /><button class="">查询</button>
                </div>
            </div>
            <form class="control-box">
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">性别：</li>
                    <li><input id="sex_all" type="radio" name="sex" value="全部" v-model="employeeCondition.sex" /><label for="sex_all">全部</label></li>
                    <li><input id="sex_male" type="radio" name="sex" value="男" v-model="employeeCondition.sex" /><label for="sex_male">男</label></li>
                    <li><input id="sex_female" type="radio" name="sex" value="女" v-model="employeeCondition.sex" /><label for="sex_female">女</label></li>
                </ul>
                <ul class="type-select-ul border-bottom">
                    <li class="type-select-name">入职状态：</li>
                    <li><input id="status_all" type="radio" name="status" value="全部" checked /><label for="status_all">全部</label></li>
                    <li><input id="status_internship" type="radio" name="status" value="实习" /><label for="status_internship">实习</label></li>
                    <li><input id="status_official" type="radio" name="status" value="正式" /><label for="status_official">正式</label></li>
                    <li><input id="status_dimission" type="radio" name="status" value="离职" /><label for="status_dimission">离职</label></li>
                </ul>
                <div class="type-control-div">
                    <ul class="ul-left">
                        <li><input type="button" value="全选" /></li>
                        <li><input type="button" value="取消全选" /></li>
                    </ul>
                    <ul class="ul-right">
                        <li><input type="button" value="删除" /></li>
                        <li><input type="button" value="添加" /></li>
                    </ul>
                </div>
            </form>
            <div class="table-box">
                <mu-table multi-selectable enable-select-all ref="table">
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
            estate
        </div>
    </div>

    <div v-if="pageState == 'property'" class="example-content property" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            property
        </div>
    </div>
</div>

<script src="./lib/vue/vue.min.js"></script>
<script src="./lib/muse/muse-ui.js"></script>
<script src="./lib/axios/axios.min.js"></script>
<script src="./js/share.js"></script>
<script src="./js/company.js"></script>
</body>
</html>