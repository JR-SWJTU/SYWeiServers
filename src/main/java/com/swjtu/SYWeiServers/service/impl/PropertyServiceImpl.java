package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Property;
import com.swjtu.SYWeiServers.mapper.PropertyMapper;
import com.swjtu.SYWeiServers.service.PropertyService;
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
public class PropertyServiceImpl implements PropertyService {

    private PropertyMapper propertyMapper = null;

    @Override
    public boolean addProperty(String companyId, String dbName,Property property) throws Exception {
        if (findProperty(companyId, dbName, property.getRoomno()) != null) {
            throw new CustomException("房源信息已经存在");
        }

        property.setPropertyid(ToolHelper.autoID());
        propertyMapper = DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);
        return propertyMapper.insert(dbName, property) == 1;
    }

    @Override
    public List<Property> findPropertyByPropertyId(String companyId, String dbName, List<String> propertyIds) throws Exception {
        propertyMapper = DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);

        List<Property> propertys = propertyMapper.selectByExampleWithBLOBs(dbName, propertyIds);
        if(propertys == null || propertys.size() == 0) {
            return new ArrayList<Property>();
        }
        return propertys;
    }

    @Override
    public Property findProperty(String companyId, String dbName, String roomno) {
        propertyMapper = DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);
        //调用dao中方法进行数据查询
        Property property = propertyMapper.selectProperty(dbName, roomno);
        return property;
    }

    public List<Property> getPropertyForPage(String companyId, String dbName, Integer pageNum, Integer pageSize) throws Exception {
        propertyMapper =  DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);

        List<Property> propertys = propertyMapper.selectForPage(dbName, pageSize * (pageNum -1), pageSize);
        return propertys;
    }

    @Override
    public boolean deleteProperty(String companyId, String dbName, List<String> propertyIds) throws Exception {
        propertyMapper = DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);

        return propertyMapper.deleteByExample(dbName, propertyIds) != 0;
    }

    @Override
    public boolean updateProperty(String companyId, String dbName, Property property) throws Exception {
        propertyMapper =  DataSourceFactory.getMapper(companyId, dbName, PropertyMapper.class);
        return propertyMapper.updateByExampleSelective(dbName, property) != 0;
    }
}
