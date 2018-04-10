/**
 * 获取url自带参数
 * @param name 参数名
 * @returns {*}
 * @constructor
 */
function getQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

/**
 * 获取session中company记录，或根据url确定公司用户
 */
var companyNo = getQueryString('no');
var company = null;
if(companyNo == '' || companyNo == null){
    testSessionCompany();
}
else{
    axios.get('/companies/find', {
        params: {
            companyno: companyNo
        }
    }).then(function (response) {
        if(response.data.code == 200){
            sessionStorage.setItem('company', JSON.stringify(response.data.data));
            company = response.data.data;
            document.title = company.companyname;
        }
        else{
            console.log(response.data.message);
            testSessionCompany();
        }
    })
        .catch(function (error) {
            // console.log(error);
            console.log(error);
            testSessionCompany();
        });
}
function testSessionCompany() {
    company = sessionStorage.getItem('company');
    if(company == null || company == ''){
        console.log('无法确定公司网页');
        location.assign('./error.jsp')
    }
    else{
        company = JSON.parse(company);
        console.log(company);
        document.title = company.companyname;
    }
}
