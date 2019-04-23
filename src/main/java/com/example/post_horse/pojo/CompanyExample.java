package com.example.post_horse.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
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

        public Criteria andCompanyQualificationsIsNull() {
            addCriterion("company_qualifications is null");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsIsNotNull() {
            addCriterion("company_qualifications is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsEqualTo(String value) {
            addCriterion("company_qualifications =", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsNotEqualTo(String value) {
            addCriterion("company_qualifications <>", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsGreaterThan(String value) {
            addCriterion("company_qualifications >", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsGreaterThanOrEqualTo(String value) {
            addCriterion("company_qualifications >=", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsLessThan(String value) {
            addCriterion("company_qualifications <", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsLessThanOrEqualTo(String value) {
            addCriterion("company_qualifications <=", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsLike(String value) {
            addCriterion("company_qualifications like", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsNotLike(String value) {
            addCriterion("company_qualifications not like", value, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsIn(List<String> values) {
            addCriterion("company_qualifications in", values, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsNotIn(List<String> values) {
            addCriterion("company_qualifications not in", values, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsBetween(String value1, String value2) {
            addCriterion("company_qualifications between", value1, value2, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andCompanyQualificationsNotBetween(String value1, String value2) {
            addCriterion("company_qualifications not between", value1, value2, "companyQualifications");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameIsNull() {
            addCriterion("contacts_people_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameIsNotNull() {
            addCriterion("contacts_people_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameEqualTo(String value) {
            addCriterion("contacts_people_name =", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameNotEqualTo(String value) {
            addCriterion("contacts_people_name <>", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameGreaterThan(String value) {
            addCriterion("contacts_people_name >", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_people_name >=", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameLessThan(String value) {
            addCriterion("contacts_people_name <", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_people_name <=", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameLike(String value) {
            addCriterion("contacts_people_name like", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameNotLike(String value) {
            addCriterion("contacts_people_name not like", value, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameIn(List<String> values) {
            addCriterion("contacts_people_name in", values, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameNotIn(List<String> values) {
            addCriterion("contacts_people_name not in", values, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameBetween(String value1, String value2) {
            addCriterion("contacts_people_name between", value1, value2, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andContactsPeopleNameNotBetween(String value1, String value2) {
            addCriterion("contacts_people_name not between", value1, value2, "contactsPeopleName");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIsNull() {
            addCriterion("service_area is null");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIsNotNull() {
            addCriterion("service_area is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAreaEqualTo(String value) {
            addCriterion("service_area =", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotEqualTo(String value) {
            addCriterion("service_area <>", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaGreaterThan(String value) {
            addCriterion("service_area >", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("service_area >=", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLessThan(String value) {
            addCriterion("service_area <", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLessThanOrEqualTo(String value) {
            addCriterion("service_area <=", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaLike(String value) {
            addCriterion("service_area like", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotLike(String value) {
            addCriterion("service_area not like", value, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaIn(List<String> values) {
            addCriterion("service_area in", values, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotIn(List<String> values) {
            addCriterion("service_area not in", values, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaBetween(String value1, String value2) {
            addCriterion("service_area between", value1, value2, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceAreaNotBetween(String value1, String value2) {
            addCriterion("service_area not between", value1, value2, "serviceArea");
            return (Criteria) this;
        }

        public Criteria andServiceIfoIsNull() {
            addCriterion("service_ifo is null");
            return (Criteria) this;
        }

        public Criteria andServiceIfoIsNotNull() {
            addCriterion("service_ifo is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIfoEqualTo(String value) {
            addCriterion("service_ifo =", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoNotEqualTo(String value) {
            addCriterion("service_ifo <>", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoGreaterThan(String value) {
            addCriterion("service_ifo >", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoGreaterThanOrEqualTo(String value) {
            addCriterion("service_ifo >=", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoLessThan(String value) {
            addCriterion("service_ifo <", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoLessThanOrEqualTo(String value) {
            addCriterion("service_ifo <=", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoLike(String value) {
            addCriterion("service_ifo like", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoNotLike(String value) {
            addCriterion("service_ifo not like", value, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoIn(List<String> values) {
            addCriterion("service_ifo in", values, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoNotIn(List<String> values) {
            addCriterion("service_ifo not in", values, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoBetween(String value1, String value2) {
            addCriterion("service_ifo between", value1, value2, "serviceIfo");
            return (Criteria) this;
        }

        public Criteria andServiceIfoNotBetween(String value1, String value2) {
            addCriterion("service_ifo not between", value1, value2, "serviceIfo");
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