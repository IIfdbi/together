package find_friend.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RtableExample() {
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

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Byte value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Byte value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Byte value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Byte value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Byte value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Byte value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Byte> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Byte> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Byte value1, Byte value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Byte value1, Byte value2) {
            addCriterion("available not between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDoneIsNull() {
            addCriterion("done is null");
            return (Criteria) this;
        }

        public Criteria andDoneIsNotNull() {
            addCriterion("done is not null");
            return (Criteria) this;
        }

        public Criteria andDoneEqualTo(Byte value) {
            addCriterion("done =", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotEqualTo(Byte value) {
            addCriterion("done <>", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneGreaterThan(Byte value) {
            addCriterion("done >", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("done >=", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneLessThan(Byte value) {
            addCriterion("done <", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneLessThanOrEqualTo(Byte value) {
            addCriterion("done <=", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneIn(List<Byte> values) {
            addCriterion("done in", values, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotIn(List<Byte> values) {
            addCriterion("done not in", values, "done");
            return (Criteria) this;
        }

        public Criteria andDoneBetween(Byte value1, Byte value2) {
            addCriterion("done between", value1, value2, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotBetween(Byte value1, Byte value2) {
            addCriterion("done not between", value1, value2, "done");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNull() {
            addCriterion("max_number is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIsNotNull() {
            addCriterion("max_number is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberEqualTo(Short value) {
            addCriterion("max_number =", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotEqualTo(Short value) {
            addCriterion("max_number <>", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThan(Short value) {
            addCriterion("max_number >", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("max_number >=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThan(Short value) {
            addCriterion("max_number <", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberLessThanOrEqualTo(Short value) {
            addCriterion("max_number <=", value, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberIn(List<Short> values) {
            addCriterion("max_number in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotIn(List<Short> values) {
            addCriterion("max_number not in", values, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberBetween(Short value1, Short value2) {
            addCriterion("max_number between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andMaxNumberNotBetween(Short value1, Short value2) {
            addCriterion("max_number not between", value1, value2, "maxNumber");
            return (Criteria) this;
        }

        public Criteria andNeedidIsNull() {
            addCriterion("needid is null");
            return (Criteria) this;
        }

        public Criteria andNeedidIsNotNull() {
            addCriterion("needid is not null");
            return (Criteria) this;
        }

        public Criteria andNeedidEqualTo(String value) {
            addCriterion("needid =", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotEqualTo(String value) {
            addCriterion("needid <>", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidGreaterThan(String value) {
            addCriterion("needid >", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidGreaterThanOrEqualTo(String value) {
            addCriterion("needid >=", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLessThan(String value) {
            addCriterion("needid <", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLessThanOrEqualTo(String value) {
            addCriterion("needid <=", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidLike(String value) {
            addCriterion("needid like", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotLike(String value) {
            addCriterion("needid not like", value, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidIn(List<String> values) {
            addCriterion("needid in", values, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotIn(List<String> values) {
            addCriterion("needid not in", values, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidBetween(String value1, String value2) {
            addCriterion("needid between", value1, value2, "needid");
            return (Criteria) this;
        }

        public Criteria andNeedidNotBetween(String value1, String value2) {
            addCriterion("needid not between", value1, value2, "needid");
            return (Criteria) this;
        }

        public Criteria andNowNumberIsNull() {
            addCriterion("now_number is null");
            return (Criteria) this;
        }

        public Criteria andNowNumberIsNotNull() {
            addCriterion("now_number is not null");
            return (Criteria) this;
        }

        public Criteria andNowNumberEqualTo(Short value) {
            addCriterion("now_number =", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberNotEqualTo(Short value) {
            addCriterion("now_number <>", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberGreaterThan(Short value) {
            addCriterion("now_number >", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("now_number >=", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberLessThan(Short value) {
            addCriterion("now_number <", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberLessThanOrEqualTo(Short value) {
            addCriterion("now_number <=", value, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberIn(List<Short> values) {
            addCriterion("now_number in", values, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberNotIn(List<Short> values) {
            addCriterion("now_number not in", values, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberBetween(Short value1, Short value2) {
            addCriterion("now_number between", value1, value2, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andNowNumberNotBetween(Short value1, Short value2) {
            addCriterion("now_number not between", value1, value2, "nowNumber");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andRtablenameIsNull() {
            addCriterion("rtablename is null");
            return (Criteria) this;
        }

        public Criteria andRtablenameIsNotNull() {
            addCriterion("rtablename is not null");
            return (Criteria) this;
        }

        public Criteria andRtablenameEqualTo(String value) {
            addCriterion("rtablename =", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameNotEqualTo(String value) {
            addCriterion("rtablename <>", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameGreaterThan(String value) {
            addCriterion("rtablename >", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameGreaterThanOrEqualTo(String value) {
            addCriterion("rtablename >=", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameLessThan(String value) {
            addCriterion("rtablename <", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameLessThanOrEqualTo(String value) {
            addCriterion("rtablename <=", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameLike(String value) {
            addCriterion("rtablename like", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameNotLike(String value) {
            addCriterion("rtablename not like", value, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameIn(List<String> values) {
            addCriterion("rtablename in", values, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameNotIn(List<String> values) {
            addCriterion("rtablename not in", values, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameBetween(String value1, String value2) {
            addCriterion("rtablename between", value1, value2, "rtablename");
            return (Criteria) this;
        }

        public Criteria andRtablenameNotBetween(String value1, String value2) {
            addCriterion("rtablename not between", value1, value2, "rtablename");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
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