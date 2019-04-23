package com.example.post_horse.controller;

import com.example.post_horse.pojo.Company;
import com.example.post_horse.service.CompanyService;
import com.example.post_horse.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.ldap.PagedResultsControl;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 19:06
 * @Description: SualLabel, Write down some description!!!
 */

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @ApiOperation("添加新的公司")
    @PostMapping("/insertCompany.action")
    public SzpJsonResult insertCompany(@RequestBody Company company, HttpServletResponse response){

        companyService.insertCompany(company);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id删除公司")
    @DeleteMapping("/deleteCompanyById.action")
    public SzpJsonResult deleteCompanyById(@RequestBody long id, HttpServletResponse response){

        companyService.deleteCompanyById(id);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id更新公司信息，更新值不为null的字段")
    @PutMapping("/updateCompanyById.action")
    public SzpJsonResult updateCompanyById(@RequestBody Company company, HttpServletResponse response){
        Company companyById = companyService.findCompanyById(company.getId());
        company.setUserId(companyById.getUserId());
        companyService.updateCompanyById(company);
        return SzpJsonResult.ok();
    }
    //通过id发现Company
    @ApiOperation("通过id发现Company")
    @GetMapping("/findCompanyById.action")
    public SzpJsonResult findCompanyById(long id, HttpServletResponse response){

        Company companyById = companyService.findCompanyById(id);
        return SzpJsonResult.ok(companyById);
    }
    //通过companyName发现Company，模糊搜索
    @ApiOperation("通过companyName发现Company，模糊搜索")
    @GetMapping("/findCompanyByCompanyName.action")
    public SzpJsonResult findCompanyByCompanyName(String companyName, HttpServletResponse response){

        List<Company> companyByCompanyName = companyService.findCompanyByCompanyName(companyName);
        return SzpJsonResult.ok(companyByCompanyName);
    }
    //通过userId发现company
    @ApiOperation("通过userId发现company")
    @GetMapping("/findCompanyByCompanyUserId.action")
    public SzpJsonResult findCompanyByCompanyUserId(long userId, HttpServletResponse response){

        List<Company> companyByCompanyUserId = companyService.findCompanyByCompanyUserId(userId);
        return SzpJsonResult.ok(companyByCompanyUserId);
    }
}
