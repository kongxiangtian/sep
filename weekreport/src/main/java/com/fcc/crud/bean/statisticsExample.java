package com.fcc.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class statisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public statisticsExample() {
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

        public Criteria andStatisticsidIsNull() {
            addCriterion("statisticsid is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsidIsNotNull() {
            addCriterion("statisticsid is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsidEqualTo(Integer value) {
            addCriterion("statisticsid =", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidNotEqualTo(Integer value) {
            addCriterion("statisticsid <>", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidGreaterThan(Integer value) {
            addCriterion("statisticsid >", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("statisticsid >=", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidLessThan(Integer value) {
            addCriterion("statisticsid <", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("statisticsid <=", value, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidIn(List<Integer> values) {
            addCriterion("statisticsid in", values, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidNotIn(List<Integer> values) {
            addCriterion("statisticsid not in", values, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidBetween(Integer value1, Integer value2) {
            addCriterion("statisticsid between", value1, value2, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andStatisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("statisticsid not between", value1, value2, "statisticsid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameIsNull() {
            addCriterion("statisticsname is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameIsNotNull() {
            addCriterion("statisticsname is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameEqualTo(String value) {
            addCriterion("statisticsname =", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameNotEqualTo(String value) {
            addCriterion("statisticsname <>", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameGreaterThan(String value) {
            addCriterion("statisticsname >", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameGreaterThanOrEqualTo(String value) {
            addCriterion("statisticsname >=", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameLessThan(String value) {
            addCriterion("statisticsname <", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameLessThanOrEqualTo(String value) {
            addCriterion("statisticsname <=", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameLike(String value) {
            addCriterion("statisticsname like", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameNotLike(String value) {
            addCriterion("statisticsname not like", value, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameIn(List<String> values) {
            addCriterion("statisticsname in", values, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameNotIn(List<String> values) {
            addCriterion("statisticsname not in", values, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameBetween(String value1, String value2) {
            addCriterion("statisticsname between", value1, value2, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andStatisticsnameNotBetween(String value1, String value2) {
            addCriterion("statisticsname not between", value1, value2, "statisticsname");
            return (Criteria) this;
        }

        public Criteria andIntimecountIsNull() {
            addCriterion("intimecount is null");
            return (Criteria) this;
        }

        public Criteria andIntimecountIsNotNull() {
            addCriterion("intimecount is not null");
            return (Criteria) this;
        }

        public Criteria andIntimecountEqualTo(Integer value) {
            addCriterion("intimecount =", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountNotEqualTo(Integer value) {
            addCriterion("intimecount <>", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountGreaterThan(Integer value) {
            addCriterion("intimecount >", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("intimecount >=", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountLessThan(Integer value) {
            addCriterion("intimecount <", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountLessThanOrEqualTo(Integer value) {
            addCriterion("intimecount <=", value, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountIn(List<Integer> values) {
            addCriterion("intimecount in", values, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountNotIn(List<Integer> values) {
            addCriterion("intimecount not in", values, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountBetween(Integer value1, Integer value2) {
            addCriterion("intimecount between", value1, value2, "intimecount");
            return (Criteria) this;
        }

        public Criteria andIntimecountNotBetween(Integer value1, Integer value2) {
            addCriterion("intimecount not between", value1, value2, "intimecount");
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