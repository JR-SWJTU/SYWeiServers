package com.swjtu.SYWeiServers.dto.property;

import com.swjtu.SYWeiServers.entity.Property;

import java.util.List;

public class PropertyRequest {
    private List<Property> properties;
    private Integer num;
    private List<String> photos;

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
