package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNull() {
            addCriterion("unickname is null");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNotNull() {
            addCriterion("unickname is not null");
            return (Criteria) this;
        }

        public Criteria andUnicknameEqualTo(String value) {
            addCriterion("unickname =", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotEqualTo(String value) {
            addCriterion("unickname <>", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThan(String value) {
            addCriterion("unickname >", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("unickname >=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThan(String value) {
            addCriterion("unickname <", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThanOrEqualTo(String value) {
            addCriterion("unickname <=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLike(String value) {
            addCriterion("unickname like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotLike(String value) {
            addCriterion("unickname not like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameIn(List<String> values) {
            addCriterion("unickname in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotIn(List<String> values) {
            addCriterion("unickname not in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameBetween(String value1, String value2) {
            addCriterion("unickname between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotBetween(String value1, String value2) {
            addCriterion("unickname not between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andUaccountIsNull() {
            addCriterion("uaccount is null");
            return (Criteria) this;
        }

        public Criteria andUaccountIsNotNull() {
            addCriterion("uaccount is not null");
            return (Criteria) this;
        }

        public Criteria andUaccountEqualTo(String value) {
            addCriterion("uaccount =", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotEqualTo(String value) {
            addCriterion("uaccount <>", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThan(String value) {
            addCriterion("uaccount >", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountGreaterThanOrEqualTo(String value) {
            addCriterion("uaccount >=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThan(String value) {
            addCriterion("uaccount <", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLessThanOrEqualTo(String value) {
            addCriterion("uaccount <=", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountLike(String value) {
            addCriterion("uaccount like", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotLike(String value) {
            addCriterion("uaccount not like", value, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountIn(List<String> values) {
            addCriterion("uaccount in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotIn(List<String> values) {
            addCriterion("uaccount not in", values, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountBetween(String value1, String value2) {
            addCriterion("uaccount between", value1, value2, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUaccountNotBetween(String value1, String value2) {
            addCriterion("uaccount not between", value1, value2, "uaccount");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andRoleflagIsNull() {
            addCriterion("roleflag is null");
            return (Criteria) this;
        }

        public Criteria andRoleflagIsNotNull() {
            addCriterion("roleflag is not null");
            return (Criteria) this;
        }

        public Criteria andRoleflagEqualTo(Integer value) {
            addCriterion("roleflag =", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagNotEqualTo(Integer value) {
            addCriterion("roleflag <>", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagGreaterThan(Integer value) {
            addCriterion("roleflag >", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("roleflag >=", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagLessThan(Integer value) {
            addCriterion("roleflag <", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagLessThanOrEqualTo(Integer value) {
            addCriterion("roleflag <=", value, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagIn(List<Integer> values) {
            addCriterion("roleflag in", values, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagNotIn(List<Integer> values) {
            addCriterion("roleflag not in", values, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagBetween(Integer value1, Integer value2) {
            addCriterion("roleflag between", value1, value2, "roleflag");
            return (Criteria) this;
        }

        public Criteria andRoleflagNotBetween(Integer value1, Integer value2) {
            addCriterion("roleflag not between", value1, value2, "roleflag");
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