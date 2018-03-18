package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.entity.StudentExample;
import com.swjtu.SYWeiServers.mapper.StudentMapper;
import com.swjtu.SYWeiServers.util.DataSourceFactory;
import com.swjtu.SYWeiServers.util.JsonResult;
import com.swjtu.SYWeiServers.util.enums.StatusCode;
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

    @RequestMapping(value = "/testlogin",method = RequestMethod.GET)
    public JsonResult testLogin( Integer id) throws Exception{
        StudentMapper studentMapper = DataSourceFactory.getMapper(id, StudentMapper.class);
        return JsonResult.build(StatusCode.SUCCESS, studentMapper.selectByExample(new StudentExample()));
    }

}
