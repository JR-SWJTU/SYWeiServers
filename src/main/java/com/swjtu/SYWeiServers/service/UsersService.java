package com.swjtu.SYWeiServers.service;


import com.swjtu.SYWeiServers.entity.Users;

import java.io.IOException;

/**
 * Created by Administrator on 2018/3/20.
 */
public interface UsersService {

    Users loadUsers(String companyId, String dbName, int id) throws IOException;

    boolean addUser(String companyId, String dbName, Users user) throws IOException;
}
