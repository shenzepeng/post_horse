package com.example.post_horse.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNull() {
            addCriterion("evaluate_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNotNull() {
            addCriterion("evaluate_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentEqualTo(String value) {
            addCriterion("evaluate_content =", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotEqualTo(String value) {
            addCriterion("evaluate_content <>", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThan(String value) {
            addCriterion("evaluate_content >", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_content >=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThan(String value) {
            addCriterion("evaluate_content <", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThanOrEqualTo(String value) {
            addCriterion("evaluate_content <=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLike(String value) {
            addCriterion("evaluate_content like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotLike(String value) {
            addCriterion("evaluate_content not like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIn(List<String> values) {
            addCriterion("evaluate_content in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotIn(List<String> values) {
            addCriterion("evaluate_content not in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentBetween(String value1, String value2) {
            addCriterion("evaluate_content between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotBetween(String value1, String value2) {
            addCriterion("evaluate_content not between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNull() {
            addCriterion("finished_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIsNotNull() {
            addCriterion("finished_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeEqualTo(String value) {
            addCriterion("finished_time =", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotEqualTo(String value) {
            addCriterion("finished_time <>", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThan(String value) {
            addCriterion("finished_time >", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("finished_time >=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThan(String value) {
            addCriterion("finished_time <", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLessThanOrEqualTo(String value) {
            addCriterion("finished_time <=", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeLike(String value) {
            addCriterion("finished_time like", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotLike(String value) {
            addCriterion("finished_time not like", value, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeIn(List<String> values) {
            addCriterion("finished_time in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotIn(List<String> values) {
            addCriterion("finished_time not in", values, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeBetween(String value1, String value2) {
            addCriterion("finished_time between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andFinishedTimeNotBetween(String value1, String value2) {
            addCriterion("finished_time not between", value1, value2, "finishedTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }

        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(String value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(String value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(String value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(String value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(String value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(String value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLike(String value) {
            addCriterion("review like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotLike(String value) {
            addCriterion("review not like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewIn(List<String> values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<String> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(String value1, String value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(String value1, String value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andStringIdIsNull() {
            addCriterion("string_id is null");
            return (Criteria) this;
        }

        public Criteria andStringIdIsNotNull() {
            addCriterion("string_id is not null");
            return (Criteria) this;
        }

        public Criteria andStringIdEqualTo(String value) {
            addCriterion("string_id =", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdNotEqualTo(String value) {
            addCriterion("string_id <>", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdGreaterThan(String value) {
            addCriterion("string_id >", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdGreaterThanOrEqualTo(String value) {
            addCriterion("string_id >=", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdLessThan(String value) {
            addCriterion("string_id <", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdLessThanOrEqualTo(String value) {
            addCriterion("string_id <=", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdLike(String value) {
            addCriterion("string_id like", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdNotLike(String value) {
            addCriterion("string_id not like", value, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdIn(List<String> values) {
            addCriterion("string_id in", values, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdNotIn(List<String> values) {
            addCriterion("string_id not in", values, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdBetween(String value1, String value2) {
            addCriterion("string_id between", value1, value2, "stringId");
            return (Criteria) this;
        }

        public Criteria andStringIdNotBetween(String value1, String value2) {
            addCriterion("string_id not between", value1, value2, "stringId");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberIsNull() {
            addCriterion("tel_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberIsNotNull() {
            addCriterion("tel_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberEqualTo(String value) {
            addCriterion("tel_phone_number =", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberNotEqualTo(String value) {
            addCriterion("tel_phone_number <>", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberGreaterThan(String value) {
            addCriterion("tel_phone_number >", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tel_phone_number >=", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberLessThan(String value) {
            addCriterion("tel_phone_number <", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("tel_phone_number <=", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberLike(String value) {
            addCriterion("tel_phone_number like", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberNotLike(String value) {
            addCriterion("tel_phone_number not like", value, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberIn(List<String> values) {
            addCriterion("tel_phone_number in", values, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberNotIn(List<String> values) {
            addCriterion("tel_phone_number not in", values, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberBetween(String value1, String value2) {
            addCriterion("tel_phone_number between", value1, value2, "telPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("tel_phone_number not between", value1, value2, "telPhoneNumber");
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