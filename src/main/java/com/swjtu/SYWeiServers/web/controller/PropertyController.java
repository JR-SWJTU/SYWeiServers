package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.dto.property.PropertyDTO;
import com.swjtu.SYWeiServers.dto.property.PropertyRequest;
import com.swjtu.SYWeiServers.dto.property.PropertySearchRequest;
import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.Photo;
import com.swjtu.SYWeiServers.entity.Property;
import com.swjtu.SYWeiServers.service.PhotoService;
import com.swjtu.SYWeiServers.service.PropertyService;
import com.swjtu.SYWeiServers.util.JsonResult;
import com.swjtu.SYWeiServers.util.enums.StatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public JsonResult queryPropertys(HttpServletRequest request, @RequestBody PropertySearchRequest propertySearchRequest) throws Exception {
        HttpSession session = request.getSession();
//        Company company = (Company) session.getAttribute("company");
//        String companyId = company.getCompanyid();
//        String dbName = company.getDbname();

        String companyId = "1";
        String dbName = "WZDC";

        List<PropertyDTO> propertys = propertyService.getPropertyForPage(companyId, dbName, propertySearchRequest.getPageNum()
                                                                        , propertySearchRequest.getPageSize(), propertySearchRequest);
        List<String> propertyIds = buildPropertyIdList(propertys);
        List<Photo> photos = photoService.findPhotosByPropertyIds(companyId, dbName, propertyIds);
        Map<String, List<String>> propertyIdAndPhotoUrlMap = groupPhotoUrlsByPropertyId(propertyIds, photos);

        for (PropertyDTO propertyDTO : propertys) {
            propertyDTO.setPhotourls(propertyIdAndPhotoUrlMap.get(propertyDTO.getPropertyid()));
        }
        return JsonResult.build(StatusCode.SUCCESS, propertys);
    }

    private List<String> buildPropertyIdList(List<PropertyDTO> propertys) {
        List<String> propertyIds = new ArrayList<String>();
        for (PropertyDTO property : propertys) {
            propertyIds.add(property.getPropertyid());
        }
        return propertyIds;
    }

    private Map<String, List<String>> groupPhotoUrlsByPropertyId(List<String> propertyIds,  List<Photo> photos) {
        Map<String, List<String>> propertyIdAndPhotoUrlMap = new HashMap<String, List<String>>();
        for (Photo photo : photos) {
            if (!StringUtils.isEmpty(photo.getPropertyid()) ) {
                if ( propertyIdAndPhotoUrlMap.get(photo.getPropertyid()) == null) {
                    List<String> photoUrls = new ArrayList<String>();
                    photoUrls.add(photo.getPhotourl());
                    propertyIdAndPhotoUrlMap.put(photo.getPropertyid(), photoUrls);
                    continue;
                }
                propertyIdAndPhotoUrlMap.get(photo.getPropertyid()).add(photo.getPhotourl());
            }
        }
        return propertyIdAndPhotoUrlMap;
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
