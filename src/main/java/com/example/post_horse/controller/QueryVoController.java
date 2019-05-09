package com.example.post_horse.controller;

import com.example.post_horse.pojo.CompanyListVo;
import com.example.post_horse.pojo.FavoritesVo;
import com.example.post_horse.service.QueryVoService;
import com.example.post_horse.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 20:46
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class QueryVoController {
    @Autowired
    private QueryVoService queryVoService;
    //通过userId找到收藏，收藏表中的userId，也是user表中的主键id
    @ApiOperation("通过userId找到收藏，收藏表中的userId，也是user表中的主键id")
    @GetMapping("/findAllFavoritesByUserId.action")
    public SzpJsonResult findAllFavoritesByUserId(long userId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<FavoritesVo> allFavoritesByUserId = queryVoService.findAllFavoritesByUserId(userId);
        return SzpJsonResult.ok(allFavoritesByUserId);
    }
        //通过搜索展示公司信息
    @ApiOperation("通过搜索名称展示公司信息")
    @GetMapping("/findCompanyListVoByCompanyName.action")
    public SzpJsonResult findCompanyListVoByCompanyName(String companyName, HttpServletResponse response){
        List<CompanyListVo> companyListVoByCompanyName = queryVoService.findCompanyListVoByCompanyName(companyName);
        return SzpJsonResult.ok(companyListVoByCompanyName);
    }
    //直接展示公司信息
    @ApiOperation("直接展示所有公司信息")
    @GetMapping("/findAllCompanyListVo.action")
    public SzpJsonResult findAllCompanyListVo(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<CompanyListVo> allCompanyListVo = queryVoService.findAllCompanyListVo();
        return SzpJsonResult.ok(allCompanyListVo);
    }

}
