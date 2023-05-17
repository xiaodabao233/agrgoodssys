package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgrInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgrInfoExample() {
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

        public Criteria andAgridIsNull() {
            addCriterion("agrid is null");
            return (Criteria) this;
        }

        public Criteria andAgridIsNotNull() {
            addCriterion("agrid is not null");
            return (Criteria) this;
        }

        public Criteria andAgridEqualTo(String value) {
            addCriterion("agrid =", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridNotEqualTo(String value) {
            addCriterion("agrid <>", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridGreaterThan(String value) {
            addCriterion("agrid >", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridGreaterThanOrEqualTo(String value) {
            addCriterion("agrid >=", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridLessThan(String value) {
            addCriterion("agrid <", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridLessThanOrEqualTo(String value) {
            addCriterion("agrid <=", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridLike(String value) {
            addCriterion("agrid like", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridNotLike(String value) {
            addCriterion("agrid not like", value, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridIn(List<String> values) {
            addCriterion("agrid in", values, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridNotIn(List<String> values) {
            addCriterion("agrid not in", values, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridBetween(String value1, String value2) {
            addCriterion("agrid between", value1, value2, "agrid");
            return (Criteria) this;
        }

        public Criteria andAgridNotBetween(String value1, String value2) {
            addCriterion("agrid not between", value1, value2, "agrid");
            return (Criteria) this;
        }

        public Criteria andCropidIsNull() {
            addCriterion("cropid is null");
            return (Criteria) this;
        }

        public Criteria andCropidIsNotNull() {
            addCriterion("cropid is not null");
            return (Criteria) this;
        }

        public Criteria andCropidEqualTo(String value) {
            addCriterion("cropid =", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotEqualTo(String value) {
            addCriterion("cropid <>", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidGreaterThan(String value) {
            addCriterion("cropid >", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidGreaterThanOrEqualTo(String value) {
            addCriterion("cropid >=", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidLessThan(String value) {
            addCriterion("cropid <", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidLessThanOrEqualTo(String value) {
            addCriterion("cropid <=", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidLike(String value) {
            addCriterion("cropid like", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotLike(String value) {
            addCriterion("cropid not like", value, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidIn(List<String> values) {
            addCriterion("cropid in", values, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotIn(List<String> values) {
            addCriterion("cropid not in", values, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidBetween(String value1, String value2) {
            addCriterion("cropid between", value1, value2, "cropid");
            return (Criteria) this;
        }

        public Criteria andCropidNotBetween(String value1, String value2) {
            addCriterion("cropid not between", value1, value2, "cropid");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNull() {
            addCriterion("storagenum is null");
            return (Criteria) this;
        }

        public Criteria andStoragenumIsNotNull() {
            addCriterion("storagenum is not null");
            return (Criteria) this;
        }

        public Criteria andStoragenumEqualTo(Double value) {
            addCriterion("storagenum =", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotEqualTo(Double value) {
            addCriterion("storagenum <>", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThan(Double value) {
            addCriterion("storagenum >", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumGreaterThanOrEqualTo(Double value) {
            addCriterion("storagenum >=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThan(Double value) {
            addCriterion("storagenum <", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumLessThanOrEqualTo(Double value) {
            addCriterion("storagenum <=", value, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumIn(List<Double> values) {
            addCriterion("storagenum in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotIn(List<Double> values) {
            addCriterion("storagenum not in", values, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumBetween(Double value1, Double value2) {
            addCriterion("storagenum between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andStoragenumNotBetween(Double value1, Double value2) {
            addCriterion("storagenum not between", value1, value2, "storagenum");
            return (Criteria) this;
        }

        public Criteria andInnumIsNull() {
            addCriterion("innum is null");
            return (Criteria) this;
        }

        public Criteria andInnumIsNotNull() {
            addCriterion("innum is not null");
            return (Criteria) this;
        }

        public Criteria andInnumEqualTo(Double value) {
            addCriterion("innum =", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotEqualTo(Double value) {
            addCriterion("innum <>", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThan(Double value) {
            addCriterion("innum >", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumGreaterThanOrEqualTo(Double value) {
            addCriterion("innum >=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThan(Double value) {
            addCriterion("innum <", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumLessThanOrEqualTo(Double value) {
            addCriterion("innum <=", value, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumIn(List<Double> values) {
            addCriterion("innum in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotIn(List<Double> values) {
            addCriterion("innum not in", values, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumBetween(Double value1, Double value2) {
            addCriterion("innum between", value1, value2, "innum");
            return (Criteria) this;
        }

        public Criteria andInnumNotBetween(Double value1, Double value2) {
            addCriterion("innum not between", value1, value2, "innum");
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