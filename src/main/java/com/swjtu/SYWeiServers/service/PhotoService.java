package com.swjtu.SYWeiServers.service;

import com.swjtu.SYWeiServers.entity.Photo;
import com.swjtu.SYWeiServers.entity.Property;
import com.swjtu.SYWeiServers.web.exception.CustomException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
public interface PhotoService {

    /**
     * 添加一个照片的信息
     * @param photo
     * @return
     */
    boolean addPhoto(String companyId, String dbName, Photo photo, String propertyId, String photoUrl) throws CustomException, Exception;

    /**
     * 根据房源Id查找多个照片信息
     * @param propertyId
     * @return
     */
    String findPhotosByPropertyId(String companyId, String dbName, String propertyId) throws Exception;
}
