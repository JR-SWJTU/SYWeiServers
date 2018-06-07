<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 2018/4/13
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link rel="shortcut icon" href="./source/icon.png" />
    <link rel="stylesheet" href="./lib/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="./lib/swiper/swiper-3.4.2.min.css" />
    <link rel="stylesheet" href="./css/wx_search.css" />
    <link rel="stylesheet" href="./css/wx_foot.css" />
    <link rel="stylesheet" href="./css/share.css" />
    <link rel="stylesheet" href="./css/wx_sell.css" />
</head>
<body>
    <div id="app">
        <header>
            <div class="container">
                <div class="row line1">
                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-0" >
                        <div class="logo">
                            <svg xmlns="http://www.w3.org/2000/svg" width="138" height="36" viewBox="0 0 138 36">
                                <path fill="#FFF" fill-rule="evenodd" d="M167.8,47.952 L177.112,47.952 L177.112,64.752 L151,64.752 L151,31.152 L167.8,31.152 L167.8,47.952 Z M196.792,30 C206.68,30 214.696,38.016 214.696,47.904 C214.696,57.792 206.68,65.808 196.792,65.808 C186.904,65.808 178.888,57.792 178.888,47.904 C178.888,38.016 186.904,30 196.792,30 Z M233.8,47.904 L251.56,47.904 C251.56,57.744 243.64,65.664 233.8,65.664 C223.96,65.664 216.04,57.744 216.04,47.904 C216.04,39.072 222.472,31.728 230.968,30.336 C234.952,29.712 239.128,30.48 242.68,32.496 L233.8,47.904 Z M270.568,30 C280.456,30 288.472,38.016 288.472,47.904 C288.472,57.792 280.456,65.808 270.568,65.808 C260.68,65.808 252.664,57.792 252.664,47.904 C252.664,38.016 260.68,30 270.568,30 Z" transform="translate(-151 -30)"/>
                            </svg>
                        </div>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-0">
                        <ul class="nav">
                            <li><a href="#">二手房</a></li>
                            <li><a href="#">租房</a></li>
                            <li><a href="#">经纪人</a></li>
                        </ul>
                    </div>
                    <div class="col-xs-12">
                        <nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
                            <div class="container">
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                    <div class="logo">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="138" height="36" viewBox="0 0 138 36">
                                            <path fill="#FFF" fill-rule="evenodd" d="M167.8,47.952 L177.112,47.952 L177.112,64.752 L151,64.752 L151,31.152 L167.8,31.152 L167.8,47.952 Z M196.792,30 C206.68,30 214.696,38.016 214.696,47.904 C214.696,57.792 206.68,65.808 196.792,65.808 C186.904,65.808 178.888,57.792 178.888,47.904 C178.888,38.016 186.904,30 196.792,30 Z M233.8,47.904 L251.56,47.904 C251.56,57.744 243.64,65.664 233.8,65.664 C223.96,65.664 216.04,57.744 216.04,47.904 C216.04,39.072 222.472,31.728 230.968,30.336 C234.952,29.712 239.128,30.48 242.68,32.496 L233.8,47.904 Z M270.568,30 C280.456,30 288.472,38.016 288.472,47.904 C288.472,57.792 280.456,65.808 270.568,65.808 C260.68,65.808 252.664,57.792 252.664,47.904 C252.664,38.016 260.68,30 270.568,30 Z" transform="translate(-151 -30)"/>
                                        </svg>
                                    </div>
                                </div>
                                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                    <ul class="nav navbar-nav">
                                        <li><a href="#">二手房</a></li>
                                        <li><a href="#" @click="pageToRent">租房</a></li>
                                        <li><a href="#">经纪人</a></li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row box">
                    <div class="inputBox inputbox_title">
                        二手房
                    </div>
                </div>


            </div>
        </header>
        <section class="wapfind">
            <div class="row">
                <div class="col-xs-12">
                    <div class="btnbox">
                        <!-- Split button -->
                        <div class="btn-group">
                            <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                区域<span class="caret"></span>
                            </button>
                        </div>
                        <!-- Split button -->
                        <div class="btn-group">
                            <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                售价<span class="caret"></span>
                            </button>
                        </div>
                        <!-- Split button -->
                        <div class="btn-group">
                            <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                房型 <span class="caret"></span>
                            </button>
                        </div>
                        <!-- Split button -->
                        <div class="btn-group">
                            <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                更多 <span class="caret"></span>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="findPanel">
            <div class="line">
                <div class="col-xs-12">
                    <!-- Split button -->
                    <div class="btn-group open">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            区域<span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <div class="two">
                                <li class="ac">
                                    <a href="#">成都</a>
                                </li>
                            </div>
                            <div class="three">
                                <div class="third">
                                    <div class="li"><a href="#" @click="district1Click">不限</a></div>
                                    <div class="li"><a href="#" @click="district2Click">新都区</a></div>
                                    <div class="li"><a href="#" @click="district3Click">成华区</a></div>
                                    <div class="li"><a href="#" @click="district4Click">高新区</a></div>
                                    <div class="li"><a href="#" @click="district5Click">郫都区</a></div>
                                    <div class="li"><a href="#" @click="district6Click">金牛区</a></div>
                                </div>
                            </div>
                        </ul>
                    </div>
                    <!-- Split button -->
                    <div class="btn-group">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            售价<span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <div class="salePrice">
                                <div class="li"><a href="#" class="aactive" @click="price1Click">不限</a></div>
                                <div class="li"><a href="#" @click="price2Click">50万以下</a></div>
                                <div class="li"><a href="#" @click="price3Click">50万-80万</a></div>
                                <div class="li"><a href="#" @click="price4Click">80万-100万</a></div>
                                <div class="li"><a href="#" @click="price5Click">100万-120万</a></div>
                                <div class="li"><a href="#" @click="price6Click">120万以上</a></div>
                            </div>
                        </ul>
                    </div>
                    <!-- Split button -->
                    <div class="btn-group">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            房型 <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <div class="type">
                                <div class="li" @click="room0Click"><a href="#">不限</a></div>
                                <div class="li" @click="room1Click"><a href="#">一室</a></div>
                                <div class="li" @click="room2Click"><a href="#">二室</a></div>
                                <div class="li" @click="room3Click"><a href="#">三室</a></div>
                                <div class="li" @click="room4Click"><a href="#">四室</a></div>
                            </div>
                            <div class="sure" @click="roomClick">确定</div>
                        </ul>
                    </div>
                    <!-- Split button -->
                    <div class="btn-group">
                        <button class="btn btn-default btn-xs dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            更多 <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <div class="more">
                                <div class="box">
                                    <h2>朝向</h2>
                                    <span @click="direction2Click">朝东</span>
                                    <span @click="direction3Click">朝西</span>
                                    <span @click="direction4Click">朝南</span>
                                    <span @click="direction5Click">朝北</span>
                                    <span @click="direction6Click">东西</span>
                                    <span @click="direction7Click">南北</span>
                                </div>
                                <div class="box">
                                    <h2>面积</h2>
                                    <span @click="square1Click">50平以下</span>
                                    <span @click="square2Click">50-60平</span>
                                    <span @click="square3Click">60-80平</span>
                                    <span @click="square4Click">80-100平</span>
                                </div>
                                <div class="box">
                                    <h2>装修</h2>
                                    <span @click="decoration1Click">精装</span>
                                    <span @click="decoration2Click">简装</span>
                                    <span @click="decoration3Click">毛坯</span>
                                </div>
                            </div>
                            <div class="clear_if" @click="resetClick">清空条件</div>
                            <div class="sure" @click="moreClick">确定</div>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <section>
            <div class="container content">
                <div class="row">
                    <div class=" chose-block col-lg-9 col-md-9 col-sm-9">
                        <div class="dataBox">
                            <div class="houseData row" v-for="item, index in propertyList"  :key="index" v-cloak>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img :src="(item.photourls && item.photourls.length != 0) ? item.photourls[0] : './source/image/wx/room-1.jpg'" alt="图片已损坏">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>{{ item.webtitle ? item.webtitle : '精品房源' }}</h3>
                                    <div>
                                        <span>{{ item.propertydecoration ? item.propertydecoration : '精装' }}</span>
                                        <span>{{ item.propertydirection ? item.propertydirection : '南北' }}</span>
                                        <span>性价比高</span>
                                    </div>
                                    <ul>
                                        <li>{{(item.countf == '' ? 0 : item.countf) + '室' + (item.countt == '' ? 0 : item.countt) + '厅' + (item.countw == '' ? 0 : item.countw) + '卫' + (item.county == '' ? 0 : item.county) + '阳台'}}</li>
                                        <li class="red1">{{ item.square + '平米' }}</li>
                                        <li>{{ item.floor + '/' + item.floorall + '层'}}</li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">{{ item.price + item.unitname}}</h3>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="pageBox">
                            <div>
                                <span @click="pageBefore"><<</span>
                                <span>..</span>
                                <span>{{currentPage}}</span>
                                <span>..</span>
                                <span @click="pageNext">>></span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="part3">
                        <h1>推荐房源</h1>
                        <div class="row">
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                <div class="img">
                                    <img src="./images/room-2.jpg" alt="">
                                    <span class="price">128万</span>
                                </div>
                                <h3>蓝润东悅荟</h3>
                                <div class="des">
                                    <span class="red1">118m²</span>&nbsp;
                                    <span>3室2厅</span>&nbsp;
                                    <span>高新区</span>
                                </div>

                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                <div class="img">
                                    <img src="./images/room-2.jpg" alt="">
                                    <span class="price">128万</span>
                                </div>
                                <h3>蓝润东悅荟</h3>
                                <div class="des">
                                    <span class="red1">118m²</span>&nbsp;
                                    <span>3室2厅</span>&nbsp;
                                    <span>高新区</span>
                                </div>

                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                <div class="img">
                                    <img src="./images/room-2.jpg" alt="">
                                    <span class="price">128万</span>
                                </div>
                                <h3>蓝润东悅荟</h3>
                                <div class="des">
                                    <span class="red1">118m²</span>&nbsp;
                                    <span>3室2厅</span>&nbsp;
                                    <span>高新区</span>
                                </div>

                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                <div class="img">
                                    <img src="./images/room-2.jpg" alt="">
                                    <span class="price">128万</span>
                                </div>
                                <h3>蓝润东悅荟</h3>
                                <div class="des">
                                    <span class="red1">118m²</span>&nbsp;
                                    <span>3室2厅</span>&nbsp;
                                    <span>高新区</span>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <footer>
            <div class="container">
                <div class="row">
                    <ul>
                <span>
                    <li><a href="＃">网站首页</a></li>
                    <li><a href="＃">联系我们</a></li>
                    <li><a href="＃">帮助中心</a></li>
                </span>

                    </ul>
                </div>
                <div class="row links">
                    <div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
                        <p class="owner">版权©bestLeo 版权所有<span class="col-xs-0">&nbsp;&nbsp;&nbsp;&nbsp;网络经营许可证 川 ICP 备 XXXXXXX 号-XX</span></p>
                    </div>
                </div>
            </div>
        </footer>
    </div>


    <script src="./lib/jquery/jquery-3.3.1.min.js"></script>
    <script src="./lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="./lib/swiper/swiper-3.4.2.min.js"></script>
    <script src="./lib/echarts/echarts.common.min.js"></script>
    <script src="./lib/vue/vue.min.js"></script>
    <script src="./lib/axios/axios.min.js"></script>
    <script src="./js/share.js"></script>
    <script src="./js/wx_sell.js"></script>
</body>
</html>
