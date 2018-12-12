package com.fcc.crud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class everyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public everyReportExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andReportidIsNull() {
            addCriterion("reportid is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportid is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(Integer value) {
            addCriterion("reportid =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(Integer value) {
            addCriterion("reportid <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(Integer value) {
            addCriterion("reportid >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportid >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(Integer value) {
            addCriterion("reportid <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(Integer value) {
            addCriterion("reportid <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<Integer> values) {
            addCriterion("reportid in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<Integer> values) {
            addCriterion("reportid not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(Integer value1, Integer value2) {
            addCriterion("reportid between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportid not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCTime("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCTime("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCTime("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andLastweekIsNull() {
            addCriterion("lastweek is null");
            return (Criteria) this;
        }

        public Criteria andLastweekIsNotNull() {
            addCriterion("lastweek is not null");
            return (Criteria) this;
        }

        public Criteria andLastweekEqualTo(String value) {
            addCriterion("lastweek =", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotEqualTo(String value) {
            addCriterion("lastweek <>", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekGreaterThan(String value) {
            addCriterion("lastweek >", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekGreaterThanOrEqualTo(String value) {
            addCriterion("lastweek >=", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekLessThan(String value) {
            addCriterion("lastweek <", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekLessThanOrEqualTo(String value) {
            addCriterion("lastweek <=", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekLike(String value) {
            addCriterion("lastweek like", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotLike(String value) {
            addCriterion("lastweek not like", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekIn(List<String> values) {
            addCriterion("lastweek in", values, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotIn(List<String> values) {
            addCriterion("lastweek not in", values, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekBetween(String value1, String value2) {
            addCriterion("lastweek between", value1, value2, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotBetween(String value1, String value2) {
            addCriterion("lastweek not between", value1, value2, "lastweek");
            return (Criteria) this;
        }

        public Criteria andThisweekIsNull() {
            addCriterion("thisweek is null");
            return (Criteria) this;
        }

        public Criteria andThisweekIsNotNull() {
            addCriterion("thisweek is not null");
            return (Criteria) this;
        }

        public Criteria andThisweekEqualTo(String value) {
            addCriterion("thisweek =", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekNotEqualTo(String value) {
            addCriterion("thisweek <>", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekGreaterThan(String value) {
            addCriterion("thisweek >", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekGreaterThanOrEqualTo(String value) {
            addCriterion("thisweek >=", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekLessThan(String value) {
            addCriterion("thisweek <", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekLessThanOrEqualTo(String value) {
            addCriterion("thisweek <=", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekLike(String value) {
            addCriterion("thisweek like", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekNotLike(String value) {
            addCriterion("thisweek not like", value, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekIn(List<String> values) {
            addCriterion("thisweek in", values, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekNotIn(List<String> values) {
            addCriterion("thisweek not in", values, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekBetween(String value1, String value2) {
            addCriterion("thisweek between", value1, value2, "thisweek");
            return (Criteria) this;
        }

        public Criteria andThisweekNotBetween(String value1, String value2) {
            addCriterion("thisweek not between", value1, value2, "thisweek");
            return (Criteria) this;
        }

        public Criteria andAttachurlIsNull() {
            addCriterion("attachurl is null");
            return (Criteria) this;
        }

        public Criteria andAttachurlIsNotNull() {
            addCriterion("attachurl is not null");
            return (Criteria) this;
        }

        public Criteria andAttachurlEqualTo(String value) {
            addCriterion("attachurl =", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlNotEqualTo(String value) {
            addCriterion("attachurl <>", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlGreaterThan(String value) {
            addCriterion("attachurl >", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlGreaterThanOrEqualTo(String value) {
            addCriterion("attachurl >=", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlLessThan(String value) {
            addCriterion("attachurl <", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlLessThanOrEqualTo(String value) {
            addCriterion("attachurl <=", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlLike(String value) {
            addCriterion("attachurl like", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlNotLike(String value) {
            addCriterion("attachurl not like", value, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlIn(List<String> values) {
            addCriterion("attachurl in", values, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlNotIn(List<String> values) {
            addCriterion("attachurl not in", values, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlBetween(String value1, String value2) {
            addCriterion("attachurl between", value1, value2, "attachurl");
            return (Criteria) this;
        }

        public Criteria andAttachurlNotBetween(String value1, String value2) {
            addCriterion("attachurl not between", value1, value2, "attachurl");
            return (Criteria) this;
        }

        public Criteria andQandaIsNull() {
            addCriterion("QandA is null");
            return (Criteria) this;
        }

        public Criteria andQandaIsNotNull() {
            addCriterion("QandA is not null");
            return (Criteria) this;
        }

        public Criteria andQandaEqualTo(String value) {
            addCriterion("QandA =", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaNotEqualTo(String value) {
            addCriterion("QandA <>", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaGreaterThan(String value) {
            addCriterion("QandA >", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaGreaterThanOrEqualTo(String value) {
            addCriterion("QandA >=", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaLessThan(String value) {
            addCriterion("QandA <", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaLessThanOrEqualTo(String value) {
            addCriterion("QandA <=", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaLike(String value) {
            addCriterion("QandA like", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaNotLike(String value) {
            addCriterion("QandA not like", value, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaIn(List<String> values) {
            addCriterion("QandA in", values, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaNotIn(List<String> values) {
            addCriterion("QandA not in", values, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaBetween(String value1, String value2) {
            addCriterion("QandA between", value1, value2, "qanda");
            return (Criteria) this;
        }

        public Criteria andQandaNotBetween(String value1, String value2) {
            addCriterion("QandA not between", value1, value2, "qanda");
            return (Criteria) this;
        }

        public Criteria andNextweekIsNull() {
            addCriterion("nextweek is null");
            return (Criteria) this;
        }

        public Criteria andNextweekIsNotNull() {
            addCriterion("nextweek is not null");
            return (Criteria) this;
        }

        public Criteria andNextweekEqualTo(String value) {
            addCriterion("nextweek =", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekNotEqualTo(String value) {
            addCriterion("nextweek <>", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekGreaterThan(String value) {
            addCriterion("nextweek >", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekGreaterThanOrEqualTo(String value) {
            addCriterion("nextweek >=", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekLessThan(String value) {
            addCriterion("nextweek <", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekLessThanOrEqualTo(String value) {
            addCriterion("nextweek <=", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekLike(String value) {
            addCriterion("nextweek like", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekNotLike(String value) {
            addCriterion("nextweek not like", value, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekIn(List<String> values) {
            addCriterion("nextweek in", values, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekNotIn(List<String> values) {
            addCriterion("nextweek not in", values, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekBetween(String value1, String value2) {
            addCriterion("nextweek between", value1, value2, "nextweek");
            return (Criteria) this;
        }

        public Criteria andNextweekNotBetween(String value1, String value2) {
            addCriterion("nextweek not between", value1, value2, "nextweek");
            return (Criteria) this;
        }

        public Criteria andReportdesIsNull() {
            addCriterion("reportdes is null");
            return (Criteria) this;
        }

        public Criteria andReportdesIsNotNull() {
            addCriterion("reportdes is not null");
            return (Criteria) this;
        }

        public Criteria andReportdesEqualTo(String value) {
            addCriterion("reportdes =", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesNotEqualTo(String value) {
            addCriterion("reportdes <>", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesGreaterThan(String value) {
            addCriterion("reportdes >", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesGreaterThanOrEqualTo(String value) {
            addCriterion("reportdes >=", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesLessThan(String value) {
            addCriterion("reportdes <", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesLessThanOrEqualTo(String value) {
            addCriterion("reportdes <=", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesLike(String value) {
            addCriterion("reportdes like", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesNotLike(String value) {
            addCriterion("reportdes not like", value, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesIn(List<String> values) {
            addCriterion("reportdes in", values, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesNotIn(List<String> values) {
            addCriterion("reportdes not in", values, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesBetween(String value1, String value2) {
            addCriterion("reportdes between", value1, value2, "reportdes");
            return (Criteria) this;
        }

        public Criteria andReportdesNotBetween(String value1, String value2) {
            addCriterion("reportdes not between", value1, value2, "reportdes");
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