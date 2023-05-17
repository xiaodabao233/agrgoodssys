package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LandInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LandInfoExample() {
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

        public Criteria andParkidIsNull() {
            addCriterion("parkid is null");
            return (Criteria) this;
        }

        public Criteria andParkidIsNotNull() {
            addCriterion("parkid is not null");
            return (Criteria) this;
        }

        public Criteria andParkidEqualTo(String value) {
            addCriterion("parkid =", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotEqualTo(String value) {
            addCriterion("parkid <>", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThan(String value) {
            addCriterion("parkid >", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidGreaterThanOrEqualTo(String value) {
            addCriterion("parkid >=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThan(String value) {
            addCriterion("parkid <", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLessThanOrEqualTo(String value) {
            addCriterion("parkid <=", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidLike(String value) {
            addCriterion("parkid like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotLike(String value) {
            addCriterion("parkid not like", value, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidIn(List<String> values) {
            addCriterion("parkid in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotIn(List<String> values) {
            addCriterion("parkid not in", values, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidBetween(String value1, String value2) {
            addCriterion("parkid between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andParkidNotBetween(String value1, String value2) {
            addCriterion("parkid not between", value1, value2, "parkid");
            return (Criteria) this;
        }

        public Criteria andLandnumIsNull() {
            addCriterion("landnum is null");
            return (Criteria) this;
        }

        public Criteria andLandnumIsNotNull() {
            addCriterion("landnum is not null");
            return (Criteria) this;
        }

        public Criteria andLandnumEqualTo(String value) {
            addCriterion("landnum =", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumNotEqualTo(String value) {
            addCriterion("landnum <>", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumGreaterThan(String value) {
            addCriterion("landnum >", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumGreaterThanOrEqualTo(String value) {
            addCriterion("landnum >=", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumLessThan(String value) {
            addCriterion("landnum <", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumLessThanOrEqualTo(String value) {
            addCriterion("landnum <=", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumLike(String value) {
            addCriterion("landnum like", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumNotLike(String value) {
            addCriterion("landnum not like", value, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumIn(List<String> values) {
            addCriterion("landnum in", values, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumNotIn(List<String> values) {
            addCriterion("landnum not in", values, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumBetween(String value1, String value2) {
            addCriterion("landnum between", value1, value2, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnumNotBetween(String value1, String value2) {
            addCriterion("landnum not between", value1, value2, "landnum");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNull() {
            addCriterion("landname is null");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNotNull() {
            addCriterion("landname is not null");
            return (Criteria) this;
        }

        public Criteria andLandnameEqualTo(String value) {
            addCriterion("landname =", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotEqualTo(String value) {
            addCriterion("landname <>", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThan(String value) {
            addCriterion("landname >", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThanOrEqualTo(String value) {
            addCriterion("landname >=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThan(String value) {
            addCriterion("landname <", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThanOrEqualTo(String value) {
            addCriterion("landname <=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLike(String value) {
            addCriterion("landname like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotLike(String value) {
            addCriterion("landname not like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameIn(List<String> values) {
            addCriterion("landname in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotIn(List<String> values) {
            addCriterion("landname not in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameBetween(String value1, String value2) {
            addCriterion("landname between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotBetween(String value1, String value2) {
            addCriterion("landname not between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andLandeIsNull() {
            addCriterion("lande is null");
            return (Criteria) this;
        }

        public Criteria andLandeIsNotNull() {
            addCriterion("lande is not null");
            return (Criteria) this;
        }

        public Criteria andLandeEqualTo(String value) {
            addCriterion("lande =", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeNotEqualTo(String value) {
            addCriterion("lande <>", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeGreaterThan(String value) {
            addCriterion("lande >", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeGreaterThanOrEqualTo(String value) {
            addCriterion("lande >=", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeLessThan(String value) {
            addCriterion("lande <", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeLessThanOrEqualTo(String value) {
            addCriterion("lande <=", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeLike(String value) {
            addCriterion("lande like", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeNotLike(String value) {
            addCriterion("lande not like", value, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeIn(List<String> values) {
            addCriterion("lande in", values, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeNotIn(List<String> values) {
            addCriterion("lande not in", values, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeBetween(String value1, String value2) {
            addCriterion("lande between", value1, value2, "lande");
            return (Criteria) this;
        }

        public Criteria andLandeNotBetween(String value1, String value2) {
            addCriterion("lande not between", value1, value2, "lande");
            return (Criteria) this;
        }

        public Criteria andLandwIsNull() {
            addCriterion("landw is null");
            return (Criteria) this;
        }

        public Criteria andLandwIsNotNull() {
            addCriterion("landw is not null");
            return (Criteria) this;
        }

        public Criteria andLandwEqualTo(String value) {
            addCriterion("landw =", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwNotEqualTo(String value) {
            addCriterion("landw <>", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwGreaterThan(String value) {
            addCriterion("landw >", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwGreaterThanOrEqualTo(String value) {
            addCriterion("landw >=", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwLessThan(String value) {
            addCriterion("landw <", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwLessThanOrEqualTo(String value) {
            addCriterion("landw <=", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwLike(String value) {
            addCriterion("landw like", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwNotLike(String value) {
            addCriterion("landw not like", value, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwIn(List<String> values) {
            addCriterion("landw in", values, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwNotIn(List<String> values) {
            addCriterion("landw not in", values, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwBetween(String value1, String value2) {
            addCriterion("landw between", value1, value2, "landw");
            return (Criteria) this;
        }

        public Criteria andLandwNotBetween(String value1, String value2) {
            addCriterion("landw not between", value1, value2, "landw");
            return (Criteria) this;
        }

        public Criteria andLandsIsNull() {
            addCriterion("lands is null");
            return (Criteria) this;
        }

        public Criteria andLandsIsNotNull() {
            addCriterion("lands is not null");
            return (Criteria) this;
        }

        public Criteria andLandsEqualTo(String value) {
            addCriterion("lands =", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsNotEqualTo(String value) {
            addCriterion("lands <>", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsGreaterThan(String value) {
            addCriterion("lands >", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsGreaterThanOrEqualTo(String value) {
            addCriterion("lands >=", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsLessThan(String value) {
            addCriterion("lands <", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsLessThanOrEqualTo(String value) {
            addCriterion("lands <=", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsLike(String value) {
            addCriterion("lands like", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsNotLike(String value) {
            addCriterion("lands not like", value, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsIn(List<String> values) {
            addCriterion("lands in", values, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsNotIn(List<String> values) {
            addCriterion("lands not in", values, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsBetween(String value1, String value2) {
            addCriterion("lands between", value1, value2, "lands");
            return (Criteria) this;
        }

        public Criteria andLandsNotBetween(String value1, String value2) {
            addCriterion("lands not between", value1, value2, "lands");
            return (Criteria) this;
        }

        public Criteria andLandnIsNull() {
            addCriterion("landn is null");
            return (Criteria) this;
        }

        public Criteria andLandnIsNotNull() {
            addCriterion("landn is not null");
            return (Criteria) this;
        }

        public Criteria andLandnEqualTo(String value) {
            addCriterion("landn =", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnNotEqualTo(String value) {
            addCriterion("landn <>", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnGreaterThan(String value) {
            addCriterion("landn >", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnGreaterThanOrEqualTo(String value) {
            addCriterion("landn >=", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnLessThan(String value) {
            addCriterion("landn <", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnLessThanOrEqualTo(String value) {
            addCriterion("landn <=", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnLike(String value) {
            addCriterion("landn like", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnNotLike(String value) {
            addCriterion("landn not like", value, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnIn(List<String> values) {
            addCriterion("landn in", values, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnNotIn(List<String> values) {
            addCriterion("landn not in", values, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnBetween(String value1, String value2) {
            addCriterion("landn between", value1, value2, "landn");
            return (Criteria) this;
        }

        public Criteria andLandnNotBetween(String value1, String value2) {
            addCriterion("landn not between", value1, value2, "landn");
            return (Criteria) this;
        }

        public Criteria andLandsizeIsNull() {
            addCriterion("landsize is null");
            return (Criteria) this;
        }

        public Criteria andLandsizeIsNotNull() {
            addCriterion("landsize is not null");
            return (Criteria) this;
        }

        public Criteria andLandsizeEqualTo(Double value) {
            addCriterion("landsize =", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeNotEqualTo(Double value) {
            addCriterion("landsize <>", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeGreaterThan(Double value) {
            addCriterion("landsize >", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("landsize >=", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeLessThan(Double value) {
            addCriterion("landsize <", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeLessThanOrEqualTo(Double value) {
            addCriterion("landsize <=", value, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeIn(List<Double> values) {
            addCriterion("landsize in", values, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeNotIn(List<Double> values) {
            addCriterion("landsize not in", values, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeBetween(Double value1, Double value2) {
            addCriterion("landsize between", value1, value2, "landsize");
            return (Criteria) this;
        }

        public Criteria andLandsizeNotBetween(Double value1, Double value2) {
            addCriterion("landsize not between", value1, value2, "landsize");
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