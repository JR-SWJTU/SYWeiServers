package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.dto.PropertyRequest;
import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.Photo;
import com.swjtu.SYWeiServers.entity.Property;
import com.swjtu.SYWeiServers.service.PhotoService;
import com.swjtu.SYWeiServers.service.PropertyService;
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
import java.util.*;

/**
 * Created by Propertyistrator on 2017/10/18.
 */
@Controller
@RequestMapping("properties")
@ResponseBody
public class PropertyController {

    @Resource
    private PropertyService propertyService;
    @Resource
    private PhotoService photoService;

    @RequestMapping(value="/addProperty", method = RequestMethod.POST)
    public JsonResult register(HttpServletRequest request, @RequestBody Property property) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        boolean res = propertyService.addProperty(companyId, dbName, property);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**批量删除房源*/
    @RequestMapping(value = "/deleteProperty", method = RequestMethod.POST)
    public JsonResult deleteProperty(HttpServletRequest request, @RequestBody Map map) throws Exception {
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List ids =  (List)map.get("ids");
        boolean res = propertyService.deleteProperty(companyId, dbName, ids);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**
     * 分页查询房源信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public JsonResult queryPropertys(HttpServletRequest request, Integer pageNum, Integer pageSize) throws Exception {
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List<Property> propertys = propertyService.getPropertyForPage(companyId, dbName, pageNum, pageSize);
        return JsonResult.build(StatusCode.SUCCESS, propertys);
    }

    /**
     * 更新房源信息
     * @param property
     * @return
     */
    @RequestMapping(value = "/updateProperty", method = RequestMethod.POST)
    public JsonResult updateProperty(HttpServletRequest request, @RequestBody Property property) throws Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        return JsonResult.build(StatusCode.SUCCESS,  propertyService.updateProperty(companyId, dbName, property) ? 1 : 0);
    }

    /**
     * 获取当前房源量
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/total", method = RequestMethod.GET)
    public JsonResult total(HttpServletRequest request/*, String sex, String status, String tel, String empName*/) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        return JsonResult.build(StatusCode.SUCCESS, propertyService.getPropertyNumber(companyId, dbName));
    }

    @RequestMapping(value="/sellquality", method = RequestMethod.GET)
    public JsonResult sellQuality(HttpServletRequest request/*, String sex, String status, String tel, String empName*/) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List<Property> properties = propertyService.getQualitySellProperty(companyId, dbName);
        Integer num = propertyService.getSellPropertyNumber(companyId, dbName);
        PropertyRequest propertyRequest = buildPropertyRequest(properties, num, companyId, dbName);
        return JsonResult.build(StatusCode.SUCCESS, propertyRequest);
    }

    @RequestMapping(value="/rentquality", method = RequestMethod.GET)
    public JsonResult rentQuality(HttpServletRequest request/*, String sex, String status, String tel, String empName*/) throws  Exception{
        HttpSession session = request.getSession();
        Company company = (Company) session.getAttribute("company");
        String companyId = company.getCompanyid();
        String dbName = company.getDbname();
        List<Property> properties = propertyService.getQualityRentProperty(companyId, dbName);
        Integer num = propertyService.getRentPropertyNumber(companyId, dbName);
        PropertyRequest propertyRequest = buildPropertyRequest(properties, num, companyId, dbName);
        return JsonResult.build(StatusCode.SUCCESS, propertyRequest);
    }

    private PropertyRequest buildPropertyRequest(List<Property> properties, Integer num, String companyId, String dbName) throws Exception {
        PropertyRequest propertyRequest = new PropertyRequest();
        propertyRequest.setProperties(properties);
        propertyRequest.setNum(num);
        List<String> photos = new ArrayList<String>();
        for(int i = 0; i < properties.size(); i++){
            Property pro = properties.get(i);
            photos.add(photoService.findPhotosByPropertyId(companyId, dbName, pro.getPropertyid()));
        }
        propertyRequest.setPhotos(photos);
        return propertyRequest;
    }
}
