package com.swjtu.SYWeiServers.service;

import com.swjtu.SYWeiServers.entity.Employee;
import com.swjtu.SYWeiServers.util.PageResult;
import com.swjtu.SYWeiServers.web.exception.CustomException;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface EmployeeService {

    /**
     * 添加一个员工的信息
     * @param employee
     * @return
     */
    boolean addEmployee(String companyId, String dbName, Employee employee) throws CustomException, Exception;

    /**
     * 员工登陆操作
     * @param employee
     * @return
     */
    Employee login(String companyId, String dbName, Employee employee) throws CustomException;

    /**
     * 根据员工No批量查找员工信息
     * @param employeeNos
     * @return
     */
    List<Employee> findEmployeeByEmployeeNo(String companyId, String dbName, List<String> employeeNos) throws Exception;

    /**
     * 根据员工No从数据库获取一个员工信息
     * @param employeeNo
     * @return
     */
    Employee findEmployee(String companyId, String dbName, String employeeNo);

    /**
     * 分页获取员工信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult getEmployeeForPage(String companyId, String dbName, Integer pageNum, Integer pageSize) throws Exception;

    /**
     * 根据员工id批量删除员工信息
     * @param employeeIds
     * @return
     */
    boolean deleteEmployee(String companyId, String dbName, List<String> employeeIds) throws Exception;

    boolean updateEmployee(String companyId, String dbName, Employee employee) throws Exception;
}
