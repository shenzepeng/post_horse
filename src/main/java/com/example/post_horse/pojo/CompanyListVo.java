package com.example.post_horse.pojo;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 19:32
 * @Description: SualLabel, Write down some description!!!
 */
public class CompanyListVo {
    //公司ID: '', 公司表主键
    private long id;
    //公司名称: ''
    private String companyName;
    //服务详情: '',
    private String serviceIfo;
    //公司头像: '',user表中的imgUrl
    private String imgUrl;
    //公司地址: ''
    private String companyAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getServiceIfo() {
        return serviceIfo;
    }

    public void setServiceIfo(String serviceIfo) {
        this.serviceIfo = serviceIfo;
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

    @Override
    public String toString() {
        return "CompanyListVo{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", serviceIfo='" + serviceIfo + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }
}
