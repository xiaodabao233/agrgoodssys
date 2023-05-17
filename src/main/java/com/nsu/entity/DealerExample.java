package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDistributoridIsNull() {
            addCriterion("distributorid is null");
            return (Criteria) this;
        }

        public Criteria andDistributoridIsNotNull() {
            addCriterion("distributorid is not null");
            return (Criteria) this;
        }

        public Criteria andDistributoridEqualTo(String value) {
            addCriterion("distributorid =", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridNotEqualTo(String value) {
            addCriterion("distributorid <>", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridGreaterThan(String value) {
            addCriterion("distributorid >", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridGreaterThanOrEqualTo(String value) {
            addCriterion("distributorid >=", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridLessThan(String value) {
            addCriterion("distributorid <", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridLessThanOrEqualTo(String value) {
            addCriterion("distributorid <=", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridLike(String value) {
            addCriterion("distributorid like", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridNotLike(String value) {
            addCriterion("distributorid not like", value, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridIn(List<String> values) {
            addCriterion("distributorid in", values, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridNotIn(List<String> values) {
            addCriterion("distributorid not in", values, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridBetween(String value1, String value2) {
            addCriterion("distributorid between", value1, value2, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributoridNotBetween(String value1, String value2) {
            addCriterion("distributorid not between", value1, value2, "distributorid");
            return (Criteria) this;
        }

        public Criteria andDistributornameIsNull() {
            addCriterion("distributorname is null");
            return (Criteria) this;
        }

        public Criteria andDistributornameIsNotNull() {
            addCriterion("distributorname is not null");
            return (Criteria) this;
        }

        public Criteria andDistributornameEqualTo(String value) {
            addCriterion("distributorname =", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameNotEqualTo(String value) {
            addCriterion("distributorname <>", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameGreaterThan(String value) {
            addCriterion("distributorname >", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameGreaterThanOrEqualTo(String value) {
            addCriterion("distributorname >=", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameLessThan(String value) {
            addCriterion("distributorname <", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameLessThanOrEqualTo(String value) {
            addCriterion("distributorname <=", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameLike(String value) {
            addCriterion("distributorname like", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameNotLike(String value) {
            addCriterion("distributorname not like", value, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameIn(List<String> values) {
            addCriterion("distributorname in", values, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameNotIn(List<String> values) {
            addCriterion("distributorname not in", values, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameBetween(String value1, String value2) {
            addCriterion("distributorname between", value1, value2, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributornameNotBetween(String value1, String value2) {
            addCriterion("distributorname not between", value1, value2, "distributorname");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressIsNull() {
            addCriterion("distributoraddress is null");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressIsNotNull() {
            addCriterion("distributoraddress is not null");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressEqualTo(String value) {
            addCriterion("distributoraddress =", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressNotEqualTo(String value) {
            addCriterion("distributoraddress <>", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressGreaterThan(String value) {
            addCriterion("distributoraddress >", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressGreaterThanOrEqualTo(String value) {
            addCriterion("distributoraddress >=", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressLessThan(String value) {
            addCriterion("distributoraddress <", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressLessThanOrEqualTo(String value) {
            addCriterion("distributoraddress <=", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressLike(String value) {
            addCriterion("distributoraddress like", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressNotLike(String value) {
            addCriterion("distributoraddress not like", value, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressIn(List<String> values) {
            addCriterion("distributoraddress in", values, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressNotIn(List<String> values) {
            addCriterion("distributoraddress not in", values, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressBetween(String value1, String value2) {
            addCriterion("distributoraddress between", value1, value2, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andDistributoraddressNotBetween(String value1, String value2) {
            addCriterion("distributoraddress not between", value1, value2, "distributoraddress");
            return (Criteria) this;
        }

        public Criteria andConcatpersonIsNull() {
            addCriterion("concatperson is null");
            return (Criteria) this;
        }

        public Criteria andConcatpersonIsNotNull() {
            addCriterion("concatperson is not null");
            return (Criteria) this;
        }

        public Criteria andConcatpersonEqualTo(String value) {
            addCriterion("concatperson =", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonNotEqualTo(String value) {
            addCriterion("concatperson <>", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonGreaterThan(String value) {
            addCriterion("concatperson >", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonGreaterThanOrEqualTo(String value) {
            addCriterion("concatperson >=", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonLessThan(String value) {
            addCriterion("concatperson <", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonLessThanOrEqualTo(String value) {
            addCriterion("concatperson <=", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonLike(String value) {
            addCriterion("concatperson like", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonNotLike(String value) {
            addCriterion("concatperson not like", value, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonIn(List<String> values) {
            addCriterion("concatperson in", values, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonNotIn(List<String> values) {
            addCriterion("concatperson not in", values, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonBetween(String value1, String value2) {
            addCriterion("concatperson between", value1, value2, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatpersonNotBetween(String value1, String value2) {
            addCriterion("concatperson not between", value1, value2, "concatperson");
            return (Criteria) this;
        }

        public Criteria andConcatmethodIsNull() {
            addCriterion("concatmethod is null");
            return (Criteria) this;
        }

        public Criteria andConcatmethodIsNotNull() {
            addCriterion("concatmethod is not null");
            return (Criteria) this;
        }

        public Criteria andConcatmethodEqualTo(String value) {
            addCriterion("concatmethod =", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodNotEqualTo(String value) {
            addCriterion("concatmethod <>", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodGreaterThan(String value) {
            addCriterion("concatmethod >", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodGreaterThanOrEqualTo(String value) {
            addCriterion("concatmethod >=", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodLessThan(String value) {
            addCriterion("concatmethod <", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodLessThanOrEqualTo(String value) {
            addCriterion("concatmethod <=", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodLike(String value) {
            addCriterion("concatmethod like", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodNotLike(String value) {
            addCriterion("concatmethod not like", value, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodIn(List<String> values) {
            addCriterion("concatmethod in", values, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodNotIn(List<String> values) {
            addCriterion("concatmethod not in", values, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodBetween(String value1, String value2) {
            addCriterion("concatmethod between", value1, value2, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andConcatmethodNotBetween(String value1, String value2) {
            addCriterion("concatmethod not between", value1, value2, "concatmethod");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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