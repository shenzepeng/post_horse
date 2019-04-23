package com.example.post_horse.mapper;

import com.example.post_horse.pojo.FavoritesVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 22:50
 * @Description: SualLabel, Write down some description!!!
 */
@Mapper
public interface FavoritesVoMapper {
    //通过userId找到收藏，收藏表中的userId，也是user表中的主键id
    List<FavoritesVo> findAllFavoritesByUserId(long userId);
}
