//a标签点击后样式改变
//PC端条件选择部分事件
$('.choose .district .col-lg-11 li').find('a').click(function(e){
    if($(this).parent('li').index()==0){
        $('.choose .district a').removeClass("aactive");
        $(this).addClass('aactive');
        $('.cityBox').slideUp();
    }else{
        $('.choose .district a').removeClass("aactive");
        $(this).addClass('aactive');
        $('.cityBox').hide();
        $('.cityBox li').eq(0).find('a').addClass('aactive');
        $('.cityBox').slideDown();
    }
});
$('.choose .cityBox a').click(function(){
    $('.choose .cityBox a').removeClass("aactive");
    $(this).addClass('aactive');
});
$('.price a').click(function(){
    $('.price a').removeClass("aactive");
    $(this).addClass('aactive');
    var text = $(this).text();
    var text2 = text.split('-');
    var low = parseInt(text2[0]);
    var high = parseInt(text2[1]);
    $('.price .comfirm').removeClass('comfirm');
    if (text.indexOf('上')!=-1){
        low = parseInt(text);
        high = '';
    }else if(text.indexOf('下')!=-1){
        low = "";
        high = parseInt(text);
    }else if(text.indexOf('全部')!=-1){
        low = '';
        high = "";
        $('.price .span').addClass('comfirm');
    }
    $('.price .low').val(low);
    $('.price .high').val(high);


});
$('.area a').click(function(){
    $('.area a').removeClass("aactive");
    $(this).addClass('aactive');
    var text = $(this).text();
    var text2 = text.split('-');
    var low = parseInt(text2[0]);
    var high = parseInt(text2[1]);
    $('.area .span').removeClass('comfirm');
    if (text.indexOf('上')!=-1){
        low = parseInt(text);
        high = '';
    }else if(text.indexOf('下')!=-1){
        low = "";
        high = parseInt(text);
    }else if(text.indexOf('全部')!=-1){
        low = '';
        high = "";
        $('.area .span').addClass('comfirm');
    }
    $('.area .low').val(low);
    $('.area .high').val(high);

});
$('.type a').click(function(){
    $('.type a').removeClass("aactive");
    $(this).addClass('aactive');
});
$('.price input').bind('input',function(){
    if($(this).val()!=''){
        $('.price a').removeClass("aactive");
        $('.price .span').removeClass('comfirm');
    }else{
        $('.price .col-lg-11 li').eq(0).find('a').addClass('aactive');
        $('.price .span').addClass('comfirm');
    }
});
$('.area input').bind('input',function(){
    if($(this).val()!=''){
        $('.area a').removeClass("aactive");
        $('.area .span').removeClass('comfirm');
    }else{
        $('.area .col-lg-11 li').eq(0).find('a').addClass('aactive');
        $('.area .span').addClass('comfirm');
    }
});

$('.answer .li-newest a').click(function(){//选择最新排序
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn').not('.li-newest').find('svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
    $(this).addClass('aactive');
    $(this).find('svg').toggleClass('totop').css({'fill':'#009688'});
});
$('.answer .li-total a').click(function(){//选择总价排序
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn').not('.li-total').find('svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
    $(this).addClass('aactive');
    $(this).find('svg').toggleClass('totop').css({'fill':'#009688'});
});
$('.answer .li-single a').click(function(){//选择单价排序
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn').not('.li-single').find('svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
    $(this).addClass('aactive');
    $(this).find('svg').toggleClass('totop').css({'fill':'#009688'});
});
$('.answer .li-area a').click(function(){//选择面积排序
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn').not('.li-area').find('svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
    $(this).addClass('aactive');
    $(this).find('svg').toggleClass('totop').css({'fill':'#009688'});
});
$('.answer .li-default a').click(function(){//选择默认排序
    $('.answer .li-btn a').removeClass('aactive');
    $(this).addClass('aactive');
    $('.answer .li-btn a svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
});
$('.answer .li-clear').find('a').click(function(){//清空条件
//        确定按钮消失
    $('.span').addClass('comfirm');
//        区域选择条件清空
    $('.district .cityBox').slideUp();
    $('.choose .cityBox a').removeClass("aactive");
    $('.choose .district a').removeClass("aactive");
    $('.choose .district .col-lg-11 li').eq(0).find('a').addClass('aactive');
//        售价条件选择清空
    $('.price .col-lg-11 li a').removeClass('aactive');
    $('.price .low,.price .high').val('');
    $('.price .col-lg-11 li').eq(0).find('a').addClass('aactive');
//      面积条件选择清空
    $('.area .col-lg-11 li a').removeClass('aactive');
    $('.area .low,.area .high').val('');
    $('.area .col-lg-11 li').eq(0).find('a').addClass('aactive');
//      房型条件选择清空
    $('.type .col-lg-11 li a').removeClass('aactive');
    $('.type .col-lg-11 li').eq(0).find('a').addClass('aactive');
//      更多条件选择清空
    $('.more select').val('0');
//        复选框条件清空
    $(":checkbox").removeAttr('checked');
//        恢复默认排序
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn a svg').removeClass('totop').css({'fill':'rgba(0,0,0,0.4)'});
    $('.answer .li-default a').addClass('aactive');
});
$('.answer .li-save').find('a').click(function(){//保存搜索
    $('.answer .li-btn a').removeClass('aactive');
    $('.answer .li-btn a svg').removeClass('totop');
});
var width = $(window).width();
$('.dropdown-menu').css({"width":width});//动态设置下拉菜单的宽度
$(window).resize(function(){
    width = $(window).width();
    $('.dropdown-menu').css({"width":width});//动态设置下拉菜单的宽度
    if(width>768){
        $('.sortBtn').hide();
    }
});
$(window).scroll(function(event){
//        console.log($(window).scrollTop());
    var top = $('.chose-block').height();
    if($(window).scrollTop()>150&&$(window).scrollTop()<top+150&&width<=768){
        $('.wapfind').addClass('fixed');
    }else {
        $('.wapfind').removeClass('fixed');
    }
    //根据滚动条位置判断排序按钮是否存在
    if($(window).scrollTop()<top+150&&width<=768){
        $('.sortBtn').fadeIn();
    }else {
        $('.sortBtn').fadeOut();
    }
});
//手机端排序按钮点击事件
$('.sort-block li a').click(function(){
    $('.sort-block li a').removeClass('aactive');
    $(this).addClass('aactive');
    $('.sort-block').fadeOut();
});
$('.wapfind .btn-group').click(function () {
    //点击正常页面的按钮，显示弹出层并激活弹出层对应序号的按钮，并且页面高度内滚动条禁止
    $('.findPanel,.wapfind').toggle();
    $('body').toggleClass('dropdown');
    var num = $(this).index();
    $('.findPanel .btn-group').eq(num).toggleClass('active');
    $('.findPanel .btn-group .dropdown-menu').hide();
    $('.active .dropdown-menu').slideDown();
    var dex = $('.ac').index();
    $('.dropdown-menu .three .third').hide();
    $('.dropdown-menu .three .third').eq(dex).slideDown();
});
$('.findPanel').click(function(){//点击面板空白区域，回到正常页面
    $('.findPanel,.wapfind').toggle();
    $('.findPanel .btn-group').removeClass('active');
    $('body').toggleClass('dropdown');
});
$('.findPanel button').click(function(e){
    e.stopPropagation();
    //如果按钮已经被激活、菜单是下拉状态，点击按钮回到正常页面
    if($(this).parent().hasClass('active')){
        $(this).parent().toggleClass('active');
        $('.findPanel').hide();
        $('.wapfind').show();
        $('body').toggleClass('dropdown');
    }else{
        //如果按钮没有被激活，则激活按钮显示下拉菜单内容
        $('.findPanel .btn-group').removeClass('active');
        $(this).parent().toggleClass('active');
        $('.findPanel .btn-group .dropdown-menu').hide();
        $('.active .dropdown-menu').slideDown();
    }
});
$('.dropdown-menu .two li').click(function(e){//区域里面二级导航选择，三级导航内容出现
    e.stopPropagation();
    $('.dropdown-menu .two li').removeClass('ac');
    $(this).addClass('ac');
    var dex = $(this).index();
    $('.dropdown-menu .three .third').hide();
    $('.dropdown-menu .three .third').eq(dex).slideDown();
});
$('.dropdown-menu .three .li').click(function(e){//三级导航，区域选择事件
    var text = $(this).text()+'<span class="caret"></span>';
    $('.wapfind .btn-group').eq(0).find('button').html(text);
    $('.wapfind .btn-group').eq(0).addClass('active');
    console.log(text);
});
$('.dropdown-menu .type .li').click(function(e) {//房型选择事件，添加类改变样式，可根据添加的类获取选中数据
    e.stopPropagation();
    $(this).toggleClass('lichoose');
});
$('.dropdown-menu .type ').next(1).click(function(){//房型模块中的确定事件
    if($('.dropdown-menu .type .lichoose').length>=1){
        $('.wapfind .btn-group').eq(2).addClass('active');
    }else{
        $('.wapfind .btn-group').eq(2).removeClass('active');
    }
});
$('.dropdown-menu .more .box span').click(function(e){//更多条件选择事件，添加类改变样式，可根据添加的类获取选中数据
    e.stopPropagation();
    $(this).toggleClass('spanchoose');
});
$('.dropdown-menu .clear_if').click(function(e){//清空选择按钮触发事件
    e.stopPropagation();
    $('.dropdown-menu .more .box span').removeClass('spanchoose');
});
$('.dropdown-menu .clear_if').next(1).click(function(){//更多模块中的确定事件
    if($('.dropdown-menu .more .spanchoose').length>=1){
        $('.wapfind .btn-group').eq(3).addClass('active');
    }else{
        $('.wapfind .btn-group').eq(3).removeClass('active');
    }
});
$('.dropdown-menu .salePrice .li').click(function(e){//售价模块中选择事件
    var text = $(this).text()+'<span class="caret"></span>';
    $('.wapfind .btn-group').eq(1).find('button').html(text);
    $('.wapfind .btn-group').eq(1).addClass('active');
});
$('.sortBtn').click(function(){
    $('.sort-block').fadeIn();
});
$('.sort-block .panel').click(function(e){
    e.stopPropagation();
    $('.sort-block').hide();
})