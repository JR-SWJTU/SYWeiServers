package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.dto.EmployeeSearchRequest;
import com.swjtu.SYWeiServers.entity.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface EmployeeMapperCustom {

    Integer getEmployeeNumber(@Param("request")EmployeeSearchRequest request);

}
