package find_friend.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RtableUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RtableUserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andRtablememberidIsNull() {
            addCriterion("rtablememberid is null");
            return (Criteria) this;
        }

        public Criteria andRtablememberidIsNotNull() {
            addCriterion("rtablememberid is not null");
            return (Criteria) this;
        }

        public Criteria andRtablememberidEqualTo(String value) {
            addCriterion("rtablememberid =", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidNotEqualTo(String value) {
            addCriterion("rtablememberid <>", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidGreaterThan(String value) {
            addCriterion("rtablememberid >", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidGreaterThanOrEqualTo(String value) {
            addCriterion("rtablememberid >=", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidLessThan(String value) {
            addCriterion("rtablememberid <", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidLessThanOrEqualTo(String value) {
            addCriterion("rtablememberid <=", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidLike(String value) {
            addCriterion("rtablememberid like", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidNotLike(String value) {
            addCriterion("rtablememberid not like", value, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidIn(List<String> values) {
            addCriterion("rtablememberid in", values, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidNotIn(List<String> values) {
            addCriterion("rtablememberid not in", values, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidBetween(String value1, String value2) {
            addCriterion("rtablememberid between", value1, value2, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andRtablememberidNotBetween(String value1, String value2) {
            addCriterion("rtablememberid not between", value1, value2, "rtablememberid");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andJoinedIsNull() {
            addCriterion("joined is null");
            return (Criteria) this;
        }

        public Criteria andJoinedIsNotNull() {
            addCriterion("joined is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedEqualTo(Byte value) {
            addCriterion("joined =", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedNotEqualTo(Byte value) {
            addCriterion("joined <>", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedGreaterThan(Byte value) {
            addCriterion("joined >", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedGreaterThanOrEqualTo(Byte value) {
            addCriterion("joined >=", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedLessThan(Byte value) {
            addCriterion("joined <", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedLessThanOrEqualTo(Byte value) {
            addCriterion("joined <=", value, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedIn(List<Byte> values) {
            addCriterion("joined in", values, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedNotIn(List<Byte> values) {
            addCriterion("joined not in", values, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedBetween(Byte value1, Byte value2) {
            addCriterion("joined between", value1, value2, "joined");
            return (Criteria) this;
        }

        public Criteria andJoinedNotBetween(Byte value1, Byte value2) {
            addCriterion("joined not between", value1, value2, "joined");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNull() {
            addCriterion("jointime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("jointime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(Date value) {
            addCriterion("jointime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(Date value) {
            addCriterion("jointime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(Date value) {
            addCriterion("jointime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jointime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(Date value) {
            addCriterion("jointime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(Date value) {
            addCriterion("jointime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<Date> values) {
            addCriterion("jointime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<Date> values) {
            addCriterion("jointime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(Date value1, Date value2) {
            addCriterion("jointime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(Date value1, Date value2) {
            addCriterion("jointime not between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andReadyIsNull() {
            addCriterion("ready is null");
            return (Criteria) this;
        }

        public Criteria andReadyIsNotNull() {
            addCriterion("ready is not null");
            return (Criteria) this;
        }

        public Criteria andReadyEqualTo(Byte value) {
            addCriterion("ready =", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyNotEqualTo(Byte value) {
            addCriterion("ready <>", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyGreaterThan(Byte value) {
            addCriterion("ready >", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyGreaterThanOrEqualTo(Byte value) {
            addCriterion("ready >=", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyLessThan(Byte value) {
            addCriterion("ready <", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyLessThanOrEqualTo(Byte value) {
            addCriterion("ready <=", value, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyIn(List<Byte> values) {
            addCriterion("ready in", values, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyNotIn(List<Byte> values) {
            addCriterion("ready not in", values, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyBetween(Byte value1, Byte value2) {
            addCriterion("ready between", value1, value2, "ready");
            return (Criteria) this;
        }

        public Criteria andReadyNotBetween(Byte value1, Byte value2) {
            addCriterion("ready not between", value1, value2, "ready");
            return (Criteria) this;
        }

        public Criteria andRtableidIsNull() {
            addCriterion("rtableid is null");
            return (Criteria) this;
        }

        public Criteria andRtableidIsNotNull() {
            addCriterion("rtableid is not null");
            return (Criteria) this;
        }

        public Criteria andRtableidEqualTo(String value) {
            addCriterion("rtableid =", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidNotEqualTo(String value) {
            addCriterion("rtableid <>", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidGreaterThan(String value) {
            addCriterion("rtableid >", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidGreaterThanOrEqualTo(String value) {
            addCriterion("rtableid >=", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidLessThan(String value) {
            addCriterion("rtableid <", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidLessThanOrEqualTo(String value) {
            addCriterion("rtableid <=", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidLike(String value) {
            addCriterion("rtableid like", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidNotLike(String value) {
            addCriterion("rtableid not like", value, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidIn(List<String> values) {
            addCriterion("rtableid in", values, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidNotIn(List<String> values) {
            addCriterion("rtableid not in", values, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidBetween(String value1, String value2) {
            addCriterion("rtableid between", value1, value2, "rtableid");
            return (Criteria) this;
        }

        public Criteria andRtableidNotBetween(String value1, String value2) {
            addCriterion("rtableid not between", value1, value2, "rtableid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    /**
     */
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