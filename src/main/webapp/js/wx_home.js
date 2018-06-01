var app = new Vue({
    el: '#app',
    data: {
        company: null,
        sellNum: 2000,
        sellQualityProperties: [],
        rentNum: 2000,
        rentQualityProperties: []
    },
    methods: {
        getQualityProperty: function (type) {
            var that = this;
            axios.get('/SYWeiServers/properties/' + type + 'quality').then(function (response) {
                if(response.data.code == 200){
                    console.log(response.data.data);
                    var properties = response.data.data.properties;
                    var urls = response.data.data.photos;
                    properties.forEach(function (item, index, arr) {
                       item.photourl = urls[index];
                    });
                    if(type == 'sell'){
                        that.sellNum = response.data.data.num;
                        that.sellQualityProperties = properties;
                    }
                    if(type == 'rent'){
                        that.rentNum = response.data.data.num;
                        that.rentQualityProperties = properties;
                    }
                }
                else{
                    console.log(response.data.message);
                    // showToast(false, response.data.message);
                }
            }).catch(function (error) {
                console.log(error);
                // showToast(false, error);
            });
        },
        searchBtnClick: function(){
            location.assign('./wx_search.jsp?no=wzdc');
        },
        sellPageTo: function () {
            location.assign('./wx_sell.jsp?no=wzdc');
        },
        rentPageTo: function () {
            location.assign('./wx_rent.jsp?no=wzdc');
        },
        employeePageTo: function () {
            
        }
    },
    computed: {

    },
    watch: {

    },
    mounted: function () {
        /**
         * 获取session中company记录，或根据url确定公司用户
         */
        var companyNo = getQueryString('no');
        if(companyNo == null || companyNo == ''){
            console.log('error');
            return;
        }
        var that = this;
        axios.get('/SYWeiServers/companies/find', {
            params: {
                companyno: companyNo
            }
        }).then(function (response) {
            if(response.data.code == 200){
                // console.log(response.data.data);
                sessionStorage.setItem('company', JSON.stringify(response.data.data));
                that.company = response.data.data;
                document.title = that.company.companyname;
                console.log(that.company);
                that.getQualityProperty('sell');
                that.getQualityProperty('rent');
            }
            else{
                console.log(response.data.message);
                // showToast(false, response.data.message);
            }
        }).catch(function (error) {
            console.log(error);
            // showToast(false, error);
        });
    }
});

var mySwiper = new Swiper ('.swiper-container', {
    loop: true,
//        autoplay:1500,
    // 如果需要分页器
    pagination: '.swiper-pagination',
    paginationClickable :true,
    autoplayDisableOnInteraction : false,
    // 如果需要前进后退按钮，不需要可删掉
//        nextButton: '.swiper-button-next',
//        prevButton: '.swiper-button-prev',
})
// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('chart'));
// 指定图表的配置项和数据
var option = {};
var symbolSize = 10;
var data = [15,20,30,20,40];
var points = [];
option = {
    title: {
        text: '房价走势图'
    },
    tooltip: {
        formatter: function (params) {
            var data = params.data || [0, 0];
            return data[0].toFixed(2) + ', ' + data[1].toFixed(2);
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis: {
        type: 'category',
        boundaryGap : false,
        data : ['7月','8月','9月','10月','11月','12月','13月']

    },
    yAxis: {
        min: 0,
        max: 40,
        type: 'value',
        axisLine: {onZero: false}
    },
    series: [
        {   symbol:'circle',
            id: 'a',
            type: 'line',
            smooth: true,
            symbolSize: symbolSize,
            itemStyle:{
                normal:{
                    color:'#009688'
                }
            },
            lineStyle:{
                normal:{
//                            width:10,  //连线粗细
                    color: "#009688"  //连线颜色
                }
            },
            data: data
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);

// $('.part2 .col-lg-3').hover(function(){
//     $(this).find('.img').addClass('part2ani');
//     $(this).find('.arrow').addClass('part2ani1');
// },function(){
//     $(this).find('.img').removeClass('part2ani');
//     $(this).find('.arrow').removeClass('part2ani1');
// });

// $('.layerBox .close').click(function(){
//     $('.layer').hide();
// });
// $('header .address').eq(0).click(function(){
//     $('.layer').show();
// });

//  手机端城市选择弹出
$('header .address').eq(0).click(function(){
    $('.layer-mobile').show();
    $('body').addClass('layer-mobile-out');
});
//    手机端城市选择弹出层隐藏
$('.back-icon').click(function(){
    $('.layer-mobile').hide();
    $('body').removeClass('layer-mobile-out');
});
//    手机端城市选择事件
$('.layer-mobile .latest a,.layer-mobile .hot-city a,.layer-mobile .city-group a').click(function () {
    var city_name = $(this).find('span').text();
    $('.navbar-header .address span').eq(1).text(city_name);
    $('.layer-mobile').fadeOut();
    $('body').removeClass('layer-mobile-out');
});
//    手机端城市字母选择事件
$('.cs a').click(function(){
    var letter = $(this).find('span').text();
    document.getElementById(letter).scrollIntoView();
});
//PC端城市选择事件
$('.layerCity a,.cityTab a').click(function(){
    var city_name = $(this).text();
    $('header .address span').eq(1).text(city_name);
    $('.layer').hide();
})