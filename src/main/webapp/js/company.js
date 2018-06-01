/**
 * vue app
 */
var app = new Vue({
    el: '#app',
    data: {
        openFlag: true,
        pageState: 'home',
        company: {},
        userInfoSrc: './source/image/info_icon_0.png',
        user: {},
        loginFlag: false,
        permissionFlag: false,

        employeeList: [],
        employee_sex: '全部',
        employee_status: '全部',
        employee_input: '',
        employeeSelectRowsIndex: [],
        employeeTotal: 5,
        employeePageCurrent: 1,
        employeeAddDialog: false,
        addempno: '',
        addpasswordweb: '',
        addempname: '',
        addsex: '',
        addtel: '',
        now_employeeItem: {},
        employeeEditDialog: false,

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
        property_trade: '全部',
        property_room: '全部',
        property_input: '',
        propertySelectRowsIndex: [],
        propertyTotal: 5,
        propertyPageCurrent: 1,
        propertyAddressDialog: false,
        propertyPhotoDialog: false,
        now_propertyItem: {},

        wxLinkDialog: false,

        employeeNo: '',
        webPassword: '',
        adminFlag: false,
        loginDialog: false,

        reemployeeNo: '',
        rewebPassword: '',
        rerewebPassword: '',
        registerDialog: false,

        infoDialog: false,
    },
    methods: {
        /**
         * 侧NAV响应
         */
        navChange: function () {
            this.openFlag = !this.openFlag;
        },
        /**
         * 登录取消
         */
        loginDialogClose: function(){
            this.loginDialog = false;
        },
        /**
         * 注册取消
         */
        registerDialogClose: function(){
            this.registerDialog = false;
        },
        /**
         * 信息修改取消
         */
        infoDialogClose: function(){
            this.infoDialog = false;
        },
        /**
         * 登录确定
         */
        loginDialogOk: function(){
            var account = this.employeeNo.trim();
            var password = this.webPassword.trim();
            var flag = this.adminFlag ? "true" : "false";
            if(account == ''){
                showToast(false, '账号不可为空');
                return;
            }
            if(password == ''){
                showToast(false, '密码不可为空');
                return;
            }
            var that = this;
            axios.post('/SYWeiServers/employees/login', {
                empno: account,
                passwordweb: password,
                nativet: flag
            }).then(function (response) {
                if(response.data.code == 200){
                    showToast(true, '登录成功');
                    if(app.adminFlag){
                        sessionStorage.setItem('permission', true);
                        that.permissionFlag = true;
                    }
                    else{
                        sessionStorage.setItem('permission', false);
                        that.permissionFlag = false;
                    }
                    sessionStorage.setItem('user', JSON.stringify(response.data.data));
                    that.user = response.data.data;
                    that.loginDialog = false;
                    that.loginFlag = true;
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 注册确认
         */
        registerDialogOk: function(){
            var account = this.reemployeeNo.trim();
            var password = this.rewebPassword.trim();
            var repassword = this.rerewebPassword.trim();
            if(account == ''){
                showToast(false, '账号不可为空');
                return;
            }
            if(password == ''){
                showToast(false, '密码不可为空');
                return;
            }
            if(password != repassword){
                showToast(false, '两次密码不一致');
                return;
            }
            var that = this;
            axios.post('/SYWeiServers/employees/register', {
                empno: account,
                passwordweb: password,
                personalauthcode: '123456789'
            }).then(function (response) {
                if(response.data.code == 200){
                    showToast(true, '注册成功，转至登录');
                    that.registerDialog = false;
                    that.loginDialog = true;
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 信息修改确认
         */
        infoDialogOk: function(){
            var that = this;
            if(this.permissionFlag){
                axios.post('/SYWeiServers/companies/updateCompany', {
                    companyid: that.company.companyid,
                    companyname: that.company.companyname,
                    companyno: that.company.compannyno,
                    dbname: that.company.dbname,
                    tel: that.company.tel,
                    qq: that.company.qq,
                    email: that.company.email,
                    address: that.company.address,
                    remark: that.company.remark,
                    flagtrashed: false,
                    flagdeleted: false
                }).then(function (response) {
                    if(response.data.code == 200){
                        showToast(true, '公司信息更新成功');
                        that.infoDialog = false;
                    }
                    else{
                        showToast(false, response.data.message);
                    }
                }).catch(function (error) {
                    showToast(false, error);
                });
            }
            else{
                axios.post('/SYWeiServers/employees/updateEmployee', {
                    empid: that.user.empid,
                    empno: that.user.empno,
                    empname: that.user.empname,
                    deptid: "123456789",
                    tel: that.user.tel,
                    sex: that.user.sex,
                    brief: that.user.brief,
                    stutas: that.user.stutas,
                    flagtrashed: false,
                    flagdeleted: false,
                    flagsalary: false,
                    flagrollret: false,
                    tiger: "0",
                    personalauthcode: "123456789"
                }).then(function (response) {
                    if(response.data.code == 200){
                        showToast(true, '个人信息更新成功');
                        that.infoDialog = false;
                    }
                    else{
                        showToast(false, response.data.message);
                    }
                }).catch(function (error) {
                    showToast(false, error);
                });
            }
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
                this.openFlag = false;
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
        loginDialogOpen: function(){
            console.log('loginDialog');
            this.loginDialog = true;
        },
        /**
         * 注册框显示
         */
        registerDialogOpen: function(){
            console.log('registerDialog');
            this.registerDialog = true;
        },
        /**
         * 个人信息框显示
         */
        infoDialogOpen: function () {
            console.log('userinfo');
            this.infoDialog = true;
        },
        /**
         * 主题框显示
         */
        themeDialogOpen: function(){
            console.log('themeDialog');
        },
        /**
         * 退出登录确认框显示
         */
        logoutConfirmOpen: function () {
            this.loginFlag = false;
            this.openFlag = false;
            this.permissionFlag = false;
            this.user = null;
            sessionStorage.removeItem('user');
            sessionStorage.removeItem('permission');
        },
        /**
         * 帮助框显示
         */
        helpDialogOpen: function () {
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
            if(this.loginFlag){
                this.pageState = 'employee';
                this.employeeSearch();
            }
        },
        /**
         * 楼盘页切换
         */
        estatePage: function () {
            console.log('estatePage');
            if(this.loginFlag){
                this.pageState = 'estate';
                this.estateSearch();
            }
        },
        /**
         * 房源页切换
         */
        propertyPage: function () {
            console.log('propertyPage');
            if(this.loginFlag){
                this.pageState = 'property';
                this.propertySearch();
            }
        },
        /**
         * 公众号链接获取
         */
        weiXinLink: function(){
            console.log('weiXinLink');
            this.wxLinkDialog = true;
        },
        /**
         * wxLinkDialog关闭
         */
        wxLinkClose: function(){
            this.wxLinkDialog = false;
        },

        /**
         * 获取员工总页数
         */
        getEmployeeTotal: function(res){
            var that = this;
            axios.get('/SYWeiServers/employees/total', {
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
            axios.get('/SYWeiServers/employees', {
                params: {
                    empNo: res.empNo,
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
                        showToast(false, "该页无数据");
                        that.employeeList = [];
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
                empName: input == '' ? null : input,
                empNo: input == '' ? null : input
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
                empName: input == '' ? null : input,
                empNo: input == '' ? null : input
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
            axios.post('/SYWeiServers/employees/deleteEmployee', {
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
            this.employeeAddDialog = true;
        },
        employeeAddDialogClose: function(){
            this.employeeAddDialog = false
        },
        employeeAddDialogOk: function(){
            var res = {
                empno: this.addempno,
                passwordweb: this.addpasswordweb,
                empname: this.addempname,
                sex: this.addsex,
                tel: this.addtel,
                personalauthcode: '123456789'
            };
            var that = this;
            axios.post('/SYWeiServers/employees/register', res).then(function (response) {
                if(response.data.code == 200){
                    showToast(true, '员工注册添加成功');
                    that.employeeAddDialog = false;
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },
        /**
         * 员工编辑
         */
        employeeEdit: function (item) {
            console.log('employEdit');
            console.log(item);
            this.now_employeeItem = item;
            this.employeeEditDialog = true;
        },
        employeeEditDialogClose: function(){
            this.now_employeeItem = {};
            this.employeeEditDialog = false;
        },
        employeeEditDialogOk: function(){
            var that = this;
            axios.post('/SYWeiServers/employees/updateEmployee', that.now_employeeItem).then(function (response) {
                if(response.data.code == 200){
                    showToast(true, '员工信息修改成功');
                    that.employeeEditDialog = false;
                    var res = {
                        status: null,
                        sex: null,
                        tel: null,
                        empName: null,
                        empNo: null
                    };
                    that.getEmployeeList(1, res);
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },

        /**
         * 获取楼盘总页数
         */
        getEstateTotal: function(res){
            var that = this;
            axios.get('/SYWeiServers/estates/total', {
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
            axios.get('/SYWeiServers/estates', {
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
                        showToast(false, "该页无数据");
                        that.estateList = [];
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
            axios.post('/SYWeiServers/estates/deleteEstate', {
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
            axios.get('/SYWeiServers/properties/total', {
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
            res.pageNum = num;
            res.pageSize = 10;
            axios.post('/SYWeiServers/properties', res).then(function (response) {
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
            };
            if(input != ''){
                res.cityname = input;
                this.property_trade = '全部';
                this.property_decoration = '全部';
                this.property_direction = '全部';
                this.property_room = '全部';
            }
            else{
                if(this.property_trade != '全部'){
                    res.trade = this.property_trade;
                }
                if(this.property_decoration != '全部'){
                    res.propertydecoration = this.property_decoration;
                }
                if(this.property_direction != '全部'){
                    res.propertydirection = this.property_direction;
                }
                if(this.property_room != '全部'){
                    res.countf = this.property_room;
                }
            }
            this.getPropertyList(1, res);
        },
        /**
         * 房源页码改变
         */
        propertyPageChange: function () {
            var input = this.property_input.trim();
            var res = {
            };
            if(input != ''){
                res.cityname = input;
                this.property_trade = '全部';
                this.property_decoration = '全部';
                this.property_direction = '全部';
                this.property_room = '全部';
            }
            else{
                if(this.property_trade != '全部'){
                    res.trade = this.property_trade;
                }
                if(this.property_decoration != '全部'){
                    res.propertydecoration = this.property_decoration;
                }
                if(this.property_direction != '全部'){
                    res.propertydirection = this.property_direction;
                }
                if(this.property_room != '全部'){
                    res.countf = this.property_room;
                }
            }
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
            axios.post('/SYWeiServers/properties/deleteProperty', {
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
        propertyAddressEdit: function (item) {
            console.log('propertyAddressEdit');
            console.log(item);
            this.now_propertyItem = item;
            this.propertyAddressDialog = true;
        },
        propertyAddressDialogClose: function(){
            this.propertyAddressDialog = false;
            this.now_propertyItem = {};
        },
        propertyAddressDialogOk: function(){
            console.log("更新房源地址");
            var that = this;
            axios.post('/SYWeiServers/properties/updateProperty', that.extendCopy(that.now_propertyItem)).then(function (response) {
                if(response.data.code == 200){
                    showToast(true, "地址信息修改成功");
                    that.now_propertyItem = {};
                    that.propertyAddressDialog = false;
                }
                else{
                    showToast(false, response.data.message);
                }
            }).catch(function (error) {
                showToast(false, error);
            });
        },

        propertyPhotoEdit: function (item) {
            console.log('propertyPhotoEdit');
            console.log(item);
            this.now_propertyItem = item;
            this.propertyPhotoDialog = true;
        },
        propertyPhotoDialogClose: function(){
            this.propertyPhotoDialog = false;
            this.now_propertyItem = {};
        },
        propertyPhotoDialogOk: function(){
            console.log("更新房源地址");
            var that = this;
            setTimeout(function(){
                showToast(true, "图片信息修改成功");
            }, 100);
            that.propertyPhotoDialog = false;
        },
        propertyPhotoDialogDelete: function(index){
            this.now_propertyItem.photourls.splice(index, 1);
            showToast(true, "图片删除成功");
        },
        propertyPhotoDialogAdd: function(){
            var inputObj=document.createElement('input')
            inputObj.setAttribute('id','_ef');
            inputObj.setAttribute('type','file');
            inputObj.setAttribute("style",'visibility:hidden');
            document.body.appendChild(inputObj);
            inputObj.click();
            var that = this;
            setTimeout(function(){
                showToast(true, "图片信息上传成功");
                that.now_propertyItem.photourls.push('http://images.0101.cm/Photo/wzdc/Property/1705241641299B3FB41B6253810A1ED8/1705241642438D934ADEB3C1DA404E67.jpg');
            }, 2000);
        },

        propertyEdit: function (item) {
            console.log('propertyEdit');
            console.log(item);
        },


        extendCopy: function(p) {
            var c = {};
            for (var i in p) {
                if(i != 'photourls')
                    c[i] = p[i];
            }
            return c;
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
                empName: input == '' ? null : input,
                empNo: input == '' ? null : input
            };
            this.getEmployeeList(1, res);
        },
        employee_status: function (val, oldVal) {
            var input = this.employee_input.trim();
            var res = {
                status: val == '全部' ? null : val,
                sex: this.employee_sex == '全部' ? null : this.employee_sex,
                tel: input == '' ? null : input,
                empName: input == '' ? null : input,
                empNo: input == '' ? null : input
            };
            this.getEmployeeList(1, res);
        },
        property_trade: function (val, oldVal) {
            var res = {
            };
            if(val != '全部'){
                res.trade = val;
            }
            if(this.property_decoration != '全部'){
                res.propertydecoration = this.property_decoration;
            }
            if(this.property_direction != '全部'){
                res.propertydirection = this.property_direction;
            }
            if(this.property_room != '全部'){
                res.countf = this.property_room;
            }
            this.getPropertyList(1, res);
        },
        property_decoration: function (val, oldVal) {
            var res = {
            };
            if(val != '全部'){
                res.propertydecoration = val;
            }
            if(this.property_trade != '全部'){
                res.trade = this.property_trade;
            }
            if(this.property_direction != '全部'){
                res.propertydirection = this.property_direction;
            }
            if(this.property_room != '全部'){
                res.countf = this.property_room;
            }
            this.getPropertyList(1, res);
        },
        property_direction: function (val, oldVal) {
            var res = {
            };
            if(val != '全部'){
                res.propertydirection = val;
            }
            if(this.property_trade != '全部'){
                res.trade = this.property_trade;
            }
            if(this.property_decoration != '全部'){
                res.propertydecoration = this.property_decoration;
            }
            if(this.property_room != '全部'){
                res.countf = this.property_room;
            }
            this.getPropertyList(1, res);
        },
        property_room: function (val, oldVal) {
            var res = {
            };
            if(val != '全部'){
                res.countf = val;
            }
            if(this.property_trade != '全部'){
                res.trade = this.property_trade;
            }
            if(this.property_decoration != '全部'){
                res.propertydecoration = this.property_decoration;
            }
            if(this.property_direction != '全部'){
                res.propertydirection = this.property_direction;
            }
            this.getPropertyList(1, res);
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
            axios.get('/SYWeiServers/companies/find', {
                params: {
                    companyno: companyNo
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    sessionStorage.setItem('company', JSON.stringify(response.data.data));
                    // sessionStorage.setItem('dbname', JSON.stringify(response.data.data.dbname));
                    that.company = response.data.data;
                    document.title = that.company.companyname;
                    that.randomUserIcon();
                    // that.testSessionUser();

                    console.log(that.company);
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
});
