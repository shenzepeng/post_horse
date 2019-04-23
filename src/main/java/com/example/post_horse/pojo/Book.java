package com.example.post_horse.pojo;

public class Book {
    //主键id
    private Long id;
    //下单人
    private Long userId;
    //公司id
    private Long companyId;
    //订单编号
    private String stringId;
    //完成时间
    private String finishedTime;
    //订单状态
    private String orderStatus;
    //创建时间
    private String createTime;
    //客户名称
    private String customerName;
    //联系方式
    private String telPhoneNumber;
    //公司名称
    private String companyName;
    //目的地
    private String destination;
    //出发地
    private String origin;
    //已评级
    private String review;
    //服务评分
    private String score;
    //评价内容
    private String evaluateContent;
    //多余字段
    private String blanckSpanceSpaceOne;
    private String blanckSpanceSpaceTwo;
    private String blanckSpanceSpaceThree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlanckSpanceSpaceOne() {
        return blanckSpanceSpaceOne;
    }

    public void setBlanckSpanceSpaceOne(String blanckSpanceSpaceOne) {
        this.blanckSpanceSpaceOne = blanckSpanceSpaceOne == null ? null : blanckSpanceSpaceOne.trim();
    }

    public String getBlanckSpanceSpaceThree() {
        return blanckSpanceSpaceThree;
    }

    public void setBlanckSpanceSpaceThree(String blanckSpanceSpaceThree) {
        this.blanckSpanceSpaceThree = blanckSpanceSpaceThree == null ? null : blanckSpanceSpaceThree.trim();
    }

    public String getBlanckSpanceSpaceTwo() {
        return blanckSpanceSpaceTwo;
    }

    public void setBlanckSpanceSpaceTwo(String blanckSpanceSpaceTwo) {
        this.blanckSpanceSpaceTwo = blanckSpanceSpaceTwo == null ? null : blanckSpanceSpaceTwo.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime == null ? null : finishedTime.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getStringId() {
        return stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId == null ? null : stringId.trim();
    }

    public String getTelPhoneNumber() {
        return telPhoneNumber;
    }

    public void setTelPhoneNumber(String telPhoneNumber) {
        this.telPhoneNumber = telPhoneNumber == null ? null : telPhoneNumber.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", userId=" + userId +
                ", companyId=" + companyId +
                ", stringId='" + stringId + '\'' +
                ", finishedTime='" + finishedTime + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", createTime='" + createTime + '\'' +
                ", customerName='" + customerName + '\'' +
                ", telPhoneNumber='" + telPhoneNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                ", review='" + review + '\'' +
                ", score='" + score + '\'' +
                ", evaluateContent='" + evaluateContent + '\'' +
                ", blanckSpanceSpaceOne='" + blanckSpanceSpaceOne + '\'' +
                ", blanckSpanceSpaceTwo='" + blanckSpanceSpaceTwo + '\'' +
                ", blanckSpanceSpaceThree='" + blanckSpanceSpaceThree + '\'' +
                '}';
    }
}