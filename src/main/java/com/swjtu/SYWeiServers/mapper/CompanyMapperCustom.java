package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface CompanyMapperCustom {

    /**
     * 创建数据库，调用对应的CompanyMapperCustom.xml中id为createDataBase的sql语句
     */
//    void createDataBase(@Param("dbName")String dbName);

    List<Company> findCompanyByCompanyNo(@Param("companyNos")List<String> companyNos);
}
