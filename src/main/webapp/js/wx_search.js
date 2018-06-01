var app = new Vue({
    el: '#app',
    data: {
        company: null,
        propertyList: [],
        search_input: '',
    },
    methods: {
        searchBtnClick: function(){
            console.log(this.search_input);
            this.getProperty(this.search_input);
        },
        getProperty: function (info) {
            var that = this;
            var selectinfo = info.trim()
            var res = {
                cityname: selectinfo
            }
            res.pageNum = 21;
            res.pageSize = 10;
            axios.post('/SYWeiServers/properties', res).then(function (response) {
                if(response.data.code == 200){
                    console.log(response.data.data);
                    that.propertyList = response.data.data;
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

