package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Photo;
import com.swjtu.SYWeiServers.entity.PhotoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhotoMapper {
    int countByExample(PhotoExample example);

    int deleteByExample(PhotoExample example);

    int insert(Photo record);

    int insertSelective(Photo record);

    List<Photo> selectByExample(@Param("dbName")String dbName, @Param("propertyIds")List<String> propertyIds);

    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);
}