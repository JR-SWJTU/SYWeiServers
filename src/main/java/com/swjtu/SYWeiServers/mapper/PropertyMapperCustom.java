package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface PropertyMapperCustom {

    Integer getPropertyNumber(@Param("dbName")String dbName);

    Integer getSellPropertyNumber(@Param("dbName")String dbName);

    List<Property> getQualitySellProperty(@Param("dbName")String dbName);

    Integer getRentPropertyNumber(@Param("dbName")String dbName);

    List<Property> getQualityRentProperty(@Param("dbName")String dbName);
}
