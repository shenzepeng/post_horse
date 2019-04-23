package com.example.post_horse.service;

import com.example.post_horse.pojo.Favorites;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 16:54
 * @Description: 沈泽鹏写点注释吧
 */
public interface FavoriteService {
    void insertFavorite(Favorites favorites);
    void deleteFavoriteById(long id);
    void updateFavoriteById(Favorites favorites);
    //通过主键id发现收藏
    Favorites findFavoriteById(long id);
    //通过userId发现收藏，返回list
    List<Favorites> findFavortiesByUserId(long userId);
    //通过companyId发现搜藏，返回list
    List<Favorites> findFavortiesByCompanyId(long companyId);
}
