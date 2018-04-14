package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.dto.property.PropertyDTO;
import com.swjtu.SYWeiServers.dto.property.PropertySearchRequest;
import com.swjtu.SYWeiServers.entity.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PropertyMapper {
    int countByExample(@Param("dbName")String dbName);

    int insert(@Param("dbName")String dbName, @Param("entity")Property record);

    List<PropertyDTO> selectForPage(@Param("dbName")String dbName, @Param("start")int start, @Param("pageSize")int pageSize, @Param("request")PropertySearchRequest request);

    List<PropertyDTO> selectByExampleWithBLOBs(@Param("dbName")String dbName, @Param("propertyIds")List<String> propertyIds);

    PropertyDTO selectProperty(@Param("dbName")String dbName, @Param("roomNo")String roomNo);

    int deleteByExample(@Param("dbName")String dbName,  @Param("propertyIds")List<String> propertyIds);

    int updateByExampleSelective(@Param("dbName")String dbName,@Param("record") Property record);
}