package com.swjtu.SYWeiServers.service;


import com.swjtu.SYWeiServers.entity.Users;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface UsersService {

    Users loadUsers(String companyId, String dbName, int id);

    boolean addUser(String companyId, String dbName, Users user);
}
