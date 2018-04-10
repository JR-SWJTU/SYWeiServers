<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>房屋租赁微信公众号SAAS平台</title>
    <link rel="shortcut icon" href="./source/icon.png" />
    <link rel="stylesheet" href="./css/cssreset.css" />
    <link rel="stylesheet" href="./lib/muse/font.css" />
    <link rel="stylesheet" href="./lib/muse/muse-ui.css" />
    <link rel="stylesheet" href="./lib/muse/theme-carbon.min.css" />
    <link rel="stylesheet" href="./css/share.css" />
    <link rel="stylesheet" href="./css/company.css"/>
</head>
<body>
    <div id="app">
        <div class="mu-appbar example-appbar mu-paper-0" :class="{ 'nav-hide': !openFlag}" v-cloak>
            <div class="left">
                <button type="button" tabindex="0" class="mu-icon-button" style="user-select: none; outline: none; cursor: pointer; -webkit-appearance: none;" @click="navChange">
                    <div>
                        <div class="mu-ripple-wrapper">
                        </div>
                        <i class="mu-icon material-icons">menu</i>
                    </div>
                </button>
            </div>
            <div class="mu-appbar-title">
                <span>{{ company.companyname }}</span>
            </div>
            <div class="right">

            </div>
        </div>

        <div class="mu-paper mu-drawer app-drawer mu-paper-round mu-paper-1" overlay="true"  :class="{ 'open': openFlag}" v-cloak>
            <div class="mu-appbar exmaples-nav-appbar mu-paper-0">
                <div class="left"></div>
                <div class="mu-appbar-title"><a href="#/index" class="exmaples-appbar-title"></a></div>
                <div class="right"></div>
            </div>
            <hr class="mu-divider">
            <div class="exmaple-drawer-content">
                <div class="mu-version-box"></div>
            </div>
        </div>

        <div class="example-content" :class="{ 'nav-hide': !openFlag}" v-cloak>
            <div class="content-wrapper">

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