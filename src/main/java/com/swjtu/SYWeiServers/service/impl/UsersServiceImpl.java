package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Users;
import com.swjtu.SYWeiServers.mapper.UsersMapper;
import com.swjtu.SYWeiServers.service.UsersService;
import com.swjtu.SYWeiServers.util.DataSourceFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class UsersServiceImpl implements UsersService {

    private UsersMapper usersMapper = null;

    public Users loadUsers(String companyId, String dbName, int id) {
        //根据公司id获取数据库连接并获取相应的dao：UsersMapper
        usersMapper = DataSourceFactory.getMapper(companyId, dbName, UsersMapper.class);
        //由于查询返回一个list，所以取第一个
        List<Users> usersList = usersMapper.findUserById(dbName, id);
        if(null == usersList) {
            return null;
        }
        return usersList.get(0);
    }

    public boolean addUser(String companyId, String dbName, Users user) {
        //根据公司id获取数据库连接并获取相应的dao：UsersMapper
        usersMapper = DataSourceFactory.getMapper(companyId, dbName, UsersMapper.class);
        //添加成功返回影响的行数1,，则整个方法返回true
        return usersMapper.addUsers(dbName, user) == 1;
    }
}
