package com.xjd.ct.dal.dos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectCommentModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ObjectCommentModelExample() {
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

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public void setOffsetAndLimit(long offset, int limit) {
        Page page = new Page();
        page.setOffset(offset);
        page.setLimit(limit);
        this.setPage(page);
    }

    public void setBeginAndEnd(long begin, long end) {
        Page page = new Page();
        page.setOffset(begin);
        page.setEnd(end);
        this.setPage(page);
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

        public Criteria andCommentIdIsNull() {
            addCriterion("COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("COMMENT_ID =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("COMMENT_ID <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("COMMENT_ID >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENT_ID >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("COMMENT_ID <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("COMMENT_ID <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("COMMENT_ID in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("COMMENT_ID not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("COMMENT_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("COMMENT_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Long value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Long value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Long value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Long value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Long> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Long> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdIsNull() {
            addCriterion("TO_COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andToCommentIdIsNotNull() {
            addCriterion("TO_COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToCommentIdEqualTo(Long value) {
            addCriterion("TO_COMMENT_ID =", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdNotEqualTo(Long value) {
            addCriterion("TO_COMMENT_ID <>", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdGreaterThan(Long value) {
            addCriterion("TO_COMMENT_ID >", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TO_COMMENT_ID >=", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdLessThan(Long value) {
            addCriterion("TO_COMMENT_ID <", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("TO_COMMENT_ID <=", value, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdIn(List<Long> values) {
            addCriterion("TO_COMMENT_ID in", values, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdNotIn(List<Long> values) {
            addCriterion("TO_COMMENT_ID not in", values, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdBetween(Long value1, Long value2) {
            addCriterion("TO_COMMENT_ID between", value1, value2, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andToCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("TO_COMMENT_ID not between", value1, value2, "toCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("COMMENT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("COMMENT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("COMMENT_CONTENT =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("COMMENT_CONTENT >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("COMMENT_CONTENT <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("COMMENT_CONTENT like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("COMMENT_CONTENT not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("COMMENT_CONTENT in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("COMMENT_CONTENT not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIsNull() {
            addCriterion("ACCEPT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIsNotNull() {
            addCriterion("ACCEPT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagEqualTo(Byte value) {
            addCriterion("ACCEPT_FLAG =", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotEqualTo(Byte value) {
            addCriterion("ACCEPT_FLAG <>", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagGreaterThan(Byte value) {
            addCriterion("ACCEPT_FLAG >", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("ACCEPT_FLAG >=", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagLessThan(Byte value) {
            addCriterion("ACCEPT_FLAG <", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagLessThanOrEqualTo(Byte value) {
            addCriterion("ACCEPT_FLAG <=", value, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagIn(List<Byte> values) {
            addCriterion("ACCEPT_FLAG in", values, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotIn(List<Byte> values) {
            addCriterion("ACCEPT_FLAG not in", values, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagBetween(Byte value1, Byte value2) {
            addCriterion("ACCEPT_FLAG between", value1, value2, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andAcceptFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("ACCEPT_FLAG not between", value1, value2, "acceptFlag");
            return (Criteria) this;
        }

        public Criteria andYesCountIsNull() {
            addCriterion("YES_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andYesCountIsNotNull() {
            addCriterion("YES_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andYesCountEqualTo(Integer value) {
            addCriterion("YES_COUNT =", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotEqualTo(Integer value) {
            addCriterion("YES_COUNT <>", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountGreaterThan(Integer value) {
            addCriterion("YES_COUNT >", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("YES_COUNT >=", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountLessThan(Integer value) {
            addCriterion("YES_COUNT <", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountLessThanOrEqualTo(Integer value) {
            addCriterion("YES_COUNT <=", value, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountIn(List<Integer> values) {
            addCriterion("YES_COUNT in", values, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotIn(List<Integer> values) {
            addCriterion("YES_COUNT not in", values, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountBetween(Integer value1, Integer value2) {
            addCriterion("YES_COUNT between", value1, value2, "yesCount");
            return (Criteria) this;
        }

        public Criteria andYesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("YES_COUNT not between", value1, value2, "yesCount");
            return (Criteria) this;
        }

        public Criteria andNoCountIsNull() {
            addCriterion("NO_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andNoCountIsNotNull() {
            addCriterion("NO_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNoCountEqualTo(Integer value) {
            addCriterion("NO_COUNT =", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotEqualTo(Integer value) {
            addCriterion("NO_COUNT <>", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountGreaterThan(Integer value) {
            addCriterion("NO_COUNT >", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("NO_COUNT >=", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountLessThan(Integer value) {
            addCriterion("NO_COUNT <", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountLessThanOrEqualTo(Integer value) {
            addCriterion("NO_COUNT <=", value, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountIn(List<Integer> values) {
            addCriterion("NO_COUNT in", values, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotIn(List<Integer> values) {
            addCriterion("NO_COUNT not in", values, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountBetween(Integer value1, Integer value2) {
            addCriterion("NO_COUNT between", value1, value2, "noCount");
            return (Criteria) this;
        }

        public Criteria andNoCountNotBetween(Integer value1, Integer value2) {
            addCriterion("NO_COUNT not between", value1, value2, "noCount");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
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

    public static class Page {
        protected long offset;

        protected int limit;

        protected long end;

        public long getOffset() {
            return offset;
        }

        public int getLimit() {
            return limit;
        }

        public long getEnd() {
            return end;
        }

        public void setOffset(long offset) {
            this.offset = offset;
            end = (offset + limit - 1);
        }

        public void setLimit(int limit) {
            this.limit = limit;
            end = (offset + limit - 1);
        }

        public void setEnd(long end) {
            this.end = end;
            limit = (int) (end - offset + 1);
        }
    }
}