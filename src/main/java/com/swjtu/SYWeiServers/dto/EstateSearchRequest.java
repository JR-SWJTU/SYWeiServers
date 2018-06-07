package com.swjtu.SYWeiServers.dto;

public class EstateSearchRequest {
    private String estatename;
    private String propertytype;
    private String propertyusage;
    private String completeyear;

    public String getEstatename() {
        return estatename;
    }

    public void setEstatename(String estatename) {
        this.estatename = estatename;
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }

    public String getPropertyusage() {
        return propertyusage;
    }

    public void setPropertyusage(String propertyusage) {
        this.propertyusage = propertyusage;
    }

    public String getCompleteyear() {
        return completeyear;
    }

    public void setCompleteyear(String completeyear) {
        this.completeyear = completeyear;
    }
}
