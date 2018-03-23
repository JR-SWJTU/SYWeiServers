package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Property;
import com.swjtu.SYWeiServers.entity.PropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyMapper {
    int countByExample(PropertyExample example);

    int deleteByExample(PropertyExample example);

    int deleteByPrimaryKey(String propertyid);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExampleWithBLOBs(PropertyExample example);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(String propertyid);

    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExampleWithBLOBs(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKeyWithBLOBs(Property record);

    int updateByPrimaryKey(Property record);
}