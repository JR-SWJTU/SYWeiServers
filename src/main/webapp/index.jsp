<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>房屋租赁微信公众号SAAS平台</title>
    <link rel="shortcut icon" href="./icon.png" />
    <link rel="stylesheet" href="./css/cssreset.css" />
    <link rel="stylesheet" href="./css/theme/main.css" />
    <link rel="stylesheet" href="./css/index.css"/>
</head>
<body>
<!--header start-->
    <a id="home"></a>
    <header>
        <div class="nav-contain">
            <div class="contain">
                <div class="logo">
                    <img src="./source/image/logo.png" alt="logo" />
                    <div class="vertical-bar"></div>
                    <span class="app-title">公众号SAAS平台</span>
                </div>
                <ul class="nav-command">
                    <li><a href="#home">首页</a></li>
                    <li><a href="#advantage">平台概览</a></li>
                    <li><a href="#case">案例</a></li>
                    <li><a href="#connection">联系我们</a></li>
                    <li class="vertical-bar"><span style="visibility: hidden">1</span></li>
                    <li><a href="#">登录</a></li>
                    <li><a href="#">注册</a></li>
                </ul>
            </div>
        </div>
        <div class="title-contain">
            <div class="contain">
                房屋租赁微信公众号 <span class="strong-text color-orange">SAAS</span> 平台
            </div>
        </div>
    </header>
<!--header end-->

<!--describe start-->
    <div class="describe-contain">
        <div class="contain">
            房屋租赁微信公众号SAAS平台，创新营销；注册商家 <span class="color-tomato">123</span> 家；服务客户 <span class="color-tomato">飞速增长</span>
        </div>
    </div>
<!--describe end-->

<!--advantage start-->
    <a id="advantage"></a>
    <div class="advantage-contain model-contain">
        <div class="contain">
            <h2 class="one-title">Advantages of Platform</h2>
            <h2 class="two-title">平台的优势</h2>
            <ul class="list">
                <li class="item advantage-item">
                    <img src="./source/image/weixin.png" alt="微信新型营销" />
                    <div class="name">微信新型营销</div>
                    <div class="text">借助微信广大用户特色，使用公众号推广营销，方便、快捷、有效且精确</div>
                </li>
                <li class="percent-vertical-bar"></li>
                <li class="item advantage-item">
                    <img src="./source/image/data.png" alt="独立数据库" />
                    <div class="name">独立数据库</div>
                    <div class="text">公司租户独享一个数据库实例，它提供了最强的分离度，租户的数据彼此物理不可见，备份与恢复都很灵活</div>
                </li>
                <li class="percent-vertical-bar"></li>
                <li class="item advantage-item">
                    <img src="./source/image/pointer.png" alt="一键轻松获取" />
                    <div class="name">一键轻松获取</div>
                    <div class="text">公司租户享有一键创建独立数据库，一键获取公众号网页链接，方便快捷</div>
                </li>
            </ul>
        </div>
    </div>
<!--advantage end-->

<!--case start-->
    <a id="case"></a>
    <div class="case-contain model-contain">
        <div class="contain">
            <h2 class="one-title">Cases</h2>
            <h2 class="two-title">案例</h2>
            <ul class="list">
                <li class="item">
                    <div class="case-item">
                        <img src="./source/image/case_logo.png" alt="logo">
                        <div class="name" style="color: #515151;">案例一</div>
                        <div class="text" style="color: #bbb;">
                            <p>描述一</p>
                            <p>描述二</p>
                        </div>
                        <hr  style="color: #bbb;"/>
                        <div class="case-item-command" style="color: #bbb;">点赞数</div>
                        <div class="case-item-hidden"></div>
                    </div>
                </li>
                <li class="item">
                    <div class="case-item">
                        <img src="./source/image/case_logo.png" alt="logo">
                        <div class="name" style="color: #515151;">案例二</div>
                        <div class="text" style="color: #bbb;">
                            <p>描述一</p>
                            <p>描述二</p>
                        </div>
                        <hr  style="color: #bbb;"/>
                        <div class="case-item-command" style="color: #bbb;">点赞数</div>
                        <div class="case-item-hidden"></div>
                    </div>
                </li>
                <li class="item">
                    <div class="case-item">
                        <img src="./source/image/case_logo.png" alt="logo">
                        <div class="name" style="color: #515151;">案例三</div>
                        <div class="text" style="color: #bbb;">
                            <p>描述一</p>
                            <p>描述二</p>
                        </div>
                        <hr style="color: #bbb;"/>
                        <div class="case-item-command" style="color: #bbb;">点赞数</div>
                        <div class="case-item-hidden" style="background-color: rgba(255, 94, 1, 0);"></div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
<!--case end-->

<!--footer start-->
    <a id="connection"></a>
    <div class="connection-contain">
        <div class="contain">
            <ul class="connection-ul">
                <li><a href="#">平台概览</a></li>
                <li><a href="#">关于我们</a></li>
            </ul>
        </div>
    </div>
    <footer class="foot-contain">
        <div class="contain">
            版权所有©Leo Copyright©trueland
        </div>
    </footer>
<!--footer end-->

<!--login-register start-->
    <div class="fixed-contain" style="display: none">
        <div class="form">
            <div class="login-form" style="display: none">
                <div class="top">
                    <img src="./source/image/logo.png" alt="" />
                </div>
                <form class="form-contain login-form-contain" name="login">
                    <p class="title">用户登录</p>
                    <div class="input-group">
                        <input class="block" type="text" name="companyNo" placeholder="请输入用户名" />
                        <!--<span>1</span>-->
                    </div>
                    <div class="input-group">
                        <input class="block" type="password" name="password" placeholder="请输入密码" />
                        <!--<span>2</span>-->
                    </div>
                    <div class="check-group">
                        <input id="memory" type="checkbox" name="memory" /><label for="memory">记住密码</label>
                    </div>
                    <button class="block" name="loginBtn">登录</button>
                </form>
            </div>

            <div class="register-form" style="display: none">
                <div class="top">
                    <img src="./source/image/logo.png" alt="" />
                </div>
                <form class="form-contain register-form-contain" name="register">
                    <p class="title">用户注册</p>
                    <div class="input-group">
                        <input class="block" type="text" name="" placeholder="请输入用户名" />
                        <!--<span>1</span>-->
                    </div>
                    <div class="input-group">
                        <input class="block" type="password" name="" placeholder="请输入密码" />
                        <!--<span>2</span>-->
                    </div>
                    <div class="input-group">
                        <input class="block" type="password" placeholder="请再次输入密码" />
                        <!--<span>2</span>-->
                    </div>
                    <div class="input-group">
                        <input class="block" type="password" placeholder="请输入公司全称" />
                        <!--<span>2</span>-->
                    </div>
                    <div class="input-group">
                        <input class="block" type="password" placeholder="请输入独立数据库名称（英文）" />
                        <!--<span>2</span>-->
                    </div>
                    <div style="height: 1px"></div>
                    <button class="block">注册</button>
                </form>
            </div>

            <div class="text">
                &copy;2018 - 房屋租赁微信公众号SAAS平台
            </div>
        </div>

    </div>
<!--login-register end-->

<!--toast start-->
    <div class="toast">

    </div>
<!--toast end-->

    <script src="./lib/axios/axios.min.js"></script>
    <script src="./js/index.js"></script>
</body>
</html>