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
    <link rel="stylesheet" href="./css/wx_home.css" />
    <link rel="stylesheet" href="./css/wx_foot.css" />
</head>
<body>
    <div class="app">
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
                            <li><a href="#">短租公寓</a></li>
                            <li><a href="#">小区</a></li>
                            <li><a href="#">门店</a></li>
                            <li><a href="#">经纪人</a></li>
                            <li><a href="#">加入房产联盟</a></li>
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
                                        <li><a href="#">短租公寓</a></li>
                                        <li><a href="#">小区</a></li>
                                        <li><a href="#">门店</a></li>
                                        <li><a href="#">经纪人</a></li>
                                        <li><a href="#">加入房产联盟</a></li>
                                    </ul>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
                <div class="row box">
                    <ul class="col-xs-0">
                        <li><a href="#">二手房</a></li>
                        <li><a href="#">租房</a></li>
                        <li><a href="#">小区</a></li>
                        <li><a href="#">公司门店</a></li>
                        <li><a href="#">短租公寓</a></li>
                        <li><a href="#">经纪人</a></li>
                    </ul>
                    <div class="inputBox">
                        <input type="text" placeholder="请输入区域、商圈或小区名">
                        <div class="searchBtn">
                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                <path fill-rule="evenodd" d="M246.808,223.426 C247.284002,223.426 247.722665,223.307001 248.124,223.069 C248.525335,222.830999 248.842666,222.511335 249.076,222.11 C249.309335,221.708665 249.426,221.270002 249.426,220.794 C249.426,220.317998 249.309335,219.879335 249.076,219.478 C248.842666,219.076665 248.525335,218.759334 248.124,218.526 C247.722665,218.292665 247.284002,218.176 246.808,218.176 C246.331998,218.176 245.893335,218.292665 245.492,218.526 C245.090665,218.759334 244.771001,219.076665 244.533,219.478 C244.294999,219.879335 244.176,220.317998 244.176,220.794 C244.176,221.270002 244.294999,221.708665 244.533,222.11 C244.771001,222.511335 245.090665,222.830999 245.492,223.069 C245.893335,223.307001 246.331998,223.426 246.808,223.426 Z M250.308,223.426 L253.206,226.324 L252.324,227.206 L249.426,224.294 L249.426,223.832 L249.258,223.678 C248.931332,223.967335 248.555669,224.188999 248.131,224.343 C247.706331,224.497001 247.265336,224.574 246.808,224.574 C246.11733,224.574 245.480336,224.406002 244.897,224.07 C244.313664,223.733998 243.854002,223.281336 243.518,222.712 C243.172665,222.123997 243,221.48467 243,220.794 C243,220.10333 243.170332,219.466336 243.511,218.883 C243.851668,218.299664 244.313664,217.840002 244.897,217.504 C245.480336,217.167998 246.11733,217 246.808,217 C247.49867,217 248.137997,217.172665 248.726,217.518 C249.295336,217.854002 249.745665,218.31133 250.077,218.89 C250.408335,219.46867 250.574,220.10333 250.574,220.794 C250.574,221.260669 250.497001,221.706331 250.343,222.131 C250.188999,222.555669 249.967335,222.931332 249.678,223.258 L249.832,223.426 L250.308,223.426 Z" transform="translate(-241 -215)"/>
                            </svg>
                        </div>
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
                                    <a href="#">区域</a>
                                </li>
                                <li>
                                    <a href="#">地铁</a>
                                </li>
                            </div>
                            <div class="three">
                                <div class="third">
                                    <div class="li"><a href="#">新都区</a></div>
                                    <div class="li"><a href="#">成华区</a></div>
                                    <div class="li"><a href="#">高新区</a></div>
                                    <div class="li"><a href="#">新都区</a></div>
                                </div>
                                <div class="third">
                                    <div class="li"><a href="#">1号线</a></div>
                                    <div class="li"><a href="#">1号线</a></div>
                                    <div class="li"><a href="#">1号线</a></div>
                                    <div class="li"><a href="#">1号线</a></div>
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
                                <div class="li"><a href="#" class="aactive">不限</a></div>
                                <div class="li"><a href="#">40万以下</a></div>
                                <div class="li"><a href="#">40万-60万</a></div>
                                <div class="li"><a href="#">60万-80万</a></div>
                                <div class="li"><a href="#">80万-100万</a></div>
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
                                <div class="li"><a href="#">一室</a></div>
                                <div class="li"><a href="#">一室</a></div>
                                <div class="li"><a href="#">一室</a></div>
                                <div class="li"><a href="#">一室</a></div>
                            </div>
                            <div class="sure">确定</div>
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
                                    <span>朝东</span>
                                    <span>朝西</span>
                                    <span>朝南</span>
                                    <span>朝北</span>
                                </div>
                                <div class="box">
                                    <h2>面积</h2>
                                    <span>50平以下</span>
                                    <span>50-60平</span>
                                    <span>60-80平</span>
                                    <span>80-100平</span>
                                </div>
                                <div class="box">
                                    <h2>标签</h2>
                                    <span>不看地下室</span>
                                    <span>随时看房</span>
                                    <span>不看车库</span>
                                    <span>随时看房</span>
                                </div>
                                <div class="box">
                                    <h2>类型</h2>
                                    <span>塔楼</span>
                                    <span>板房</span>
                                    <span>砖房</span>
                                </div>
                                <div class="box">
                                    <h2>楼龄</h2>
                                    <span>5年以下</span>
                                    <span>5-10年</span>
                                    <span>10-15年</span>
                                    <span>15-20年</span>
                                </div>
                                <div class="box">
                                    <h2>楼层</h2>
                                    <span>低层</span>
                                    <span>中层</span>
                                    <span>高层</span>
                                </div>
                                <div class="box">
                                    <h2>装修</h2>
                                    <span>精装修</span>
                                    <span>普通装修</span>
                                    <span>毛坯房</span>
                                </div>
                                <div class="box">
                                    <h2>电梯</h2>
                                    <span>有电梯</span>
                                    <span>没有电梯</span>
                                </div>
                                <div class="box">
                                    <h2>用途</h2>
                                    <span>普通住宅</span>
                                    <span>商业使用</span>
                                    <span>别墅</span>
                                    <span>四合院</span>
                                </div>
                                <div class="box">
                                    <h2>交易权属</h2>
                                    <span>公房</span>
                                    <span>朝西</span>
                                    <span>经济房</span>
                                    <span>其他</span>
                                </div>
                            </div>
                            <div class="clear_if">清空条件</div>
                            <div class="sure">确定</div>
                        </ul>
                    </div>
                </div>
            </div>
        </section>
        <div class="sortBtn">
            <i class="icon-sort"></i>
            <span>排序</span>
        </div>
        <section class="sort-block">
            <div class="panel"></div>
            <ul>
                <li><a class="aactive" href="#">默认排序</a></li>
                <li><a href="#">最新发布</a></li>
                <li><a href="#">最近热门</a></li>
                <li><a href="#">租金（由低到高）</a></li>
                <li><a href="#">租金（由高到低）</a></li>
            </ul>
        </section>
        <section>
            <div class="container col-xs-0">
                <div class="choose">
                    <ul class="district row">
                        <div class="col-lg-1">
                            <li><span>区域：</span></li>
                        </div>
                        <div class="col-lg-11">
                            <li><a href="#" class="aactive">全部</a></li>
                            <li><a href="#">青羊</a></li>
                            <li><a href="#">锦江</a></li>
                            <li><a href="#">金牛</a></li>
                            <li><a href="#">武侯</a></li>
                            <li><a href="#">成华</a></li>
                            <li><a href="#">高新区</a></li>
                            <li><a href="#">天府新区</a></li>
                            <li><a href="#">温江</a></li>
                            <li><a href="#">龙泉驿</a></li>
                            <li><a href="#">双流</a></li>
                            <li><a href="#">都江堰</a></li>
                            <li><a href="#">郫都</a></li>
                            <li><a href="#">新都</a></li>
                            <li><a href="#">青白江</a></li>
                            <li><a href="#">新津</a></li>
                            <li><a href="#">金堂</a></li>
                            <li><a href="#">彭州</a></li>
                            <li><a href="#">崇州</a></li>
                            <li><a href="#">蒲江</a></li>
                            <li><a href="#">简阳</a></li>
                            <li><a href="#">大邑</a></li>
                            <li><a href="#">邛崃</a></li>
                            <li><a href="#">成都周边</a></li>
                        </div>
                        <div class="cityBox">
                            <li><a href="#" class="aactive">不限</a></li>
                            <li><span class="char">A</span><a href="#">啊里</a><a href="#">阿里郎</a></li>
                            <li><span class="char">B</span><a href="#">八宝街</a><a href="#">贝森</a></li>
                            <li><span class="char">C</span><a href="#">草市街</a><a href="#">草堂</a></li>
                            <li><span class="char">F</span><a href="#">府南新区</a><a href="#">阿里郎</a></li>
                            <li><span class="char">G</span><a href="#">光华泡小</a><a href="#">阿里郎</a></li>
                            <li><span class="char">H</span><a href="#">浣花溪</a><a href="#">阿里郎</a></li>
                            <li><span class="char">J</span><a href="#">金沙</a><a href="#">阿里郎</a></li>
                            <li><span class="char">K</span><a href="#">宽窄巷子</a><a href="#">阿里郎</a></li>
                        </div>
                    </ul>
                    <ul class="price row">
                        <div class="col-lg-1">
                            <li><span>售价：</span></li>
                        </div>
                        <div class="col-lg-11">
                            <li><a href="#" class="aactive">全部</a></li>
                            <li><a href="#">40万以下</a></li>
                            <li><a href="#">40-50万</a></li>
                            <li><a href="#">50-60万</a></li>
                            <li><a href="#">60-80万</a></li>
                            <li><a href="#">80-100万</a></li>
                            <li><a href="#">100-120万</a></li>
                            <li><a href="#">120-150万</a></li>
                            <li><a href="#">150-200万</a></li>
                            <li><a href="#">200万以上</a></li>
                            <input class="low" type="text"><span>至</span>
                            <input class="high" type="text"><span>万</span>
                            <span class="comfirm span">确定</span>
                        </div>
                    </ul>
                    <ul class="area row">
                        <div class="col-lg-1">
                            <li><span>面积：</span></li>
                        </div>
                        <div class="col-lg-11">
                            <li><a href="#" class="aactive">全部</a></li>
                            <li><a href="#">50m²以下</a></li>
                            <li><a href="#">50-70m²</a></li>
                            <li><a href="#">70-90m²</a></li>
                            <li><a href="#">90-120m²</a></li>
                            <li><a href="#">120-144m²</a></li>
                            <li><a href="#">144-200m²</a></li>
                            <li><a href="#">200-300m²</a></li>
                            <li><a href="#">300m²以上</a></li>
                            <input class="low" type="text"><span>至</span>
                            <input class="high" type="text"><span>m²</span>
                            <span class="comfirm span">确定</span>
                        </div>
                    </ul>
                    <ul class="type row">
                        <div class="col-lg-1">
                            <li><span>房型：</span></li>
                        </div>
                        <div class="col-lg-11">
                            <li><a href="#" class="aactive">全部</a></li>
                            <li><a href="#">一室</a></li>
                            <li><a href="#">二室</a></li>
                            <li><a href="#">三室</a></li>
                            <li><a href="#">四室</a></li>
                            <li><a href="#">五室</a></li>
                            <li><a href="#">五室以上</a></li>
                        </div>


                    </ul>
                    <ul class="more row">
                        <div class="col-lg-1">
                            <li><span>更多：</span></li>
                        </div>
                        <div class="col-lg-11">
                            <select name="year" id="year">
                                <option value="0">建造年代</option>
                                <option value="1">建造年代</option>
                                <option value="2">建造年代</option>
                            </select>
                            <select name="houseType" id="houseType">
                                <option value="0">房屋类型</option>
                                <option value="1">板房</option>
                                <option value="2">砖房</option>
                            </select>
                            <select name="floor" id="floor">
                                <option value="0">楼层</option>
                                <option value="1">中层</option>
                                <option value="2">高层</option>
                            </select>
                            <select name="direction" id="direction">
                                <option value="0">朝向</option>
                                <option value="1">朝南</option>
                                <option value="2">朝北</option>
                            </select>
                            <select name="decoration" id="decoration">
                                <option value="0">装修</option>
                                <option value='1'>普通装修</option>
                                <option value="2">精装修</option>
                            </select>
                            <select name="agency" id="agency">
                                <option value="0">品牌中介</option>
                                <option value="1">68好房</option>
                                <option value="2">玛雅房屋</option>
                            </select>
                            <input type="checkbox" name="checkbox1" value="nearSubway">近地铁
                            <input type="checkbox" name="checkbox2" value="nearSchool">近学校
                            <input type="checkbox" name="checkbox3" value="good68">68 好房

                        </div>
                    </ul>
                </div>
            </div>
        </section>
        <section>
            <div class="container content">
                <div class="row">
                    <div class=" chose-block col-lg-9 col-md-9 col-sm-9">
                        <div class="sx col-xs-0">
                            <span>筛选：</span>
                            <input type="checkbox" value="2year">满两年
                            <input type="checkbox" value="5year">满五年
                            <input type="checkbox" value="better">优选
                            <input type="checkbox" value="new">新上
                            <input type="checkbox" value="">随时看房
                            <input type="checkbox" value="">不看商业类
                            <input type="checkbox" value="">不看地下室
                            <input type="checkbox" value="">不看车位
                        </div>
                        <div class="answer row">
                            <div class="col-lg-4">
                                <h3>共找到7550套成都新房</h3>
                            </div>
                            <div class="col-lg-8 col-xs-0">
                                <ul>
                                    <li>排序：</li>
                                    <li class="li-default li-btn"><a href="#" class="aactive">默认</a></li>
                                    <li class="li-newest li-btn"><a href="#">
                                        <span>最新</span>
                                        <svg class="rotate" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <polygon fill-rule="evenodd" points="152.676 217 157.352 221.676 152.676 226.352 151.85 225.526 155.112 222.25 148 222.25 148 221.102 155.112 221.102 151.85 217.826" transform="translate(-145 -215)"/>
                                        </svg>
                                    </a></li>
                                    <li class="li-total li-btn"><a href="#">
                                        <span>总价</span>
                                        <svg class="rotate" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <polygon fill-rule="evenodd" points="152.676 217 157.352 221.676 152.676 226.352 151.85 225.526 155.112 222.25 148 222.25 148 221.102 155.112 221.102 151.85 217.826" transform="translate(-145 -215)"/>
                                        </svg>
                                    </a></li>
                                    <li class="li-single li-btn"><a href="#">
                                        <span>单价</span>
                                        <svg class="rotate" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <polygon fill-rule="evenodd" points="152.676 217 157.352 221.676 152.676 226.352 151.85 225.526 155.112 222.25 148 222.25 148 221.102 155.112 221.102 151.85 217.826" transform="translate(-145 -215)"/>
                                        </svg>
                                    </a></li>
                                    <li class="li-area li-btn"><a href="#">
                                        <span>面积</span>
                                        <svg class="rotate" xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <polygon fill-rule="evenodd" points="152.676 217 157.352 221.676 152.676 226.352 151.85 225.526 155.112 222.25 148 222.25 148 221.102 155.112 221.102 151.85 217.826" transform="translate(-145 -215)"/>
                                        </svg>
                                    </a></li>
                                    <li class="li-clear"><a href="#">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <g fill="none" fill-rule="evenodd" transform="translate(-265 -215)">
                                                <path fill="#000" fill-rule="nonzero" d="M277.786957,219.40105 L274.556471,216.105073 C274.419157,215.964976 274.197528,215.964976 274.060214,216.105073 L267.102985,223.203343 C266.965672,223.343441 266.965672,223.570792 267.102985,223.710889 L269.297596,225.948761 L269.65413,226.36168 L269.65413,226.888889 L276.726991,226.888889 L276.726991,225.77917 L271.847536,225.77917 L277.785753,219.908596 C277.923066,219.768498 277.923066,219.541147 277.786957,219.40105 Z M272.944841,223.710889 L271.199512,225.490372 L269.968506,225.490372 L268.224381,223.710889 C268.087067,223.570792 268.087067,223.343441 268.224381,223.203343 L270.33588,221.049038 C270.473194,220.90894 270.694823,220.90894 270.832137,221.049038 L272.943637,223.203343 C273.082155,223.343441 273.082155,223.569563 272.944841,223.710889 Z"/>
                                                <rect width="14" height="14" x="265" y="215"/>
                                            </g>
                                        </svg>
                                        <span>清空条件</span>
                                    </a></li>
                                    <li class="li-save"><a href="#">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                            <path fill-rule="evenodd" d="M295.824,223.826 L298.008,225.128 L297.434,222.65 L299.38,220.942 L296.804,220.732 L295.824,218.38 L294.844,220.732 L292.268,220.942 L294.214,222.65 L293.64,225.128 L295.824,223.826 Z M301.648,220.214 L298.484,222.972 L299.436,227.074 L295.824,224.89 L292.212,227.074 L293.178,222.972 L290,220.214 L294.186,219.85 L295.824,216 L297.462,219.85 L301.648,220.214 Z" transform="translate(-289 -215)"/>
                                        </svg>
                                        <span>保存搜索</span>
                                    </a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="dataBox">
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
                                </div>
                            </div>
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
                                </div>
                            </div>
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
                                </div>
                            </div>
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
                                </div>
                            </div>
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
                                </div>
                            </div>
                            <div class="houseData row">
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-3 imgBox">
                                    <div class="img">
                                        <img src="./images/room-5.jpg" alt="">
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-9 detail">
                                    <h3>花样年家天下</h3>
                                    <div>
                                        <span>配套成熟</span>
                                        <span>品质小区</span>
                                        <span>拎包入住</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">凯丽美誉</a></li>
                                        <li>3室2厅</li>
                                        <li class="red1">82m²</li>
                                        <li>朝东</li>
                                        <li><a href="#">精装</a></li>
                                        <li>高层</li>

                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>低区（共 17 层）</li>
                                        <li>2004年建造</li>
                                        <li>神仙树商圈</li>
                                        <li>挂牌 2 天</li>
                                        <li>带看 7 次</li>
                                    </ul>
                                    <ul class="col-xs-0">
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M55.824,227.696 L54.984,226.926 C53.7146603,225.777994 52.8373358,224.956669 52.352,224.462 C51.5586627,223.659329 50.9846684,222.945336 50.63,222.32 C50.2099979,221.610663 50,220.901337 50,220.192 C50,219.603997 50.1423319,219.065002 50.427,218.575 C50.7116681,218.084998 51.0966642,217.700001 51.582,217.42 C52.0673358,217.139999 52.6086637,217 53.206,217 C53.7006691,217 54.181331,217.111999 54.648,217.336 C55.114669,217.560001 55.5066651,217.858665 55.824,218.232 C56.1413349,217.858665 56.533331,217.560001 57,217.336 C57.466669,217.111999 57.9519975,217 58.456,217 C59.0440029,217 59.5829976,217.139999 60.073,217.42 C60.5630024,217.700001 60.9479986,218.084998 61.228,218.575 C61.5080014,219.065002 61.648,219.603997 61.648,220.192 C61.648,220.901337 61.4426687,221.61533 61.032,222.334 C60.6679982,222.959336 60.0893373,223.673329 59.296,224.476 C58.8013309,224.989336 57.9286729,225.815328 56.678,226.954 L55.824,227.696 Z" transform="translate(-49 -215)"/>
                                            </svg>
                                            <span>269</span>
                                        </li>
                                        <li>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M80.132,218.898 L80.132,221.964 L82.75,223.518 L82.316,224.26 L79.25,222.398 L79.25,218.898 L80.132,218.898 Z M79.824,226.5 C80.6640042,226.5 81.4479964,226.285335 82.176,225.856 C82.8853369,225.445331 83.4453313,224.885337 83.856,224.176 C84.2853355,223.447996 84.5,222.664004 84.5,221.824 C84.5,220.983996 84.2853355,220.200004 83.856,219.472 C83.4453313,218.762663 82.8853369,218.202669 82.176,217.792 C81.4479964,217.362665 80.6640042,217.148 79.824,217.148 C78.9839958,217.148 78.2000036,217.362665 77.472,217.792 C76.7626631,218.202669 76.2026687,218.762663 75.792,219.472 C75.3626645,220.200004 75.148,220.983996 75.148,221.824 C75.148,222.664004 75.3626645,223.447996 75.792,224.176 C76.2026687,224.885337 76.7626631,225.445331 77.472,225.856 C78.2000036,226.285335 78.9839958,226.5 79.824,226.5 Z M79.824,216 C80.8880053,216 81.8726621,216.265997 82.778,216.798 C83.6553377,217.302003 84.3459975,217.992662 84.85,218.87 C85.3820027,219.775338 85.648,220.759995 85.648,221.824 C85.648,222.888005 85.3820027,223.872662 84.85,224.778 C84.3459975,225.655338 83.6553377,226.345997 82.778,226.85 C81.8726621,227.382003 80.8880053,227.648 79.824,227.648 C78.7599947,227.648 77.7753379,227.382003 76.87,226.85 C75.9926623,226.336664 75.3020025,225.641338 74.798,224.764 C74.2659973,223.858662 74,222.878672 74,221.824 C74,220.769328 74.2659973,219.789338 74.798,218.884 C75.3113359,218.006662 76.0066623,217.311336 76.884,216.798 C77.7893379,216.265997 78.7693281,216 79.824,216 Z" transform="translate(-73 -215)"/>
                                            </svg>
                                            <span>更新于 01-17-2017</span>
                                        </li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M107.324,224 L107.324,225.176 L106.148,225.176 L106.148,224 L107.324,224 Z M107.324,221.676 L107.324,222.824 L106.148,222.824 L106.148,221.676 L107.324,221.676 Z M108.5,226.324 L108.5,220.5 L103.824,220.5 L103.824,221.676 L105,221.676 L105,222.824 L103.824,222.824 L103.824,224 L105,224 L105,225.176 L103.824,225.176 L103.824,226.324 L108.5,226.324 Z M102.648,219.324 L102.648,218.176 L101.5,218.176 L101.5,219.324 L102.648,219.324 Z M102.648,221.676 L102.648,220.5 L101.5,220.5 L101.5,221.676 L102.648,221.676 Z M102.648,224 L102.648,222.824 L101.5,222.824 L101.5,224 L102.648,224 Z M102.648,226.324 L102.648,225.176 L101.5,225.176 L101.5,226.324 L102.648,226.324 Z M100.324,219.324 L100.324,218.176 L99.148,218.176 L99.148,219.324 L100.324,219.324 Z M100.324,221.676 L100.324,220.5 L99.148,220.5 L99.148,221.676 L100.324,221.676 Z M100.324,224 L100.324,222.824 L99.148,222.824 L99.148,224 L100.324,224 Z M100.324,226.324 L100.324,225.176 L99.148,225.176 L99.148,226.324 L100.324,226.324 Z M103.824,219.324 L109.648,219.324 L109.648,227.5 L98,227.5 L98,217 L103.824,217 L103.824,219.324 Z" transform="translate(-97 -215)"/>
                                            </svg>
                                            <span>富房不动产</span>
                                        </a></li>
                                        <li><a href="#">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 14 14">
                                                <path fill-rule="evenodd" d="M128.676,222.25 C129.245336,222.25 129.879997,222.338666 130.58,222.516 C131.364004,222.712001 131.998664,222.973332 132.484,223.3 C133.06267,223.692002 133.352,224.125998 133.352,224.602 L133.352,226.352 L124,226.352 L124,224.602 C124,224.125998 124.28933,223.692002 124.868,223.3 C125.353336,222.973332 125.987996,222.712001 126.772,222.516 C127.472003,222.338666 128.106664,222.25 128.676,222.25 Z M128.676,217 C129.096002,217 129.483332,217.104999 129.838,217.315 C130.192668,217.525001 130.474999,217.811998 130.685,218.176 C130.895001,218.540002 131,218.931998 131,219.352 C131,219.772002 130.895001,220.159332 130.685,220.514 C130.474999,220.868668 130.192668,221.150999 129.838,221.361 C129.483332,221.571001 129.096002,221.676 128.676,221.676 C128.255998,221.676 127.868668,221.571001 127.514,221.361 C127.159332,221.150999 126.877001,220.868668 126.667,220.514 C126.456999,220.159332 126.352,219.772002 126.352,219.352 C126.352,218.931998 126.456999,218.540002 126.667,218.176 C126.877001,217.811998 127.159332,217.525001 127.514,217.315 C127.868668,217.104999 128.255998,217 128.676,217 Z M128.676,223.37 C128.143997,223.37 127.579336,223.449333 126.982,223.608 C126.468664,223.748001 126.030002,223.915999 125.666,224.112 C125.301998,224.308001 125.12,224.471333 125.12,224.602 L125.12,225.232 L132.232,225.232 L132.232,224.602 C132.232,224.471333 132.050002,224.308001 131.686,224.112 C131.321998,223.915999 130.883336,223.748001 130.37,223.608 C129.772664,223.449333 129.208003,223.37 128.676,223.37 Z M128.676,218.12 C128.330665,218.12 128.039001,218.238999 127.801,218.477 C127.562999,218.715001 127.444,219.006665 127.444,219.352 C127.444,219.697335 127.562999,219.984332 127.801,220.213 C128.039001,220.441668 128.330665,220.556 128.676,220.556 C129.021335,220.556 129.312999,220.441668 129.551,220.213 C129.789001,219.984332 129.908,219.697335 129.908,219.352 C129.908,219.006665 129.789001,218.715001 129.551,218.477 C129.312999,218.238999 129.021335,218.12 128.676,218.12 Z" transform="translate(-121 -215)"/>
                                            </svg>

                                            <span>胡奉宇</span>
                                        </a></li>
                                    </ul>
                                    <ul class="showPrice">
                                        <h3 class="red">78</h3>
                                        <h3>8130(元/m²)</h3>
                                    </ul>
                                </div>
                                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-9 priceData">
                                    <div class="col-xs-0">
                                        <div class="f_right single" >
                                            <h3>8130 <span>(元/m²)</span></h3>
                                            <p class="col-xs-0">单价 (元/m²)</p>
                                        </div>
                                        <div class="f_right total" >
                                            <h3 class="red">78</h3>
                                            <p class="col-xs-0">总价 (万)</p>
                                        </div>
                                    </div>
                                    <h4 class="col-xs-0">小区均价 8570 元/m²</h4>
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
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="ad">
                            <img src="./images/ad1.png" alt="">
                        </div>
                        <div class="ad">
                            <img src="./images/ad2.png" alt="">
                        </div>
                        <div class="quest">
                            <div class="title">
                                <span class="h3">热门房产问答</span>
                                <span>全部></span>
                            </div>
                            <ul>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                                <a href="#"><li>怎样装修厨房更省钱</li></a>
                            </ul>
                            <div class="ask">我要提问</div>
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
                    <li><a href="＃">关于我们</a></li>
                    <li><a href="＃">加入我们</a></li>
                    <li><a href="＃">帮助中心</a></li>
                    <li><a href="＃">相关下载</a></li>
                    <li><a href="＃">房产联盟</a></li>
                </span>

                    </ul>
                </div>
                <div class="row links">
                    <div class="col-lg-10 col-md-10 col-sm-10 col-xs-12">
                        <p class="h3 col-xs-0">友情链接:</p>
                        <ul class=" col-xs-0">
                            <li><a href="#">农村别墅</a></li>
                            <li><a href="#">四川公务员考试网</a></li>
                            <li><a href="#">个人房源网</a></li>
                            <li><a href="#">生肖配对</a></li>
                            <li><a href="#">开店找项目</a></li>
                            <li><a href="#">上海二手房</a></li>
                            <li><a href="#">酒店加盟</a></li>
                            <li><a href="#">芥末留学网</a></li>
                            <li><a href="#">成都列表网</a></li>
                            <li><a href="#">服务众包需求</a></li>
                            <li><a href="#">动物园租房</a></li>
                            <li><a href="#">新双楠租房</a></li>
                            <li><a href="#">新都城区租房</a></li>
                            <li><a href="#">金堂租房</a></li>
                            <li><a href="#">城南宜家租房</a></li>
                            <li><a href="#">阳光城租房</a></li>
                            <li><a href="#">贝森租房</a></li>
                            <li><a href="#">川音租房</a></li>
                        </ul>
                        <p class="owner">版权©2016成都万云互联科技有限公司 版权所有<span class="col-xs-0">&nbsp;&nbsp;&nbsp;&nbsp;网络经营许可证 川 ICP 备 11024601 号-12</span></p>
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-0">
                        <div class="code">
                            <img src="./images/room-3.jpg" alt="">
                        </div>
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
