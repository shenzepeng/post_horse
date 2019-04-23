package com.example.post_horse.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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