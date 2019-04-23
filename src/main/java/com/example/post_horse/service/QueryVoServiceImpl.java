package com.example.post_horse.service;

import com.example.post_horse.pojo.CompanyListVo;
import com.example.post_horse.mapper.CompanyListVoMapper;
import com.example.post_horse.pojo.FavoritesVo;
import com.example.post_horse.mapper.FavoritesVoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 22:44
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class QueryVoServiceImpl implements QueryVoService {
    @Autowired
    private FavoritesVoMapper favoritesVoMapper;
    @Autowired
    private CompanyListVoMapper companyListVoMapper;
    //通过userId找到收藏，收藏表中的userId，也是user表中的主键id
    @Override
    public List<FavoritesVo> findAllFavoritesByUserId(long userId) {
        List<FavoritesVo> allFavoritesByUserId = favoritesVoMapper.findAllFavoritesByUserId(userId);
        return allFavoritesByUserId;
    }

    //通过搜索展示公司信息
    @Override
    public List<CompanyListVo> findCompanyListVoByCompanyName(String companyName) {
        List<CompanyListVo> companyListVoByCompanyName = companyListVoMapper.findCompanyListVoByCompanyName(companyName);
        return companyListVoByCompanyName;
    }
    //直接展示公司信息
    @Override
    public List<CompanyListVo> findAllCompanyListVo() {
        List<CompanyListVo> allCompanyListVo = companyListVoMapper.findAllCompanyListVo();
        return allCompanyListVo;
    }
}
