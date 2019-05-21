package com.zzx.controller;

import com.zzx.dao.UserDao;
import com.zzx.entity.GirlEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mr.John on 2018/9/17 22:07.
 **/

@RestController
public class GirlController {


    @Autowired
    UserDao dao;

    @GetMapping("/all")
    public List<GirlEntity> all(int age,String cupSize) {
        return dao.all(age,cupSize);
    }

    @GetMapping("/one")
    public List<GirlEntity> one(int age) {
        return dao.one(age);
    }
}
