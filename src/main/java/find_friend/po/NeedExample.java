package find_friend.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public NeedExample() {
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

        public Criteria andNeedidIsNull() {
            addCriterion("needID is null");
            return (Criteria) this;
        }

        public Criteria andNeedidIsNotNull() {
            addCriterion("needID is not null");
            return (Criteria) this;
        }

        public Criteria andNeedidEqualTo(String value) {
            addCriterion("needID =", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotEqualTo(String value) {
            addCriterion("needID <>", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidGreaterThan(String value) {
            addCriterion("needID >", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidGreaterThanOrEqualTo(String value) {
            addCriterion("needID >=", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLessThan(String value) {
            addCriterion("needID <", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLessThanOrEqualTo(String value) {
            addCriterion("needID <=", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLike(String value) {
            addCriterion("needID like", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotLike(String value) {
            addCriterion("needID not like", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidIn(List<String> values) {
            addCriterion("needID in", values, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotIn(List<String> values) {
            addCriterion("needID not in", values, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidBetween(String value1, String value2) {
            addCriterion("needID between", value1, value2, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotBetween(String value1, String value2) {
            addCriterion("needID not between", value1, value2, "needid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createUserID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createUserID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("createUserID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("createUserID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("createUserID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("createUserID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("createUserID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("createUserID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("createUserID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("createUserID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("createUserID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("createUserID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("createUserID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("createUserID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andMaxcountIsNull() {
            addCriterion("maxCount is null");
            return (Criteria) this;
        }

        public Criteria andMaxcountIsNotNull() {
            addCriterion("maxCount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcountEqualTo(Short value) {
            addCriterion("maxCount =", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotEqualTo(Short value) {
            addCriterion("maxCount <>", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountGreaterThan(Short value) {
            addCriterion("maxCount >", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountGreaterThanOrEqualTo(Short value) {
            addCriterion("maxCount >=", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountLessThan(Short value) {
            addCriterion("maxCount <", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountLessThanOrEqualTo(Short value) {
            addCriterion("maxCount <=", value, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountIn(List<Short> values) {
            addCriterion("maxCount in", values, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotIn(List<Short> values) {
            addCriterion("maxCount not in", values, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountBetween(Short value1, Short value2) {
            addCriterion("maxCount between", value1, value2, "maxcount");
            return (Criteria) this;
        }

        public Criteria andMaxcountNotBetween(Short value1, Short value2) {
            addCriterion("maxCount not between", value1, value2, "maxcount");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDdlIsNull() {
            addCriterion("ddl is null");
            return (Criteria) this;
        }

        public Criteria andDdlIsNotNull() {
            addCriterion("ddl is not null");
            return (Criteria) this;
        }

        public Criteria andDdlEqualTo(Date value) {
            addCriterion("ddl =", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotEqualTo(Date value) {
            addCriterion("ddl <>", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThan(Date value) {
            addCriterion("ddl >", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlGreaterThanOrEqualTo(Date value) {
            addCriterion("ddl >=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThan(Date value) {
            addCriterion("ddl <", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlLessThanOrEqualTo(Date value) {
            addCriterion("ddl <=", value, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlIn(List<Date> values) {
            addCriterion("ddl in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotIn(List<Date> values) {
            addCriterion("ddl not in", values, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlBetween(Date value1, Date value2) {
            addCriterion("ddl between", value1, value2, "ddl");
            return (Criteria) this;
        }

        public Criteria andDdlNotBetween(Date value1, Date value2) {
            addCriterion("ddl not between", value1, value2, "ddl");
            return (Criteria) this;
        }

        public Criteria anddetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria anddetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria anddetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria anddetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andFirstTagIsNull() {
            addCriterion("first_tag is null");
            return (Criteria) this;
        }

        public Criteria andFirstTagIsNotNull() {
            addCriterion("first_tag is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTagEqualTo(String value) {
            addCriterion("first_tag =", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagNotEqualTo(String value) {
            addCriterion("first_tag <>", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagGreaterThan(String value) {
            addCriterion("first_tag >", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagGreaterThanOrEqualTo(String value) {
            addCriterion("first_tag >=", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagLessThan(String value) {
            addCriterion("first_tag <", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagLessThanOrEqualTo(String value) {
            addCriterion("first_tag <=", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagLike(String value) {
            addCriterion("first_tag like", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagNotLike(String value) {
            addCriterion("first_tag not like", value, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagIn(List<String> values) {
            addCriterion("first_tag in", values, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagNotIn(List<String> values) {
            addCriterion("first_tag not in", values, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagBetween(String value1, String value2) {
            addCriterion("first_tag between", value1, value2, "firstTag");
            return (Criteria) this;
        }

        public Criteria andFirstTagNotBetween(String value1, String value2) {
            addCriterion("first_tag not between", value1, value2, "firstTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagIsNull() {
            addCriterion("second_tag is null");
            return (Criteria) this;
        }

        public Criteria andSecondTagIsNotNull() {
            addCriterion("second_tag is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTagEqualTo(String value) {
            addCriterion("second_tag =", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagNotEqualTo(String value) {
            addCriterion("second_tag <>", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagGreaterThan(String value) {
            addCriterion("second_tag >", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagGreaterThanOrEqualTo(String value) {
            addCriterion("second_tag >=", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagLessThan(String value) {
            addCriterion("second_tag <", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagLessThanOrEqualTo(String value) {
            addCriterion("second_tag <=", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagLike(String value) {
            addCriterion("second_tag like", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagNotLike(String value) {
            addCriterion("second_tag not like", value, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagIn(List<String> values) {
            addCriterion("second_tag in", values, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagNotIn(List<String> values) {
            addCriterion("second_tag not in", values, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagBetween(String value1, String value2) {
            addCriterion("second_tag between", value1, value2, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSecondTagNotBetween(String value1, String value2) {
            addCriterion("second_tag not between", value1, value2, "secondTag");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNull() {
            addCriterion("submitted is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNotNull() {
            addCriterion("submitted is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedEqualTo(Byte value) {
            addCriterion("submitted =", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotEqualTo(Byte value) {
            addCriterion("submitted <>", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThan(Byte value) {
            addCriterion("submitted >", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThanOrEqualTo(Byte value) {
            addCriterion("submitted >=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThan(Byte value) {
            addCriterion("submitted <", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThanOrEqualTo(Byte value) {
            addCriterion("submitted <=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedIn(List<Byte> values) {
            addCriterion("submitted in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotIn(List<Byte> values) {
            addCriterion("submitted not in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedBetween(Byte value1, Byte value2) {
            addCriterion("submitted between", value1, value2, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotBetween(Byte value1, Byte value2) {
            addCriterion("submitted not between", value1, value2, "submitted");
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