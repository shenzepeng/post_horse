package com.example.post_horse.controller;

import com.example.post_horse.pojo.Company;
import com.example.post_horse.pojo.Favorites;
import com.example.post_horse.pojo.FavoritesQueryVo;
import com.example.post_horse.pojo.User;
import com.example.post_horse.service.CompanyService;
import com.example.post_horse.service.FavoriteService;
import com.example.post_horse.service.UserService;
import com.example.post_horse.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 19:01
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class FavotiesController {
    @Autowired
    private FavoriteService favoriteService;
    @Autowired
    private UserService userService;
    @Autowired
    private CompanyService companyService;
    @ApiOperation("添加收藏")
    @PostMapping("/insertFavorite.action")
    public SzpJsonResult insertFavorite(@RequestBody Favorites favorites, HttpServletResponse response){

        favoriteService.insertFavorite(favorites);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id删除收藏")
    @DeleteMapping("/deleteFavoriteById.action")
    public SzpJsonResult deleteFavoriteById(@RequestBody long id){
        favoriteService.deleteFavoriteById(id);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id更新收藏信息，更新值不为null的字段")
    @PutMapping("/updateFavoriteById.action")
    public SzpJsonResult updateFavoriteById(@RequestBody Favorites favorites, HttpServletResponse response){
       // response.setHeader("Access-Control-Allow-Origin", "*");
        if (favorites.getUserId()!=null){
            Favorites favoriteById = favoriteService.findFavoriteById(favorites.getId());
            Long userId = favoriteById.getUserId();
            favorites.setUserId(userId);
        }else {
            Favorites favoriteById = favoriteService.findFavoriteById(favorites.getId());
            Long companyId = favoriteById.getCompanyId();
            favorites.setCompanyId(companyId);
        }
        favoriteService.updateFavoriteById(favorites);
        Favorites favoriteById = favoriteService.findFavoriteById(favorites.getId());
        return SzpJsonResult.ok(favoriteById);
    }
    //通过主键id发现收藏
    @ApiOperation("通过主键id发现收藏")
    @GetMapping("/findFavoriteById.action")
    public SzpJsonResult findFavoriteById(long id, HttpServletResponse response){

        Favorites favoriteById = favoriteService.findFavoriteById(id);
        return SzpJsonResult.ok(favoriteById);
    }
    //通过userId发现收藏，返回list
    @ApiOperation("通过userId发现收藏，返回list")
    @GetMapping("/findFavortiesByUserId.action")
    public SzpJsonResult findFavortiesByUserId(long userId, HttpServletResponse response){
        //通过userId找到收藏
        List<Favorites> favortiesByUserId = favoriteService.findFavortiesByUserId(userId);

        List<FavoritesQueryVo> favoritesQueryVos=new ArrayList<>();
        //遍历跟user所有收藏
        for (int i=0;i<favortiesByUserId.size();i++){
            //从收藏中获取companyId
            Long companyId = favortiesByUserId.get(i).getCompanyId();
            //通过companyId找到公司
            Company company=companyService.findCompanyById(companyId);
            //通过主键找到user
            User user=userService.findUserById(company.getUserId());

            //List<Company> companyByCompanyUserId = companyService.findCompanyByCompanyUserId(userId);
            FavoritesQueryVo favoritesQueryVo=new FavoritesQueryVo();
            favoritesQueryVo.setFavorites(favortiesByUserId.get(i));
            favoritesQueryVo.setCompany(company);
            favoritesQueryVo.setUser(user);



            favoritesQueryVos.add(favoritesQueryVo);
        }
        return SzpJsonResult.ok(favoritesQueryVos);
    }
    //通过companyId发现搜藏，返回list
    @ApiOperation("通过companyId发现搜藏，返回list")
    @GetMapping("/findFavortiesByCompanyId.action")
    public SzpJsonResult findFavortiesByCompanyId(long companyId, HttpServletResponse response){

        List<Favorites> favortiesByCompanyId = favoriteService.findFavortiesByCompanyId(companyId);
        return SzpJsonResult.ok(favortiesByCompanyId);
    }
}
