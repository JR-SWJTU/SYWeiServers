package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    int insert(@Param("dbName")String dbName, @Param("entity")Employee record);

    List<Employee> selectByExampleWithBLOBs(@Param("dbName")String dbName, @Param("employeeNos")List<String> employeeNos);

    List<Employee> selectForPage(@Param("dbName")String dbName, @Param("start")int start, @Param("pageSize")int pageSize);

    int deleteByExample(@Param("dbName")String dbName,  @Param("employeeIds")List<String> employeeIds);

    int updateByExampleSelective(@Param("dbName")String dbName,@Param("record") Employee record);

}