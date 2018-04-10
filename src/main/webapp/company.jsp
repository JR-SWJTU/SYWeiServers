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
            <div v-show="!user" class="nologin">
                <mu-icon-button tooltip="登录" icon="person" @click="loginDialog"></mu-icon-button>
                <mu-icon-button tooltip="注册" icon="edit" @click="registerDialog"></mu-icon-button>
            </div>
            <div v-show="user" class="login">
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
                <a href="http://bestleo.top">
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
                <mu-list-item v-show="permissionFlag" title="员工" @click="employeePage" :title-class="{ 'active-color': pageState == 'employee' }">
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

    <div v-show="pageState == 'home'" class="example-content home" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            <div class="bc-title">
                <div class="title">
                    <h2 class="one-title">{{ company ? company.companyname : 'NO LOGIN' }}</h2>
                    <h2 class="two-title">{{ company ? company.remark : 'NO LOGIN' }}</h2>
                </div>
            </div>
            <div class="content-top">
                <p>这里管理员可以舒畅滴管理员工信息、楼盘信息以及房源信息；这里员工可以舒畅滴管理自己实勘滴楼盘信息、房源信息。原来公司管理如此轻松快捷，原来员工管理也是如此方便，这一切皆是 <a
                        href="http://bestleo.top">房屋租赁微信公众号SAAS平台</a>。</p>
            </div>
            <div class="content-box">
                <ul>
                    <li>

                    </li>
                    <li>

                    </li>
                    <li>

                    </li>
                </ul>
            </div>
            <div class="content-bottom">
                <p><a href="http://bestleo.top">房屋租赁微信公众号SAAS平台</a> 方便快捷</p>
            </div>
            <div class="foot">

            </div>
        </div>
    </div>

    <div v-show="pageState == 'employee'" class="example-content employee" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            employee
        </div>
    </div>

    <div v-show="pageState == 'estate'" class="example-content estate" :class="{ 'nav-hide': !openFlag}" v-cloak>
        <div class="content-wrapper">
            estate
        </div>
    </div>

    <div v-show="pageState == 'property'" class="example-content property" :class="{ 'nav-hide': !openFlag}" v-cloak>
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