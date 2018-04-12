/**
 * 获取当前系统公司用户量
 */
axios.get('/SYWeiServers/companies/total')
    .then(function (response) {
        if(response.data.code == 200){
            var companyNumber = document.getElementById('company_number');
            companyNumber.innerHTML = response.data.data;
        }
        else{
            console.log(response.data.message);
            // console.log(response.data.message);
        }
    })
    .catch(function (error) {
        // console.log(error);
        console.log(error);
    });

/**
 * 显示登录注册层
 * @param type login/register
 */
function showForm(type) {
    var fixed = document.getElementsByClassName('fixed-contain')[0];
    fixed.style.display = '';
    var fixedStyle = getComputedStyle(fixed);
    var type = document.getElementsByClassName(type + '-form')[0];
    type.style.display = '';
    var form = document.getElementsByClassName('form')[0];
    var formStyle = getComputedStyle(form);
    var outheight = parseInt(fixedStyle.height) / 2;
    var inheight = parseInt(formStyle.height) / 2;
    (function(obj, outheight, inheight){
        obj.style.marginTop = '-' + inheight + 'px';
        var start = -inheight;
        var end = outheight - inheight - 100;
        var intervalId = setInterval(function () {
            start += 5;
            if(start > end){
                clearInterval(intervalId);
            }
            else{
                obj.style.marginTop = start + 'px';
            }
        }, 7);
    }(form, outheight, inheight));
}

/**
 * 隐藏登录注册层
 */
function hiddenForm() {
    var form = document.getElementsByClassName('form')[0];
    var formMarginTop = parseInt(form.style.marginTop.substring(0, form.style.marginTop.length - 2));
    var login = document.getElementsByClassName('login-form')[0];
    var register = document.getElementsByClassName('register-form')[0];
    var fixed = document.getElementsByClassName('fixed-contain')[0];

    var intervalId = setInterval(function () {
        formMarginTop -= 5;
        if(formMarginTop < -300){
            clearInterval(intervalId);
            login.style.display = 'none';
            register.style.display = 'none';
            fixed.style.display = 'none';
        }
        else{
            form.style.marginTop = formMarginTop + 'px';
        }
    }, 7);
}

/**
 * 登陆注册 遮蔽层响应事件
 */
var fixedContain = document.getElementsByClassName('fixed-contain')[0];
fixedContain.addEventListener('click', function (event) {
    hiddenForm();
});

/**
 * 登录注册 form阻止事件冒泡
 */
var formContain = document.getElementsByClassName('form')[0];
formContain.addEventListener('click', function (event) {
    event.stopPropagation();
});

/**
 * 登录注册点击弹出框响应事件
 * @type {NodeList}
 */
var nav_alist = document.getElementsByClassName('nav-command')[0].getElementsByTagName('a');
nav_alist[nav_alist.length - 2].addEventListener('click', function (event) {
    console.log('登录');
    showForm('login');
});
nav_alist[nav_alist.length - 1].addEventListener('click', function (event) {
    console.log('注册');
    showForm('register');
});

/**
 * 登录，注册请求
 */
var loginForm = document.forms.login;
loginForm.loginBtn.addEventListener('click', function (event) {
    event.preventDefault();
    var companyno = loginForm.companyNo.value;
    var password = loginForm.password.value;
    if(companyno == ''){
        showToast(false, '用户名不可为空');
        return;
    }
    if(password == ''){
        showToast(false, '密码不可为空');
        return;
    }
    axios.post('/SYWeiServers/companies/login', {
        companyno: companyno,
        password: password
    })
        .then(function (response) {
            if(response.data.code == 200){
                sessionStorage.setItem('company', JSON.stringify(response.data.data));
                // sessionStorage.setItem('dbname', JSON.stringify(response.data.data.dbname));
                var user = {
                    name: '管理员',
                    email: response.data.data.email,
                    tel: response.data.data.tel
                }
                sessionStorage.setItem('user', JSON.stringify(user));
                sessionStorage.setItem('permission', true);
                showToast(true, '登录成功');
                location.assign('./company.jsp');
            }
            else{
                showToast(false, response.data.message);
                // console.log(response.data.message);
            }
        })
        .catch(function (error) {
            // console.log(error);
            showToast(false, error);
        });
});
var registerForm = document.forms.register;
registerForm.registerBtn.addEventListener('click', function (event) {
    event.preventDefault();
    var companyno = registerForm.companyNo.value;
    var password = registerForm.password.value;
    var repassword = registerForm.repassword.value;
    var companyname = registerForm.companyName.value;
    var dbname = registerForm.dbName.value;
    if(companyno == ''){
        showToast(false, '用户名不可为空');
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
    if(companyname == ''){
        showToast(false, '公司名称不可为空');
        return;
    }
    if(dbname == ''){
        showToast(false, '独立数据库名不可为空');
        return;
    }
    axios.post('/SYWeiServers/companies/register', {
        companyno: companyno,
        password: password,
        companyname: companyname,
        dbname: dbname
    })
        .then(function (response) {
            if(response.data.code == 200){
                // sessionStorage.setItem('company', JSON.stringify(response.data.data));
                showToast(true, '注册成功，并创建独立数据库，转至登录');
                hiddenForm();
                showForm('login');
                loginForm.companyno.value = companyno;
                loginForm.password.value = password;
                // location.assign('./company.jsp');
            }
            else{
                showToast(false, response.data.message);
                // console.log(response.data.message);
            }
        })
        .catch(function (error) {
            // console.log(error);
            showToast(false, error);
        });
});

/**
 * 平台优势 单项动画
 * @type {NodeList}
 */
var advantage_list = document.getElementsByClassName('advantage-item');
var i = 0;
for(i = 0; i < advantage_list.length; i++){
    advantage_list[i].addEventListener('mouseenter', function (event) {
        var obj = event.target;
        var name = obj.getElementsByClassName('name')[0];
        var img = obj.getElementsByTagName('img')[0];
        name.style.color = 'tomato';
        img.className = 'advantage-animation';
    });
    advantage_list[i].addEventListener('mouseleave', function (event) {
        var obj = event.target;
        var name = obj.getElementsByClassName('name')[0];
        var img = obj.getElementsByTagName('img')[0];
        name.style.color = '#2b2a28';
        img.className = '';
    });
}

/**
 * 平台实例 单项遮蔽响应
 * @type {NodeList}
 */
var case_list = document.getElementsByClassName('case-item');
var j = 0;
for(j = 0; j < case_list.length; j++){
    case_list[j].addEventListener('mouseenter', function (event) {
        var obj = event.target;
        var name = obj.getElementsByClassName('name')[0];
        var text = obj.getElementsByClassName('text')[0];
        var hr = obj.getElementsByTagName('hr')[0];
        var command = obj.getElementsByClassName('case-item-command')[0];
        var hidden = obj.getElementsByClassName('case-item-hidden')[0];
        name.style.color = 'white';
        text.style.color = 'white'
        hr.style.color = 'rgba(255, 94, 1, 0.3)';
        command.style.color = 'white';
        hidden.style.backgroundColor = 'rgba(255, 94, 1, 0.8)';
    });
    case_list[j].addEventListener('mouseleave', function (event) {
        var obj = event.target;
        var name = obj.getElementsByClassName('name')[0];
        var text = obj.getElementsByClassName('text')[0];
        var hr = obj.getElementsByTagName('hr')[0];
        var command = obj.getElementsByClassName('case-item-command')[0];
        var hidden = obj.getElementsByClassName('case-item-hidden')[0];
        name.style.color = '#515151';
        text.style.color = '#bbb'
        hr.style.color = '#bbb';
        command.style.color = '#bbb';
        hidden.style.backgroundColor = 'rgba(255, 94, 1, 0)';
    });
}