package com.swjtu.SYWeiServers.service;

import com.swjtu.SYWeiServers.entity.Estate;
import com.swjtu.SYWeiServers.web.exception.CustomException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface EstateService {

    /**
     * 添加一个楼盘的信息
     * @param estate
     * @return
     */
    boolean addEstate(String companyId, String dbName, Estate estate) throws CustomException, Exception;

    /**
     * 根据楼盘Id批量查找楼盘信息
     * @param estateIds
     * @return
     */
    List<Estate> findEstateByEstateId(String companyId, String dbName, List<String> estateIds) throws Exception;

    /**
     * 根据楼盘Id从数据库获取一个楼盘信息
     * @param companyId
     * @param dbName
     * @param eatateName 楼盘名称
     * @param address  地址
     * @return
     */
    Estate findEstate(String companyId, String dbName, String eatateName, String address) throws IOException;

    /**
     * 分页获取楼盘信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Estate> getEstateForPage(String companyId, String dbName, Integer pageNum, Integer pageSize) throws Exception;

    /**
     * 根据楼盘id批量删除楼盘信息
     * @param estateIds
     * @return
     */
    boolean deleteEstate(String companyId, String dbName, List<String> estateIds) throws Exception;

    /**
     * 根据id更新楼盘信息
     * @param companyId
     * @param dbName
     * @param estate
     * @return
     * @throws Exception
     */
    boolean updateEstate(String companyId, String dbName, Estate estate) throws Exception;
}
