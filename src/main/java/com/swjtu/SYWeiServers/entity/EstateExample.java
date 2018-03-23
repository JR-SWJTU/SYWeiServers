package com.swjtu.SYWeiServers.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EstateExample() {
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

        public Criteria andEstatenameIsNull() {
            addCriterion("EstateName is null");
            return (Criteria) this;
        }

        public Criteria andEstatenameIsNotNull() {
            addCriterion("EstateName is not null");
            return (Criteria) this;
        }

        public Criteria andEstatenameEqualTo(String value) {
            addCriterion("EstateName =", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotEqualTo(String value) {
            addCriterion("EstateName <>", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameGreaterThan(String value) {
            addCriterion("EstateName >", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameGreaterThanOrEqualTo(String value) {
            addCriterion("EstateName >=", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLessThan(String value) {
            addCriterion("EstateName <", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLessThanOrEqualTo(String value) {
            addCriterion("EstateName <=", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameLike(String value) {
            addCriterion("EstateName like", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotLike(String value) {
            addCriterion("EstateName not like", value, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameIn(List<String> values) {
            addCriterion("EstateName in", values, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotIn(List<String> values) {
            addCriterion("EstateName not in", values, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameBetween(String value1, String value2) {
            addCriterion("EstateName between", value1, value2, "estatename");
            return (Criteria) this;
        }

        public Criteria andEstatenameNotBetween(String value1, String value2) {
            addCriterion("EstateName not between", value1, value2, "estatename");
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

        public Criteria andAreaidIsNull() {
            addCriterion("AreaID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("AreaID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("AreaID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("AreaID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("AreaID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("AreaID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("AreaID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("AreaID like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("AreaID not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("AreaID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("AreaID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("AreaID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("AreaID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("Spell is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("Spell is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("Spell =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("Spell <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("Spell >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("Spell >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("Spell <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("Spell <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("Spell like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("Spell not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("Spell in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("Spell not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("Spell between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("Spell not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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

        public Criteria andDevcompanyIsNull() {
            addCriterion("DevCompany is null");
            return (Criteria) this;
        }

        public Criteria andDevcompanyIsNotNull() {
            addCriterion("DevCompany is not null");
            return (Criteria) this;
        }

        public Criteria andDevcompanyEqualTo(String value) {
            addCriterion("DevCompany =", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotEqualTo(String value) {
            addCriterion("DevCompany <>", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyGreaterThan(String value) {
            addCriterion("DevCompany >", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DevCompany >=", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLessThan(String value) {
            addCriterion("DevCompany <", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLessThanOrEqualTo(String value) {
            addCriterion("DevCompany <=", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyLike(String value) {
            addCriterion("DevCompany like", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotLike(String value) {
            addCriterion("DevCompany not like", value, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyIn(List<String> values) {
            addCriterion("DevCompany in", values, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotIn(List<String> values) {
            addCriterion("DevCompany not in", values, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyBetween(String value1, String value2) {
            addCriterion("DevCompany between", value1, value2, "devcompany");
            return (Criteria) this;
        }

        public Criteria andDevcompanyNotBetween(String value1, String value2) {
            addCriterion("DevCompany not between", value1, value2, "devcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIsNull() {
            addCriterion("MgtCompany is null");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIsNotNull() {
            addCriterion("MgtCompany is not null");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyEqualTo(String value) {
            addCriterion("MgtCompany =", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotEqualTo(String value) {
            addCriterion("MgtCompany <>", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyGreaterThan(String value) {
            addCriterion("MgtCompany >", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("MgtCompany >=", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLessThan(String value) {
            addCriterion("MgtCompany <", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLessThanOrEqualTo(String value) {
            addCriterion("MgtCompany <=", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyLike(String value) {
            addCriterion("MgtCompany like", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotLike(String value) {
            addCriterion("MgtCompany not like", value, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyIn(List<String> values) {
            addCriterion("MgtCompany in", values, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotIn(List<String> values) {
            addCriterion("MgtCompany not in", values, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyBetween(String value1, String value2) {
            addCriterion("MgtCompany between", value1, value2, "mgtcompany");
            return (Criteria) this;
        }

        public Criteria andMgtcompanyNotBetween(String value1, String value2) {
            addCriterion("MgtCompany not between", value1, value2, "mgtcompany");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLandnoIsNull() {
            addCriterion("LandNo is null");
            return (Criteria) this;
        }

        public Criteria andLandnoIsNotNull() {
            addCriterion("LandNo is not null");
            return (Criteria) this;
        }

        public Criteria andLandnoEqualTo(String value) {
            addCriterion("LandNo =", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoNotEqualTo(String value) {
            addCriterion("LandNo <>", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoGreaterThan(String value) {
            addCriterion("LandNo >", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoGreaterThanOrEqualTo(String value) {
            addCriterion("LandNo >=", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoLessThan(String value) {
            addCriterion("LandNo <", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoLessThanOrEqualTo(String value) {
            addCriterion("LandNo <=", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoLike(String value) {
            addCriterion("LandNo like", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoNotLike(String value) {
            addCriterion("LandNo not like", value, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoIn(List<String> values) {
            addCriterion("LandNo in", values, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoNotIn(List<String> values) {
            addCriterion("LandNo not in", values, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoBetween(String value1, String value2) {
            addCriterion("LandNo between", value1, value2, "landno");
            return (Criteria) this;
        }

        public Criteria andLandnoNotBetween(String value1, String value2) {
            addCriterion("LandNo not between", value1, value2, "landno");
            return (Criteria) this;
        }

        public Criteria andLandgradeIsNull() {
            addCriterion("LandGrade is null");
            return (Criteria) this;
        }

        public Criteria andLandgradeIsNotNull() {
            addCriterion("LandGrade is not null");
            return (Criteria) this;
        }

        public Criteria andLandgradeEqualTo(String value) {
            addCriterion("LandGrade =", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeNotEqualTo(String value) {
            addCriterion("LandGrade <>", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeGreaterThan(String value) {
            addCriterion("LandGrade >", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeGreaterThanOrEqualTo(String value) {
            addCriterion("LandGrade >=", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeLessThan(String value) {
            addCriterion("LandGrade <", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeLessThanOrEqualTo(String value) {
            addCriterion("LandGrade <=", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeLike(String value) {
            addCriterion("LandGrade like", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeNotLike(String value) {
            addCriterion("LandGrade not like", value, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeIn(List<String> values) {
            addCriterion("LandGrade in", values, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeNotIn(List<String> values) {
            addCriterion("LandGrade not in", values, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeBetween(String value1, String value2) {
            addCriterion("LandGrade between", value1, value2, "landgrade");
            return (Criteria) this;
        }

        public Criteria andLandgradeNotBetween(String value1, String value2) {
            addCriterion("LandGrade not between", value1, value2, "landgrade");
            return (Criteria) this;
        }

        public Criteria andFrameworkIsNull() {
            addCriterion("FrameWork is null");
            return (Criteria) this;
        }

        public Criteria andFrameworkIsNotNull() {
            addCriterion("FrameWork is not null");
            return (Criteria) this;
        }

        public Criteria andFrameworkEqualTo(String value) {
            addCriterion("FrameWork =", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkNotEqualTo(String value) {
            addCriterion("FrameWork <>", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkGreaterThan(String value) {
            addCriterion("FrameWork >", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkGreaterThanOrEqualTo(String value) {
            addCriterion("FrameWork >=", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkLessThan(String value) {
            addCriterion("FrameWork <", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkLessThanOrEqualTo(String value) {
            addCriterion("FrameWork <=", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkLike(String value) {
            addCriterion("FrameWork like", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkNotLike(String value) {
            addCriterion("FrameWork not like", value, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkIn(List<String> values) {
            addCriterion("FrameWork in", values, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkNotIn(List<String> values) {
            addCriterion("FrameWork not in", values, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkBetween(String value1, String value2) {
            addCriterion("FrameWork between", value1, value2, "framework");
            return (Criteria) this;
        }

        public Criteria andFrameworkNotBetween(String value1, String value2) {
            addCriterion("FrameWork not between", value1, value2, "framework");
            return (Criteria) this;
        }

        public Criteria andMgttelIsNull() {
            addCriterion("MgtTel is null");
            return (Criteria) this;
        }

        public Criteria andMgttelIsNotNull() {
            addCriterion("MgtTel is not null");
            return (Criteria) this;
        }

        public Criteria andMgttelEqualTo(String value) {
            addCriterion("MgtTel =", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelNotEqualTo(String value) {
            addCriterion("MgtTel <>", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelGreaterThan(String value) {
            addCriterion("MgtTel >", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelGreaterThanOrEqualTo(String value) {
            addCriterion("MgtTel >=", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelLessThan(String value) {
            addCriterion("MgtTel <", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelLessThanOrEqualTo(String value) {
            addCriterion("MgtTel <=", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelLike(String value) {
            addCriterion("MgtTel like", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelNotLike(String value) {
            addCriterion("MgtTel not like", value, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelIn(List<String> values) {
            addCriterion("MgtTel in", values, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelNotIn(List<String> values) {
            addCriterion("MgtTel not in", values, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelBetween(String value1, String value2) {
            addCriterion("MgtTel between", value1, value2, "mgttel");
            return (Criteria) this;
        }

        public Criteria andMgttelNotBetween(String value1, String value2) {
            addCriterion("MgtTel not between", value1, value2, "mgttel");
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

        public Criteria andDoc1IsNull() {
            addCriterion("Doc1 is null");
            return (Criteria) this;
        }

        public Criteria andDoc1IsNotNull() {
            addCriterion("Doc1 is not null");
            return (Criteria) this;
        }

        public Criteria andDoc1EqualTo(String value) {
            addCriterion("Doc1 =", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1NotEqualTo(String value) {
            addCriterion("Doc1 <>", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1GreaterThan(String value) {
            addCriterion("Doc1 >", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1GreaterThanOrEqualTo(String value) {
            addCriterion("Doc1 >=", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1LessThan(String value) {
            addCriterion("Doc1 <", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1LessThanOrEqualTo(String value) {
            addCriterion("Doc1 <=", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1Like(String value) {
            addCriterion("Doc1 like", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1NotLike(String value) {
            addCriterion("Doc1 not like", value, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1In(List<String> values) {
            addCriterion("Doc1 in", values, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1NotIn(List<String> values) {
            addCriterion("Doc1 not in", values, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1Between(String value1, String value2) {
            addCriterion("Doc1 between", value1, value2, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc1NotBetween(String value1, String value2) {
            addCriterion("Doc1 not between", value1, value2, "doc1");
            return (Criteria) this;
        }

        public Criteria andDoc2IsNull() {
            addCriterion("Doc2 is null");
            return (Criteria) this;
        }

        public Criteria andDoc2IsNotNull() {
            addCriterion("Doc2 is not null");
            return (Criteria) this;
        }

        public Criteria andDoc2EqualTo(String value) {
            addCriterion("Doc2 =", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2NotEqualTo(String value) {
            addCriterion("Doc2 <>", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2GreaterThan(String value) {
            addCriterion("Doc2 >", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2GreaterThanOrEqualTo(String value) {
            addCriterion("Doc2 >=", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2LessThan(String value) {
            addCriterion("Doc2 <", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2LessThanOrEqualTo(String value) {
            addCriterion("Doc2 <=", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2Like(String value) {
            addCriterion("Doc2 like", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2NotLike(String value) {
            addCriterion("Doc2 not like", value, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2In(List<String> values) {
            addCriterion("Doc2 in", values, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2NotIn(List<String> values) {
            addCriterion("Doc2 not in", values, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2Between(String value1, String value2) {
            addCriterion("Doc2 between", value1, value2, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc2NotBetween(String value1, String value2) {
            addCriterion("Doc2 not between", value1, value2, "doc2");
            return (Criteria) this;
        }

        public Criteria andDoc3IsNull() {
            addCriterion("Doc3 is null");
            return (Criteria) this;
        }

        public Criteria andDoc3IsNotNull() {
            addCriterion("Doc3 is not null");
            return (Criteria) this;
        }

        public Criteria andDoc3EqualTo(String value) {
            addCriterion("Doc3 =", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3NotEqualTo(String value) {
            addCriterion("Doc3 <>", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3GreaterThan(String value) {
            addCriterion("Doc3 >", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3GreaterThanOrEqualTo(String value) {
            addCriterion("Doc3 >=", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3LessThan(String value) {
            addCriterion("Doc3 <", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3LessThanOrEqualTo(String value) {
            addCriterion("Doc3 <=", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3Like(String value) {
            addCriterion("Doc3 like", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3NotLike(String value) {
            addCriterion("Doc3 not like", value, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3In(List<String> values) {
            addCriterion("Doc3 in", values, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3NotIn(List<String> values) {
            addCriterion("Doc3 not in", values, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3Between(String value1, String value2) {
            addCriterion("Doc3 between", value1, value2, "doc3");
            return (Criteria) this;
        }

        public Criteria andDoc3NotBetween(String value1, String value2) {
            addCriterion("Doc3 not between", value1, value2, "doc3");
            return (Criteria) this;
        }

        public Criteria andLink1IsNull() {
            addCriterion("Link1 is null");
            return (Criteria) this;
        }

        public Criteria andLink1IsNotNull() {
            addCriterion("Link1 is not null");
            return (Criteria) this;
        }

        public Criteria andLink1EqualTo(String value) {
            addCriterion("Link1 =", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1NotEqualTo(String value) {
            addCriterion("Link1 <>", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1GreaterThan(String value) {
            addCriterion("Link1 >", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1GreaterThanOrEqualTo(String value) {
            addCriterion("Link1 >=", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1LessThan(String value) {
            addCriterion("Link1 <", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1LessThanOrEqualTo(String value) {
            addCriterion("Link1 <=", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1Like(String value) {
            addCriterion("Link1 like", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1NotLike(String value) {
            addCriterion("Link1 not like", value, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1In(List<String> values) {
            addCriterion("Link1 in", values, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1NotIn(List<String> values) {
            addCriterion("Link1 not in", values, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1Between(String value1, String value2) {
            addCriterion("Link1 between", value1, value2, "link1");
            return (Criteria) this;
        }

        public Criteria andLink1NotBetween(String value1, String value2) {
            addCriterion("Link1 not between", value1, value2, "link1");
            return (Criteria) this;
        }

        public Criteria andLink2IsNull() {
            addCriterion("Link2 is null");
            return (Criteria) this;
        }

        public Criteria andLink2IsNotNull() {
            addCriterion("Link2 is not null");
            return (Criteria) this;
        }

        public Criteria andLink2EqualTo(String value) {
            addCriterion("Link2 =", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2NotEqualTo(String value) {
            addCriterion("Link2 <>", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2GreaterThan(String value) {
            addCriterion("Link2 >", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2GreaterThanOrEqualTo(String value) {
            addCriterion("Link2 >=", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2LessThan(String value) {
            addCriterion("Link2 <", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2LessThanOrEqualTo(String value) {
            addCriterion("Link2 <=", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2Like(String value) {
            addCriterion("Link2 like", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2NotLike(String value) {
            addCriterion("Link2 not like", value, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2In(List<String> values) {
            addCriterion("Link2 in", values, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2NotIn(List<String> values) {
            addCriterion("Link2 not in", values, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2Between(String value1, String value2) {
            addCriterion("Link2 between", value1, value2, "link2");
            return (Criteria) this;
        }

        public Criteria andLink2NotBetween(String value1, String value2) {
            addCriterion("Link2 not between", value1, value2, "link2");
            return (Criteria) this;
        }

        public Criteria andLink3IsNull() {
            addCriterion("Link3 is null");
            return (Criteria) this;
        }

        public Criteria andLink3IsNotNull() {
            addCriterion("Link3 is not null");
            return (Criteria) this;
        }

        public Criteria andLink3EqualTo(String value) {
            addCriterion("Link3 =", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3NotEqualTo(String value) {
            addCriterion("Link3 <>", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3GreaterThan(String value) {
            addCriterion("Link3 >", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3GreaterThanOrEqualTo(String value) {
            addCriterion("Link3 >=", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3LessThan(String value) {
            addCriterion("Link3 <", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3LessThanOrEqualTo(String value) {
            addCriterion("Link3 <=", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3Like(String value) {
            addCriterion("Link3 like", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3NotLike(String value) {
            addCriterion("Link3 not like", value, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3In(List<String> values) {
            addCriterion("Link3 in", values, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3NotIn(List<String> values) {
            addCriterion("Link3 not in", values, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3Between(String value1, String value2) {
            addCriterion("Link3 between", value1, value2, "link3");
            return (Criteria) this;
        }

        public Criteria andLink3NotBetween(String value1, String value2) {
            addCriterion("Link3 not between", value1, value2, "link3");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNull() {
            addCriterion("Address2 is null");
            return (Criteria) this;
        }

        public Criteria andAddress2IsNotNull() {
            addCriterion("Address2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddress2EqualTo(String value) {
            addCriterion("Address2 =", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotEqualTo(String value) {
            addCriterion("Address2 <>", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThan(String value) {
            addCriterion("Address2 >", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("Address2 >=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThan(String value) {
            addCriterion("Address2 <", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2LessThanOrEqualTo(String value) {
            addCriterion("Address2 <=", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Like(String value) {
            addCriterion("Address2 like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotLike(String value) {
            addCriterion("Address2 not like", value, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2In(List<String> values) {
            addCriterion("Address2 in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotIn(List<String> values) {
            addCriterion("Address2 not in", values, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2Between(String value1, String value2) {
            addCriterion("Address2 between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andAddress2NotBetween(String value1, String value2) {
            addCriterion("Address2 not between", value1, value2, "address2");
            return (Criteria) this;
        }

        public Criteria andDevtelIsNull() {
            addCriterion("DevTel is null");
            return (Criteria) this;
        }

        public Criteria andDevtelIsNotNull() {
            addCriterion("DevTel is not null");
            return (Criteria) this;
        }

        public Criteria andDevtelEqualTo(String value) {
            addCriterion("DevTel =", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelNotEqualTo(String value) {
            addCriterion("DevTel <>", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelGreaterThan(String value) {
            addCriterion("DevTel >", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelGreaterThanOrEqualTo(String value) {
            addCriterion("DevTel >=", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelLessThan(String value) {
            addCriterion("DevTel <", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelLessThanOrEqualTo(String value) {
            addCriterion("DevTel <=", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelLike(String value) {
            addCriterion("DevTel like", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelNotLike(String value) {
            addCriterion("DevTel not like", value, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelIn(List<String> values) {
            addCriterion("DevTel in", values, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelNotIn(List<String> values) {
            addCriterion("DevTel not in", values, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelBetween(String value1, String value2) {
            addCriterion("DevTel between", value1, value2, "devtel");
            return (Criteria) this;
        }

        public Criteria andDevtelNotBetween(String value1, String value2) {
            addCriterion("DevTel not between", value1, value2, "devtel");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("Room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("Room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Short value) {
            addCriterion("Room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Short value) {
            addCriterion("Room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Short value) {
            addCriterion("Room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Short value) {
            addCriterion("Room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Short value) {
            addCriterion("Room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Short value) {
            addCriterion("Room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Short> values) {
            addCriterion("Room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Short> values) {
            addCriterion("Room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Short value1, Short value2) {
            addCriterion("Room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Short value1, Short value2) {
            addCriterion("Room not between", value1, value2, "room");
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

        public Criteria andEstatenameeIsNull() {
            addCriterion("EstateNameE is null");
            return (Criteria) this;
        }

        public Criteria andEstatenameeIsNotNull() {
            addCriterion("EstateNameE is not null");
            return (Criteria) this;
        }

        public Criteria andEstatenameeEqualTo(String value) {
            addCriterion("EstateNameE =", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeNotEqualTo(String value) {
            addCriterion("EstateNameE <>", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeGreaterThan(String value) {
            addCriterion("EstateNameE >", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeGreaterThanOrEqualTo(String value) {
            addCriterion("EstateNameE >=", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeLessThan(String value) {
            addCriterion("EstateNameE <", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeLessThanOrEqualTo(String value) {
            addCriterion("EstateNameE <=", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeLike(String value) {
            addCriterion("EstateNameE like", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeNotLike(String value) {
            addCriterion("EstateNameE not like", value, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeIn(List<String> values) {
            addCriterion("EstateNameE in", values, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeNotIn(List<String> values) {
            addCriterion("EstateNameE not in", values, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeBetween(String value1, String value2) {
            addCriterion("EstateNameE between", value1, value2, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andEstatenameeNotBetween(String value1, String value2) {
            addCriterion("EstateNameE not between", value1, value2, "estatenamee");
            return (Criteria) this;
        }

        public Criteria andAddresseIsNull() {
            addCriterion("AddressE is null");
            return (Criteria) this;
        }

        public Criteria andAddresseIsNotNull() {
            addCriterion("AddressE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseEqualTo(String value) {
            addCriterion("AddressE =", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseNotEqualTo(String value) {
            addCriterion("AddressE <>", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseGreaterThan(String value) {
            addCriterion("AddressE >", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseGreaterThanOrEqualTo(String value) {
            addCriterion("AddressE >=", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseLessThan(String value) {
            addCriterion("AddressE <", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseLessThanOrEqualTo(String value) {
            addCriterion("AddressE <=", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseLike(String value) {
            addCriterion("AddressE like", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseNotLike(String value) {
            addCriterion("AddressE not like", value, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseIn(List<String> values) {
            addCriterion("AddressE in", values, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseNotIn(List<String> values) {
            addCriterion("AddressE not in", values, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseBetween(String value1, String value2) {
            addCriterion("AddressE between", value1, value2, "addresse");
            return (Criteria) this;
        }

        public Criteria andAddresseNotBetween(String value1, String value2) {
            addCriterion("AddressE not between", value1, value2, "addresse");
            return (Criteria) this;
        }

        public Criteria andMapidIsNull() {
            addCriterion("MapID is null");
            return (Criteria) this;
        }

        public Criteria andMapidIsNotNull() {
            addCriterion("MapID is not null");
            return (Criteria) this;
        }

        public Criteria andMapidEqualTo(String value) {
            addCriterion("MapID =", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotEqualTo(String value) {
            addCriterion("MapID <>", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThan(String value) {
            addCriterion("MapID >", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidGreaterThanOrEqualTo(String value) {
            addCriterion("MapID >=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThan(String value) {
            addCriterion("MapID <", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLessThanOrEqualTo(String value) {
            addCriterion("MapID <=", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidLike(String value) {
            addCriterion("MapID like", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotLike(String value) {
            addCriterion("MapID not like", value, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidIn(List<String> values) {
            addCriterion("MapID in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotIn(List<String> values) {
            addCriterion("MapID not in", values, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidBetween(String value1, String value2) {
            addCriterion("MapID between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andMapidNotBetween(String value1, String value2) {
            addCriterion("MapID not between", value1, value2, "mapid");
            return (Criteria) this;
        }

        public Criteria andCoxIsNull() {
            addCriterion("CoX is null");
            return (Criteria) this;
        }

        public Criteria andCoxIsNotNull() {
            addCriterion("CoX is not null");
            return (Criteria) this;
        }

        public Criteria andCoxEqualTo(Integer value) {
            addCriterion("CoX =", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxNotEqualTo(Integer value) {
            addCriterion("CoX <>", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxGreaterThan(Integer value) {
            addCriterion("CoX >", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoX >=", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxLessThan(Integer value) {
            addCriterion("CoX <", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxLessThanOrEqualTo(Integer value) {
            addCriterion("CoX <=", value, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxIn(List<Integer> values) {
            addCriterion("CoX in", values, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxNotIn(List<Integer> values) {
            addCriterion("CoX not in", values, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxBetween(Integer value1, Integer value2) {
            addCriterion("CoX between", value1, value2, "cox");
            return (Criteria) this;
        }

        public Criteria andCoxNotBetween(Integer value1, Integer value2) {
            addCriterion("CoX not between", value1, value2, "cox");
            return (Criteria) this;
        }

        public Criteria andCoyIsNull() {
            addCriterion("CoY is null");
            return (Criteria) this;
        }

        public Criteria andCoyIsNotNull() {
            addCriterion("CoY is not null");
            return (Criteria) this;
        }

        public Criteria andCoyEqualTo(Integer value) {
            addCriterion("CoY =", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyNotEqualTo(Integer value) {
            addCriterion("CoY <>", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyGreaterThan(Integer value) {
            addCriterion("CoY >", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoY >=", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyLessThan(Integer value) {
            addCriterion("CoY <", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyLessThanOrEqualTo(Integer value) {
            addCriterion("CoY <=", value, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyIn(List<Integer> values) {
            addCriterion("CoY in", values, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyNotIn(List<Integer> values) {
            addCriterion("CoY not in", values, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyBetween(Integer value1, Integer value2) {
            addCriterion("CoY between", value1, value2, "coy");
            return (Criteria) this;
        }

        public Criteria andCoyNotBetween(Integer value1, Integer value2) {
            addCriterion("CoY not between", value1, value2, "coy");
            return (Criteria) this;
        }

        public Criteria andRoomruleIsNull() {
            addCriterion("RoomRule is null");
            return (Criteria) this;
        }

        public Criteria andRoomruleIsNotNull() {
            addCriterion("RoomRule is not null");
            return (Criteria) this;
        }

        public Criteria andRoomruleEqualTo(Integer value) {
            addCriterion("RoomRule =", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleNotEqualTo(Integer value) {
            addCriterion("RoomRule <>", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleGreaterThan(Integer value) {
            addCriterion("RoomRule >", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoomRule >=", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleLessThan(Integer value) {
            addCriterion("RoomRule <", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleLessThanOrEqualTo(Integer value) {
            addCriterion("RoomRule <=", value, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleIn(List<Integer> values) {
            addCriterion("RoomRule in", values, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleNotIn(List<Integer> values) {
            addCriterion("RoomRule not in", values, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleBetween(Integer value1, Integer value2) {
            addCriterion("RoomRule between", value1, value2, "roomrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleNotBetween(Integer value1, Integer value2) {
            addCriterion("RoomRule not between", value1, value2, "roomrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleIsNull() {
            addCriterion("BuildingRule is null");
            return (Criteria) this;
        }

        public Criteria andBuildingruleIsNotNull() {
            addCriterion("BuildingRule is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingruleEqualTo(Boolean value) {
            addCriterion("BuildingRule =", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleNotEqualTo(Boolean value) {
            addCriterion("BuildingRule <>", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleGreaterThan(Boolean value) {
            addCriterion("BuildingRule >", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BuildingRule >=", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleLessThan(Boolean value) {
            addCriterion("BuildingRule <", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleLessThanOrEqualTo(Boolean value) {
            addCriterion("BuildingRule <=", value, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleIn(List<Boolean> values) {
            addCriterion("BuildingRule in", values, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleNotIn(List<Boolean> values) {
            addCriterion("BuildingRule not in", values, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleBetween(Boolean value1, Boolean value2) {
            addCriterion("BuildingRule between", value1, value2, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andBuildingruleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BuildingRule not between", value1, value2, "buildingrule");
            return (Criteria) this;
        }

        public Criteria andRoomruleexIsNull() {
            addCriterion("RoomRuleEx is null");
            return (Criteria) this;
        }

        public Criteria andRoomruleexIsNotNull() {
            addCriterion("RoomRuleEx is not null");
            return (Criteria) this;
        }

        public Criteria andRoomruleexEqualTo(String value) {
            addCriterion("RoomRuleEx =", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexNotEqualTo(String value) {
            addCriterion("RoomRuleEx <>", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexGreaterThan(String value) {
            addCriterion("RoomRuleEx >", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexGreaterThanOrEqualTo(String value) {
            addCriterion("RoomRuleEx >=", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexLessThan(String value) {
            addCriterion("RoomRuleEx <", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexLessThanOrEqualTo(String value) {
            addCriterion("RoomRuleEx <=", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexLike(String value) {
            addCriterion("RoomRuleEx like", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexNotLike(String value) {
            addCriterion("RoomRuleEx not like", value, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexIn(List<String> values) {
            addCriterion("RoomRuleEx in", values, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexNotIn(List<String> values) {
            addCriterion("RoomRuleEx not in", values, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexBetween(String value1, String value2) {
            addCriterion("RoomRuleEx between", value1, value2, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andRoomruleexNotBetween(String value1, String value2) {
            addCriterion("RoomRuleEx not between", value1, value2, "roomruleex");
            return (Criteria) this;
        }

        public Criteria andSurfaceIsNull() {
            addCriterion("Surface is null");
            return (Criteria) this;
        }

        public Criteria andSurfaceIsNotNull() {
            addCriterion("Surface is not null");
            return (Criteria) this;
        }

        public Criteria andSurfaceEqualTo(String value) {
            addCriterion("Surface =", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceNotEqualTo(String value) {
            addCriterion("Surface <>", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceGreaterThan(String value) {
            addCriterion("Surface >", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceGreaterThanOrEqualTo(String value) {
            addCriterion("Surface >=", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceLessThan(String value) {
            addCriterion("Surface <", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceLessThanOrEqualTo(String value) {
            addCriterion("Surface <=", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceLike(String value) {
            addCriterion("Surface like", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceNotLike(String value) {
            addCriterion("Surface not like", value, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceIn(List<String> values) {
            addCriterion("Surface in", values, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceNotIn(List<String> values) {
            addCriterion("Surface not in", values, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceBetween(String value1, String value2) {
            addCriterion("Surface between", value1, value2, "surface");
            return (Criteria) this;
        }

        public Criteria andSurfaceNotBetween(String value1, String value2) {
            addCriterion("Surface not between", value1, value2, "surface");
            return (Criteria) this;
        }

        public Criteria andOwnyearIsNull() {
            addCriterion("OwnYear is null");
            return (Criteria) this;
        }

        public Criteria andOwnyearIsNotNull() {
            addCriterion("OwnYear is not null");
            return (Criteria) this;
        }

        public Criteria andOwnyearEqualTo(String value) {
            addCriterion("OwnYear =", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearNotEqualTo(String value) {
            addCriterion("OwnYear <>", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearGreaterThan(String value) {
            addCriterion("OwnYear >", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearGreaterThanOrEqualTo(String value) {
            addCriterion("OwnYear >=", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearLessThan(String value) {
            addCriterion("OwnYear <", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearLessThanOrEqualTo(String value) {
            addCriterion("OwnYear <=", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearLike(String value) {
            addCriterion("OwnYear like", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearNotLike(String value) {
            addCriterion("OwnYear not like", value, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearIn(List<String> values) {
            addCriterion("OwnYear in", values, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearNotIn(List<String> values) {
            addCriterion("OwnYear not in", values, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearBetween(String value1, String value2) {
            addCriterion("OwnYear between", value1, value2, "ownyear");
            return (Criteria) this;
        }

        public Criteria andOwnyearNotBetween(String value1, String value2) {
            addCriterion("OwnYear not between", value1, value2, "ownyear");
            return (Criteria) this;
        }

        public Criteria andEstatenameaIsNull() {
            addCriterion("EstateNameA is null");
            return (Criteria) this;
        }

        public Criteria andEstatenameaIsNotNull() {
            addCriterion("EstateNameA is not null");
            return (Criteria) this;
        }

        public Criteria andEstatenameaEqualTo(String value) {
            addCriterion("EstateNameA =", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaNotEqualTo(String value) {
            addCriterion("EstateNameA <>", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaGreaterThan(String value) {
            addCriterion("EstateNameA >", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaGreaterThanOrEqualTo(String value) {
            addCriterion("EstateNameA >=", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaLessThan(String value) {
            addCriterion("EstateNameA <", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaLessThanOrEqualTo(String value) {
            addCriterion("EstateNameA <=", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaLike(String value) {
            addCriterion("EstateNameA like", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaNotLike(String value) {
            addCriterion("EstateNameA not like", value, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaIn(List<String> values) {
            addCriterion("EstateNameA in", values, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaNotIn(List<String> values) {
            addCriterion("EstateNameA not in", values, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaBetween(String value1, String value2) {
            addCriterion("EstateNameA between", value1, value2, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andEstatenameaNotBetween(String value1, String value2) {
            addCriterion("EstateNameA not between", value1, value2, "estatenamea");
            return (Criteria) this;
        }

        public Criteria andFlaglockedIsNull() {
            addCriterion("FlagLocked is null");
            return (Criteria) this;
        }

        public Criteria andFlaglockedIsNotNull() {
            addCriterion("FlagLocked is not null");
            return (Criteria) this;
        }

        public Criteria andFlaglockedEqualTo(Boolean value) {
            addCriterion("FlagLocked =", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedNotEqualTo(Boolean value) {
            addCriterion("FlagLocked <>", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedGreaterThan(Boolean value) {
            addCriterion("FlagLocked >", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagLocked >=", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedLessThan(Boolean value) {
            addCriterion("FlagLocked <", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagLocked <=", value, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedIn(List<Boolean> values) {
            addCriterion("FlagLocked in", values, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedNotIn(List<Boolean> values) {
            addCriterion("FlagLocked not in", values, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagLocked between", value1, value2, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andFlaglockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagLocked not between", value1, value2, "flaglocked");
            return (Criteria) this;
        }

        public Criteria andPropertymetroIsNull() {
            addCriterion("PropertyMetro is null");
            return (Criteria) this;
        }

        public Criteria andPropertymetroIsNotNull() {
            addCriterion("PropertyMetro is not null");
            return (Criteria) this;
        }

        public Criteria andPropertymetroEqualTo(String value) {
            addCriterion("PropertyMetro =", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroNotEqualTo(String value) {
            addCriterion("PropertyMetro <>", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroGreaterThan(String value) {
            addCriterion("PropertyMetro >", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyMetro >=", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroLessThan(String value) {
            addCriterion("PropertyMetro <", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroLessThanOrEqualTo(String value) {
            addCriterion("PropertyMetro <=", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroLike(String value) {
            addCriterion("PropertyMetro like", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroNotLike(String value) {
            addCriterion("PropertyMetro not like", value, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroIn(List<String> values) {
            addCriterion("PropertyMetro in", values, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroNotIn(List<String> values) {
            addCriterion("PropertyMetro not in", values, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroBetween(String value1, String value2) {
            addCriterion("PropertyMetro between", value1, value2, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertymetroNotBetween(String value1, String value2) {
            addCriterion("PropertyMetro not between", value1, value2, "propertymetro");
            return (Criteria) this;
        }

        public Criteria andPropertyringIsNull() {
            addCriterion("PropertyRing is null");
            return (Criteria) this;
        }

        public Criteria andPropertyringIsNotNull() {
            addCriterion("PropertyRing is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyringEqualTo(String value) {
            addCriterion("PropertyRing =", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringNotEqualTo(String value) {
            addCriterion("PropertyRing <>", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringGreaterThan(String value) {
            addCriterion("PropertyRing >", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyRing >=", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringLessThan(String value) {
            addCriterion("PropertyRing <", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringLessThanOrEqualTo(String value) {
            addCriterion("PropertyRing <=", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringLike(String value) {
            addCriterion("PropertyRing like", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringNotLike(String value) {
            addCriterion("PropertyRing not like", value, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringIn(List<String> values) {
            addCriterion("PropertyRing in", values, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringNotIn(List<String> values) {
            addCriterion("PropertyRing not in", values, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringBetween(String value1, String value2) {
            addCriterion("PropertyRing between", value1, value2, "propertyring");
            return (Criteria) this;
        }

        public Criteria andPropertyringNotBetween(String value1, String value2) {
            addCriterion("PropertyRing not between", value1, value2, "propertyring");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleIsNull() {
            addCriterion("RoomNoRule is null");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleIsNotNull() {
            addCriterion("RoomNoRule is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleEqualTo(Boolean value) {
            addCriterion("RoomNoRule =", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleNotEqualTo(Boolean value) {
            addCriterion("RoomNoRule <>", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleGreaterThan(Boolean value) {
            addCriterion("RoomNoRule >", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("RoomNoRule >=", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleLessThan(Boolean value) {
            addCriterion("RoomNoRule <", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleLessThanOrEqualTo(Boolean value) {
            addCriterion("RoomNoRule <=", value, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleIn(List<Boolean> values) {
            addCriterion("RoomNoRule in", values, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleNotIn(List<Boolean> values) {
            addCriterion("RoomNoRule not in", values, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleBetween(Boolean value1, Boolean value2) {
            addCriterion("RoomNoRule between", value1, value2, "roomnorule");
            return (Criteria) this;
        }

        public Criteria andRoomnoruleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("RoomNoRule not between", value1, value2, "roomnorule");
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