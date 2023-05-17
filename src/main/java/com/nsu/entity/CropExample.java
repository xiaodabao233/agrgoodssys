package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CropExample() {
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

        public Criteria andLandidIsNull() {
            addCriterion("landid is null");
            return (Criteria) this;
        }

        public Criteria andLandidIsNotNull() {
            addCriterion("landid is not null");
            return (Criteria) this;
        }

        public Criteria andLandidEqualTo(String value) {
            addCriterion("landid =", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotEqualTo(String value) {
            addCriterion("landid <>", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidGreaterThan(String value) {
            addCriterion("landid >", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidGreaterThanOrEqualTo(String value) {
            addCriterion("landid >=", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidLessThan(String value) {
            addCriterion("landid <", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidLessThanOrEqualTo(String value) {
            addCriterion("landid <=", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidLike(String value) {
            addCriterion("landid like", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotLike(String value) {
            addCriterion("landid not like", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidIn(List<String> values) {
            addCriterion("landid in", values, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotIn(List<String> values) {
            addCriterion("landid not in", values, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidBetween(String value1, String value2) {
            addCriterion("landid between", value1, value2, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotBetween(String value1, String value2) {
            addCriterion("landid not between", value1, value2, "landid");
            return (Criteria) this;
        }

        public Criteria andSeedidIsNull() {
            addCriterion("seedid is null");
            return (Criteria) this;
        }

        public Criteria andSeedidIsNotNull() {
            addCriterion("seedid is not null");
            return (Criteria) this;
        }

        public Criteria andSeedidEqualTo(String value) {
            addCriterion("seedid =", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidNotEqualTo(String value) {
            addCriterion("seedid <>", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidGreaterThan(String value) {
            addCriterion("seedid >", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidGreaterThanOrEqualTo(String value) {
            addCriterion("seedid >=", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidLessThan(String value) {
            addCriterion("seedid <", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidLessThanOrEqualTo(String value) {
            addCriterion("seedid <=", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidLike(String value) {
            addCriterion("seedid like", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidNotLike(String value) {
            addCriterion("seedid not like", value, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidIn(List<String> values) {
            addCriterion("seedid in", values, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidNotIn(List<String> values) {
            addCriterion("seedid not in", values, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidBetween(String value1, String value2) {
            addCriterion("seedid between", value1, value2, "seedid");
            return (Criteria) this;
        }

        public Criteria andSeedidNotBetween(String value1, String value2) {
            addCriterion("seedid not between", value1, value2, "seedid");
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

        public Criteria andStstusIsNull() {
            addCriterion("ststus is null");
            return (Criteria) this;
        }

        public Criteria andStstusIsNotNull() {
            addCriterion("ststus is not null");
            return (Criteria) this;
        }

        public Criteria andStstusEqualTo(Integer value) {
            addCriterion("ststus =", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotEqualTo(Integer value) {
            addCriterion("ststus <>", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusGreaterThan(Integer value) {
            addCriterion("ststus >", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ststus >=", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusLessThan(Integer value) {
            addCriterion("ststus <", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusLessThanOrEqualTo(Integer value) {
            addCriterion("ststus <=", value, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusIn(List<Integer> values) {
            addCriterion("ststus in", values, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotIn(List<Integer> values) {
            addCriterion("ststus not in", values, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusBetween(Integer value1, Integer value2) {
            addCriterion("ststus between", value1, value2, "ststus");
            return (Criteria) this;
        }

        public Criteria andStstusNotBetween(Integer value1, Integer value2) {
            addCriterion("ststus not between", value1, value2, "ststus");
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