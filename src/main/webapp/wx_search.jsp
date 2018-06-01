<%--
  Created by IntelliJ IDEA.
  User: Leo
  Date: 2018/4/13
  Time: 14:44
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
                                        <li><a href="#">租房</a></li>
                                        <li><a href="#">经纪人</a></li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row box">
                    <div class="inputBox">
                        <input type="text" placeholder="请输入城市名、区域等" v-model="search_input">
                        <div class="searchBtn" @click="searchBtnClick">
                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                <path fill-rule="evenodd" d="M246.808,223.426 C247.284002,223.426 247.722665,223.307001 248.124,223.069 C248.525335,222.830999 248.842666,222.511335 249.076,222.11 C249.309335,221.708665 249.426,221.270002 249.426,220.794 C249.426,220.317998 249.309335,219.879335 249.076,219.478 C248.842666,219.076665 248.525335,218.759334 248.124,218.526 C247.722665,218.292665 247.284002,218.176 246.808,218.176 C246.331998,218.176 245.893335,218.292665 245.492,218.526 C245.090665,218.759334 244.771001,219.076665 244.533,219.478 C244.294999,219.879335 244.176,220.317998 244.176,220.794 C244.176,221.270002 244.294999,221.708665 244.533,222.11 C244.771001,222.511335 245.090665,222.830999 245.492,223.069 C245.893335,223.307001 246.331998,223.426 246.808,223.426 Z M250.308,223.426 L253.206,226.324 L252.324,227.206 L249.426,224.294 L249.426,223.832 L249.258,223.678 C248.931332,223.967335 248.555669,224.188999 248.131,224.343 C247.706331,224.497001 247.265336,224.574 246.808,224.574 C246.11733,224.574 245.480336,224.406002 244.897,224.07 C244.313664,223.733998 243.854002,223.281336 243.518,222.712 C243.172665,222.123997 243,221.48467 243,220.794 C243,220.10333 243.170332,219.466336 243.511,218.883 C243.851668,218.299664 244.313664,217.840002 244.897,217.504 C245.480336,217.167998 246.11733,217 246.808,217 C247.49867,217 248.137997,217.172665 248.726,217.518 C249.295336,217.854002 249.745665,218.31133 250.077,218.89 C250.408335,219.46867 250.574,220.10333 250.574,220.794 C250.574,221.260669 250.497001,221.706331 250.343,222.131 C250.188999,222.555669 249.967335,222.931332 249.678,223.258 L249.832,223.426 L250.308,223.426 Z" transform="translate(-241 -215)"/>
                            </svg>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <section>
            <div class="container content">
                <div class="row">
                    <div v-show="propertyList.length != 0" class="chose-block col-lg-9 col-md-9 col-sm-9" v-cloak>
                        <div class="dataBox">
                            <div class="houseData row" v-for="item, index in propertyList"  :key="index" v-cloak>
                                <div class="col-xs-3 imgBox">
                                    <div class="img">
                                        <img :src="(item.photourls && item.photourls.length != 0) ? item.photourls[0] : './source/image/wx/room-1.jpg'" alt="">
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
                                        <h3 class="red">{{ item.trade }}</h3>
                                        <h3>{{ item.trade == '出售' ? (item.price + item.unitname) : (item.rentprice + item.rentunitname) }}</h3>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="pageBox">
                            <div>
                                <span><<</span>
                                <span>1</span>
                                <span>2</span>
                                <span>3</span>
                                <span>>></span>
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
                                    <span class="price">88万</span>
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
    <script src="./js/wx_search.js"></script>
</body>
</html>
