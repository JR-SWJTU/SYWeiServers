package com.swjtu.SYWeiServers.web.controller;

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
    public JsonResult register(@RequestBody Estate estate, String companyId, String dbName) throws  Exception{
        boolean res = estateService.addEstate(companyId, dbName, estate);
        return JsonResult.build(StatusCode.SUCCESS, res ? 1 : 0);
    }

    /**批量删除楼盘*/
    @RequestMapping(value = "/deleteEstate", method = RequestMethod.POST)
    public JsonResult deleteEstate(@RequestBody Map map, String companyId, String dbName) throws Exception {
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
    public JsonResult queryEstates(Integer pageNum, Integer pageSize, String companyId, String dbName) throws Exception {
        List<Estate> estates = estateService.getEstateForPage(companyId, dbName, pageNum, pageSize);
        return JsonResult.build(StatusCode.SUCCESS, estates);
    }

    /**
     * 更新楼盘信息
     * @param estate
     * @return
     */
    @RequestMapping(value = "/updateEstate", method = RequestMethod.POST)
    public JsonResult updateEstate(@RequestBody Estate estate, String companyId, String dbName) throws Exception{
        return JsonResult.build(StatusCode.SUCCESS,  estateService.updateEstate(companyId, dbName, estate) ? 1 : 0);
    }

}
