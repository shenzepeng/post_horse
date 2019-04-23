package com.example.post_horse.pojo;

import java.util.ArrayList;
import java.util.List;

public class FavoritesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FavoritesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneIsNull() {
            addCriterion("blanck_spance_space_one is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneIsNotNull() {
            addCriterion("blanck_spance_space_one is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneEqualTo(String value) {
            addCriterion("blanck_spance_space_one =", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneNotEqualTo(String value) {
            addCriterion("blanck_spance_space_one <>", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneGreaterThan(String value) {
            addCriterion("blanck_spance_space_one >", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_one >=", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneLessThan(String value) {
            addCriterion("blanck_spance_space_one <", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneLessThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_one <=", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneLike(String value) {
            addCriterion("blanck_spance_space_one like", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneNotLike(String value) {
            addCriterion("blanck_spance_space_one not like", value, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneIn(List<String> values) {
            addCriterion("blanck_spance_space_one in", values, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneNotIn(List<String> values) {
            addCriterion("blanck_spance_space_one not in", values, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_one between", value1, value2, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceOneNotBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_one not between", value1, value2, "blanckSpanceSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeIsNull() {
            addCriterion("blanck_spance_space_three is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeIsNotNull() {
            addCriterion("blanck_spance_space_three is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeEqualTo(String value) {
            addCriterion("blanck_spance_space_three =", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeNotEqualTo(String value) {
            addCriterion("blanck_spance_space_three <>", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeGreaterThan(String value) {
            addCriterion("blanck_spance_space_three >", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_three >=", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeLessThan(String value) {
            addCriterion("blanck_spance_space_three <", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeLessThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_three <=", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeLike(String value) {
            addCriterion("blanck_spance_space_three like", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeNotLike(String value) {
            addCriterion("blanck_spance_space_three not like", value, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeIn(List<String> values) {
            addCriterion("blanck_spance_space_three in", values, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeNotIn(List<String> values) {
            addCriterion("blanck_spance_space_three not in", values, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_three between", value1, value2, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceThreeNotBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_three not between", value1, value2, "blanckSpanceSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoIsNull() {
            addCriterion("blanck_spance_space_two is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoIsNotNull() {
            addCriterion("blanck_spance_space_two is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoEqualTo(String value) {
            addCriterion("blanck_spance_space_two =", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoNotEqualTo(String value) {
            addCriterion("blanck_spance_space_two <>", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoGreaterThan(String value) {
            addCriterion("blanck_spance_space_two >", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_two >=", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoLessThan(String value) {
            addCriterion("blanck_spance_space_two <", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoLessThanOrEqualTo(String value) {
            addCriterion("blanck_spance_space_two <=", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoLike(String value) {
            addCriterion("blanck_spance_space_two like", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoNotLike(String value) {
            addCriterion("blanck_spance_space_two not like", value, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoIn(List<String> values) {
            addCriterion("blanck_spance_space_two in", values, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoNotIn(List<String> values) {
            addCriterion("blanck_spance_space_two not in", values, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_two between", value1, value2, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpanceSpaceTwoNotBetween(String value1, String value2) {
            addCriterion("blanck_spance_space_two not between", value1, value2, "blanckSpanceSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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