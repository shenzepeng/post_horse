package com.example.post_horse.service;

import com.example.post_horse.mapper.FavoritesMapper;
import com.example.post_horse.pojo.Favorites;
import com.example.post_horse.pojo.FavoritesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 18:59
 * @Description: 沈泽鹏写点注释吧
 */
@Service
@Transactional
public class FavoriteServiceImpl implements FavoriteService{
    @Autowired
    private FavoritesMapper favoritesMapper;
    @Override
    public void insertFavorite(Favorites favorites) {
        favoritesMapper.insert(favorites);
    }

    @Override
    public void deleteFavoriteById(long id) {
        favoritesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateFavoriteById(Favorites favorites) {
        favoritesMapper.updateByPrimaryKeySelective(favorites);
    }

    @Override
    public Favorites findFavoriteById(long id) {
        Favorites favorites = favoritesMapper.selectByPrimaryKey(id);
        return favorites;
    }

    @Override
    public List<Favorites> findFavortiesByUserId(long userId) {
        FavoritesExample favoritesExample=new FavoritesExample();
        favoritesExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Favorites> favorites = favoritesMapper.selectByExample(favoritesExample);
        return favorites;
    }

    @Override
    public List<Favorites> findFavortiesByCompanyId(long companyId) {
        FavoritesExample favoritesExample=new FavoritesExample();
        favoritesExample.createCriteria()
                .andCompanyIdEqualTo(companyId);
        List<Favorites> favorites = favoritesMapper.selectByExample(favoritesExample);
        return favorites;
    }
}
