package com.swjtu.SYWeiServers.mapper;

import com.swjtu.SYWeiServers.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {

    List<Users> findUserById(@Param("dbName")String dbName, @Param("id")int id);

    int addUsers(@Param("dbName")String dbName, @Param("entity")Users user);
}