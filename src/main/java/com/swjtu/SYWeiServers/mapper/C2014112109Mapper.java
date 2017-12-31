package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.C2014112109;
import com.swjtu.SYWeiServers.entity.C2014112109Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface C2014112109Mapper {
    int countByExample(C2014112109Example example);

    int deleteByExample(C2014112109Example example);

    int deleteByPrimaryKey(@Param("cusIdcard") String cusIdcard, @Param("driIdcard") String driIdcard);

    int insert(C2014112109 record);

    int insertSelective(C2014112109 record);

    List<C2014112109> selectByExample(C2014112109Example example);

    C2014112109 selectByPrimaryKey(@Param("cusIdcard") String cusIdcard, @Param("driIdcard") String driIdcard);

    int updateByExampleSelective(@Param("record") C2014112109 record, @Param("example") C2014112109Example example);

    int updateByExample(@Param("record") C2014112109 record, @Param("example") C2014112109Example example);

    int updateByPrimaryKeySelective(C2014112109 record);

    int updateByPrimaryKey(C2014112109 record);
}