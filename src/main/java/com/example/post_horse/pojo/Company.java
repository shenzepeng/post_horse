package com.example.post_horse.pojo;

public class Company {
    //主键Id
    private Long id;
    private String companyName;
    private String companyAddress;
    //服务区域
    private String serviceArea;
    //服务详情
    private String serviceIfo;
    //企业资质
    private String companyQualifications;
    //联系人
    private String contactsPeopleName;
    //用户id
    private Long userId;
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

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyQualifications() {
        return companyQualifications;
    }

    public void setCompanyQualifications(String companyQualifications) {
        this.companyQualifications = companyQualifications == null ? null : companyQualifications.trim();
    }

    public String getContactsPeopleName() {
        return contactsPeopleName;
    }

    public void setContactsPeopleName(String contactsPeopleName) {
        this.contactsPeopleName = contactsPeopleName == null ? null : contactsPeopleName.trim();
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea == null ? null : serviceArea.trim();
    }

    public String getServiceIfo() {
        return serviceIfo;
    }

    public void setServiceIfo(String serviceIfo) {
        this.serviceIfo = serviceIfo == null ? null : serviceIfo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}