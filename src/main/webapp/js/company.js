/**
 * vue app
 */
var app = new Vue({
    el: '#app',
    data: {
        openFlag: true,
        pageState: 'home',
        company: null,
        userInfoSrc: './source/image/info_icon_0.png',
        user: null,
        loginFlag: false,
        permissionFlag: false
    },
    methods: {
        /**
         * 侧NAV响应
         */
        navChange: function () {
            this.openFlag = !this.openFlag;
        },
        /**
         * 提取session公司信息
         */
        testSessionCompany: function () {
            this.company = sessionStorage.getItem('company');
            if(this.company == null || this.company == ''){
                console.log('无法确定公司网页');
                location.assign('./error.jsp')
            }
            else{
                this.company = JSON.parse(this.company);
                document.title = this.company.companyname;
                this.randomUserIcon();
                this.testSessionUser();
                console.log(this.company);
            }
        },
        /**
         * 提取session用户信息
         */
        testSessionUser: function () {
            this.user = sessionStorage.getItem('user');
            if(this.user == null || this.user == ''){
                console.log('未登录');
                this.loginFlag = false;
            }
            else{
                this.user = JSON.parse(this.user);
                this.loginFlag = true;
                this.permissionFlag = sessionStorage.getItem('permission') == 'true' ? true : false;
            }
        },
        /**
         * 随机用户头像
         */
        randomUserIcon: function () {
            this.userInfoSrc = './source/image/info_icon_' + Math.floor(Math.random() * 10) + '.png';
        },
        /**
         * 登录框显示
         */
        loginDialog: function(){
            console.log('loginDialog');
        },
        /**
         * 注册框显示
         */
        registerDialog: function(){
            console.log('registerDialog');
        },
        /**
         * 个人信息框显示
         */
        infoDialog: function () {
            console.log('userinfo');
        },
        /**
         * 主题框显示
         */
        themeDialog: function(){
            console.log('themeDialog');
        },
        /**
         * 退出登录确认框显示
         */
        logoutConfirm: function () {
            this.loginFlag = false;
            this.permissionFlag = false;
            this.user = null;
            sessionStorage.removeItem('user');
            sessionStorage.removeItem('permission');
        },
        /**
         * 帮助框显示
         */
        helpDialog: function () {
            console.log('helpDialog');
        },
        /**
         * 主页切换
         */
        homePage: function () {
            console.log('homePage');
            this.pageState = 'home';
        },
        /**
         * 员工页切换
         */
        employeePage: function () {
            console.log('employeePage');
            this.pageState = 'employee';
        },
        /**
         * 楼盘页切换
         */
        estatePage: function () {
            console.log('estatePage');
            this.pageState = 'estate';
        },
        /**
         * 房源页切换
         */
        propertyPage: function () {
            console.log('propertyPage');
            this.pageState = 'property';
        },
    },
    computed: {

    },
    mounted: function () {
        /**
         * 获取session中company记录，或根据url确定公司用户
         */
        var companyNo = getQueryString('no');
        if(companyNo == '' || companyNo == null){
            this.testSessionCompany();
        }
        else{
            axios.get('/companies/find', {
                params: {
                    companyno: companyNo
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    sessionStorage.setItem('company', JSON.stringify(response.data.data));
                    this.company = response.data.data;
                    document.title = this.company.companyname;
                    this.randomUserIcon();
                    this.testSessionUser();
                    console.log(this.company);
                }
                else{
                    console.log(response.data.message);
                    this.testSessionCompany();
                }
            }).catch(function (error) {
                // console.log(error);
                console.log(error);
                this.testSessionCompany();
            });
        }
    }
})
