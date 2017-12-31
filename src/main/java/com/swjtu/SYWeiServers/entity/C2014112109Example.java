package com.swjtu.SYWeiServers.entity;

import java.util.ArrayList;
import java.util.List;

public class C2014112109Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public C2014112109Example() {
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

        public Criteria andCusIdcardIsNull() {
            addCriterion("Cus_idCard is null");
            return (Criteria) this;
        }

        public Criteria andCusIdcardIsNotNull() {
            addCriterion("Cus_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andCusIdcardEqualTo(String value) {
            addCriterion("Cus_idCard =", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotEqualTo(String value) {
            addCriterion("Cus_idCard <>", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardGreaterThan(String value) {
            addCriterion("Cus_idCard >", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("Cus_idCard >=", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLessThan(String value) {
            addCriterion("Cus_idCard <", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLessThanOrEqualTo(String value) {
            addCriterion("Cus_idCard <=", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardLike(String value) {
            addCriterion("Cus_idCard like", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotLike(String value) {
            addCriterion("Cus_idCard not like", value, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardIn(List<String> values) {
            addCriterion("Cus_idCard in", values, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotIn(List<String> values) {
            addCriterion("Cus_idCard not in", values, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardBetween(String value1, String value2) {
            addCriterion("Cus_idCard between", value1, value2, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andCusIdcardNotBetween(String value1, String value2) {
            addCriterion("Cus_idCard not between", value1, value2, "cusIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardIsNull() {
            addCriterion("Dri_idCard is null");
            return (Criteria) this;
        }

        public Criteria andDriIdcardIsNotNull() {
            addCriterion("Dri_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andDriIdcardEqualTo(String value) {
            addCriterion("Dri_idCard =", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardNotEqualTo(String value) {
            addCriterion("Dri_idCard <>", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardGreaterThan(String value) {
            addCriterion("Dri_idCard >", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("Dri_idCard >=", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardLessThan(String value) {
            addCriterion("Dri_idCard <", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardLessThanOrEqualTo(String value) {
            addCriterion("Dri_idCard <=", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardLike(String value) {
            addCriterion("Dri_idCard like", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardNotLike(String value) {
            addCriterion("Dri_idCard not like", value, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardIn(List<String> values) {
            addCriterion("Dri_idCard in", values, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardNotIn(List<String> values) {
            addCriterion("Dri_idCard not in", values, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardBetween(String value1, String value2) {
            addCriterion("Dri_idCard between", value1, value2, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andDriIdcardNotBetween(String value1, String value2) {
            addCriterion("Dri_idCard not between", value1, value2, "driIdcard");
            return (Criteria) this;
        }

        public Criteria andCDripointIsNull() {
            addCriterion("C_driPoint is null");
            return (Criteria) this;
        }

        public Criteria andCDripointIsNotNull() {
            addCriterion("C_driPoint is not null");
            return (Criteria) this;
        }

        public Criteria andCDripointEqualTo(Integer value) {
            addCriterion("C_driPoint =", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointNotEqualTo(Integer value) {
            addCriterion("C_driPoint <>", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointGreaterThan(Integer value) {
            addCriterion("C_driPoint >", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_driPoint >=", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointLessThan(Integer value) {
            addCriterion("C_driPoint <", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointLessThanOrEqualTo(Integer value) {
            addCriterion("C_driPoint <=", value, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointIn(List<Integer> values) {
            addCriterion("C_driPoint in", values, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointNotIn(List<Integer> values) {
            addCriterion("C_driPoint not in", values, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointBetween(Integer value1, Integer value2) {
            addCriterion("C_driPoint between", value1, value2, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCDripointNotBetween(Integer value1, Integer value2) {
            addCriterion("C_driPoint not between", value1, value2, "cDripoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointIsNull() {
            addCriterion("C_CusPoint is null");
            return (Criteria) this;
        }

        public Criteria andCCuspointIsNotNull() {
            addCriterion("C_CusPoint is not null");
            return (Criteria) this;
        }

        public Criteria andCCuspointEqualTo(Integer value) {
            addCriterion("C_CusPoint =", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointNotEqualTo(Integer value) {
            addCriterion("C_CusPoint <>", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointGreaterThan(Integer value) {
            addCriterion("C_CusPoint >", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_CusPoint >=", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointLessThan(Integer value) {
            addCriterion("C_CusPoint <", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointLessThanOrEqualTo(Integer value) {
            addCriterion("C_CusPoint <=", value, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointIn(List<Integer> values) {
            addCriterion("C_CusPoint in", values, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointNotIn(List<Integer> values) {
            addCriterion("C_CusPoint not in", values, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointBetween(Integer value1, Integer value2) {
            addCriterion("C_CusPoint between", value1, value2, "cCuspoint");
            return (Criteria) this;
        }

        public Criteria andCCuspointNotBetween(Integer value1, Integer value2) {
            addCriterion("C_CusPoint not between", value1, value2, "cCuspoint");
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