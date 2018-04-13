package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Photo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface PhotoMapperCustom {

    String selectByPropertyId(@Param("dbName")String dbName, @Param("propertyId")String propertyId);
}
