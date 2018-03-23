package com.swjtu.SYWeiServers.entity;

import java.util.Date;

public class Photo {
    private String photoid;

    private String propertyid;

    private String photono;

    private String photoname;

    private Date moddate;

    private Boolean flagtrashed;

    private Boolean flagdeleted;

    private Date exdate;

    private String regperson;

    private Date regdate;

    private String photourl;

    private String checkstatus;

    public String getPhotoid() {
        return photoid;
    }

    public void setPhotoid(String photoid) {
        this.photoid = photoid == null ? null : photoid.trim();
    }

    public String getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(String propertyid) {
        this.propertyid = propertyid == null ? null : propertyid.trim();
    }

    public String getPhotono() {
        return photono;
    }

    public void setPhotono(String photono) {
        this.photono = photono == null ? null : photono.trim();
    }

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname == null ? null : photoname.trim();
    }

    public Date getModdate() {
        return moddate;
    }

    public void setModdate(Date moddate) {
        this.moddate = moddate;
    }

    public Boolean getFlagtrashed() {
        return flagtrashed;
    }

    public void setFlagtrashed(Boolean flagtrashed) {
        this.flagtrashed = flagtrashed;
    }

    public Boolean getFlagdeleted() {
        return flagdeleted;
    }

    public void setFlagdeleted(Boolean flagdeleted) {
        this.flagdeleted = flagdeleted;
    }

    public Date getExdate() {
        return exdate;
    }

    public void setExdate(Date exdate) {
        this.exdate = exdate;
    }

    public String getRegperson() {
        return regperson;
    }

    public void setRegperson(String regperson) {
        this.regperson = regperson == null ? null : regperson.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", photoid=").append(photoid);
        sb.append(", propertyid=").append(propertyid);
        sb.append(", photono=").append(photono);
        sb.append(", photoname=").append(photoname);
        sb.append(", moddate=").append(moddate);
        sb.append(", flagtrashed=").append(flagtrashed);
        sb.append(", flagdeleted=").append(flagdeleted);
        sb.append(", exdate=").append(exdate);
        sb.append(", regperson=").append(regperson);
        sb.append(", regdate=").append(regdate);
        sb.append(", photourl=").append(photourl);
        sb.append(", checkstatus=").append(checkstatus);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Photo other = (Photo) that;
        return (this.getPhotoid() == null ? other.getPhotoid() == null : this.getPhotoid().equals(other.getPhotoid()))
            && (this.getPropertyid() == null ? other.getPropertyid() == null : this.getPropertyid().equals(other.getPropertyid()))
            && (this.getPhotono() == null ? other.getPhotono() == null : this.getPhotono().equals(other.getPhotono()))
            && (this.getPhotoname() == null ? other.getPhotoname() == null : this.getPhotoname().equals(other.getPhotoname()))
            && (this.getModdate() == null ? other.getModdate() == null : this.getModdate().equals(other.getModdate()))
            && (this.getFlagtrashed() == null ? other.getFlagtrashed() == null : this.getFlagtrashed().equals(other.getFlagtrashed()))
            && (this.getFlagdeleted() == null ? other.getFlagdeleted() == null : this.getFlagdeleted().equals(other.getFlagdeleted()))
            && (this.getExdate() == null ? other.getExdate() == null : this.getExdate().equals(other.getExdate()))
            && (this.getRegperson() == null ? other.getRegperson() == null : this.getRegperson().equals(other.getRegperson()))
            && (this.getRegdate() == null ? other.getRegdate() == null : this.getRegdate().equals(other.getRegdate()))
            && (this.getPhotourl() == null ? other.getPhotourl() == null : this.getPhotourl().equals(other.getPhotourl()))
            && (this.getCheckstatus() == null ? other.getCheckstatus() == null : this.getCheckstatus().equals(other.getCheckstatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPhotoid() == null) ? 0 : getPhotoid().hashCode());
        result = prime * result + ((getPropertyid() == null) ? 0 : getPropertyid().hashCode());
        result = prime * result + ((getPhotono() == null) ? 0 : getPhotono().hashCode());
        result = prime * result + ((getPhotoname() == null) ? 0 : getPhotoname().hashCode());
        result = prime * result + ((getModdate() == null) ? 0 : getModdate().hashCode());
        result = prime * result + ((getFlagtrashed() == null) ? 0 : getFlagtrashed().hashCode());
        result = prime * result + ((getFlagdeleted() == null) ? 0 : getFlagdeleted().hashCode());
        result = prime * result + ((getExdate() == null) ? 0 : getExdate().hashCode());
        result = prime * result + ((getRegperson() == null) ? 0 : getRegperson().hashCode());
        result = prime * result + ((getRegdate() == null) ? 0 : getRegdate().hashCode());
        result = prime * result + ((getPhotourl() == null) ? 0 : getPhotourl().hashCode());
        result = prime * result + ((getCheckstatus() == null) ? 0 : getCheckstatus().hashCode());
        return result;
    }
}