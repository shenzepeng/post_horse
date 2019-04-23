package com.example.post_horse.mapper;

import com.example.post_horse.pojo.CompanyListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 22:49
 * @Description: SualLabel, Write down some description!!!
 */
@Mapper
public interface CompanyListVoMapper {


    //通过搜索展示公司信息
    List<CompanyListVo> findCompanyListVoByCompanyName(String companyName);
    //直接展示公司信息
    List<CompanyListVo> findAllCompanyListVo();
}
