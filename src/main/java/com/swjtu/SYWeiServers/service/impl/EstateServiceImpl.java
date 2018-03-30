package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Estate;
import com.swjtu.SYWeiServers.mapper.EstateMapper;
import com.swjtu.SYWeiServers.service.EstateService;
import com.swjtu.SYWeiServers.util.DataSourceFactory;
import com.swjtu.SYWeiServers.util.ToolHelper;
import com.swjtu.SYWeiServers.web.exception.CustomException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
@Service
public class EstateServiceImpl implements EstateService {

    private EstateMapper estateMapper = null;

    @Override
    public boolean addEstate(String companyId, String dbName,Estate estate) throws Exception {
        if (findEstate(companyId, dbName, estate.getEstatename(), estate.getAddress()) != null) {
            throw new CustomException("楼盘已经存在");
        }

        estate.setEstateid(ToolHelper.autoID());
        estateMapper = DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);
        return estateMapper.insert(dbName, estate) == 1;
    }

    @Override
    public List<Estate> findEstateByEstateId(String companyId, String dbName, List<String> estateIds) throws Exception {
        estateMapper = DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);

        List<Estate> estates = estateMapper.selectByExampleWithBLOBs(dbName, estateIds);
        if(estates == null || estates.size() == 0) {
            return new ArrayList<Estate>();
        }
        return estates;
    }

    @Override
    public Estate findEstate(String companyId, String dbName, String eatateName, String address) {
        estateMapper = DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);
        //调用dao中方法进行数据查询
        Estate estate = estateMapper.selectEstate(dbName, eatateName, address);
        return estate;
    }

    public List<Estate> getEstateForPage(String companyId, String dbName, Integer pageNum, Integer pageSize) throws Exception {
        estateMapper =  DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);

        List<Estate> estates = estateMapper.selectForPage(dbName, pageSize * (pageNum -1), pageSize);
        return estates;
    }

    @Override
    public boolean deleteEstate(String companyId, String dbName, List<String> estateIds) throws Exception {
        estateMapper = DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);

        return estateMapper.deleteByExample(dbName, estateIds) != 0;
    }

    @Override
    public boolean updateEstate(String companyId, String dbName, Estate estate) throws Exception {
        estateMapper =  DataSourceFactory.getMapper(companyId, dbName, EstateMapper.class);

        return estateMapper.updateByExampleSelective(dbName, estate) != 0;
    }
}
