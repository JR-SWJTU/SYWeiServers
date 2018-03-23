package com.swjtu.SYWeiServers.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropertyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPropertyidIsNull() {
            addCriterion("PropertyID is null");
            return (Criteria) this;
        }

        public Criteria andPropertyidIsNotNull() {
            addCriterion("PropertyID is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyidEqualTo(String value) {
            addCriterion("PropertyID =", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotEqualTo(String value) {
            addCriterion("PropertyID <>", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThan(String value) {
            addCriterion("PropertyID >", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyID >=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThan(String value) {
            addCriterion("PropertyID <", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLessThanOrEqualTo(String value) {
            addCriterion("PropertyID <=", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidLike(String value) {
            addCriterion("PropertyID like", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotLike(String value) {
            addCriterion("PropertyID not like", value, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidIn(List<String> values) {
            addCriterion("PropertyID in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotIn(List<String> values) {
            addCriterion("PropertyID not in", values, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidBetween(String value1, String value2) {
            addCriterion("PropertyID between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andPropertyidNotBetween(String value1, String value2) {
            addCriterion("PropertyID not between", value1, value2, "propertyid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CityName is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CityName is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("CityName =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("CityName <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("CityName >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("CityName >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("CityName <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("CityName <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLike(String value) {
            addCriterion("CityName like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotLike(String value) {
            addCriterion("CityName not like", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("CityName in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("CityName not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("CityName between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("CityName not between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNull() {
            addCriterion("DistrictName is null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIsNotNull() {
            addCriterion("DistrictName is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictnameEqualTo(String value) {
            addCriterion("DistrictName =", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotEqualTo(String value) {
            addCriterion("DistrictName <>", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThan(String value) {
            addCriterion("DistrictName >", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameGreaterThanOrEqualTo(String value) {
            addCriterion("DistrictName >=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThan(String value) {
            addCriterion("DistrictName <", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLessThanOrEqualTo(String value) {
            addCriterion("DistrictName <=", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameLike(String value) {
            addCriterion("DistrictName like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotLike(String value) {
            addCriterion("DistrictName not like", value, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameIn(List<String> values) {
            addCriterion("DistrictName in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotIn(List<String> values) {
            addCriterion("DistrictName not in", values, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameBetween(String value1, String value2) {
            addCriterion("DistrictName between", value1, value2, "districtname");
            return (Criteria) this;
        }

        public Criteria andDistrictnameNotBetween(String value1, String value2) {
            addCriterion("DistrictName not between", value1, value2, "districtname");
            return (Criteria) this;
        }

        public Criteria andEstateidIsNull() {
            addCriterion("EstateID is null");
            return (Criteria) this;
        }

        public Criteria andEstateidIsNotNull() {
            addCriterion("EstateID is not null");
            return (Criteria) this;
        }

        public Criteria andEstateidEqualTo(String value) {
            addCriterion("EstateID =", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotEqualTo(String value) {
            addCriterion("EstateID <>", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidGreaterThan(String value) {
            addCriterion("EstateID >", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidGreaterThanOrEqualTo(String value) {
            addCriterion("EstateID >=", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLessThan(String value) {
            addCriterion("EstateID <", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLessThanOrEqualTo(String value) {
            addCriterion("EstateID <=", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidLike(String value) {
            addCriterion("EstateID like", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotLike(String value) {
            addCriterion("EstateID not like", value, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidIn(List<String> values) {
            addCriterion("EstateID in", values, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotIn(List<String> values) {
            addCriterion("EstateID not in", values, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidBetween(String value1, String value2) {
            addCriterion("EstateID between", value1, value2, "estateid");
            return (Criteria) this;
        }

        public Criteria andEstateidNotBetween(String value1, String value2) {
            addCriterion("EstateID not between", value1, value2, "estateid");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNull() {
            addCriterion("RoomNo is null");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNotNull() {
            addCriterion("RoomNo is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnoEqualTo(String value) {
            addCriterion("RoomNo =", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotEqualTo(String value) {
            addCriterion("RoomNo <>", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThan(String value) {
            addCriterion("RoomNo >", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThanOrEqualTo(String value) {
            addCriterion("RoomNo >=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThan(String value) {
            addCriterion("RoomNo <", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThanOrEqualTo(String value) {
            addCriterion("RoomNo <=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLike(String value) {
            addCriterion("RoomNo like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotLike(String value) {
            addCriterion("RoomNo not like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoIn(List<String> values) {
            addCriterion("RoomNo in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotIn(List<String> values) {
            addCriterion("RoomNo not in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoBetween(String value1, String value2) {
            addCriterion("RoomNo between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotBetween(String value1, String value2) {
            addCriterion("RoomNo not between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("Floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("Floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("Floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("Floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("Floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("Floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("Floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("Floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("Floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("Floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("Floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("Floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("Trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("Trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("Trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("Trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("Trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("Trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("Trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("Trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("Trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("Trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("Trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("Trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("Trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("Trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCountfIsNull() {
            addCriterion("CountF is null");
            return (Criteria) this;
        }

        public Criteria andCountfIsNotNull() {
            addCriterion("CountF is not null");
            return (Criteria) this;
        }

        public Criteria andCountfEqualTo(String value) {
            addCriterion("CountF =", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfNotEqualTo(String value) {
            addCriterion("CountF <>", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfGreaterThan(String value) {
            addCriterion("CountF >", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfGreaterThanOrEqualTo(String value) {
            addCriterion("CountF >=", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfLessThan(String value) {
            addCriterion("CountF <", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfLessThanOrEqualTo(String value) {
            addCriterion("CountF <=", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfLike(String value) {
            addCriterion("CountF like", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfNotLike(String value) {
            addCriterion("CountF not like", value, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfIn(List<String> values) {
            addCriterion("CountF in", values, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfNotIn(List<String> values) {
            addCriterion("CountF not in", values, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfBetween(String value1, String value2) {
            addCriterion("CountF between", value1, value2, "countf");
            return (Criteria) this;
        }

        public Criteria andCountfNotBetween(String value1, String value2) {
            addCriterion("CountF not between", value1, value2, "countf");
            return (Criteria) this;
        }

        public Criteria andCounttIsNull() {
            addCriterion("CountT is null");
            return (Criteria) this;
        }

        public Criteria andCounttIsNotNull() {
            addCriterion("CountT is not null");
            return (Criteria) this;
        }

        public Criteria andCounttEqualTo(String value) {
            addCriterion("CountT =", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttNotEqualTo(String value) {
            addCriterion("CountT <>", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttGreaterThan(String value) {
            addCriterion("CountT >", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttGreaterThanOrEqualTo(String value) {
            addCriterion("CountT >=", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttLessThan(String value) {
            addCriterion("CountT <", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttLessThanOrEqualTo(String value) {
            addCriterion("CountT <=", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttLike(String value) {
            addCriterion("CountT like", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttNotLike(String value) {
            addCriterion("CountT not like", value, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttIn(List<String> values) {
            addCriterion("CountT in", values, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttNotIn(List<String> values) {
            addCriterion("CountT not in", values, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttBetween(String value1, String value2) {
            addCriterion("CountT between", value1, value2, "countt");
            return (Criteria) this;
        }

        public Criteria andCounttNotBetween(String value1, String value2) {
            addCriterion("CountT not between", value1, value2, "countt");
            return (Criteria) this;
        }

        public Criteria andCountwIsNull() {
            addCriterion("CountW is null");
            return (Criteria) this;
        }

        public Criteria andCountwIsNotNull() {
            addCriterion("CountW is not null");
            return (Criteria) this;
        }

        public Criteria andCountwEqualTo(String value) {
            addCriterion("CountW =", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwNotEqualTo(String value) {
            addCriterion("CountW <>", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwGreaterThan(String value) {
            addCriterion("CountW >", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwGreaterThanOrEqualTo(String value) {
            addCriterion("CountW >=", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwLessThan(String value) {
            addCriterion("CountW <", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwLessThanOrEqualTo(String value) {
            addCriterion("CountW <=", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwLike(String value) {
            addCriterion("CountW like", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwNotLike(String value) {
            addCriterion("CountW not like", value, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwIn(List<String> values) {
            addCriterion("CountW in", values, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwNotIn(List<String> values) {
            addCriterion("CountW not in", values, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwBetween(String value1, String value2) {
            addCriterion("CountW between", value1, value2, "countw");
            return (Criteria) this;
        }

        public Criteria andCountwNotBetween(String value1, String value2) {
            addCriterion("CountW not between", value1, value2, "countw");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("CountY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("CountY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("CountY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("CountY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("CountY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("CountY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("CountY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("CountY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("CountY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("CountY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("CountY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("CountY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("CountY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("CountY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Byte value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Byte value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Byte value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Byte value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Byte value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Byte> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Byte> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Byte value1, Byte value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andPropertyusageIsNull() {
            addCriterion("PropertyUsage is null");
            return (Criteria) this;
        }

        public Criteria andPropertyusageIsNotNull() {
            addCriterion("PropertyUsage is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyusageEqualTo(String value) {
            addCriterion("PropertyUsage =", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageNotEqualTo(String value) {
            addCriterion("PropertyUsage <>", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageGreaterThan(String value) {
            addCriterion("PropertyUsage >", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyUsage >=", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageLessThan(String value) {
            addCriterion("PropertyUsage <", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageLessThanOrEqualTo(String value) {
            addCriterion("PropertyUsage <=", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageLike(String value) {
            addCriterion("PropertyUsage like", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageNotLike(String value) {
            addCriterion("PropertyUsage not like", value, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageIn(List<String> values) {
            addCriterion("PropertyUsage in", values, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageNotIn(List<String> values) {
            addCriterion("PropertyUsage not in", values, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageBetween(String value1, String value2) {
            addCriterion("PropertyUsage between", value1, value2, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertyusageNotBetween(String value1, String value2) {
            addCriterion("PropertyUsage not between", value1, value2, "propertyusage");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNull() {
            addCriterion("PropertyType is null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIsNotNull() {
            addCriterion("PropertyType is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytypeEqualTo(String value) {
            addCriterion("PropertyType =", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotEqualTo(String value) {
            addCriterion("PropertyType <>", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThan(String value) {
            addCriterion("PropertyType >", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyType >=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThan(String value) {
            addCriterion("PropertyType <", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLessThanOrEqualTo(String value) {
            addCriterion("PropertyType <=", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeLike(String value) {
            addCriterion("PropertyType like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotLike(String value) {
            addCriterion("PropertyType not like", value, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeIn(List<String> values) {
            addCriterion("PropertyType in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotIn(List<String> values) {
            addCriterion("PropertyType not in", values, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeBetween(String value1, String value2) {
            addCriterion("PropertyType between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertytypeNotBetween(String value1, String value2) {
            addCriterion("PropertyType not between", value1, value2, "propertytype");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIsNull() {
            addCriterion("PropertyDirection is null");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIsNotNull() {
            addCriterion("PropertyDirection is not null");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionEqualTo(String value) {
            addCriterion("PropertyDirection =", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotEqualTo(String value) {
            addCriterion("PropertyDirection <>", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionGreaterThan(String value) {
            addCriterion("PropertyDirection >", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyDirection >=", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLessThan(String value) {
            addCriterion("PropertyDirection <", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLessThanOrEqualTo(String value) {
            addCriterion("PropertyDirection <=", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionLike(String value) {
            addCriterion("PropertyDirection like", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotLike(String value) {
            addCriterion("PropertyDirection not like", value, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionIn(List<String> values) {
            addCriterion("PropertyDirection in", values, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotIn(List<String> values) {
            addCriterion("PropertyDirection not in", values, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionBetween(String value1, String value2) {
            addCriterion("PropertyDirection between", value1, value2, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertydirectionNotBetween(String value1, String value2) {
            addCriterion("PropertyDirection not between", value1, value2, "propertydirection");
            return (Criteria) this;
        }

        public Criteria andPropertylookIsNull() {
            addCriterion("PropertyLook is null");
            return (Criteria) this;
        }

        public Criteria andPropertylookIsNotNull() {
            addCriterion("PropertyLook is not null");
            return (Criteria) this;
        }

        public Criteria andPropertylookEqualTo(String value) {
            addCriterion("PropertyLook =", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookNotEqualTo(String value) {
            addCriterion("PropertyLook <>", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookGreaterThan(String value) {
            addCriterion("PropertyLook >", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyLook >=", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookLessThan(String value) {
            addCriterion("PropertyLook <", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookLessThanOrEqualTo(String value) {
            addCriterion("PropertyLook <=", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookLike(String value) {
            addCriterion("PropertyLook like", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookNotLike(String value) {
            addCriterion("PropertyLook not like", value, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookIn(List<String> values) {
            addCriterion("PropertyLook in", values, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookNotIn(List<String> values) {
            addCriterion("PropertyLook not in", values, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookBetween(String value1, String value2) {
            addCriterion("PropertyLook between", value1, value2, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertylookNotBetween(String value1, String value2) {
            addCriterion("PropertyLook not between", value1, value2, "propertylook");
            return (Criteria) this;
        }

        public Criteria andPropertybuyIsNull() {
            addCriterion("PropertyBuy is null");
            return (Criteria) this;
        }

        public Criteria andPropertybuyIsNotNull() {
            addCriterion("PropertyBuy is not null");
            return (Criteria) this;
        }

        public Criteria andPropertybuyEqualTo(String value) {
            addCriterion("PropertyBuy =", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyNotEqualTo(String value) {
            addCriterion("PropertyBuy <>", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyGreaterThan(String value) {
            addCriterion("PropertyBuy >", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyBuy >=", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyLessThan(String value) {
            addCriterion("PropertyBuy <", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyLessThanOrEqualTo(String value) {
            addCriterion("PropertyBuy <=", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyLike(String value) {
            addCriterion("PropertyBuy like", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyNotLike(String value) {
            addCriterion("PropertyBuy not like", value, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyIn(List<String> values) {
            addCriterion("PropertyBuy in", values, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyNotIn(List<String> values) {
            addCriterion("PropertyBuy not in", values, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyBetween(String value1, String value2) {
            addCriterion("PropertyBuy between", value1, value2, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertybuyNotBetween(String value1, String value2) {
            addCriterion("PropertyBuy not between", value1, value2, "propertybuy");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionIsNull() {
            addCriterion("PropertyCommission is null");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionIsNotNull() {
            addCriterion("PropertyCommission is not null");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionEqualTo(String value) {
            addCriterion("PropertyCommission =", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionNotEqualTo(String value) {
            addCriterion("PropertyCommission <>", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionGreaterThan(String value) {
            addCriterion("PropertyCommission >", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyCommission >=", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionLessThan(String value) {
            addCriterion("PropertyCommission <", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionLessThanOrEqualTo(String value) {
            addCriterion("PropertyCommission <=", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionLike(String value) {
            addCriterion("PropertyCommission like", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionNotLike(String value) {
            addCriterion("PropertyCommission not like", value, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionIn(List<String> values) {
            addCriterion("PropertyCommission in", values, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionNotIn(List<String> values) {
            addCriterion("PropertyCommission not in", values, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionBetween(String value1, String value2) {
            addCriterion("PropertyCommission between", value1, value2, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertycommissionNotBetween(String value1, String value2) {
            addCriterion("PropertyCommission not between", value1, value2, "propertycommission");
            return (Criteria) this;
        }

        public Criteria andPropertysourceIsNull() {
            addCriterion("PropertySource is null");
            return (Criteria) this;
        }

        public Criteria andPropertysourceIsNotNull() {
            addCriterion("PropertySource is not null");
            return (Criteria) this;
        }

        public Criteria andPropertysourceEqualTo(String value) {
            addCriterion("PropertySource =", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceNotEqualTo(String value) {
            addCriterion("PropertySource <>", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceGreaterThan(String value) {
            addCriterion("PropertySource >", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceGreaterThanOrEqualTo(String value) {
            addCriterion("PropertySource >=", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceLessThan(String value) {
            addCriterion("PropertySource <", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceLessThanOrEqualTo(String value) {
            addCriterion("PropertySource <=", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceLike(String value) {
            addCriterion("PropertySource like", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceNotLike(String value) {
            addCriterion("PropertySource not like", value, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceIn(List<String> values) {
            addCriterion("PropertySource in", values, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceNotIn(List<String> values) {
            addCriterion("PropertySource not in", values, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceBetween(String value1, String value2) {
            addCriterion("PropertySource between", value1, value2, "propertysource");
            return (Criteria) this;
        }

        public Criteria andPropertysourceNotBetween(String value1, String value2) {
            addCriterion("PropertySource not between", value1, value2, "propertysource");
            return (Criteria) this;
        }

        public Criteria andSquareIsNull() {
            addCriterion("Square is null");
            return (Criteria) this;
        }

        public Criteria andSquareIsNotNull() {
            addCriterion("Square is not null");
            return (Criteria) this;
        }

        public Criteria andSquareEqualTo(Double value) {
            addCriterion("Square =", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotEqualTo(Double value) {
            addCriterion("Square <>", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThan(Double value) {
            addCriterion("Square >", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareGreaterThanOrEqualTo(Double value) {
            addCriterion("Square >=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThan(Double value) {
            addCriterion("Square <", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareLessThanOrEqualTo(Double value) {
            addCriterion("Square <=", value, "square");
            return (Criteria) this;
        }

        public Criteria andSquareIn(List<Double> values) {
            addCriterion("Square in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotIn(List<Double> values) {
            addCriterion("Square not in", values, "square");
            return (Criteria) this;
        }

        public Criteria andSquareBetween(Double value1, Double value2) {
            addCriterion("Square between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andSquareNotBetween(Double value1, Double value2) {
            addCriterion("Square not between", value1, value2, "square");
            return (Criteria) this;
        }

        public Criteria andPriceunitIsNull() {
            addCriterion("PriceUnit is null");
            return (Criteria) this;
        }

        public Criteria andPriceunitIsNotNull() {
            addCriterion("PriceUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPriceunitEqualTo(BigDecimal value) {
            addCriterion("PriceUnit =", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitNotEqualTo(BigDecimal value) {
            addCriterion("PriceUnit <>", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitGreaterThan(BigDecimal value) {
            addCriterion("PriceUnit >", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceUnit >=", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitLessThan(BigDecimal value) {
            addCriterion("PriceUnit <", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceUnit <=", value, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitIn(List<BigDecimal> values) {
            addCriterion("PriceUnit in", values, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitNotIn(List<BigDecimal> values) {
            addCriterion("PriceUnit not in", values, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceUnit between", value1, value2, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceunitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceUnit not between", value1, value2, "priceunit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPricebaseIsNull() {
            addCriterion("PriceBase is null");
            return (Criteria) this;
        }

        public Criteria andPricebaseIsNotNull() {
            addCriterion("PriceBase is not null");
            return (Criteria) this;
        }

        public Criteria andPricebaseEqualTo(BigDecimal value) {
            addCriterion("PriceBase =", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseNotEqualTo(BigDecimal value) {
            addCriterion("PriceBase <>", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseGreaterThan(BigDecimal value) {
            addCriterion("PriceBase >", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceBase >=", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseLessThan(BigDecimal value) {
            addCriterion("PriceBase <", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PriceBase <=", value, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseIn(List<BigDecimal> values) {
            addCriterion("PriceBase in", values, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseNotIn(List<BigDecimal> values) {
            addCriterion("PriceBase not in", values, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceBase between", value1, value2, "pricebase");
            return (Criteria) this;
        }

        public Criteria andPricebaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PriceBase not between", value1, value2, "pricebase");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitIsNull() {
            addCriterion("RentPriceUnit is null");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitIsNotNull() {
            addCriterion("RentPriceUnit is not null");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitEqualTo(BigDecimal value) {
            addCriterion("RentPriceUnit =", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitNotEqualTo(BigDecimal value) {
            addCriterion("RentPriceUnit <>", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitGreaterThan(BigDecimal value) {
            addCriterion("RentPriceUnit >", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RentPriceUnit >=", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitLessThan(BigDecimal value) {
            addCriterion("RentPriceUnit <", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RentPriceUnit <=", value, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitIn(List<BigDecimal> values) {
            addCriterion("RentPriceUnit in", values, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitNotIn(List<BigDecimal> values) {
            addCriterion("RentPriceUnit not in", values, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RentPriceUnit between", value1, value2, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceunitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RentPriceUnit not between", value1, value2, "rentpriceunit");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNull() {
            addCriterion("RentPrice is null");
            return (Criteria) this;
        }

        public Criteria andRentpriceIsNotNull() {
            addCriterion("RentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRentpriceEqualTo(BigDecimal value) {
            addCriterion("RentPrice =", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotEqualTo(BigDecimal value) {
            addCriterion("RentPrice <>", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThan(BigDecimal value) {
            addCriterion("RentPrice >", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RentPrice >=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThan(BigDecimal value) {
            addCriterion("RentPrice <", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RentPrice <=", value, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceIn(List<BigDecimal> values) {
            addCriterion("RentPrice in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotIn(List<BigDecimal> values) {
            addCriterion("RentPrice not in", values, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RentPrice between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andRentpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RentPrice not between", value1, value2, "rentprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIsNull() {
            addCriterion("MgtPrice is null");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIsNotNull() {
            addCriterion("MgtPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMgtpriceEqualTo(BigDecimal value) {
            addCriterion("MgtPrice =", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotEqualTo(BigDecimal value) {
            addCriterion("MgtPrice <>", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceGreaterThan(BigDecimal value) {
            addCriterion("MgtPrice >", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MgtPrice >=", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceLessThan(BigDecimal value) {
            addCriterion("MgtPrice <", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MgtPrice <=", value, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceIn(List<BigDecimal> values) {
            addCriterion("MgtPrice in", values, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotIn(List<BigDecimal> values) {
            addCriterion("MgtPrice not in", values, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MgtPrice between", value1, value2, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andMgtpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MgtPrice not between", value1, value2, "mgtprice");
            return (Criteria) this;
        }

        public Criteria andTrustdateIsNull() {
            addCriterion("TrustDate is null");
            return (Criteria) this;
        }

        public Criteria andTrustdateIsNotNull() {
            addCriterion("TrustDate is not null");
            return (Criteria) this;
        }

        public Criteria andTrustdateEqualTo(Date value) {
            addCriterion("TrustDate =", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateNotEqualTo(Date value) {
            addCriterion("TrustDate <>", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateGreaterThan(Date value) {
            addCriterion("TrustDate >", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateGreaterThanOrEqualTo(Date value) {
            addCriterion("TrustDate >=", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateLessThan(Date value) {
            addCriterion("TrustDate <", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateLessThanOrEqualTo(Date value) {
            addCriterion("TrustDate <=", value, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateIn(List<Date> values) {
            addCriterion("TrustDate in", values, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateNotIn(List<Date> values) {
            addCriterion("TrustDate not in", values, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateBetween(Date value1, Date value2) {
            addCriterion("TrustDate between", value1, value2, "trustdate");
            return (Criteria) this;
        }

        public Criteria andTrustdateNotBetween(Date value1, Date value2) {
            addCriterion("TrustDate not between", value1, value2, "trustdate");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DeptID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DeptID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EmpID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EmpID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EmpID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EmpID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EmpID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EmpID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EmpID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EmpID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EmpID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EmpID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EmpID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EmpID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EmpID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EmpID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationIsNull() {
            addCriterion("PropertyDecoration is null");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationIsNotNull() {
            addCriterion("PropertyDecoration is not null");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationEqualTo(String value) {
            addCriterion("PropertyDecoration =", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationNotEqualTo(String value) {
            addCriterion("PropertyDecoration <>", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationGreaterThan(String value) {
            addCriterion("PropertyDecoration >", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyDecoration >=", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationLessThan(String value) {
            addCriterion("PropertyDecoration <", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationLessThanOrEqualTo(String value) {
            addCriterion("PropertyDecoration <=", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationLike(String value) {
            addCriterion("PropertyDecoration like", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationNotLike(String value) {
            addCriterion("PropertyDecoration not like", value, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationIn(List<String> values) {
            addCriterion("PropertyDecoration in", values, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationNotIn(List<String> values) {
            addCriterion("PropertyDecoration not in", values, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationBetween(String value1, String value2) {
            addCriterion("PropertyDecoration between", value1, value2, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertydecorationNotBetween(String value1, String value2) {
            addCriterion("PropertyDecoration not between", value1, value2, "propertydecoration");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorIsNull() {
            addCriterion("PropertyFloor is null");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorIsNotNull() {
            addCriterion("PropertyFloor is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorEqualTo(String value) {
            addCriterion("PropertyFloor =", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorNotEqualTo(String value) {
            addCriterion("PropertyFloor <>", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorGreaterThan(String value) {
            addCriterion("PropertyFloor >", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyFloor >=", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorLessThan(String value) {
            addCriterion("PropertyFloor <", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorLessThanOrEqualTo(String value) {
            addCriterion("PropertyFloor <=", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorLike(String value) {
            addCriterion("PropertyFloor like", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorNotLike(String value) {
            addCriterion("PropertyFloor not like", value, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorIn(List<String> values) {
            addCriterion("PropertyFloor in", values, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorNotIn(List<String> values) {
            addCriterion("PropertyFloor not in", values, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorBetween(String value1, String value2) {
            addCriterion("PropertyFloor between", value1, value2, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andPropertyfloorNotBetween(String value1, String value2) {
            addCriterion("PropertyFloor not between", value1, value2, "propertyfloor");
            return (Criteria) this;
        }

        public Criteria andRegpersonIsNull() {
            addCriterion("RegPerson is null");
            return (Criteria) this;
        }

        public Criteria andRegpersonIsNotNull() {
            addCriterion("RegPerson is not null");
            return (Criteria) this;
        }

        public Criteria andRegpersonEqualTo(String value) {
            addCriterion("RegPerson =", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonNotEqualTo(String value) {
            addCriterion("RegPerson <>", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonGreaterThan(String value) {
            addCriterion("RegPerson >", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonGreaterThanOrEqualTo(String value) {
            addCriterion("RegPerson >=", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonLessThan(String value) {
            addCriterion("RegPerson <", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonLessThanOrEqualTo(String value) {
            addCriterion("RegPerson <=", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonLike(String value) {
            addCriterion("RegPerson like", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonNotLike(String value) {
            addCriterion("RegPerson not like", value, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonIn(List<String> values) {
            addCriterion("RegPerson in", values, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonNotIn(List<String> values) {
            addCriterion("RegPerson not in", values, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonBetween(String value1, String value2) {
            addCriterion("RegPerson between", value1, value2, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegpersonNotBetween(String value1, String value2) {
            addCriterion("RegPerson not between", value1, value2, "regperson");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("RegDate is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("RegDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Date value) {
            addCriterion("RegDate =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Date value) {
            addCriterion("RegDate <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Date value) {
            addCriterion("RegDate >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RegDate >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Date value) {
            addCriterion("RegDate <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Date value) {
            addCriterion("RegDate <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Date> values) {
            addCriterion("RegDate in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Date> values) {
            addCriterion("RegDate not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Date value1, Date value2) {
            addCriterion("RegDate between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Date value1, Date value2) {
            addCriterion("RegDate not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andModpersonIsNull() {
            addCriterion("ModPerson is null");
            return (Criteria) this;
        }

        public Criteria andModpersonIsNotNull() {
            addCriterion("ModPerson is not null");
            return (Criteria) this;
        }

        public Criteria andModpersonEqualTo(String value) {
            addCriterion("ModPerson =", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonNotEqualTo(String value) {
            addCriterion("ModPerson <>", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonGreaterThan(String value) {
            addCriterion("ModPerson >", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonGreaterThanOrEqualTo(String value) {
            addCriterion("ModPerson >=", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonLessThan(String value) {
            addCriterion("ModPerson <", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonLessThanOrEqualTo(String value) {
            addCriterion("ModPerson <=", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonLike(String value) {
            addCriterion("ModPerson like", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonNotLike(String value) {
            addCriterion("ModPerson not like", value, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonIn(List<String> values) {
            addCriterion("ModPerson in", values, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonNotIn(List<String> values) {
            addCriterion("ModPerson not in", values, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonBetween(String value1, String value2) {
            addCriterion("ModPerson between", value1, value2, "modperson");
            return (Criteria) this;
        }

        public Criteria andModpersonNotBetween(String value1, String value2) {
            addCriterion("ModPerson not between", value1, value2, "modperson");
            return (Criteria) this;
        }

        public Criteria andModdateIsNull() {
            addCriterion("ModDate is null");
            return (Criteria) this;
        }

        public Criteria andModdateIsNotNull() {
            addCriterion("ModDate is not null");
            return (Criteria) this;
        }

        public Criteria andModdateEqualTo(Date value) {
            addCriterion("ModDate =", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotEqualTo(Date value) {
            addCriterion("ModDate <>", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateGreaterThan(Date value) {
            addCriterion("ModDate >", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModDate >=", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateLessThan(Date value) {
            addCriterion("ModDate <", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateLessThanOrEqualTo(Date value) {
            addCriterion("ModDate <=", value, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateIn(List<Date> values) {
            addCriterion("ModDate in", values, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotIn(List<Date> values) {
            addCriterion("ModDate not in", values, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateBetween(Date value1, Date value2) {
            addCriterion("ModDate between", value1, value2, "moddate");
            return (Criteria) this;
        }

        public Criteria andModdateNotBetween(Date value1, Date value2) {
            addCriterion("ModDate not between", value1, value2, "moddate");
            return (Criteria) this;
        }

        public Criteria andPropertytrustIsNull() {
            addCriterion("PropertyTrust is null");
            return (Criteria) this;
        }

        public Criteria andPropertytrustIsNotNull() {
            addCriterion("PropertyTrust is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytrustEqualTo(String value) {
            addCriterion("PropertyTrust =", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustNotEqualTo(String value) {
            addCriterion("PropertyTrust <>", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustGreaterThan(String value) {
            addCriterion("PropertyTrust >", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyTrust >=", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustLessThan(String value) {
            addCriterion("PropertyTrust <", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustLessThanOrEqualTo(String value) {
            addCriterion("PropertyTrust <=", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustLike(String value) {
            addCriterion("PropertyTrust like", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustNotLike(String value) {
            addCriterion("PropertyTrust not like", value, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustIn(List<String> values) {
            addCriterion("PropertyTrust in", values, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustNotIn(List<String> values) {
            addCriterion("PropertyTrust not in", values, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustBetween(String value1, String value2) {
            addCriterion("PropertyTrust between", value1, value2, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andPropertytrustNotBetween(String value1, String value2) {
            addCriterion("PropertyTrust not between", value1, value2, "propertytrust");
            return (Criteria) this;
        }

        public Criteria andKeynoIsNull() {
            addCriterion("KeyNo is null");
            return (Criteria) this;
        }

        public Criteria andKeynoIsNotNull() {
            addCriterion("KeyNo is not null");
            return (Criteria) this;
        }

        public Criteria andKeynoEqualTo(String value) {
            addCriterion("KeyNo =", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoNotEqualTo(String value) {
            addCriterion("KeyNo <>", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoGreaterThan(String value) {
            addCriterion("KeyNo >", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoGreaterThanOrEqualTo(String value) {
            addCriterion("KeyNo >=", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoLessThan(String value) {
            addCriterion("KeyNo <", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoLessThanOrEqualTo(String value) {
            addCriterion("KeyNo <=", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoLike(String value) {
            addCriterion("KeyNo like", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoNotLike(String value) {
            addCriterion("KeyNo not like", value, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoIn(List<String> values) {
            addCriterion("KeyNo in", values, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoNotIn(List<String> values) {
            addCriterion("KeyNo not in", values, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoBetween(String value1, String value2) {
            addCriterion("KeyNo between", value1, value2, "keyno");
            return (Criteria) this;
        }

        public Criteria andKeynoNotBetween(String value1, String value2) {
            addCriterion("KeyNo not between", value1, value2, "keyno");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIsNull() {
            addCriterion("CompleteYear is null");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIsNotNull() {
            addCriterion("CompleteYear is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteyearEqualTo(String value) {
            addCriterion("CompleteYear =", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotEqualTo(String value) {
            addCriterion("CompleteYear <>", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearGreaterThan(String value) {
            addCriterion("CompleteYear >", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearGreaterThanOrEqualTo(String value) {
            addCriterion("CompleteYear >=", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLessThan(String value) {
            addCriterion("CompleteYear <", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLessThanOrEqualTo(String value) {
            addCriterion("CompleteYear <=", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearLike(String value) {
            addCriterion("CompleteYear like", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotLike(String value) {
            addCriterion("CompleteYear not like", value, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearIn(List<String> values) {
            addCriterion("CompleteYear in", values, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotIn(List<String> values) {
            addCriterion("CompleteYear not in", values, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearBetween(String value1, String value2) {
            addCriterion("CompleteYear between", value1, value2, "completeyear");
            return (Criteria) this;
        }

        public Criteria andCompleteyearNotBetween(String value1, String value2) {
            addCriterion("CompleteYear not between", value1, value2, "completeyear");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyIsNull() {
            addCriterion("PropertyOccupy is null");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyIsNotNull() {
            addCriterion("PropertyOccupy is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyEqualTo(String value) {
            addCriterion("PropertyOccupy =", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyNotEqualTo(String value) {
            addCriterion("PropertyOccupy <>", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyGreaterThan(String value) {
            addCriterion("PropertyOccupy >", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyOccupy >=", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyLessThan(String value) {
            addCriterion("PropertyOccupy <", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyLessThanOrEqualTo(String value) {
            addCriterion("PropertyOccupy <=", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyLike(String value) {
            addCriterion("PropertyOccupy like", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyNotLike(String value) {
            addCriterion("PropertyOccupy not like", value, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyIn(List<String> values) {
            addCriterion("PropertyOccupy in", values, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyNotIn(List<String> values) {
            addCriterion("PropertyOccupy not in", values, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyBetween(String value1, String value2) {
            addCriterion("PropertyOccupy between", value1, value2, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyoccupyNotBetween(String value1, String value2) {
            addCriterion("PropertyOccupy not between", value1, value2, "propertyoccupy");
            return (Criteria) this;
        }

        public Criteria andPropertyownIsNull() {
            addCriterion("PropertyOwn is null");
            return (Criteria) this;
        }

        public Criteria andPropertyownIsNotNull() {
            addCriterion("PropertyOwn is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyownEqualTo(String value) {
            addCriterion("PropertyOwn =", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownNotEqualTo(String value) {
            addCriterion("PropertyOwn <>", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownGreaterThan(String value) {
            addCriterion("PropertyOwn >", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyOwn >=", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownLessThan(String value) {
            addCriterion("PropertyOwn <", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownLessThanOrEqualTo(String value) {
            addCriterion("PropertyOwn <=", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownLike(String value) {
            addCriterion("PropertyOwn like", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownNotLike(String value) {
            addCriterion("PropertyOwn not like", value, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownIn(List<String> values) {
            addCriterion("PropertyOwn in", values, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownNotIn(List<String> values) {
            addCriterion("PropertyOwn not in", values, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownBetween(String value1, String value2) {
            addCriterion("PropertyOwn between", value1, value2, "propertyown");
            return (Criteria) this;
        }

        public Criteria andPropertyownNotBetween(String value1, String value2) {
            addCriterion("PropertyOwn not between", value1, value2, "propertyown");
            return (Criteria) this;
        }

        public Criteria andSquareuseIsNull() {
            addCriterion("SquareUse is null");
            return (Criteria) this;
        }

        public Criteria andSquareuseIsNotNull() {
            addCriterion("SquareUse is not null");
            return (Criteria) this;
        }

        public Criteria andSquareuseEqualTo(Double value) {
            addCriterion("SquareUse =", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseNotEqualTo(Double value) {
            addCriterion("SquareUse <>", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseGreaterThan(Double value) {
            addCriterion("SquareUse >", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseGreaterThanOrEqualTo(Double value) {
            addCriterion("SquareUse >=", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseLessThan(Double value) {
            addCriterion("SquareUse <", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseLessThanOrEqualTo(Double value) {
            addCriterion("SquareUse <=", value, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseIn(List<Double> values) {
            addCriterion("SquareUse in", values, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseNotIn(List<Double> values) {
            addCriterion("SquareUse not in", values, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseBetween(Double value1, Double value2) {
            addCriterion("SquareUse between", value1, value2, "squareuse");
            return (Criteria) this;
        }

        public Criteria andSquareuseNotBetween(Double value1, Double value2) {
            addCriterion("SquareUse not between", value1, value2, "squareuse");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateIsNull() {
            addCriterion("LastFollowDate is null");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateIsNotNull() {
            addCriterion("LastFollowDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateEqualTo(Date value) {
            addCriterion("LastFollowDate =", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateNotEqualTo(Date value) {
            addCriterion("LastFollowDate <>", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateGreaterThan(Date value) {
            addCriterion("LastFollowDate >", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastFollowDate >=", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateLessThan(Date value) {
            addCriterion("LastFollowDate <", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateLessThanOrEqualTo(Date value) {
            addCriterion("LastFollowDate <=", value, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateIn(List<Date> values) {
            addCriterion("LastFollowDate in", values, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateNotIn(List<Date> values) {
            addCriterion("LastFollowDate not in", values, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateBetween(Date value1, Date value2) {
            addCriterion("LastFollowDate between", value1, value2, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andLastfollowdateNotBetween(Date value1, Date value2) {
            addCriterion("LastFollowDate not between", value1, value2, "lastfollowdate");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIsNull() {
            addCriterion("FlagTrashed is null");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIsNotNull() {
            addCriterion("FlagTrashed is not null");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedEqualTo(Boolean value) {
            addCriterion("FlagTrashed =", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotEqualTo(Boolean value) {
            addCriterion("FlagTrashed <>", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedGreaterThan(Boolean value) {
            addCriterion("FlagTrashed >", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagTrashed >=", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedLessThan(Boolean value) {
            addCriterion("FlagTrashed <", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagTrashed <=", value, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedIn(List<Boolean> values) {
            addCriterion("FlagTrashed in", values, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotIn(List<Boolean> values) {
            addCriterion("FlagTrashed not in", values, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagTrashed between", value1, value2, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagtrashedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagTrashed not between", value1, value2, "flagtrashed");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIsNull() {
            addCriterion("FlagDeleted is null");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIsNotNull() {
            addCriterion("FlagDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedEqualTo(Boolean value) {
            addCriterion("FlagDeleted =", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotEqualTo(Boolean value) {
            addCriterion("FlagDeleted <>", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedGreaterThan(Boolean value) {
            addCriterion("FlagDeleted >", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagDeleted >=", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedLessThan(Boolean value) {
            addCriterion("FlagDeleted <", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagDeleted <=", value, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedIn(List<Boolean> values) {
            addCriterion("FlagDeleted in", values, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotIn(List<Boolean> values) {
            addCriterion("FlagDeleted not in", values, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagDeleted between", value1, value2, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andFlagdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagDeleted not between", value1, value2, "flagdeleted");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("OwnerName is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("OwnerName is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("OwnerName =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("OwnerName <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("OwnerName >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerName >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("OwnerName <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("OwnerName <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("OwnerName like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("OwnerName not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("OwnerName in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("OwnerName not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("OwnerName between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("OwnerName not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNull() {
            addCriterion("OwnerTel is null");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNotNull() {
            addCriterion("OwnerTel is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertelEqualTo(String value) {
            addCriterion("OwnerTel =", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotEqualTo(String value) {
            addCriterion("OwnerTel <>", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThan(String value) {
            addCriterion("OwnerTel >", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerTel >=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThan(String value) {
            addCriterion("OwnerTel <", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThanOrEqualTo(String value) {
            addCriterion("OwnerTel <=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLike(String value) {
            addCriterion("OwnerTel like", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotLike(String value) {
            addCriterion("OwnerTel not like", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelIn(List<String> values) {
            addCriterion("OwnerTel in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotIn(List<String> values) {
            addCriterion("OwnerTel not in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelBetween(String value1, String value2) {
            addCriterion("OwnerTel between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotBetween(String value1, String value2) {
            addCriterion("OwnerTel not between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNull() {
            addCriterion("ContactName is null");
            return (Criteria) this;
        }

        public Criteria andContactnameIsNotNull() {
            addCriterion("ContactName is not null");
            return (Criteria) this;
        }

        public Criteria andContactnameEqualTo(String value) {
            addCriterion("ContactName =", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotEqualTo(String value) {
            addCriterion("ContactName <>", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThan(String value) {
            addCriterion("ContactName >", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameGreaterThanOrEqualTo(String value) {
            addCriterion("ContactName >=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThan(String value) {
            addCriterion("ContactName <", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLessThanOrEqualTo(String value) {
            addCriterion("ContactName <=", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameLike(String value) {
            addCriterion("ContactName like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotLike(String value) {
            addCriterion("ContactName not like", value, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameIn(List<String> values) {
            addCriterion("ContactName in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotIn(List<String> values) {
            addCriterion("ContactName not in", values, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameBetween(String value1, String value2) {
            addCriterion("ContactName between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andContactnameNotBetween(String value1, String value2) {
            addCriterion("ContactName not between", value1, value2, "contactname");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureIsNull() {
            addCriterion("PropertyFurniture is null");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureIsNotNull() {
            addCriterion("PropertyFurniture is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureEqualTo(String value) {
            addCriterion("PropertyFurniture =", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureNotEqualTo(String value) {
            addCriterion("PropertyFurniture <>", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureGreaterThan(String value) {
            addCriterion("PropertyFurniture >", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyFurniture >=", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureLessThan(String value) {
            addCriterion("PropertyFurniture <", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureLessThanOrEqualTo(String value) {
            addCriterion("PropertyFurniture <=", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureLike(String value) {
            addCriterion("PropertyFurniture like", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureNotLike(String value) {
            addCriterion("PropertyFurniture not like", value, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureIn(List<String> values) {
            addCriterion("PropertyFurniture in", values, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureNotIn(List<String> values) {
            addCriterion("PropertyFurniture not in", values, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureBetween(String value1, String value2) {
            addCriterion("PropertyFurniture between", value1, value2, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertyfurnitureNotBetween(String value1, String value2) {
            addCriterion("PropertyFurniture not between", value1, value2, "propertyfurniture");
            return (Criteria) this;
        }

        public Criteria andPropertynoIsNull() {
            addCriterion("PropertyNo is null");
            return (Criteria) this;
        }

        public Criteria andPropertynoIsNotNull() {
            addCriterion("PropertyNo is not null");
            return (Criteria) this;
        }

        public Criteria andPropertynoEqualTo(String value) {
            addCriterion("PropertyNo =", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotEqualTo(String value) {
            addCriterion("PropertyNo <>", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoGreaterThan(String value) {
            addCriterion("PropertyNo >", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyNo >=", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLessThan(String value) {
            addCriterion("PropertyNo <", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLessThanOrEqualTo(String value) {
            addCriterion("PropertyNo <=", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoLike(String value) {
            addCriterion("PropertyNo like", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotLike(String value) {
            addCriterion("PropertyNo not like", value, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoIn(List<String> values) {
            addCriterion("PropertyNo in", values, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotIn(List<String> values) {
            addCriterion("PropertyNo not in", values, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoBetween(String value1, String value2) {
            addCriterion("PropertyNo between", value1, value2, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPropertynoNotBetween(String value1, String value2) {
            addCriterion("PropertyNo not between", value1, value2, "propertyno");
            return (Criteria) this;
        }

        public Criteria andPricelineIsNull() {
            addCriterion("PriceLine is null");
            return (Criteria) this;
        }

        public Criteria andPricelineIsNotNull() {
            addCriterion("PriceLine is not null");
            return (Criteria) this;
        }

        public Criteria andPricelineEqualTo(Double value) {
            addCriterion("PriceLine =", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineNotEqualTo(Double value) {
            addCriterion("PriceLine <>", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineGreaterThan(Double value) {
            addCriterion("PriceLine >", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineGreaterThanOrEqualTo(Double value) {
            addCriterion("PriceLine >=", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineLessThan(Double value) {
            addCriterion("PriceLine <", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineLessThanOrEqualTo(Double value) {
            addCriterion("PriceLine <=", value, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineIn(List<Double> values) {
            addCriterion("PriceLine in", values, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineNotIn(List<Double> values) {
            addCriterion("PriceLine not in", values, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineBetween(Double value1, Double value2) {
            addCriterion("PriceLine between", value1, value2, "priceline");
            return (Criteria) this;
        }

        public Criteria andPricelineNotBetween(Double value1, Double value2) {
            addCriterion("PriceLine not between", value1, value2, "priceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineIsNull() {
            addCriterion("RentPriceLine is null");
            return (Criteria) this;
        }

        public Criteria andRentpricelineIsNotNull() {
            addCriterion("RentPriceLine is not null");
            return (Criteria) this;
        }

        public Criteria andRentpricelineEqualTo(Double value) {
            addCriterion("RentPriceLine =", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineNotEqualTo(Double value) {
            addCriterion("RentPriceLine <>", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineGreaterThan(Double value) {
            addCriterion("RentPriceLine >", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineGreaterThanOrEqualTo(Double value) {
            addCriterion("RentPriceLine >=", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineLessThan(Double value) {
            addCriterion("RentPriceLine <", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineLessThanOrEqualTo(Double value) {
            addCriterion("RentPriceLine <=", value, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineIn(List<Double> values) {
            addCriterion("RentPriceLine in", values, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineNotIn(List<Double> values) {
            addCriterion("RentPriceLine not in", values, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineBetween(Double value1, Double value2) {
            addCriterion("RentPriceLine between", value1, value2, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andRentpricelineNotBetween(Double value1, Double value2) {
            addCriterion("RentPriceLine not between", value1, value2, "rentpriceline");
            return (Criteria) this;
        }

        public Criteria andBuildnoIsNull() {
            addCriterion("BuildNo is null");
            return (Criteria) this;
        }

        public Criteria andBuildnoIsNotNull() {
            addCriterion("BuildNo is not null");
            return (Criteria) this;
        }

        public Criteria andBuildnoEqualTo(String value) {
            addCriterion("BuildNo =", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoNotEqualTo(String value) {
            addCriterion("BuildNo <>", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoGreaterThan(String value) {
            addCriterion("BuildNo >", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoGreaterThanOrEqualTo(String value) {
            addCriterion("BuildNo >=", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoLessThan(String value) {
            addCriterion("BuildNo <", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoLessThanOrEqualTo(String value) {
            addCriterion("BuildNo <=", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoLike(String value) {
            addCriterion("BuildNo like", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoNotLike(String value) {
            addCriterion("BuildNo not like", value, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoIn(List<String> values) {
            addCriterion("BuildNo in", values, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoNotIn(List<String> values) {
            addCriterion("BuildNo not in", values, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoBetween(String value1, String value2) {
            addCriterion("BuildNo between", value1, value2, "buildno");
            return (Criteria) this;
        }

        public Criteria andBuildnoNotBetween(String value1, String value2) {
            addCriterion("BuildNo not between", value1, value2, "buildno");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateIsNull() {
            addCriterion("PropertyCertificate is null");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateIsNotNull() {
            addCriterion("PropertyCertificate is not null");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateEqualTo(String value) {
            addCriterion("PropertyCertificate =", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateNotEqualTo(String value) {
            addCriterion("PropertyCertificate <>", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateGreaterThan(String value) {
            addCriterion("PropertyCertificate >", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyCertificate >=", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateLessThan(String value) {
            addCriterion("PropertyCertificate <", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateLessThanOrEqualTo(String value) {
            addCriterion("PropertyCertificate <=", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateLike(String value) {
            addCriterion("PropertyCertificate like", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateNotLike(String value) {
            addCriterion("PropertyCertificate not like", value, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateIn(List<String> values) {
            addCriterion("PropertyCertificate in", values, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateNotIn(List<String> values) {
            addCriterion("PropertyCertificate not in", values, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateBetween(String value1, String value2) {
            addCriterion("PropertyCertificate between", value1, value2, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertycertificateNotBetween(String value1, String value2) {
            addCriterion("PropertyCertificate not between", value1, value2, "propertycertificate");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricIsNull() {
            addCriterion("PropertyElectric is null");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricIsNotNull() {
            addCriterion("PropertyElectric is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricEqualTo(String value) {
            addCriterion("PropertyElectric =", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricNotEqualTo(String value) {
            addCriterion("PropertyElectric <>", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricGreaterThan(String value) {
            addCriterion("PropertyElectric >", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyElectric >=", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricLessThan(String value) {
            addCriterion("PropertyElectric <", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricLessThanOrEqualTo(String value) {
            addCriterion("PropertyElectric <=", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricLike(String value) {
            addCriterion("PropertyElectric like", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricNotLike(String value) {
            addCriterion("PropertyElectric not like", value, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricIn(List<String> values) {
            addCriterion("PropertyElectric in", values, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricNotIn(List<String> values) {
            addCriterion("PropertyElectric not in", values, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricBetween(String value1, String value2) {
            addCriterion("PropertyElectric between", value1, value2, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andPropertyelectricNotBetween(String value1, String value2) {
            addCriterion("PropertyElectric not between", value1, value2, "propertyelectric");
            return (Criteria) this;
        }

        public Criteria andExdateIsNull() {
            addCriterion("ExDate is null");
            return (Criteria) this;
        }

        public Criteria andExdateIsNotNull() {
            addCriterion("ExDate is not null");
            return (Criteria) this;
        }

        public Criteria andExdateEqualTo(Date value) {
            addCriterion("ExDate =", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotEqualTo(Date value) {
            addCriterion("ExDate <>", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThan(Date value) {
            addCriterion("ExDate >", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExDate >=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThan(Date value) {
            addCriterion("ExDate <", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateLessThanOrEqualTo(Date value) {
            addCriterion("ExDate <=", value, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateIn(List<Date> values) {
            addCriterion("ExDate in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotIn(List<Date> values) {
            addCriterion("ExDate not in", values, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateBetween(Date value1, Date value2) {
            addCriterion("ExDate between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andExdateNotBetween(Date value1, Date value2) {
            addCriterion("ExDate not between", value1, value2, "exdate");
            return (Criteria) this;
        }

        public Criteria andFloorallIsNull() {
            addCriterion("FloorAll is null");
            return (Criteria) this;
        }

        public Criteria andFloorallIsNotNull() {
            addCriterion("FloorAll is not null");
            return (Criteria) this;
        }

        public Criteria andFloorallEqualTo(Integer value) {
            addCriterion("FloorAll =", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotEqualTo(Integer value) {
            addCriterion("FloorAll <>", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallGreaterThan(Integer value) {
            addCriterion("FloorAll >", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallGreaterThanOrEqualTo(Integer value) {
            addCriterion("FloorAll >=", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallLessThan(Integer value) {
            addCriterion("FloorAll <", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallLessThanOrEqualTo(Integer value) {
            addCriterion("FloorAll <=", value, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallIn(List<Integer> values) {
            addCriterion("FloorAll in", values, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotIn(List<Integer> values) {
            addCriterion("FloorAll not in", values, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallBetween(Integer value1, Integer value2) {
            addCriterion("FloorAll between", value1, value2, "floorall");
            return (Criteria) this;
        }

        public Criteria andFloorallNotBetween(Integer value1, Integer value2) {
            addCriterion("FloorAll not between", value1, value2, "floorall");
            return (Criteria) this;
        }

        public Criteria andHandoverdateIsNull() {
            addCriterion("HandOverDate is null");
            return (Criteria) this;
        }

        public Criteria andHandoverdateIsNotNull() {
            addCriterion("HandOverDate is not null");
            return (Criteria) this;
        }

        public Criteria andHandoverdateEqualTo(Date value) {
            addCriterion("HandOverDate =", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateNotEqualTo(Date value) {
            addCriterion("HandOverDate <>", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateGreaterThan(Date value) {
            addCriterion("HandOverDate >", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("HandOverDate >=", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateLessThan(Date value) {
            addCriterion("HandOverDate <", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateLessThanOrEqualTo(Date value) {
            addCriterion("HandOverDate <=", value, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateIn(List<Date> values) {
            addCriterion("HandOverDate in", values, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateNotIn(List<Date> values) {
            addCriterion("HandOverDate not in", values, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateBetween(Date value1, Date value2) {
            addCriterion("HandOverDate between", value1, value2, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andHandoverdateNotBetween(Date value1, Date value2) {
            addCriterion("HandOverDate not between", value1, value2, "handoverdate");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UnitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UnitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UnitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UnitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UnitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UnitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UnitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UnitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UnitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UnitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UnitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UnitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UnitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameIsNull() {
            addCriterion("RentUnitName is null");
            return (Criteria) this;
        }

        public Criteria andRentunitnameIsNotNull() {
            addCriterion("RentUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andRentunitnameEqualTo(String value) {
            addCriterion("RentUnitName =", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameNotEqualTo(String value) {
            addCriterion("RentUnitName <>", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameGreaterThan(String value) {
            addCriterion("RentUnitName >", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("RentUnitName >=", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameLessThan(String value) {
            addCriterion("RentUnitName <", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameLessThanOrEqualTo(String value) {
            addCriterion("RentUnitName <=", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameLike(String value) {
            addCriterion("RentUnitName like", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameNotLike(String value) {
            addCriterion("RentUnitName not like", value, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameIn(List<String> values) {
            addCriterion("RentUnitName in", values, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameNotIn(List<String> values) {
            addCriterion("RentUnitName not in", values, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameBetween(String value1, String value2) {
            addCriterion("RentUnitName between", value1, value2, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andRentunitnameNotBetween(String value1, String value2) {
            addCriterion("RentUnitName not between", value1, value2, "rentunitname");
            return (Criteria) this;
        }

        public Criteria andPhotocountIsNull() {
            addCriterion("PhotoCount is null");
            return (Criteria) this;
        }

        public Criteria andPhotocountIsNotNull() {
            addCriterion("PhotoCount is not null");
            return (Criteria) this;
        }

        public Criteria andPhotocountEqualTo(Integer value) {
            addCriterion("PhotoCount =", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountNotEqualTo(Integer value) {
            addCriterion("PhotoCount <>", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountGreaterThan(Integer value) {
            addCriterion("PhotoCount >", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhotoCount >=", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountLessThan(Integer value) {
            addCriterion("PhotoCount <", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountLessThanOrEqualTo(Integer value) {
            addCriterion("PhotoCount <=", value, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountIn(List<Integer> values) {
            addCriterion("PhotoCount in", values, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountNotIn(List<Integer> values) {
            addCriterion("PhotoCount not in", values, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountBetween(Integer value1, Integer value2) {
            addCriterion("PhotoCount between", value1, value2, "photocount");
            return (Criteria) this;
        }

        public Criteria andPhotocountNotBetween(Integer value1, Integer value2) {
            addCriterion("PhotoCount not between", value1, value2, "photocount");
            return (Criteria) this;
        }

        public Criteria andUsage1IsNull() {
            addCriterion("Usage1 is null");
            return (Criteria) this;
        }

        public Criteria andUsage1IsNotNull() {
            addCriterion("Usage1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsage1EqualTo(Double value) {
            addCriterion("Usage1 =", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotEqualTo(Double value) {
            addCriterion("Usage1 <>", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1GreaterThan(Double value) {
            addCriterion("Usage1 >", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1GreaterThanOrEqualTo(Double value) {
            addCriterion("Usage1 >=", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1LessThan(Double value) {
            addCriterion("Usage1 <", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1LessThanOrEqualTo(Double value) {
            addCriterion("Usage1 <=", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1In(List<Double> values) {
            addCriterion("Usage1 in", values, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotIn(List<Double> values) {
            addCriterion("Usage1 not in", values, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1Between(Double value1, Double value2) {
            addCriterion("Usage1 between", value1, value2, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotBetween(Double value1, Double value2) {
            addCriterion("Usage1 not between", value1, value2, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage2IsNull() {
            addCriterion("Usage2 is null");
            return (Criteria) this;
        }

        public Criteria andUsage2IsNotNull() {
            addCriterion("Usage2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsage2EqualTo(Double value) {
            addCriterion("Usage2 =", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2NotEqualTo(Double value) {
            addCriterion("Usage2 <>", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2GreaterThan(Double value) {
            addCriterion("Usage2 >", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2GreaterThanOrEqualTo(Double value) {
            addCriterion("Usage2 >=", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2LessThan(Double value) {
            addCriterion("Usage2 <", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2LessThanOrEqualTo(Double value) {
            addCriterion("Usage2 <=", value, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2In(List<Double> values) {
            addCriterion("Usage2 in", values, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2NotIn(List<Double> values) {
            addCriterion("Usage2 not in", values, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2Between(Double value1, Double value2) {
            addCriterion("Usage2 between", value1, value2, "usage2");
            return (Criteria) this;
        }

        public Criteria andUsage2NotBetween(Double value1, Double value2) {
            addCriterion("Usage2 not between", value1, value2, "usage2");
            return (Criteria) this;
        }

        public Criteria andTrustnoIsNull() {
            addCriterion("TrustNo is null");
            return (Criteria) this;
        }

        public Criteria andTrustnoIsNotNull() {
            addCriterion("TrustNo is not null");
            return (Criteria) this;
        }

        public Criteria andTrustnoEqualTo(String value) {
            addCriterion("TrustNo =", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoNotEqualTo(String value) {
            addCriterion("TrustNo <>", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoGreaterThan(String value) {
            addCriterion("TrustNo >", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoGreaterThanOrEqualTo(String value) {
            addCriterion("TrustNo >=", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoLessThan(String value) {
            addCriterion("TrustNo <", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoLessThanOrEqualTo(String value) {
            addCriterion("TrustNo <=", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoLike(String value) {
            addCriterion("TrustNo like", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoNotLike(String value) {
            addCriterion("TrustNo not like", value, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoIn(List<String> values) {
            addCriterion("TrustNo in", values, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoNotIn(List<String> values) {
            addCriterion("TrustNo not in", values, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoBetween(String value1, String value2) {
            addCriterion("TrustNo between", value1, value2, "trustno");
            return (Criteria) this;
        }

        public Criteria andTrustnoNotBetween(String value1, String value2) {
            addCriterion("TrustNo not between", value1, value2, "trustno");
            return (Criteria) this;
        }

        public Criteria andPropertytaxIsNull() {
            addCriterion("PropertyTax is null");
            return (Criteria) this;
        }

        public Criteria andPropertytaxIsNotNull() {
            addCriterion("PropertyTax is not null");
            return (Criteria) this;
        }

        public Criteria andPropertytaxEqualTo(String value) {
            addCriterion("PropertyTax =", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxNotEqualTo(String value) {
            addCriterion("PropertyTax <>", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxGreaterThan(String value) {
            addCriterion("PropertyTax >", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyTax >=", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxLessThan(String value) {
            addCriterion("PropertyTax <", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxLessThanOrEqualTo(String value) {
            addCriterion("PropertyTax <=", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxLike(String value) {
            addCriterion("PropertyTax like", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxNotLike(String value) {
            addCriterion("PropertyTax not like", value, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxIn(List<String> values) {
            addCriterion("PropertyTax in", values, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxNotIn(List<String> values) {
            addCriterion("PropertyTax not in", values, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxBetween(String value1, String value2) {
            addCriterion("PropertyTax between", value1, value2, "propertytax");
            return (Criteria) this;
        }

        public Criteria andPropertytaxNotBetween(String value1, String value2) {
            addCriterion("PropertyTax not between", value1, value2, "propertytax");
            return (Criteria) this;
        }

        public Criteria andOwnermobileIsNull() {
            addCriterion("OwnerMobile is null");
            return (Criteria) this;
        }

        public Criteria andOwnermobileIsNotNull() {
            addCriterion("OwnerMobile is not null");
            return (Criteria) this;
        }

        public Criteria andOwnermobileEqualTo(String value) {
            addCriterion("OwnerMobile =", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileNotEqualTo(String value) {
            addCriterion("OwnerMobile <>", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileGreaterThan(String value) {
            addCriterion("OwnerMobile >", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerMobile >=", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileLessThan(String value) {
            addCriterion("OwnerMobile <", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileLessThanOrEqualTo(String value) {
            addCriterion("OwnerMobile <=", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileLike(String value) {
            addCriterion("OwnerMobile like", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileNotLike(String value) {
            addCriterion("OwnerMobile not like", value, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileIn(List<String> values) {
            addCriterion("OwnerMobile in", values, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileNotIn(List<String> values) {
            addCriterion("OwnerMobile not in", values, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileBetween(String value1, String value2) {
            addCriterion("OwnerMobile between", value1, value2, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andOwnermobileNotBetween(String value1, String value2) {
            addCriterion("OwnerMobile not between", value1, value2, "ownermobile");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("Country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("Country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("Country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("Country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("Country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("Country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("Country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("Country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("Country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("Country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("Country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("Country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("Country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("Country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andDeptid1IsNull() {
            addCriterion("DeptID1 is null");
            return (Criteria) this;
        }

        public Criteria andDeptid1IsNotNull() {
            addCriterion("DeptID1 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptid1EqualTo(String value) {
            addCriterion("DeptID1 =", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1NotEqualTo(String value) {
            addCriterion("DeptID1 <>", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1GreaterThan(String value) {
            addCriterion("DeptID1 >", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1GreaterThanOrEqualTo(String value) {
            addCriterion("DeptID1 >=", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1LessThan(String value) {
            addCriterion("DeptID1 <", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1LessThanOrEqualTo(String value) {
            addCriterion("DeptID1 <=", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1Like(String value) {
            addCriterion("DeptID1 like", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1NotLike(String value) {
            addCriterion("DeptID1 not like", value, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1In(List<String> values) {
            addCriterion("DeptID1 in", values, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1NotIn(List<String> values) {
            addCriterion("DeptID1 not in", values, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1Between(String value1, String value2) {
            addCriterion("DeptID1 between", value1, value2, "deptid1");
            return (Criteria) this;
        }

        public Criteria andDeptid1NotBetween(String value1, String value2) {
            addCriterion("DeptID1 not between", value1, value2, "deptid1");
            return (Criteria) this;
        }

        public Criteria andEmpid2IsNull() {
            addCriterion("EmpID2 is null");
            return (Criteria) this;
        }

        public Criteria andEmpid2IsNotNull() {
            addCriterion("EmpID2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmpid2EqualTo(String value) {
            addCriterion("EmpID2 =", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2NotEqualTo(String value) {
            addCriterion("EmpID2 <>", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2GreaterThan(String value) {
            addCriterion("EmpID2 >", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2GreaterThanOrEqualTo(String value) {
            addCriterion("EmpID2 >=", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2LessThan(String value) {
            addCriterion("EmpID2 <", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2LessThanOrEqualTo(String value) {
            addCriterion("EmpID2 <=", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2Like(String value) {
            addCriterion("EmpID2 like", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2NotLike(String value) {
            addCriterion("EmpID2 not like", value, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2In(List<String> values) {
            addCriterion("EmpID2 in", values, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2NotIn(List<String> values) {
            addCriterion("EmpID2 not in", values, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2Between(String value1, String value2) {
            addCriterion("EmpID2 between", value1, value2, "empid2");
            return (Criteria) this;
        }

        public Criteria andEmpid2NotBetween(String value1, String value2) {
            addCriterion("EmpID2 not between", value1, value2, "empid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2IsNull() {
            addCriterion("DeptID2 is null");
            return (Criteria) this;
        }

        public Criteria andDeptid2IsNotNull() {
            addCriterion("DeptID2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptid2EqualTo(String value) {
            addCriterion("DeptID2 =", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotEqualTo(String value) {
            addCriterion("DeptID2 <>", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2GreaterThan(String value) {
            addCriterion("DeptID2 >", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2GreaterThanOrEqualTo(String value) {
            addCriterion("DeptID2 >=", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2LessThan(String value) {
            addCriterion("DeptID2 <", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2LessThanOrEqualTo(String value) {
            addCriterion("DeptID2 <=", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2Like(String value) {
            addCriterion("DeptID2 like", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotLike(String value) {
            addCriterion("DeptID2 not like", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2In(List<String> values) {
            addCriterion("DeptID2 in", values, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotIn(List<String> values) {
            addCriterion("DeptID2 not in", values, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2Between(String value1, String value2) {
            addCriterion("DeptID2 between", value1, value2, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotBetween(String value1, String value2) {
            addCriterion("DeptID2 not between", value1, value2, "deptid2");
            return (Criteria) this;
        }

        public Criteria andEmpid1IsNull() {
            addCriterion("EmpID1 is null");
            return (Criteria) this;
        }

        public Criteria andEmpid1IsNotNull() {
            addCriterion("EmpID1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmpid1EqualTo(String value) {
            addCriterion("EmpID1 =", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1NotEqualTo(String value) {
            addCriterion("EmpID1 <>", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1GreaterThan(String value) {
            addCriterion("EmpID1 >", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1GreaterThanOrEqualTo(String value) {
            addCriterion("EmpID1 >=", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1LessThan(String value) {
            addCriterion("EmpID1 <", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1LessThanOrEqualTo(String value) {
            addCriterion("EmpID1 <=", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1Like(String value) {
            addCriterion("EmpID1 like", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1NotLike(String value) {
            addCriterion("EmpID1 not like", value, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1In(List<String> values) {
            addCriterion("EmpID1 in", values, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1NotIn(List<String> values) {
            addCriterion("EmpID1 not in", values, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1Between(String value1, String value2) {
            addCriterion("EmpID1 between", value1, value2, "empid1");
            return (Criteria) this;
        }

        public Criteria andEmpid1NotBetween(String value1, String value2) {
            addCriterion("EmpID1 not between", value1, value2, "empid1");
            return (Criteria) this;
        }

        public Criteria andUsageIsNull() {
            addCriterion("Usage is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("Usage is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("Usage =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("Usage <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("Usage >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Usage >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("Usage <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("Usage <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("Usage like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("Usage not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("Usage in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("Usage not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("Usage between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("Usage not between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andPrivyIsNull() {
            addCriterion("Privy is null");
            return (Criteria) this;
        }

        public Criteria andPrivyIsNotNull() {
            addCriterion("Privy is not null");
            return (Criteria) this;
        }

        public Criteria andPrivyEqualTo(Short value) {
            addCriterion("Privy =", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyNotEqualTo(Short value) {
            addCriterion("Privy <>", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyGreaterThan(Short value) {
            addCriterion("Privy >", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyGreaterThanOrEqualTo(Short value) {
            addCriterion("Privy >=", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyLessThan(Short value) {
            addCriterion("Privy <", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyLessThanOrEqualTo(Short value) {
            addCriterion("Privy <=", value, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyIn(List<Short> values) {
            addCriterion("Privy in", values, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyNotIn(List<Short> values) {
            addCriterion("Privy not in", values, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyBetween(Short value1, Short value2) {
            addCriterion("Privy between", value1, value2, "privy");
            return (Criteria) this;
        }

        public Criteria andPrivyNotBetween(Short value1, Short value2) {
            addCriterion("Privy not between", value1, value2, "privy");
            return (Criteria) this;
        }

        public Criteria andFlagwebIsNull() {
            addCriterion("FlagWeb is null");
            return (Criteria) this;
        }

        public Criteria andFlagwebIsNotNull() {
            addCriterion("FlagWeb is not null");
            return (Criteria) this;
        }

        public Criteria andFlagwebEqualTo(Boolean value) {
            addCriterion("FlagWeb =", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotEqualTo(Boolean value) {
            addCriterion("FlagWeb <>", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebGreaterThan(Boolean value) {
            addCriterion("FlagWeb >", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagWeb >=", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebLessThan(Boolean value) {
            addCriterion("FlagWeb <", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagWeb <=", value, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebIn(List<Boolean> values) {
            addCriterion("FlagWeb in", values, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotIn(List<Boolean> values) {
            addCriterion("FlagWeb not in", values, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagWeb between", value1, value2, "flagweb");
            return (Criteria) this;
        }

        public Criteria andFlagwebNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagWeb not between", value1, value2, "flagweb");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("Word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("Word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("Word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("Word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("Word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("Word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("Word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("Word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("Word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("Word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("Word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("Word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("Word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("Word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPropertydateIsNull() {
            addCriterion("PropertyDate is null");
            return (Criteria) this;
        }

        public Criteria andPropertydateIsNotNull() {
            addCriterion("PropertyDate is not null");
            return (Criteria) this;
        }

        public Criteria andPropertydateEqualTo(Date value) {
            addCriterion("PropertyDate =", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateNotEqualTo(Date value) {
            addCriterion("PropertyDate <>", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateGreaterThan(Date value) {
            addCriterion("PropertyDate >", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateGreaterThanOrEqualTo(Date value) {
            addCriterion("PropertyDate >=", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateLessThan(Date value) {
            addCriterion("PropertyDate <", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateLessThanOrEqualTo(Date value) {
            addCriterion("PropertyDate <=", value, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateIn(List<Date> values) {
            addCriterion("PropertyDate in", values, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateNotIn(List<Date> values) {
            addCriterion("PropertyDate not in", values, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateBetween(Date value1, Date value2) {
            addCriterion("PropertyDate between", value1, value2, "propertydate");
            return (Criteria) this;
        }

        public Criteria andPropertydateNotBetween(Date value1, Date value2) {
            addCriterion("PropertyDate not between", value1, value2, "propertydate");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoIsNull() {
            addCriterion("RegulatoryNo is null");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoIsNotNull() {
            addCriterion("RegulatoryNo is not null");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoEqualTo(String value) {
            addCriterion("RegulatoryNo =", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoNotEqualTo(String value) {
            addCriterion("RegulatoryNo <>", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoGreaterThan(String value) {
            addCriterion("RegulatoryNo >", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoGreaterThanOrEqualTo(String value) {
            addCriterion("RegulatoryNo >=", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoLessThan(String value) {
            addCriterion("RegulatoryNo <", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoLessThanOrEqualTo(String value) {
            addCriterion("RegulatoryNo <=", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoLike(String value) {
            addCriterion("RegulatoryNo like", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoNotLike(String value) {
            addCriterion("RegulatoryNo not like", value, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoIn(List<String> values) {
            addCriterion("RegulatoryNo in", values, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoNotIn(List<String> values) {
            addCriterion("RegulatoryNo not in", values, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoBetween(String value1, String value2) {
            addCriterion("RegulatoryNo between", value1, value2, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andRegulatorynoNotBetween(String value1, String value2) {
            addCriterion("RegulatoryNo not between", value1, value2, "regulatoryno");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNull() {
            addCriterion("WebTitle is null");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNotNull() {
            addCriterion("WebTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWebtitleEqualTo(String value) {
            addCriterion("WebTitle =", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotEqualTo(String value) {
            addCriterion("WebTitle <>", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThan(String value) {
            addCriterion("WebTitle >", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThanOrEqualTo(String value) {
            addCriterion("WebTitle >=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThan(String value) {
            addCriterion("WebTitle <", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThanOrEqualTo(String value) {
            addCriterion("WebTitle <=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLike(String value) {
            addCriterion("WebTitle like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotLike(String value) {
            addCriterion("WebTitle not like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleIn(List<String> values) {
            addCriterion("WebTitle in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotIn(List<String> values) {
            addCriterion("WebTitle not in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleBetween(String value1, String value2) {
            addCriterion("WebTitle between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotBetween(String value1, String value2) {
            addCriterion("WebTitle not between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andPropertybriefIsNull() {
            addCriterion("PropertyBrief is null");
            return (Criteria) this;
        }

        public Criteria andPropertybriefIsNotNull() {
            addCriterion("PropertyBrief is not null");
            return (Criteria) this;
        }

        public Criteria andPropertybriefEqualTo(String value) {
            addCriterion("PropertyBrief =", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefNotEqualTo(String value) {
            addCriterion("PropertyBrief <>", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefGreaterThan(String value) {
            addCriterion("PropertyBrief >", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyBrief >=", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefLessThan(String value) {
            addCriterion("PropertyBrief <", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefLessThanOrEqualTo(String value) {
            addCriterion("PropertyBrief <=", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefLike(String value) {
            addCriterion("PropertyBrief like", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefNotLike(String value) {
            addCriterion("PropertyBrief not like", value, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefIn(List<String> values) {
            addCriterion("PropertyBrief in", values, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefNotIn(List<String> values) {
            addCriterion("PropertyBrief not in", values, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefBetween(String value1, String value2) {
            addCriterion("PropertyBrief between", value1, value2, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andPropertybriefNotBetween(String value1, String value2) {
            addCriterion("PropertyBrief not between", value1, value2, "propertybrief");
            return (Criteria) this;
        }

        public Criteria andDeptid3IsNull() {
            addCriterion("DeptID3 is null");
            return (Criteria) this;
        }

        public Criteria andDeptid3IsNotNull() {
            addCriterion("DeptID3 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptid3EqualTo(String value) {
            addCriterion("DeptID3 =", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotEqualTo(String value) {
            addCriterion("DeptID3 <>", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3GreaterThan(String value) {
            addCriterion("DeptID3 >", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3GreaterThanOrEqualTo(String value) {
            addCriterion("DeptID3 >=", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3LessThan(String value) {
            addCriterion("DeptID3 <", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3LessThanOrEqualTo(String value) {
            addCriterion("DeptID3 <=", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3Like(String value) {
            addCriterion("DeptID3 like", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotLike(String value) {
            addCriterion("DeptID3 not like", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3In(List<String> values) {
            addCriterion("DeptID3 in", values, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotIn(List<String> values) {
            addCriterion("DeptID3 not in", values, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3Between(String value1, String value2) {
            addCriterion("DeptID3 between", value1, value2, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotBetween(String value1, String value2) {
            addCriterion("DeptID3 not between", value1, value2, "deptid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3IsNull() {
            addCriterion("EmpID3 is null");
            return (Criteria) this;
        }

        public Criteria andEmpid3IsNotNull() {
            addCriterion("EmpID3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmpid3EqualTo(String value) {
            addCriterion("EmpID3 =", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3NotEqualTo(String value) {
            addCriterion("EmpID3 <>", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3GreaterThan(String value) {
            addCriterion("EmpID3 >", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3GreaterThanOrEqualTo(String value) {
            addCriterion("EmpID3 >=", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3LessThan(String value) {
            addCriterion("EmpID3 <", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3LessThanOrEqualTo(String value) {
            addCriterion("EmpID3 <=", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3Like(String value) {
            addCriterion("EmpID3 like", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3NotLike(String value) {
            addCriterion("EmpID3 not like", value, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3In(List<String> values) {
            addCriterion("EmpID3 in", values, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3NotIn(List<String> values) {
            addCriterion("EmpID3 not in", values, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3Between(String value1, String value2) {
            addCriterion("EmpID3 between", value1, value2, "empid3");
            return (Criteria) this;
        }

        public Criteria andEmpid3NotBetween(String value1, String value2) {
            addCriterion("EmpID3 not between", value1, value2, "empid3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}