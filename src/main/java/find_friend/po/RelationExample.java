package find_friend.po;

import java.util.ArrayList;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RelationExample() {
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

        public Criteria andRelationidIsNull() {
            addCriterion("relationID is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("relationID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(String value) {
            addCriterion("relationID =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(String value) {
            addCriterion("relationID <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(String value) {
            addCriterion("relationID >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(String value) {
            addCriterion("relationID >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(String value) {
            addCriterion("relationID <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(String value) {
            addCriterion("relationID <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLike(String value) {
            addCriterion("relationID like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotLike(String value) {
            addCriterion("relationID not like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<String> values) {
            addCriterion("relationID in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<String> values) {
            addCriterion("relationID not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(String value1, String value2) {
            addCriterion("relationID between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(String value1, String value2) {
            addCriterion("relationID not between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andParterneridIsNull() {
            addCriterion("parternerID is null");
            return (Criteria) this;
        }

        public Criteria andParterneridIsNotNull() {
            addCriterion("parternerID is not null");
            return (Criteria) this;
        }

        public Criteria andParterneridEqualTo(String value) {
            addCriterion("parternerID =", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridNotEqualTo(String value) {
            addCriterion("parternerID <>", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridGreaterThan(String value) {
            addCriterion("parternerID >", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridGreaterThanOrEqualTo(String value) {
            addCriterion("parternerID >=", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridLessThan(String value) {
            addCriterion("parternerID <", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridLessThanOrEqualTo(String value) {
            addCriterion("parternerID <=", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridLike(String value) {
            addCriterion("parternerID like", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridNotLike(String value) {
            addCriterion("parternerID not like", value, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridIn(List<String> values) {
            addCriterion("parternerID in", values, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridNotIn(List<String> values) {
            addCriterion("parternerID not in", values, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridBetween(String value1, String value2) {
            addCriterion("parternerID between", value1, value2, "parternerid");
            return (Criteria) this;
        }

        public Criteria andParterneridNotBetween(String value1, String value2) {
            addCriterion("parternerID not between", value1, value2, "parternerid");
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