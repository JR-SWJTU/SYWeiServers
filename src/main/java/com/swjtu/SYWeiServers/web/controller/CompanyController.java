package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.service.CompanyService;
import com.swjtu.SYWeiServers.util.DBHelper;
import com.swjtu.SYWeiServers.util.JsonResult;
import com.swjtu.SYWeiServers.util.PageResult;
import com.swjtu.SYWeiServers.util.enums.StatusCode;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by Companyistrator on 2017/10/18.
 */
@Controller
@RequestMapping("companies")
@ResponseBody
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public JsonResult register(@RequestBody Company company) throws  Exception{
        boolean res = companyService.addCompany(company);
        if(res) {
            DBHelper.createNewDB(company.getDbname());
        }
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**
     * 登陆
     * @param request
     * @param company
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public JsonResult login(HttpServletRequest request, @RequestBody Company company) throws  Exception{
        Company company1 = companyService.login(company);
        JSONObject jsonObject = JSONObject.fromObject(company1);
        jsonObject.remove("password");
        company1 = (Company) JSONObject.toBean(jsonObject, Company.class);
        return JsonResult.build(StatusCode.SUCCESS, company1);
    }

    /**批量删除公司*/
    @RequestMapping(value = "/deleteCompany", method = RequestMethod.POST)
    public JsonResult deleteCompany(@RequestBody Map map) throws Exception {
        List ids =  (List)map.get("ids");
        boolean res = companyService.deleteCompany(ids);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**
     * 分页查询公司信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public JsonResult queryCompanys(Integer pageNum, Integer pageSize) throws Exception {
        PageResult companys = companyService.getCompanyForPage(pageNum, pageSize);
        return JsonResult.build(StatusCode.SUCCESS, companys);
    }

    /**
     * 更新公司信息
     * @param company
     * @return
     */
    @RequestMapping(value = "/updateCompany", method = RequestMethod.POST)
    public JsonResult updateCompany(@RequestBody Company company) throws Exception{
        return JsonResult.build(StatusCode.SUCCESS,  companyService.updateCompany(company) ? 1 : 0);
    }

}
