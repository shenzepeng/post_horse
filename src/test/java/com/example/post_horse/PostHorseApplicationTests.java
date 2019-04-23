package com.example.post_horse;

import com.example.post_horse.mapper.FavoritesVoMapper;
import com.example.post_horse.pojo.CompanyListVo;
import com.example.post_horse.pojo.FavoritesVo;
import com.example.post_horse.service.QueryVoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostHorseApplicationTests {
    @Autowired
    private QueryVoService queryVoService;
    @Test
    public void contextLoads() {

    }

}
