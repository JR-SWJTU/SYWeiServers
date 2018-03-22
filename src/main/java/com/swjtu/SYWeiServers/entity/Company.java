package com.swjtu.SYWeiServers.entity;

import java.util.Date;

public class Company {
    private String companyid;

    private String companyname;

    private String companyno;

    private Boolean flagtrashed;

    private Boolean flagdeleted;

    private Date regdate;

    private String dbname;

    private String email;

    private String password;

    private String tel;

    private String qq;

    private Date expiredate;

    private String address;

    private String storecount;

    private Boolean flaggrant;

    private String cityname;

    private String rtcount;

    private String domain;

    private String remark;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyno() {
        return companyno;
    }

    public void setCompanyno(String companyno) {
        this.companyno = companyno == null ? null : companyno.trim();
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

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStorecount() {
        return storecount;
    }

    public void setStorecount(String storecount) {
        this.storecount = storecount == null ? null : storecount.trim();
    }

    public Boolean getFlaggrant() {
        return flaggrant;
    }

    public void setFlaggrant(Boolean flaggrant) {
        this.flaggrant = flaggrant;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getRtcount() {
        return rtcount;
    }

    public void setRtcount(String rtcount) {
        this.rtcount = rtcount == null ? null : rtcount.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyid=").append(companyid);
        sb.append(", companyname=").append(companyname);
        sb.append(", companyno=").append(companyno);
        sb.append(", flagtrashed=").append(flagtrashed);
        sb.append(", flagdeleted=").append(flagdeleted);
        sb.append(", regdate=").append(regdate);
        sb.append(", dbname=").append(dbname);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", tel=").append(tel);
        sb.append(", qq=").append(qq);
        sb.append(", expiredate=").append(expiredate);
        sb.append(", address=").append(address);
        sb.append(", storecount=").append(storecount);
        sb.append(", flaggrant=").append(flaggrant);
        sb.append(", cityname=").append(cityname);
        sb.append(", rtcount=").append(rtcount);
        sb.append(", domain=").append(domain);
        sb.append(", remark=").append(remark);
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
        Company other = (Company) that;
        return (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getCompanyno() == null ? other.getCompanyno() == null : this.getCompanyno().equals(other.getCompanyno()))
            && (this.getFlagtrashed() == null ? other.getFlagtrashed() == null : this.getFlagtrashed().equals(other.getFlagtrashed()))
            && (this.getFlagdeleted() == null ? other.getFlagdeleted() == null : this.getFlagdeleted().equals(other.getFlagdeleted()))
            && (this.getRegdate() == null ? other.getRegdate() == null : this.getRegdate().equals(other.getRegdate()))
            && (this.getDbname() == null ? other.getDbname() == null : this.getDbname().equals(other.getDbname()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getExpiredate() == null ? other.getExpiredate() == null : this.getExpiredate().equals(other.getExpiredate()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStorecount() == null ? other.getStorecount() == null : this.getStorecount().equals(other.getStorecount()))
            && (this.getFlaggrant() == null ? other.getFlaggrant() == null : this.getFlaggrant().equals(other.getFlaggrant()))
            && (this.getCityname() == null ? other.getCityname() == null : this.getCityname().equals(other.getCityname()))
            && (this.getRtcount() == null ? other.getRtcount() == null : this.getRtcount().equals(other.getRtcount()))
            && (this.getDomain() == null ? other.getDomain() == null : this.getDomain().equals(other.getDomain()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getCompanyno() == null) ? 0 : getCompanyno().hashCode());
        result = prime * result + ((getFlagtrashed() == null) ? 0 : getFlagtrashed().hashCode());
        result = prime * result + ((getFlagdeleted() == null) ? 0 : getFlagdeleted().hashCode());
        result = prime * result + ((getRegdate() == null) ? 0 : getRegdate().hashCode());
        result = prime * result + ((getDbname() == null) ? 0 : getDbname().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getExpiredate() == null) ? 0 : getExpiredate().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStorecount() == null) ? 0 : getStorecount().hashCode());
        result = prime * result + ((getFlaggrant() == null) ? 0 : getFlaggrant().hashCode());
        result = prime * result + ((getCityname() == null) ? 0 : getCityname().hashCode());
        result = prime * result + ((getRtcount() == null) ? 0 : getRtcount().hashCode());
        result = prime * result + ((getDomain() == null) ? 0 : getDomain().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}