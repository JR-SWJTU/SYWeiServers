package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.Estate;
import com.swjtu.SYWeiServers.service.EstateService;
import com.swjtu.SYWeiServers.util.JsonResult;
import com.swjtu.SYWeiServers.util.enums.StatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Estateistrator on 2017/10/18.
 */
@Controller
@RequestMapping("estates")
@ResponseBody
public class EstateController {

    @Resource
    private EstateService estateService;

    @RequestMapping(value="/addEstate", method = RequestMethod.POST)
    public JsonResult register(HttpServletRequest request, @RequestBody Estate estate) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        boolean res = estateService.addEstate(companyId, dbName, estate);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**批量删除楼盘*/
    @RequestMapping(value = "/deleteEstate", method = RequestMethod.POST)
    public JsonResult deleteEstate(HttpServletRequest request, @RequestBody Map map) throws Exception {
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List ids =  (List)map.get("ids");
        boolean res = estateService.deleteEstate(companyId, dbName, ids);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**
     * 分页查询楼盘信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public JsonResult queryEstates(HttpServletRequest request, Integer pageNum, Integer pageSize) throws Exception {
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List<Estate> estates = estateService.getEstateForPage(companyId, dbName, pageNum, pageSize);
        return JsonResult.build(StatusCode.SUCCESS, estates);
    }

    /**
     * 更新楼盘信息
     * @param estate
     * @return
     */
    @RequestMapping(value = "/updateEstate", method = RequestMethod.POST)
    public JsonResult updateEstate(HttpServletRequest request, @RequestBody Estate estate) throws Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        return JsonResult.build(StatusCode.SUCCESS,  estateService.updateEstate(companyId, dbName, estate) ? 1 : 0);
    }

    /**
     * 获取当前楼盘工量
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/total", method = RequestMethod.GET)
    public JsonResult total(HttpServletRequest request/*, String sex, String status, String tel, String empName*/) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        return JsonResult.build(StatusCode.SUCCESS, estateService.getEstateNumber(companyId, dbName));
    }
}
