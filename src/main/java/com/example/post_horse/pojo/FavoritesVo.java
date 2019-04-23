package com.example.post_horse.pojo;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 20:48
 * @Description: 获取已收藏公司列表
 */
public class FavoritesVo {
    //收藏主键，收藏表中
    private Long id;
    //公司表主键id，从公司表找到
    private Long companyId;
    //user表主键id，从user表中找到
    private Long userId;
    //公司名称，从公司表找到
    private String companyName;
    //公司头像，从用户表中找到
    private String imgUrl;
    //公司地址，从公司表找到
    private String companyAddress;
    //公司服务详情，从公司表找到
    private String serviceIfo;

    @Override
    public String toString() {
        return "FavoritesVo{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", userId=" + userId +
                ", companyName='" + companyName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", serviceIfo='" + serviceIfo + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getServiceIfo() {
        return serviceIfo;
    }

    public void setServiceIfo(String serviceIfo) {
        this.serviceIfo = serviceIfo;
    }
}
