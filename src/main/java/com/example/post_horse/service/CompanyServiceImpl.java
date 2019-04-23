package com.example.post_horse.service;

import com.example.post_horse.mapper.CompanyMapper;
import com.example.post_horse.pojo.Company;
import com.example.post_horse.pojo.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 18:41
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public void insertCompany(Company company) {
        companyMapper.insert(company);
    }

    @Override
    public void deleteCompanyById(long id) {
        companyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateCompanyById(Company company) {
        companyMapper.updateByPrimaryKey(company);
    }

    @Override
    public Company findCompanyById(long id) {
        Company company = companyMapper.selectByPrimaryKey(id);
        return company;
    }

    @Override
    public List<Company> findCompanyByCompanyName(String companyName) {
        CompanyExample companyExample=new CompanyExample();
        companyExample.createCriteria().andCompanyNameEqualTo(companyName);
        List<Company> companies = companyMapper.selectByExample(companyExample);
        return companies;
    }

    @Override
    public List<Company> findCompanyByCompanyUserId(long userId) {
        CompanyExample companyExample=new CompanyExample();
        companyExample.createCriteria().andUserIdEqualTo(userId);
        List<Company> companies = companyMapper.selectByExample(companyExample);
        return companies;
    }
}
