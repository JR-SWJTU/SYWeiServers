package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Photo;
import com.swjtu.SYWeiServers.mapper.PhotoMapper;
import com.swjtu.SYWeiServers.mapper.PhotoMapperCustom;
import com.swjtu.SYWeiServers.service.PhotoService;
import com.swjtu.SYWeiServers.util.DataSourceFactory;
import com.swjtu.SYWeiServers.util.ToolHelper;
import com.swjtu.SYWeiServers.web.exception.CustomException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    private PhotoMapper photoMapper = null;
    private PhotoMapperCustom photoMapperCustom = null;

    @Override
    public boolean addPhoto(String companyId, String dbName, Photo photo, String propertyId, String photoUrl) throws CustomException, Exception {
        photo.setPhotoid(ToolHelper.autoID());
        photo.setPropertyid(propertyId);
        photo.setPhotourl(photoUrl);
        photoMapper = DataSourceFactory.getMapper(companyId, dbName, PhotoMapper.class);
        return photoMapper.insert(photo) == 1;
    }

    @Override
    public String findPhotosByPropertyId(String companyId, String dbName, String propertyId) throws Exception {
        photoMapperCustom = DataSourceFactory.getMapper(companyId, dbName, PhotoMapperCustom.class);
        return photoMapperCustom.selectByPropertyId(dbName, "'" + propertyId + "'");
    }

    @Override
    public List<Photo> findPhotosByPropertyIds(String companyId, String dbName, List<String> propertyIds) throws Exception {
        photoMapper = DataSourceFactory.getMapper(companyId, dbName, PhotoMapper.class);

        List<Photo> photos = photoMapper.selectByExample(dbName, propertyIds);
        if(photos == null || photos.size() == 0) {
            return new ArrayList<Photo>();
        }
        return photos;
    }
}
