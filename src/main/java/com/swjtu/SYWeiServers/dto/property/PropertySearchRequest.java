package com.swjtu.SYWeiServers.dto.property;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/4/14.
 */
public class PropertySearchRequest {

    private int pageSize;

    private int pageNum;

    private String cityname;

    private String districtname;

    private String propertydecoration;

    private String propertydirection;

    private Integer floorMax ;

    private Integer floorMin ;

    private String trade;

    private String status;

    private String countf;

    private String countt;

    private String countw;

    private String county;

    private Double squareMax ;

    private Double squareMin ;

    private BigDecimal priceMax;

    private BigDecimal priceMin;

    private BigDecimal rentpriceMax;

    private BigDecimal rentpriceMin;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public String getPropertydecoration() {
        return propertydecoration;
    }

    public void setPropertydecoration(String propertydecoration) {
        this.propertydecoration = propertydecoration;
    }

    public String getPropertydirection() {
        return propertydirection;
    }

    public void setPropertydirection(String propertydirection) {
        this.propertydirection = propertydirection;
    }

    public Integer getFloorMax() {
        return floorMax;
    }

    public void setFloorMax(Integer floorMax) {
        this.floorMax = floorMax;
    }

    public Integer getFloorMin() {
        return floorMin;
    }

    public void setFloorMin(Integer floorMin) {
        this.floorMin = floorMin;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountf() {
        return countf;
    }

    public void setCountf(String countf) {
        this.countf = countf;
    }

    public String getCountt() {
        return countt;
    }

    public void setCountt(String countt) {
        this.countt = countt;
    }

    public String getCountw() {
        return countw;
    }

    public void setCountw(String countw) {
        this.countw = countw;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Double getSquareMax() {
        return squareMax;
    }

    public void setSquareMax(Double squareMax) {
        this.squareMax = squareMax;
    }

    public Double getSquareMin() {
        return squareMin;
    }

    public void setSquareMin(Double squareMin) {
        this.squareMin = squareMin;
    }

    public BigDecimal getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(BigDecimal priceMax) {
        this.priceMax = priceMax;
    }

    public BigDecimal getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(BigDecimal priceMin) {
        this.priceMin = priceMin;
    }

    public BigDecimal getRentpriceMax() {
        return rentpriceMax;
    }

    public void setRentpriceMax(BigDecimal rentpriceMax) {
        this.rentpriceMax = rentpriceMax;
    }

    public BigDecimal getRentpriceMin() {
        return rentpriceMin;
    }

    public void setRentpriceMin(BigDecimal rentpriceMin) {
        this.rentpriceMin = rentpriceMin;
    }
}
