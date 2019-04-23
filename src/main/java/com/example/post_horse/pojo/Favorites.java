package com.example.post_horse.pojo;

public class Favorites {
    //主键
    private Long id;
    //公司id
    private Long companyId;
    //公司名称
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}