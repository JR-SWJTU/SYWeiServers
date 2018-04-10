/**
 * toast展示
 * @param type
 * @param message
 */
function showToast( type, message ) {
    var toast = document.getElementsByClassName('toast')[0];
    var toastMes = toast.getElementsByTagName('div')[0];
    if(type){
        toastMes.className = 'toast-success';
    }
    else{
        toastMes.className = 'toast-error';
    }
    toastMes.innerHTML = message;
    toast.style.display = '';
    setTimeout(function () {
        toast.style.display = 'none';
    }, 1500);
}

/**
 * 获取url自带参数
 * @param name 参数名
 * @returns {*}
 * @constructor
 */
function getQueryString(name) {
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}