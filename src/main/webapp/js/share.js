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