package com.swjtu.SYWeiServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyidIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("CompanyID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("CompanyID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("CompanyID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("CompanyID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("CompanyID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("CompanyID like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("CompanyID not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("CompanyID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("CompanyID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("CompanyID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("CompanyID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynoIsNull() {
            addCriterion("CompanyNO is null");
            return (Criteria) this;
        }

        public Criteria andCompanynoIsNotNull() {
            addCriterion("CompanyNO is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynoEqualTo(String value) {
            addCriterion("CompanyNO =", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoNotEqualTo(String value) {
            addCriterion("CompanyNO <>", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoGreaterThan(String value) {
            addCriterion("CompanyNO >", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyNO >=", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoLessThan(String value) {
            addCriterion("CompanyNO <", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoLessThanOrEqualTo(String value) {
            addCriterion("CompanyNO <=", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoLike(String value) {
            addCriterion("CompanyNO like", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoNotLike(String value) {
            addCriterion("CompanyNO not like", value, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoIn(List<String> values) {
            addCriterion("CompanyNO in", values, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoNotIn(List<String> values) {
            addCriterion("CompanyNO not in", values, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoBetween(String value1, String value2) {
            addCriterion("CompanyNO between", value1, value2, "companyno");
            return (Criteria) this;
        }

        public Criteria andCompanynoNotBetween(String value1, String value2) {
            addCriterion("CompanyNO not between", value1, value2, "companyno");
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

        public Criteria andDbnameIsNull() {
            addCriterion("DBname is null");
            return (Criteria) this;
        }

        public Criteria andDbnameIsNotNull() {
            addCriterion("DBname is not null");
            return (Criteria) this;
        }

        public Criteria andDbnameEqualTo(String value) {
            addCriterion("DBname =", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotEqualTo(String value) {
            addCriterion("DBname <>", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThan(String value) {
            addCriterion("DBname >", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameGreaterThanOrEqualTo(String value) {
            addCriterion("DBname >=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThan(String value) {
            addCriterion("DBname <", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLessThanOrEqualTo(String value) {
            addCriterion("DBname <=", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameLike(String value) {
            addCriterion("DBname like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotLike(String value) {
            addCriterion("DBname not like", value, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameIn(List<String> values) {
            addCriterion("DBname in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotIn(List<String> values) {
            addCriterion("DBname not in", values, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameBetween(String value1, String value2) {
            addCriterion("DBname between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andDbnameNotBetween(String value1, String value2) {
            addCriterion("DBname not between", value1, value2, "dbname");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNull() {
            addCriterion("ExpireDate is null");
            return (Criteria) this;
        }

        public Criteria andExpiredateIsNotNull() {
            addCriterion("ExpireDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredateEqualTo(Date value) {
            addCriterion("ExpireDate =", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotEqualTo(Date value) {
            addCriterion("ExpireDate <>", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThan(Date value) {
            addCriterion("ExpireDate >", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireDate >=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThan(Date value) {
            addCriterion("ExpireDate <", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateLessThanOrEqualTo(Date value) {
            addCriterion("ExpireDate <=", value, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateIn(List<Date> values) {
            addCriterion("ExpireDate in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotIn(List<Date> values) {
            addCriterion("ExpireDate not in", values, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateBetween(Date value1, Date value2) {
            addCriterion("ExpireDate between", value1, value2, "expiredate");
            return (Criteria) this;
        }

        public Criteria andExpiredateNotBetween(Date value1, Date value2) {
            addCriterion("ExpireDate not between", value1, value2, "expiredate");
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

        public Criteria andStorecountIsNull() {
            addCriterion("StoreCount is null");
            return (Criteria) this;
        }

        public Criteria andStorecountIsNotNull() {
            addCriterion("StoreCount is not null");
            return (Criteria) this;
        }

        public Criteria andStorecountEqualTo(String value) {
            addCriterion("StoreCount =", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotEqualTo(String value) {
            addCriterion("StoreCount <>", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThan(String value) {
            addCriterion("StoreCount >", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountGreaterThanOrEqualTo(String value) {
            addCriterion("StoreCount >=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThan(String value) {
            addCriterion("StoreCount <", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLessThanOrEqualTo(String value) {
            addCriterion("StoreCount <=", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountLike(String value) {
            addCriterion("StoreCount like", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotLike(String value) {
            addCriterion("StoreCount not like", value, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountIn(List<String> values) {
            addCriterion("StoreCount in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotIn(List<String> values) {
            addCriterion("StoreCount not in", values, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountBetween(String value1, String value2) {
            addCriterion("StoreCount between", value1, value2, "storecount");
            return (Criteria) this;
        }

        public Criteria andStorecountNotBetween(String value1, String value2) {
            addCriterion("StoreCount not between", value1, value2, "storecount");
            return (Criteria) this;
        }

        public Criteria andFlaggrantIsNull() {
            addCriterion("FlagGrant is null");
            return (Criteria) this;
        }

        public Criteria andFlaggrantIsNotNull() {
            addCriterion("FlagGrant is not null");
            return (Criteria) this;
        }

        public Criteria andFlaggrantEqualTo(Boolean value) {
            addCriterion("FlagGrant =", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantNotEqualTo(Boolean value) {
            addCriterion("FlagGrant <>", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantGreaterThan(Boolean value) {
            addCriterion("FlagGrant >", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagGrant >=", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantLessThan(Boolean value) {
            addCriterion("FlagGrant <", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagGrant <=", value, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantIn(List<Boolean> values) {
            addCriterion("FlagGrant in", values, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantNotIn(List<Boolean> values) {
            addCriterion("FlagGrant not in", values, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagGrant between", value1, value2, "flaggrant");
            return (Criteria) this;
        }

        public Criteria andFlaggrantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagGrant not between", value1, value2, "flaggrant");
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

        public Criteria andRtcountIsNull() {
            addCriterion("RTCount is null");
            return (Criteria) this;
        }

        public Criteria andRtcountIsNotNull() {
            addCriterion("RTCount is not null");
            return (Criteria) this;
        }

        public Criteria andRtcountEqualTo(String value) {
            addCriterion("RTCount =", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountNotEqualTo(String value) {
            addCriterion("RTCount <>", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountGreaterThan(String value) {
            addCriterion("RTCount >", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountGreaterThanOrEqualTo(String value) {
            addCriterion("RTCount >=", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountLessThan(String value) {
            addCriterion("RTCount <", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountLessThanOrEqualTo(String value) {
            addCriterion("RTCount <=", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountLike(String value) {
            addCriterion("RTCount like", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountNotLike(String value) {
            addCriterion("RTCount not like", value, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountIn(List<String> values) {
            addCriterion("RTCount in", values, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountNotIn(List<String> values) {
            addCriterion("RTCount not in", values, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountBetween(String value1, String value2) {
            addCriterion("RTCount between", value1, value2, "rtcount");
            return (Criteria) this;
        }

        public Criteria andRtcountNotBetween(String value1, String value2) {
            addCriterion("RTCount not between", value1, value2, "rtcount");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("Domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("Domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("Domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("Domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("Domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("Domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("Domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("Domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("Domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("Domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("Domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("Domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("Domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("Domain not between", value1, value2, "domain");
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