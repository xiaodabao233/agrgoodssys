package com.nsu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgrSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgrSupplierExample() {
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

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("supplierid like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("supplierid not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("suppliername is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("suppliername is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("suppliername =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("suppliername <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("suppliername >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("suppliername >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("suppliername <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("suppliername <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("suppliername like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("suppliername not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("suppliername in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("suppliername not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("suppliername between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("suppliername not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIsNull() {
            addCriterion("supplieraddress is null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIsNotNull() {
            addCriterion("supplieraddress is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressEqualTo(String value) {
            addCriterion("supplieraddress =", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotEqualTo(String value) {
            addCriterion("supplieraddress <>", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressGreaterThan(String value) {
            addCriterion("supplieraddress >", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressGreaterThanOrEqualTo(String value) {
            addCriterion("supplieraddress >=", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLessThan(String value) {
            addCriterion("supplieraddress <", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLessThanOrEqualTo(String value) {
            addCriterion("supplieraddress <=", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressLike(String value) {
            addCriterion("supplieraddress like", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotLike(String value) {
            addCriterion("supplieraddress not like", value, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressIn(List<String> values) {
            addCriterion("supplieraddress in", values, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotIn(List<String> values) {
            addCriterion("supplieraddress not in", values, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressBetween(String value1, String value2) {
            addCriterion("supplieraddress between", value1, value2, "supplieraddress");
            return (Criteria) this;
        }

        public Criteria andSupplieraddressNotBetween(String value1, String value2) {
            addCriterion("supplieraddress not between", value1, value2, "supplieraddress");
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