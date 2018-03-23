package com.swjtu.SYWeiServers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpnoIsNull() {
            addCriterion("EmpNo is null");
            return (Criteria) this;
        }

        public Criteria andEmpnoIsNotNull() {
            addCriterion("EmpNo is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnoEqualTo(String value) {
            addCriterion("EmpNo =", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotEqualTo(String value) {
            addCriterion("EmpNo <>", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThan(String value) {
            addCriterion("EmpNo >", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoGreaterThanOrEqualTo(String value) {
            addCriterion("EmpNo >=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThan(String value) {
            addCriterion("EmpNo <", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLessThanOrEqualTo(String value) {
            addCriterion("EmpNo <=", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoLike(String value) {
            addCriterion("EmpNo like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotLike(String value) {
            addCriterion("EmpNo not like", value, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoIn(List<String> values) {
            addCriterion("EmpNo in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotIn(List<String> values) {
            addCriterion("EmpNo not in", values, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoBetween(String value1, String value2) {
            addCriterion("EmpNo between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnoNotBetween(String value1, String value2) {
            addCriterion("EmpNo not between", value1, value2, "empno");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("EmpName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("EmpName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("EmpName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("EmpName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("EmpName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("EmpName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("EmpName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("EmpName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("EmpName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("EmpName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("EmpName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("EmpName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("EmpName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("EmpName not between", value1, value2, "empname");
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

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
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

        public Criteria andPropertycolsIsNull() {
            addCriterion("PropertyCols is null");
            return (Criteria) this;
        }

        public Criteria andPropertycolsIsNotNull() {
            addCriterion("PropertyCols is not null");
            return (Criteria) this;
        }

        public Criteria andPropertycolsEqualTo(String value) {
            addCriterion("PropertyCols =", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsNotEqualTo(String value) {
            addCriterion("PropertyCols <>", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsGreaterThan(String value) {
            addCriterion("PropertyCols >", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsGreaterThanOrEqualTo(String value) {
            addCriterion("PropertyCols >=", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsLessThan(String value) {
            addCriterion("PropertyCols <", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsLessThanOrEqualTo(String value) {
            addCriterion("PropertyCols <=", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsLike(String value) {
            addCriterion("PropertyCols like", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsNotLike(String value) {
            addCriterion("PropertyCols not like", value, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsIn(List<String> values) {
            addCriterion("PropertyCols in", values, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsNotIn(List<String> values) {
            addCriterion("PropertyCols not in", values, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsBetween(String value1, String value2) {
            addCriterion("PropertyCols between", value1, value2, "propertycols");
            return (Criteria) this;
        }

        public Criteria andPropertycolsNotBetween(String value1, String value2) {
            addCriterion("PropertyCols not between", value1, value2, "propertycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsIsNull() {
            addCriterion("InquiryCols is null");
            return (Criteria) this;
        }

        public Criteria andInquirycolsIsNotNull() {
            addCriterion("InquiryCols is not null");
            return (Criteria) this;
        }

        public Criteria andInquirycolsEqualTo(String value) {
            addCriterion("InquiryCols =", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsNotEqualTo(String value) {
            addCriterion("InquiryCols <>", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsGreaterThan(String value) {
            addCriterion("InquiryCols >", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsGreaterThanOrEqualTo(String value) {
            addCriterion("InquiryCols >=", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsLessThan(String value) {
            addCriterion("InquiryCols <", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsLessThanOrEqualTo(String value) {
            addCriterion("InquiryCols <=", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsLike(String value) {
            addCriterion("InquiryCols like", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsNotLike(String value) {
            addCriterion("InquiryCols not like", value, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsIn(List<String> values) {
            addCriterion("InquiryCols in", values, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsNotIn(List<String> values) {
            addCriterion("InquiryCols not in", values, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsBetween(String value1, String value2) {
            addCriterion("InquiryCols between", value1, value2, "inquirycols");
            return (Criteria) this;
        }

        public Criteria andInquirycolsNotBetween(String value1, String value2) {
            addCriterion("InquiryCols not between", value1, value2, "inquirycols");
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

        public Criteria andRollinIsNull() {
            addCriterion("RollIn is null");
            return (Criteria) this;
        }

        public Criteria andRollinIsNotNull() {
            addCriterion("RollIn is not null");
            return (Criteria) this;
        }

        public Criteria andRollinEqualTo(Date value) {
            addCriterion("RollIn =", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotEqualTo(Date value) {
            addCriterion("RollIn <>", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinGreaterThan(Date value) {
            addCriterion("RollIn >", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinGreaterThanOrEqualTo(Date value) {
            addCriterion("RollIn >=", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinLessThan(Date value) {
            addCriterion("RollIn <", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinLessThanOrEqualTo(Date value) {
            addCriterion("RollIn <=", value, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinIn(List<Date> values) {
            addCriterion("RollIn in", values, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotIn(List<Date> values) {
            addCriterion("RollIn not in", values, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinBetween(Date value1, Date value2) {
            addCriterion("RollIn between", value1, value2, "rollin");
            return (Criteria) this;
        }

        public Criteria andRollinNotBetween(Date value1, Date value2) {
            addCriterion("RollIn not between", value1, value2, "rollin");
            return (Criteria) this;
        }

        public Criteria andRolloutIsNull() {
            addCriterion("RollOut is null");
            return (Criteria) this;
        }

        public Criteria andRolloutIsNotNull() {
            addCriterion("RollOut is not null");
            return (Criteria) this;
        }

        public Criteria andRolloutEqualTo(Date value) {
            addCriterion("RollOut =", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutNotEqualTo(Date value) {
            addCriterion("RollOut <>", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutGreaterThan(Date value) {
            addCriterion("RollOut >", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutGreaterThanOrEqualTo(Date value) {
            addCriterion("RollOut >=", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutLessThan(Date value) {
            addCriterion("RollOut <", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutLessThanOrEqualTo(Date value) {
            addCriterion("RollOut <=", value, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutIn(List<Date> values) {
            addCriterion("RollOut in", values, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutNotIn(List<Date> values) {
            addCriterion("RollOut not in", values, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutBetween(Date value1, Date value2) {
            addCriterion("RollOut between", value1, value2, "rollout");
            return (Criteria) this;
        }

        public Criteria andRolloutNotBetween(Date value1, Date value2) {
            addCriterion("RollOut not between", value1, value2, "rollout");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("PositionID is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("PositionID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(String value) {
            addCriterion("PositionID =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(String value) {
            addCriterion("PositionID <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(String value) {
            addCriterion("PositionID >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(String value) {
            addCriterion("PositionID >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(String value) {
            addCriterion("PositionID <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(String value) {
            addCriterion("PositionID <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLike(String value) {
            addCriterion("PositionID like", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotLike(String value) {
            addCriterion("PositionID not like", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<String> values) {
            addCriterion("PositionID in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<String> values) {
            addCriterion("PositionID not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(String value1, String value2) {
            addCriterion("PositionID between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(String value1, String value2) {
            addCriterion("PositionID not between", value1, value2, "positionid");
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

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
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

        public Criteria andEducationIsNull() {
            addCriterion("Education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("Education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("Education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("Education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("Education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("Education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("Education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("Education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("Education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("Education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("Education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("Education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("Education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("Education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("Speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("Speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("Speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("Speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("Speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("Speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("Speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("Speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("Speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("Speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("Speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("Speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("Speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("Speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMail is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMail is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMail =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMail <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMail >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMail >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMail <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMail <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMail like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMail not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMail in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMail not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMail between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMail not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andContractcolsIsNull() {
            addCriterion("ContractCols is null");
            return (Criteria) this;
        }

        public Criteria andContractcolsIsNotNull() {
            addCriterion("ContractCols is not null");
            return (Criteria) this;
        }

        public Criteria andContractcolsEqualTo(String value) {
            addCriterion("ContractCols =", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsNotEqualTo(String value) {
            addCriterion("ContractCols <>", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsGreaterThan(String value) {
            addCriterion("ContractCols >", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsGreaterThanOrEqualTo(String value) {
            addCriterion("ContractCols >=", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsLessThan(String value) {
            addCriterion("ContractCols <", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsLessThanOrEqualTo(String value) {
            addCriterion("ContractCols <=", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsLike(String value) {
            addCriterion("ContractCols like", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsNotLike(String value) {
            addCriterion("ContractCols not like", value, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsIn(List<String> values) {
            addCriterion("ContractCols in", values, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsNotIn(List<String> values) {
            addCriterion("ContractCols not in", values, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsBetween(String value1, String value2) {
            addCriterion("ContractCols between", value1, value2, "contractcols");
            return (Criteria) this;
        }

        public Criteria andContractcolsNotBetween(String value1, String value2) {
            addCriterion("ContractCols not between", value1, value2, "contractcols");
            return (Criteria) this;
        }

        public Criteria andPwddateIsNull() {
            addCriterion("PwdDate is null");
            return (Criteria) this;
        }

        public Criteria andPwddateIsNotNull() {
            addCriterion("PwdDate is not null");
            return (Criteria) this;
        }

        public Criteria andPwddateEqualTo(Date value) {
            addCriterion("PwdDate =", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateNotEqualTo(Date value) {
            addCriterion("PwdDate <>", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateGreaterThan(Date value) {
            addCriterion("PwdDate >", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateGreaterThanOrEqualTo(Date value) {
            addCriterion("PwdDate >=", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateLessThan(Date value) {
            addCriterion("PwdDate <", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateLessThanOrEqualTo(Date value) {
            addCriterion("PwdDate <=", value, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateIn(List<Date> values) {
            addCriterion("PwdDate in", values, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateNotIn(List<Date> values) {
            addCriterion("PwdDate not in", values, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateBetween(Date value1, Date value2) {
            addCriterion("PwdDate between", value1, value2, "pwddate");
            return (Criteria) this;
        }

        public Criteria andPwddateNotBetween(Date value1, Date value2) {
            addCriterion("PwdDate not between", value1, value2, "pwddate");
            return (Criteria) this;
        }

        public Criteria andSignerIsNull() {
            addCriterion("Signer is null");
            return (Criteria) this;
        }

        public Criteria andSignerIsNotNull() {
            addCriterion("Signer is not null");
            return (Criteria) this;
        }

        public Criteria andSignerEqualTo(String value) {
            addCriterion("Signer =", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotEqualTo(String value) {
            addCriterion("Signer <>", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThan(String value) {
            addCriterion("Signer >", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThanOrEqualTo(String value) {
            addCriterion("Signer >=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThan(String value) {
            addCriterion("Signer <", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThanOrEqualTo(String value) {
            addCriterion("Signer <=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLike(String value) {
            addCriterion("Signer like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotLike(String value) {
            addCriterion("Signer not like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerIn(List<String> values) {
            addCriterion("Signer in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotIn(List<String> values) {
            addCriterion("Signer not in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerBetween(String value1, String value2) {
            addCriterion("Signer between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotBetween(String value1, String value2) {
            addCriterion("Signer not between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andAcl3IsNull() {
            addCriterion("ACL3 is null");
            return (Criteria) this;
        }

        public Criteria andAcl3IsNotNull() {
            addCriterion("ACL3 is not null");
            return (Criteria) this;
        }

        public Criteria andAcl3EqualTo(String value) {
            addCriterion("ACL3 =", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3NotEqualTo(String value) {
            addCriterion("ACL3 <>", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3GreaterThan(String value) {
            addCriterion("ACL3 >", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3GreaterThanOrEqualTo(String value) {
            addCriterion("ACL3 >=", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3LessThan(String value) {
            addCriterion("ACL3 <", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3LessThanOrEqualTo(String value) {
            addCriterion("ACL3 <=", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3Like(String value) {
            addCriterion("ACL3 like", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3NotLike(String value) {
            addCriterion("ACL3 not like", value, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3In(List<String> values) {
            addCriterion("ACL3 in", values, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3NotIn(List<String> values) {
            addCriterion("ACL3 not in", values, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3Between(String value1, String value2) {
            addCriterion("ACL3 between", value1, value2, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl3NotBetween(String value1, String value2) {
            addCriterion("ACL3 not between", value1, value2, "acl3");
            return (Criteria) this;
        }

        public Criteria andAcl1IsNull() {
            addCriterion("ACL1 is null");
            return (Criteria) this;
        }

        public Criteria andAcl1IsNotNull() {
            addCriterion("ACL1 is not null");
            return (Criteria) this;
        }

        public Criteria andAcl1EqualTo(String value) {
            addCriterion("ACL1 =", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1NotEqualTo(String value) {
            addCriterion("ACL1 <>", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1GreaterThan(String value) {
            addCriterion("ACL1 >", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1GreaterThanOrEqualTo(String value) {
            addCriterion("ACL1 >=", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1LessThan(String value) {
            addCriterion("ACL1 <", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1LessThanOrEqualTo(String value) {
            addCriterion("ACL1 <=", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1Like(String value) {
            addCriterion("ACL1 like", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1NotLike(String value) {
            addCriterion("ACL1 not like", value, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1In(List<String> values) {
            addCriterion("ACL1 in", values, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1NotIn(List<String> values) {
            addCriterion("ACL1 not in", values, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1Between(String value1, String value2) {
            addCriterion("ACL1 between", value1, value2, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl1NotBetween(String value1, String value2) {
            addCriterion("ACL1 not between", value1, value2, "acl1");
            return (Criteria) this;
        }

        public Criteria andAcl2IsNull() {
            addCriterion("ACL2 is null");
            return (Criteria) this;
        }

        public Criteria andAcl2IsNotNull() {
            addCriterion("ACL2 is not null");
            return (Criteria) this;
        }

        public Criteria andAcl2EqualTo(String value) {
            addCriterion("ACL2 =", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2NotEqualTo(String value) {
            addCriterion("ACL2 <>", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2GreaterThan(String value) {
            addCriterion("ACL2 >", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2GreaterThanOrEqualTo(String value) {
            addCriterion("ACL2 >=", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2LessThan(String value) {
            addCriterion("ACL2 <", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2LessThanOrEqualTo(String value) {
            addCriterion("ACL2 <=", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2Like(String value) {
            addCriterion("ACL2 like", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2NotLike(String value) {
            addCriterion("ACL2 not like", value, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2In(List<String> values) {
            addCriterion("ACL2 in", values, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2NotIn(List<String> values) {
            addCriterion("ACL2 not in", values, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2Between(String value1, String value2) {
            addCriterion("ACL2 between", value1, value2, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl2NotBetween(String value1, String value2) {
            addCriterion("ACL2 not between", value1, value2, "acl2");
            return (Criteria) this;
        }

        public Criteria andAcl6IsNull() {
            addCriterion("ACL6 is null");
            return (Criteria) this;
        }

        public Criteria andAcl6IsNotNull() {
            addCriterion("ACL6 is not null");
            return (Criteria) this;
        }

        public Criteria andAcl6EqualTo(String value) {
            addCriterion("ACL6 =", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6NotEqualTo(String value) {
            addCriterion("ACL6 <>", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6GreaterThan(String value) {
            addCriterion("ACL6 >", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6GreaterThanOrEqualTo(String value) {
            addCriterion("ACL6 >=", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6LessThan(String value) {
            addCriterion("ACL6 <", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6LessThanOrEqualTo(String value) {
            addCriterion("ACL6 <=", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6Like(String value) {
            addCriterion("ACL6 like", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6NotLike(String value) {
            addCriterion("ACL6 not like", value, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6In(List<String> values) {
            addCriterion("ACL6 in", values, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6NotIn(List<String> values) {
            addCriterion("ACL6 not in", values, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6Between(String value1, String value2) {
            addCriterion("ACL6 between", value1, value2, "acl6");
            return (Criteria) this;
        }

        public Criteria andAcl6NotBetween(String value1, String value2) {
            addCriterion("ACL6 not between", value1, value2, "acl6");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("JoinDate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("JoinDate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterion("JoinDate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterion("JoinDate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterion("JoinDate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterion("JoinDate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterion("JoinDate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterion("JoinDate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterion("JoinDate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterion("JoinDate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterion("JoinDate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterion("JoinDate not between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andFolkIsNull() {
            addCriterion("Folk is null");
            return (Criteria) this;
        }

        public Criteria andFolkIsNotNull() {
            addCriterion("Folk is not null");
            return (Criteria) this;
        }

        public Criteria andFolkEqualTo(String value) {
            addCriterion("Folk =", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotEqualTo(String value) {
            addCriterion("Folk <>", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThan(String value) {
            addCriterion("Folk >", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkGreaterThanOrEqualTo(String value) {
            addCriterion("Folk >=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThan(String value) {
            addCriterion("Folk <", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLessThanOrEqualTo(String value) {
            addCriterion("Folk <=", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkLike(String value) {
            addCriterion("Folk like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotLike(String value) {
            addCriterion("Folk not like", value, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkIn(List<String> values) {
            addCriterion("Folk in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotIn(List<String> values) {
            addCriterion("Folk not in", values, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkBetween(String value1, String value2) {
            addCriterion("Folk between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andFolkNotBetween(String value1, String value2) {
            addCriterion("Folk not between", value1, value2, "folk");
            return (Criteria) this;
        }

        public Criteria andPolityIsNull() {
            addCriterion("Polity is null");
            return (Criteria) this;
        }

        public Criteria andPolityIsNotNull() {
            addCriterion("Polity is not null");
            return (Criteria) this;
        }

        public Criteria andPolityEqualTo(String value) {
            addCriterion("Polity =", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotEqualTo(String value) {
            addCriterion("Polity <>", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityGreaterThan(String value) {
            addCriterion("Polity >", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityGreaterThanOrEqualTo(String value) {
            addCriterion("Polity >=", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLessThan(String value) {
            addCriterion("Polity <", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLessThanOrEqualTo(String value) {
            addCriterion("Polity <=", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLike(String value) {
            addCriterion("Polity like", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotLike(String value) {
            addCriterion("Polity not like", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityIn(List<String> values) {
            addCriterion("Polity in", values, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotIn(List<String> values) {
            addCriterion("Polity not in", values, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityBetween(String value1, String value2) {
            addCriterion("Polity between", value1, value2, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotBetween(String value1, String value2) {
            addCriterion("Polity not between", value1, value2, "polity");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNull() {
            addCriterion("Graduate is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("Graduate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(String value) {
            addCriterion("Graduate =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(String value) {
            addCriterion("Graduate <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(String value) {
            addCriterion("Graduate >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("Graduate >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(String value) {
            addCriterion("Graduate <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(String value) {
            addCriterion("Graduate <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLike(String value) {
            addCriterion("Graduate like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotLike(String value) {
            addCriterion("Graduate not like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<String> values) {
            addCriterion("Graduate in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<String> values) {
            addCriterion("Graduate not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(String value1, String value2) {
            addCriterion("Graduate between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(String value1, String value2) {
            addCriterion("Graduate not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andTechtitleIsNull() {
            addCriterion("TechTitle is null");
            return (Criteria) this;
        }

        public Criteria andTechtitleIsNotNull() {
            addCriterion("TechTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTechtitleEqualTo(String value) {
            addCriterion("TechTitle =", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleNotEqualTo(String value) {
            addCriterion("TechTitle <>", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleGreaterThan(String value) {
            addCriterion("TechTitle >", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleGreaterThanOrEqualTo(String value) {
            addCriterion("TechTitle >=", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleLessThan(String value) {
            addCriterion("TechTitle <", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleLessThanOrEqualTo(String value) {
            addCriterion("TechTitle <=", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleLike(String value) {
            addCriterion("TechTitle like", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleNotLike(String value) {
            addCriterion("TechTitle not like", value, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleIn(List<String> values) {
            addCriterion("TechTitle in", values, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleNotIn(List<String> values) {
            addCriterion("TechTitle not in", values, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleBetween(String value1, String value2) {
            addCriterion("TechTitle between", value1, value2, "techtitle");
            return (Criteria) this;
        }

        public Criteria andTechtitleNotBetween(String value1, String value2) {
            addCriterion("TechTitle not between", value1, value2, "techtitle");
            return (Criteria) this;
        }

        public Criteria andArchivesIsNull() {
            addCriterion("Archives is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIsNotNull() {
            addCriterion("Archives is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesEqualTo(String value) {
            addCriterion("Archives =", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotEqualTo(String value) {
            addCriterion("Archives <>", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesGreaterThan(String value) {
            addCriterion("Archives >", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesGreaterThanOrEqualTo(String value) {
            addCriterion("Archives >=", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLessThan(String value) {
            addCriterion("Archives <", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLessThanOrEqualTo(String value) {
            addCriterion("Archives <=", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLike(String value) {
            addCriterion("Archives like", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotLike(String value) {
            addCriterion("Archives not like", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesIn(List<String> values) {
            addCriterion("Archives in", values, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotIn(List<String> values) {
            addCriterion("Archives not in", values, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesBetween(String value1, String value2) {
            addCriterion("Archives between", value1, value2, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotBetween(String value1, String value2) {
            addCriterion("Archives not between", value1, value2, "archives");
            return (Criteria) this;
        }

        public Criteria andAcl4IsNull() {
            addCriterion("ACL4 is null");
            return (Criteria) this;
        }

        public Criteria andAcl4IsNotNull() {
            addCriterion("ACL4 is not null");
            return (Criteria) this;
        }

        public Criteria andAcl4EqualTo(String value) {
            addCriterion("ACL4 =", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4NotEqualTo(String value) {
            addCriterion("ACL4 <>", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4GreaterThan(String value) {
            addCriterion("ACL4 >", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4GreaterThanOrEqualTo(String value) {
            addCriterion("ACL4 >=", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4LessThan(String value) {
            addCriterion("ACL4 <", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4LessThanOrEqualTo(String value) {
            addCriterion("ACL4 <=", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4Like(String value) {
            addCriterion("ACL4 like", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4NotLike(String value) {
            addCriterion("ACL4 not like", value, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4In(List<String> values) {
            addCriterion("ACL4 in", values, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4NotIn(List<String> values) {
            addCriterion("ACL4 not in", values, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4Between(String value1, String value2) {
            addCriterion("ACL4 between", value1, value2, "acl4");
            return (Criteria) this;
        }

        public Criteria andAcl4NotBetween(String value1, String value2) {
            addCriterion("ACL4 not between", value1, value2, "acl4");
            return (Criteria) this;
        }

        public Criteria andIdioIsNull() {
            addCriterion("Idio is null");
            return (Criteria) this;
        }

        public Criteria andIdioIsNotNull() {
            addCriterion("Idio is not null");
            return (Criteria) this;
        }

        public Criteria andIdioEqualTo(String value) {
            addCriterion("Idio =", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioNotEqualTo(String value) {
            addCriterion("Idio <>", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioGreaterThan(String value) {
            addCriterion("Idio >", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioGreaterThanOrEqualTo(String value) {
            addCriterion("Idio >=", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioLessThan(String value) {
            addCriterion("Idio <", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioLessThanOrEqualTo(String value) {
            addCriterion("Idio <=", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioLike(String value) {
            addCriterion("Idio like", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioNotLike(String value) {
            addCriterion("Idio not like", value, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioIn(List<String> values) {
            addCriterion("Idio in", values, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioNotIn(List<String> values) {
            addCriterion("Idio not in", values, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioBetween(String value1, String value2) {
            addCriterion("Idio between", value1, value2, "idio");
            return (Criteria) this;
        }

        public Criteria andIdioNotBetween(String value1, String value2) {
            addCriterion("Idio not between", value1, value2, "idio");
            return (Criteria) this;
        }

        public Criteria andAwaydateIsNull() {
            addCriterion("AwayDate is null");
            return (Criteria) this;
        }

        public Criteria andAwaydateIsNotNull() {
            addCriterion("AwayDate is not null");
            return (Criteria) this;
        }

        public Criteria andAwaydateEqualTo(Date value) {
            addCriterion("AwayDate =", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateNotEqualTo(Date value) {
            addCriterion("AwayDate <>", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateGreaterThan(Date value) {
            addCriterion("AwayDate >", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("AwayDate >=", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateLessThan(Date value) {
            addCriterion("AwayDate <", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateLessThanOrEqualTo(Date value) {
            addCriterion("AwayDate <=", value, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateIn(List<Date> values) {
            addCriterion("AwayDate in", values, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateNotIn(List<Date> values) {
            addCriterion("AwayDate not in", values, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateBetween(Date value1, Date value2) {
            addCriterion("AwayDate between", value1, value2, "awaydate");
            return (Criteria) this;
        }

        public Criteria andAwaydateNotBetween(Date value1, Date value2) {
            addCriterion("AwayDate not between", value1, value2, "awaydate");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryIsNull() {
            addCriterion("FlagSalary is null");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryIsNotNull() {
            addCriterion("FlagSalary is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryEqualTo(Boolean value) {
            addCriterion("FlagSalary =", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryNotEqualTo(Boolean value) {
            addCriterion("FlagSalary <>", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryGreaterThan(Boolean value) {
            addCriterion("FlagSalary >", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagSalary >=", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryLessThan(Boolean value) {
            addCriterion("FlagSalary <", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagSalary <=", value, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryIn(List<Boolean> values) {
            addCriterion("FlagSalary in", values, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryNotIn(List<Boolean> values) {
            addCriterion("FlagSalary not in", values, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagSalary between", value1, value2, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andFlagsalaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagSalary not between", value1, value2, "flagsalary");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("Source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("Source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("Source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("Source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("Source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("Source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("Source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("Source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("Source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("Source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("Source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("Source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("Source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("Source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andDeptidsIsNull() {
            addCriterion("DeptIDS is null");
            return (Criteria) this;
        }

        public Criteria andDeptidsIsNotNull() {
            addCriterion("DeptIDS is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidsEqualTo(String value) {
            addCriterion("DeptIDS =", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsNotEqualTo(String value) {
            addCriterion("DeptIDS <>", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsGreaterThan(String value) {
            addCriterion("DeptIDS >", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsGreaterThanOrEqualTo(String value) {
            addCriterion("DeptIDS >=", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsLessThan(String value) {
            addCriterion("DeptIDS <", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsLessThanOrEqualTo(String value) {
            addCriterion("DeptIDS <=", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsLike(String value) {
            addCriterion("DeptIDS like", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsNotLike(String value) {
            addCriterion("DeptIDS not like", value, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsIn(List<String> values) {
            addCriterion("DeptIDS in", values, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsNotIn(List<String> values) {
            addCriterion("DeptIDS not in", values, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsBetween(String value1, String value2) {
            addCriterion("DeptIDS between", value1, value2, "deptids");
            return (Criteria) this;
        }

        public Criteria andDeptidsNotBetween(String value1, String value2) {
            addCriterion("DeptIDS not between", value1, value2, "deptids");
            return (Criteria) this;
        }

        public Criteria andEmpidsIsNull() {
            addCriterion("EmpIDS is null");
            return (Criteria) this;
        }

        public Criteria andEmpidsIsNotNull() {
            addCriterion("EmpIDS is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidsEqualTo(String value) {
            addCriterion("EmpIDS =", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsNotEqualTo(String value) {
            addCriterion("EmpIDS <>", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsGreaterThan(String value) {
            addCriterion("EmpIDS >", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsGreaterThanOrEqualTo(String value) {
            addCriterion("EmpIDS >=", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsLessThan(String value) {
            addCriterion("EmpIDS <", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsLessThanOrEqualTo(String value) {
            addCriterion("EmpIDS <=", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsLike(String value) {
            addCriterion("EmpIDS like", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsNotLike(String value) {
            addCriterion("EmpIDS not like", value, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsIn(List<String> values) {
            addCriterion("EmpIDS in", values, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsNotIn(List<String> values) {
            addCriterion("EmpIDS not in", values, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsBetween(String value1, String value2) {
            addCriterion("EmpIDS between", value1, value2, "empids");
            return (Criteria) this;
        }

        public Criteria andEmpidsNotBetween(String value1, String value2) {
            addCriterion("EmpIDS not between", value1, value2, "empids");
            return (Criteria) this;
        }

        public Criteria andDeptidzIsNull() {
            addCriterion("DeptIDZ is null");
            return (Criteria) this;
        }

        public Criteria andDeptidzIsNotNull() {
            addCriterion("DeptIDZ is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidzEqualTo(String value) {
            addCriterion("DeptIDZ =", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzNotEqualTo(String value) {
            addCriterion("DeptIDZ <>", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzGreaterThan(String value) {
            addCriterion("DeptIDZ >", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzGreaterThanOrEqualTo(String value) {
            addCriterion("DeptIDZ >=", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzLessThan(String value) {
            addCriterion("DeptIDZ <", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzLessThanOrEqualTo(String value) {
            addCriterion("DeptIDZ <=", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzLike(String value) {
            addCriterion("DeptIDZ like", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzNotLike(String value) {
            addCriterion("DeptIDZ not like", value, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzIn(List<String> values) {
            addCriterion("DeptIDZ in", values, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzNotIn(List<String> values) {
            addCriterion("DeptIDZ not in", values, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzBetween(String value1, String value2) {
            addCriterion("DeptIDZ between", value1, value2, "deptidz");
            return (Criteria) this;
        }

        public Criteria andDeptidzNotBetween(String value1, String value2) {
            addCriterion("DeptIDZ not between", value1, value2, "deptidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzIsNull() {
            addCriterion("EmpIDZ is null");
            return (Criteria) this;
        }

        public Criteria andEmpidzIsNotNull() {
            addCriterion("EmpIDZ is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidzEqualTo(String value) {
            addCriterion("EmpIDZ =", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzNotEqualTo(String value) {
            addCriterion("EmpIDZ <>", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzGreaterThan(String value) {
            addCriterion("EmpIDZ >", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzGreaterThanOrEqualTo(String value) {
            addCriterion("EmpIDZ >=", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzLessThan(String value) {
            addCriterion("EmpIDZ <", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzLessThanOrEqualTo(String value) {
            addCriterion("EmpIDZ <=", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzLike(String value) {
            addCriterion("EmpIDZ like", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzNotLike(String value) {
            addCriterion("EmpIDZ not like", value, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzIn(List<String> values) {
            addCriterion("EmpIDZ in", values, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzNotIn(List<String> values) {
            addCriterion("EmpIDZ not in", values, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzBetween(String value1, String value2) {
            addCriterion("EmpIDZ between", value1, value2, "empidz");
            return (Criteria) this;
        }

        public Criteria andEmpidzNotBetween(String value1, String value2) {
            addCriterion("EmpIDZ not between", value1, value2, "empidz");
            return (Criteria) this;
        }

        public Criteria andFlagrollretIsNull() {
            addCriterion("FlagRollRet is null");
            return (Criteria) this;
        }

        public Criteria andFlagrollretIsNotNull() {
            addCriterion("FlagRollRet is not null");
            return (Criteria) this;
        }

        public Criteria andFlagrollretEqualTo(Boolean value) {
            addCriterion("FlagRollRet =", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretNotEqualTo(Boolean value) {
            addCriterion("FlagRollRet <>", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretGreaterThan(Boolean value) {
            addCriterion("FlagRollRet >", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FlagRollRet >=", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretLessThan(Boolean value) {
            addCriterion("FlagRollRet <", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretLessThanOrEqualTo(Boolean value) {
            addCriterion("FlagRollRet <=", value, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretIn(List<Boolean> values) {
            addCriterion("FlagRollRet in", values, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretNotIn(List<Boolean> values) {
            addCriterion("FlagRollRet not in", values, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagRollRet between", value1, value2, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andFlagrollretNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FlagRollRet not between", value1, value2, "flagrollret");
            return (Criteria) this;
        }

        public Criteria andArrdateIsNull() {
            addCriterion("ArrDate is null");
            return (Criteria) this;
        }

        public Criteria andArrdateIsNotNull() {
            addCriterion("ArrDate is not null");
            return (Criteria) this;
        }

        public Criteria andArrdateEqualTo(Date value) {
            addCriterion("ArrDate =", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateNotEqualTo(Date value) {
            addCriterion("ArrDate <>", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateGreaterThan(Date value) {
            addCriterion("ArrDate >", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ArrDate >=", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateLessThan(Date value) {
            addCriterion("ArrDate <", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateLessThanOrEqualTo(Date value) {
            addCriterion("ArrDate <=", value, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateIn(List<Date> values) {
            addCriterion("ArrDate in", values, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateNotIn(List<Date> values) {
            addCriterion("ArrDate not in", values, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateBetween(Date value1, Date value2) {
            addCriterion("ArrDate between", value1, value2, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrdateNotBetween(Date value1, Date value2) {
            addCriterion("ArrDate not between", value1, value2, "arrdate");
            return (Criteria) this;
        }

        public Criteria andArrangeIsNull() {
            addCriterion("Arrange is null");
            return (Criteria) this;
        }

        public Criteria andArrangeIsNotNull() {
            addCriterion("Arrange is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeEqualTo(String value) {
            addCriterion("Arrange =", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotEqualTo(String value) {
            addCriterion("Arrange <>", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeGreaterThan(String value) {
            addCriterion("Arrange >", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeGreaterThanOrEqualTo(String value) {
            addCriterion("Arrange >=", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLessThan(String value) {
            addCriterion("Arrange <", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLessThanOrEqualTo(String value) {
            addCriterion("Arrange <=", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLike(String value) {
            addCriterion("Arrange like", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotLike(String value) {
            addCriterion("Arrange not like", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeIn(List<String> values) {
            addCriterion("Arrange in", values, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotIn(List<String> values) {
            addCriterion("Arrange not in", values, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeBetween(String value1, String value2) {
            addCriterion("Arrange between", value1, value2, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotBetween(String value1, String value2) {
            addCriterion("Arrange not between", value1, value2, "arrange");
            return (Criteria) this;
        }

        public Criteria andTigerIsNull() {
            addCriterion("Tiger is null");
            return (Criteria) this;
        }

        public Criteria andTigerIsNotNull() {
            addCriterion("Tiger is not null");
            return (Criteria) this;
        }

        public Criteria andTigerEqualTo(Double value) {
            addCriterion("Tiger =", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerNotEqualTo(Double value) {
            addCriterion("Tiger <>", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerGreaterThan(Double value) {
            addCriterion("Tiger >", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerGreaterThanOrEqualTo(Double value) {
            addCriterion("Tiger >=", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerLessThan(Double value) {
            addCriterion("Tiger <", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerLessThanOrEqualTo(Double value) {
            addCriterion("Tiger <=", value, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerIn(List<Double> values) {
            addCriterion("Tiger in", values, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerNotIn(List<Double> values) {
            addCriterion("Tiger not in", values, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerBetween(Double value1, Double value2) {
            addCriterion("Tiger between", value1, value2, "tiger");
            return (Criteria) this;
        }

        public Criteria andTigerNotBetween(Double value1, Double value2) {
            addCriterion("Tiger not between", value1, value2, "tiger");
            return (Criteria) this;
        }

        public Criteria andAcl3rIsNull() {
            addCriterion("ACL3R is null");
            return (Criteria) this;
        }

        public Criteria andAcl3rIsNotNull() {
            addCriterion("ACL3R is not null");
            return (Criteria) this;
        }

        public Criteria andAcl3rEqualTo(String value) {
            addCriterion("ACL3R =", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rNotEqualTo(String value) {
            addCriterion("ACL3R <>", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rGreaterThan(String value) {
            addCriterion("ACL3R >", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rGreaterThanOrEqualTo(String value) {
            addCriterion("ACL3R >=", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rLessThan(String value) {
            addCriterion("ACL3R <", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rLessThanOrEqualTo(String value) {
            addCriterion("ACL3R <=", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rLike(String value) {
            addCriterion("ACL3R like", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rNotLike(String value) {
            addCriterion("ACL3R not like", value, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rIn(List<String> values) {
            addCriterion("ACL3R in", values, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rNotIn(List<String> values) {
            addCriterion("ACL3R not in", values, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rBetween(String value1, String value2) {
            addCriterion("ACL3R between", value1, value2, "acl3r");
            return (Criteria) this;
        }

        public Criteria andAcl3rNotBetween(String value1, String value2) {
            addCriterion("ACL3R not between", value1, value2, "acl3r");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBankacctIsNull() {
            addCriterion("BankAcct is null");
            return (Criteria) this;
        }

        public Criteria andBankacctIsNotNull() {
            addCriterion("BankAcct is not null");
            return (Criteria) this;
        }

        public Criteria andBankacctEqualTo(String value) {
            addCriterion("BankAcct =", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotEqualTo(String value) {
            addCriterion("BankAcct <>", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctGreaterThan(String value) {
            addCriterion("BankAcct >", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctGreaterThanOrEqualTo(String value) {
            addCriterion("BankAcct >=", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLessThan(String value) {
            addCriterion("BankAcct <", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLessThanOrEqualTo(String value) {
            addCriterion("BankAcct <=", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctLike(String value) {
            addCriterion("BankAcct like", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotLike(String value) {
            addCriterion("BankAcct not like", value, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctIn(List<String> values) {
            addCriterion("BankAcct in", values, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotIn(List<String> values) {
            addCriterion("BankAcct not in", values, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctBetween(String value1, String value2) {
            addCriterion("BankAcct between", value1, value2, "bankacct");
            return (Criteria) this;
        }

        public Criteria andBankacctNotBetween(String value1, String value2) {
            addCriterion("BankAcct not between", value1, value2, "bankacct");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("PhotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("PhotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("PhotoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("PhotoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("PhotoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("PhotoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("PhotoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("PhotoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("PhotoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("PhotoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("PhotoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("PhotoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("PhotoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIsNull() {
            addCriterion("PassWordWeb is null");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIsNotNull() {
            addCriterion("PassWordWeb is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordwebEqualTo(String value) {
            addCriterion("PassWordWeb =", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotEqualTo(String value) {
            addCriterion("PassWordWeb <>", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebGreaterThan(String value) {
            addCriterion("PassWordWeb >", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebGreaterThanOrEqualTo(String value) {
            addCriterion("PassWordWeb >=", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLessThan(String value) {
            addCriterion("PassWordWeb <", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLessThanOrEqualTo(String value) {
            addCriterion("PassWordWeb <=", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebLike(String value) {
            addCriterion("PassWordWeb like", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotLike(String value) {
            addCriterion("PassWordWeb not like", value, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebIn(List<String> values) {
            addCriterion("PassWordWeb in", values, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotIn(List<String> values) {
            addCriterion("PassWordWeb not in", values, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebBetween(String value1, String value2) {
            addCriterion("PassWordWeb between", value1, value2, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andPasswordwebNotBetween(String value1, String value2) {
            addCriterion("PassWordWeb not between", value1, value2, "passwordweb");
            return (Criteria) this;
        }

        public Criteria andTargetdIsNull() {
            addCriterion("TargetD is null");
            return (Criteria) this;
        }

        public Criteria andTargetdIsNotNull() {
            addCriterion("TargetD is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdEqualTo(String value) {
            addCriterion("TargetD =", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdNotEqualTo(String value) {
            addCriterion("TargetD <>", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdGreaterThan(String value) {
            addCriterion("TargetD >", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdGreaterThanOrEqualTo(String value) {
            addCriterion("TargetD >=", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdLessThan(String value) {
            addCriterion("TargetD <", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdLessThanOrEqualTo(String value) {
            addCriterion("TargetD <=", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdLike(String value) {
            addCriterion("TargetD like", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdNotLike(String value) {
            addCriterion("TargetD not like", value, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdIn(List<String> values) {
            addCriterion("TargetD in", values, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdNotIn(List<String> values) {
            addCriterion("TargetD not in", values, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdBetween(String value1, String value2) {
            addCriterion("TargetD between", value1, value2, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetdNotBetween(String value1, String value2) {
            addCriterion("TargetD not between", value1, value2, "targetd");
            return (Criteria) this;
        }

        public Criteria andTargetwIsNull() {
            addCriterion("TargetW is null");
            return (Criteria) this;
        }

        public Criteria andTargetwIsNotNull() {
            addCriterion("TargetW is not null");
            return (Criteria) this;
        }

        public Criteria andTargetwEqualTo(String value) {
            addCriterion("TargetW =", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwNotEqualTo(String value) {
            addCriterion("TargetW <>", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwGreaterThan(String value) {
            addCriterion("TargetW >", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwGreaterThanOrEqualTo(String value) {
            addCriterion("TargetW >=", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwLessThan(String value) {
            addCriterion("TargetW <", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwLessThanOrEqualTo(String value) {
            addCriterion("TargetW <=", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwLike(String value) {
            addCriterion("TargetW like", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwNotLike(String value) {
            addCriterion("TargetW not like", value, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwIn(List<String> values) {
            addCriterion("TargetW in", values, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwNotIn(List<String> values) {
            addCriterion("TargetW not in", values, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwBetween(String value1, String value2) {
            addCriterion("TargetW between", value1, value2, "targetw");
            return (Criteria) this;
        }

        public Criteria andTargetwNotBetween(String value1, String value2) {
            addCriterion("TargetW not between", value1, value2, "targetw");
            return (Criteria) this;
        }

        public Criteria andCellphoneidIsNull() {
            addCriterion("CellPhoneID is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneidIsNotNull() {
            addCriterion("CellPhoneID is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneidEqualTo(String value) {
            addCriterion("CellPhoneID =", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidNotEqualTo(String value) {
            addCriterion("CellPhoneID <>", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidGreaterThan(String value) {
            addCriterion("CellPhoneID >", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidGreaterThanOrEqualTo(String value) {
            addCriterion("CellPhoneID >=", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidLessThan(String value) {
            addCriterion("CellPhoneID <", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidLessThanOrEqualTo(String value) {
            addCriterion("CellPhoneID <=", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidLike(String value) {
            addCriterion("CellPhoneID like", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidNotLike(String value) {
            addCriterion("CellPhoneID not like", value, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidIn(List<String> values) {
            addCriterion("CellPhoneID in", values, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidNotIn(List<String> values) {
            addCriterion("CellPhoneID not in", values, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidBetween(String value1, String value2) {
            addCriterion("CellPhoneID between", value1, value2, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andCellphoneidNotBetween(String value1, String value2) {
            addCriterion("CellPhoneID not between", value1, value2, "cellphoneid");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeIsNull() {
            addCriterion("PersonalAuthCode is null");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeIsNotNull() {
            addCriterion("PersonalAuthCode is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeEqualTo(String value) {
            addCriterion("PersonalAuthCode =", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeNotEqualTo(String value) {
            addCriterion("PersonalAuthCode <>", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeGreaterThan(String value) {
            addCriterion("PersonalAuthCode >", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PersonalAuthCode >=", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeLessThan(String value) {
            addCriterion("PersonalAuthCode <", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeLessThanOrEqualTo(String value) {
            addCriterion("PersonalAuthCode <=", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeLike(String value) {
            addCriterion("PersonalAuthCode like", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeNotLike(String value) {
            addCriterion("PersonalAuthCode not like", value, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeIn(List<String> values) {
            addCriterion("PersonalAuthCode in", values, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeNotIn(List<String> values) {
            addCriterion("PersonalAuthCode not in", values, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeBetween(String value1, String value2) {
            addCriterion("PersonalAuthCode between", value1, value2, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andPersonalauthcodeNotBetween(String value1, String value2) {
            addCriterion("PersonalAuthCode not between", value1, value2, "personalauthcode");
            return (Criteria) this;
        }

        public Criteria andNativetIsNull() {
            addCriterion("NativeT is null");
            return (Criteria) this;
        }

        public Criteria andNativetIsNotNull() {
            addCriterion("NativeT is not null");
            return (Criteria) this;
        }

        public Criteria andNativetEqualTo(String value) {
            addCriterion("NativeT =", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetNotEqualTo(String value) {
            addCriterion("NativeT <>", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetGreaterThan(String value) {
            addCriterion("NativeT >", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetGreaterThanOrEqualTo(String value) {
            addCriterion("NativeT >=", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetLessThan(String value) {
            addCriterion("NativeT <", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetLessThanOrEqualTo(String value) {
            addCriterion("NativeT <=", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetLike(String value) {
            addCriterion("NativeT like", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetNotLike(String value) {
            addCriterion("NativeT not like", value, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetIn(List<String> values) {
            addCriterion("NativeT in", values, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetNotIn(List<String> values) {
            addCriterion("NativeT not in", values, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetBetween(String value1, String value2) {
            addCriterion("NativeT between", value1, value2, "nativet");
            return (Criteria) this;
        }

        public Criteria andNativetNotBetween(String value1, String value2) {
            addCriterion("NativeT not between", value1, value2, "nativet");
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