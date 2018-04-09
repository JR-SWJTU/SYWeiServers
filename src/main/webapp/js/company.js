/**
 * 获取session中company记录，并修改页面title
 * @type {string | null}
 */
var company = sessionStorage.getItem('company');
company = JSON.parse(company);
console.log(company);

/**
 * 修改页面标题为公司名称
 */
document.title = company.companyname;
