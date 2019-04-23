package com.example.post_horse.service;

import com.example.post_horse.pojo.Company;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 15:52
 * @Description: 沈泽鹏写点注释吧
 */
public interface CompanyService {
    void insertCompany(Company company);
    void deleteCompanyById(long id);
    void updateCompanyById(Company company);
    //通过id发现Company
    Company findCompanyById(long id);
    //通过companyName发现Company，模糊搜索
    List<Company> findCompanyByCompanyName(String companyName);
    //通过userId发现company
    List<Company> findCompanyByCompanyUserId(long userId);
}
