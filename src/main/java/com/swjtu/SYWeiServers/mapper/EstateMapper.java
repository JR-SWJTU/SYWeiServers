package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Estate;
import com.swjtu.SYWeiServers.entity.EstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstateMapper {
    int countByExample(EstateExample example);

    int deleteByExample(EstateExample example);

    int insert(Estate record);

    int insertSelective(Estate record);

    List<Estate> selectByExampleWithBLOBs(EstateExample example);

    List<Estate> selectByExample(EstateExample example);

    int updateByExampleSelective(@Param("record") Estate record, @Param("example") EstateExample example);

    int updateByExampleWithBLOBs(@Param("record") Estate record, @Param("example") EstateExample example);

    int updateByExample(@Param("record") Estate record, @Param("example") EstateExample example);
}