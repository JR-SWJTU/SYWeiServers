package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.Users;
import com.swjtu.SYWeiServers.service.CompanyService;
import com.swjtu.SYWeiServers.service.UsersService;
import com.swjtu.SYWeiServers.util.JsonResult;
import com.swjtu.SYWeiServers.util.enums.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/10/18.
 */
@Controller
@RequestMapping("admin")
@ResponseBody
public class AdminController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private UsersService usersService;

    /**
     * 获取公司信息
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/loadCompany",method = RequestMethod.GET)
    public JsonResult loadCompany(String id) throws Exception{
        Company company = companyService.findCompany(id);
        return JsonResult.build(StatusCode.SUCCESS, company);
    }


    @RequestMapping(value = "/loadRights",method = RequestMethod.GET)
    public JsonResult testLogin( Integer id) throws Exception{
        String companyId = "160903154525CA1E9B5E7C3A8AE2130D";
        String dbName = "MyDataBase";
        return JsonResult.build(StatusCode.SUCCESS, usersService.loadUsers(companyId, dbName, id) );
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public JsonResult addUser( Integer id) throws Exception{
        String companyId = "160903154525CA1E9B5E7C3A8AE2130D";
        String dbName = "MyDataBase";
        Users users = new Users();
        users.setPassword("123");
        users.setUsername("ffff");
        return JsonResult.build(StatusCode.SUCCESS, usersService.addUser(companyId, dbName, users) );
    }

}
