/**
 * vue app
 */
var app = new Vue({
    el: '#app',
    data: {
        openFlag: true,
        company: null
    },
    methods: {
        navChange: function () {
            this.openFlag = !this.openFlag;
        },
        testSessionCompany: function () {
            this.company = sessionStorage.getItem('company');
            if(this.company == null || this.company == ''){
                console.log('无法确定公司网页');
                location.assign('./error.jsp')
            }
            else{
                this.company = JSON.parse(this.company);
                document.title = this.company.companyname;
            }
        }
    },
    computed: {

    },
    mounted: function () {
        /**
         * 获取session中company记录，或根据url确定公司用户
         */
        var companyNo = getQueryString('no');
        if(companyNo == '' || companyNo == null){
            this.testSessionCompany();
        }
        else{
            axios.get('/companies/find', {
                params: {
                    companyno: companyNo
                }
            }).then(function (response) {
                if(response.data.code == 200){
                    sessionStorage.setItem('company', JSON.stringify(response.data.data));
                    this.company = response.data.data;
                    document.title = this.company.companyname;
                }
                else{
                    console.log(response.data.message);
                    this.testSessionCompany();
                }
            }).catch(function (error) {
                // console.log(error);
                console.log(error);
                this.testSessionCompany();
            });
        }
    }
})
