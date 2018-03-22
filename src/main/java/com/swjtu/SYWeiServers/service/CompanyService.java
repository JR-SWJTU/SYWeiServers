package com.swjtu.SYWeiServers.service;

import com.swjtu.SYWeiServers.entity.Company;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface CompanyService {

    /**
     * 根据公司id从数据库获取一个公司信息
     * @param companyId
     * @return
     */
    Company loadCompany(String companyId);

    /**
     * 创建数据库
     * @param dbName
     */
    void createDataBase(String dbName);
}
