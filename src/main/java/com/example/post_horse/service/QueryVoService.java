package com.example.post_horse.service;

import com.example.post_horse.pojo.CompanyListVo;
import com.example.post_horse.pojo.FavoritesVo;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 22:26
 * @Description: 多表查询
 */
public interface QueryVoService {
    //通过userId找到收藏，收藏表中的userId，也是user表中的主键id
    List<FavoritesVo> findAllFavoritesByUserId(long userId);
    //通过搜索展示公司信息
    List<CompanyListVo> findCompanyListVoByCompanyName(String companyName);
    //直接展示公司信息
    List<CompanyListVo> findAllCompanyListVo();

}
