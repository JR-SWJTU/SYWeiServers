package com.swjtu.SYWeiServers.entity;

public class C2014112109 {
    private String cusIdcard;

    private String driIdcard;

    private Integer cDripoint;

    private Integer cCuspoint;

    public String getCusIdcard() {
        return cusIdcard;
    }

    public void setCusIdcard(String cusIdcard) {
        this.cusIdcard = cusIdcard == null ? null : cusIdcard.trim();
    }

    public String getDriIdcard() {
        return driIdcard;
    }

    public void setDriIdcard(String driIdcard) {
        this.driIdcard = driIdcard == null ? null : driIdcard.trim();
    }

    public Integer getcDripoint() {
        return cDripoint;
    }

    public void setcDripoint(Integer cDripoint) {
        this.cDripoint = cDripoint;
    }

    public Integer getcCuspoint() {
        return cCuspoint;
    }

    public void setcCuspoint(Integer cCuspoint) {
        this.cCuspoint = cCuspoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cusIdcard=").append(cusIdcard);
        sb.append(", driIdcard=").append(driIdcard);
        sb.append(", cDripoint=").append(cDripoint);
        sb.append(", cCuspoint=").append(cCuspoint);
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
        C2014112109 other = (C2014112109) that;
        return (this.getCusIdcard() == null ? other.getCusIdcard() == null : this.getCusIdcard().equals(other.getCusIdcard()))
            && (this.getDriIdcard() == null ? other.getDriIdcard() == null : this.getDriIdcard().equals(other.getDriIdcard()))
            && (this.getcDripoint() == null ? other.getcDripoint() == null : this.getcDripoint().equals(other.getcDripoint()))
            && (this.getcCuspoint() == null ? other.getcCuspoint() == null : this.getcCuspoint().equals(other.getcCuspoint()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCusIdcard() == null) ? 0 : getCusIdcard().hashCode());
        result = prime * result + ((getDriIdcard() == null) ? 0 : getDriIdcard().hashCode());
        result = prime * result + ((getcDripoint() == null) ? 0 : getcDripoint().hashCode());
        result = prime * result + ((getcCuspoint() == null) ? 0 : getcCuspoint().hashCode());
        return result;
    }
}