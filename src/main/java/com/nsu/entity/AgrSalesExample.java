package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgrSalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgrSalesExample() {
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

        public Criteria andAgroutidIsNull() {
            addCriterion("agroutid is null");
            return (Criteria) this;
        }

        public Criteria andAgroutidIsNotNull() {
            addCriterion("agroutid is not null");
            return (Criteria) this;
        }

        public Criteria andAgroutidEqualTo(String value) {
            addCriterion("agroutid =", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidNotEqualTo(String value) {
            addCriterion("agroutid <>", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidGreaterThan(String value) {
            addCriterion("agroutid >", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidGreaterThanOrEqualTo(String value) {
            addCriterion("agroutid >=", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidLessThan(String value) {
            addCriterion("agroutid <", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidLessThanOrEqualTo(String value) {
            addCriterion("agroutid <=", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidLike(String value) {
            addCriterion("agroutid like", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidNotLike(String value) {
            addCriterion("agroutid not like", value, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidIn(List<String> values) {
            addCriterion("agroutid in", values, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidNotIn(List<String> values) {
            addCriterion("agroutid not in", values, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidBetween(String value1, String value2) {
            addCriterion("agroutid between", value1, value2, "agroutid");
            return (Criteria) this;
        }

        public Criteria andAgroutidNotBetween(String value1, String value2) {
            addCriterion("agroutid not between", value1, value2, "agroutid");
            return (Criteria) this;
        }

        public Criteria andOutnumIsNull() {
            addCriterion("outnum is null");
            return (Criteria) this;
        }

        public Criteria andOutnumIsNotNull() {
            addCriterion("outnum is not null");
            return (Criteria) this;
        }

        public Criteria andOutnumEqualTo(Double value) {
            addCriterion("outnum =", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotEqualTo(Double value) {
            addCriterion("outnum <>", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThan(Double value) {
            addCriterion("outnum >", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumGreaterThanOrEqualTo(Double value) {
            addCriterion("outnum >=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThan(Double value) {
            addCriterion("outnum <", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumLessThanOrEqualTo(Double value) {
            addCriterion("outnum <=", value, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumIn(List<Double> values) {
            addCriterion("outnum in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotIn(List<Double> values) {
            addCriterion("outnum not in", values, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumBetween(Double value1, Double value2) {
            addCriterion("outnum between", value1, value2, "outnum");
            return (Criteria) this;
        }

        public Criteria andOutnumNotBetween(Double value1, Double value2) {
            addCriterion("outnum not between", value1, value2, "outnum");
            return (Criteria) this;
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