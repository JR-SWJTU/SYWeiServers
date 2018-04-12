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
        permissionFlag: false,

        employeeList: [],
        employee_sex: '全部',
        employee_status: '全部',
        employee_input: '',
        employeeSelectRowsIndex: [],
        employeeTotal: 5,
        employeePageCurrent: 1,

        estateList: [],
        estate_usage: '全部',
        estate_type: '全部',
        estate_input: '',
        estateSelectRowsIndex: [],
        estateTotal: 5,
        estatePageCurrent: 1,

        propertyList: [],
        property_decoration: '全部',
        property_direction: '全部',
        property_input: '',
        propertySelectRowsIndex: [],
        propertyTotal: 5,
        propertyPageCurrent: 1,
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
                showToast(false, '无法确定公司网页');
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
                showToast(false, '未登录');
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
            this.employeeSearch();
        },
        /**
         * 楼盘页切换
         */
        estatePage: function () {
            console.log('estatePage');
            this.pageState = 'estate';
            this.estateSearch();
        },
        /**
         * 房源页切换
         */
        propertyPage: function () {
            console.log('propertyPage');
            this.pageState = 'property';
            this.propertySearch();
        },
        /**
         * 公众号链接获取
         */
        weiXinLink: function(){
            console.log('weiXinLink');
        },

        /**
         * 获取员工总页数
         */
        getEmployeeTotal: function(res){
            var that = this;
            axios.get('/employees/total', {
                params: res
            }).then(function (response) {
                if(response.data.code == 200){
                    that.employeeTotal = parseInt(response.data.data);
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         *  获取employeeList
         */
        getEmployeeList: function (num, res) {
            // console.log(res);
            this.employeePageCurrent = num;
            this.getEmployeeTotal(res);
            var that = this;
            axios.get('/employees', {
                params: {
                    sex: res.sex,
                    status: res.status,
                    tel: res.tel,
                    empName: res.empName,
                    pageNum: num,
                    pageSize: 10
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    // console.log(response.data)
                    if(response.data.data.length > 0){
                        that.employeeList = response.data.data;
                        // that.employeePageCurrent = num;
                    }
                    else{
                        showToast(false, "下一页无数据");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 员工信息查询
         */
        employeeSearch: function(){
            var input = this.employee_input.trim();
            var res = {
                sex: this.employee_sex == '全部' ? null : this.employee_sex,
                status: this.employee_status == '全部' ? null : this.employee_status,
                tel: input == '' ? null : input,
                empName: input == '' ? null : input
            };
            this.getEmployeeList(1, res);
        },
        /**
         * 员工页码改变
         */
        employeePageChange: function ( ) {
            console.log(arguments);
            var input = this.employee_input.trim();
            var res = {
                sex: this.employee_sex == '全部' ? null : this.employee_sex,
                status: this.employee_status == '全部' ? null : this.employee_status,
                tel: input == '' ? null : input,
                empName: input == '' ? null : input
            };
            this.getEmployeeList(parseInt(arguments[0]), res);
        },
        /**
         * 员工全选
         */
        employeeSelectAll: function () {
            this.$refs.employee_table.selectAll();
        },
        /**
         * 员工取消全选
         */
        employeeNotSelectAll: function () {
            this.$refs.employee_table.unSelectAll();
        },
        /**
         * 员工选择监听
         */
        employeeSelectChange: function( selectedRowsIndex ){
            this.employeeSelectRowsIndex = selectedRowsIndex;
        },
        /**
         * 员工删除
         */
        employeeDelete: function () {
            var ids = [];
            var that = this;
            this.employeeSelectRowsIndex.forEach(function (item, index, arr) {
                ids.push(that.employeeList[item].empid);
            });
            axios.post('/employees/deleteEmployee', {
                ids: ids
            }).then(function (response) {
                if(response.data.code == 200){
                    if(response.data.data == 1) {
                        showToast(true, "删除成功");
                        that.$refs.employee_table.unSelectAll();
                        that.employeeSearch();
                    }
                    else{
                        showToast(false, "删除失败");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 员工添加
         */
        employeeAdd: function () {
            console.log('employAdd');
        },
        /**
         * 员工编辑
         */
        employeeEdit: function (item) {
            console.log('employEdit');
            console.log(item);
        },

        /**
         * 获取楼盘总页数
         */
        getEstateTotal: function(res){
            var that = this;
            axios.get('/estates/total', {
                params: res
            }).then(function (response) {
                if(response.data.code == 200){
                    that.estateTotal = parseInt(response.data.data);
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         *  获取estateList
         */
        getEstateList: function (num, res) {
            // console.log(res);
            this.estatePageCurrent = num;
            this.getEstateTotal(res);
            var that = this;
            axios.get('/estates', {
                params: {
                    // sex: res.sex,
                    // status: res.status,
                    // tel: res.tel,
                    // empName: res.empName,
                    pageNum: num,
                    pageSize: 10
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    // console.log(response.data)
                    if(response.data.data.length > 0){
                        that.estateList = response.data.data;
                        // that.estatePageCurrent = num;
                    }
                    else{
                        showToast(false, "下一页无数据");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 楼盘信息查询
         */
        estateSearch: function(){
            var input = this.estate_input.trim();
            var res = {
                // sex: this.employee_sex == '全部' ? null : this.employee_sex,
                // status: this.employee_status == '全部' ? null : this.employee_status,
                // tel: input == '' ? null : input,
                // empName: input == '' ? null : input
            };
            this.getEstateList(1, res);
        },
        /**
         * 楼盘页码改变
         */
        estatePageChange: function () {
            var input = this.estate_input.trim();
            var res = {
                // sex: this.employee_sex == '全部' ? null : this.employee_sex,
                // status: this.employee_status == '全部' ? null : this.employee_status,
                // tel: input == '' ? null : input,
                // empName: input == '' ? null : input
            };
            this.getEstateList(parseInt(arguments[0]), res);
        },
        /**
         * 楼盘全选
         */
        estateSelectAll: function () {
            this.$refs.estate_table.selectAll();
        },
        /**
         * 楼盘取消全选
         */
        estateNotSelectAll: function () {
            this.$refs.estate_table.unSelectAll();
        },
        /**
         * 楼盘选择监听
         */
        estateSelectChange: function( selectedRowsIndex ){
            this.estateSelectRowsIndex = selectedRowsIndex;
            // console.log(this.estateSelectRowsIndex);
        },
        /**
         * 楼盘删除
         */
        estateDelete: function () {
            var ids = [];
            var that = this;
            this.estateSelectRowsIndex.forEach(function (item, index, arr) {
                ids.push(that.estateList[item].estateid);
            });
            axios.post('/estates/deleteEstate', {
                ids: ids
            }).then(function (response) {
                if(response.data.code == 200){
                    if(response.data.data == 1) {
                        showToast(true, "删除成功");
                        that.$refs.estate_table.unSelectAll();
                        that.estateSearch();
                    }
                    else{
                        showToast(false, "删除失败");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 楼盘添加
         */
        estateAdd: function () {
            console.log('estateAdd');
        },
        /**
         * 楼盘编辑
         */
        estateEdit: function (item) {
            console.log('estateEdit');
            console.log(item);
        },

        /**
         * 获取房源总页数
         */
        getPropertyTotal: function(res){
            var that = this;
            axios.get('/properties/total', {
                params: res
            }).then(function (response) {
                if(response.data.code == 200){
                    that.propertyTotal = parseInt(response.data.data);
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         *  获取propertyList
         */
        getPropertyList: function (num, res) {
            // console.log(res);
            this.propertyPageCurrent = num;
            this.getPropertyTotal(res);
            var that = this;
            axios.get('/properties', {
                params: {
                    // sex: res.sex,
                    // status: res.status,
                    // tel: res.tel,
                    // empName: res.empName,
                    pageNum: num,
                    pageSize: 10
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    // console.log(response.data)
                    if(response.data.data.length > 0){
                        that.propertyList = response.data.data;
                        // that.propertyPageCurrent = num;
                    }
                    else{
                        showToast(false, "无数据");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 房源信息查询
         */
        propertySearch: function(){
            var input = this.property_input.trim();
            var res = {
                // sex: this.employee_sex == '全部' ? null : this.employee_sex,
                // status: this.employee_status == '全部' ? null : this.employee_status,
                // tel: input == '' ? null : input,
                // empName: input == '' ? null : input
            };
            this.getPropertyList(1, res);
        },
        /**
         * 房源页码改变
         */
        propertyPageChange: function () {
            var input = this.property_input.trim();
            var res = {
                // sex: this.employee_sex == '全部' ? null : this.employee_sex,
                // status: this.employee_status == '全部' ? null : this.employee_status,
                // tel: input == '' ? null : input,
                // empName: input == '' ? null : input
            };
            this.getPropertyList(parseInt(arguments[0]), res);
        },
        /**
         * 房源全选
         */
        propertySelectAll: function () {
            this.$refs.property_table.selectAll();
        },
        /**
         * 房源取消全选
         */
        propertyNotSelectAll: function () {
            this.$refs.property_table.unSelectAll();
        },
        /**
         * 房源选择监听
         */
        propertySelectChange: function( selectedRowsIndex ){
            this.propertySelectRowsIndex = selectedRowsIndex;
            // console.log(this.propertySelectRowsIndex);
        },
        /**
         * 房源删除
         */
        propertyDelete: function () {
            var ids = [];
            var that = this;
            this.propertySelectRowsIndex.forEach(function (item, index, arr) {
                ids.push(that.propertyList[item].propertyid);
            });
            axios.post('/properties/deleteProperty', {
                ids: ids
            }).then(function (response) {
                if(response.data.code == 200){
                    if(response.data.data == 1) {
                        showToast(true, "删除成功");
                        that.$refs.property_table.unSelectAll();
                        that.propertySearch();
                    }
                    else{
                        showToast(false, "删除失败");
                    }
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 房源添加
         */
        propertyAdd: function () {
            console.log('propertyAdd');
        },
        /**
         * 房源编辑
         */
        propertyEdit: function (item) {
            console.log('propertyEdit');
            console.log(item);
        }
    },
    computed: {

    },
    watch: {
        employee_sex: function (val, oldVal) {
            var input = this.employee_input.trim();
            var res = {
                sex: val == '全部' ? null : val,
                status: this.employee_status == '全部' ? null : this.employee_status,
                tel: input == '' ? null : input,
                empName: input == '' ? null : input
            };
            this.getEmployeeList(1, res);
        },
        employee_status: function (val, oldVal) {
            var input = this.employee_input.trim();
            var res = {
                status: val == '全部' ? null : val,
                sex: this.employee_sex == '全部' ? null : this.employee_sex,
                tel: input == '' ? null : input,
                empName: input == '' ? null : input
            };
            this.getEmployeeList(1, res);
        }
    },
    mounted: function () {
        /**
         * 获取session中company记录，或根据url确定公司用户
         */
        var that = this;
        var companyNo = getQueryString('no');
        if(companyNo == '' || companyNo == null){
            this.testSessionCompany();
        }
        else{
            sessionStorage.removeItem('user');
            sessionStorage.removeItem('permission');
            axios.get('/companies/find', {
                params: {
                    companyno: companyNo
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    sessionStorage.setItem('company', JSON.stringify(response.data.data));
                    // sessionStorage.setItem('dbname', JSON.stringify(response.data.data.dbname));
                    that.company = response.data.data;
                    document.title = this.company.companyname;
                    that.randomUserIcon();
                    // that.testSessionUser();
                    console.log(this.company);
                }
                else{
                    showToast(false, response.data.message);
                    that.testSessionCompany();
                }
            }).catch(function (error) {
                // console.log(error);
                showToast(false, error);
                that.testSessionCompany();
            });
        }
    }
})
