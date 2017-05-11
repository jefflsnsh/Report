package com.lsrcb.service;

import com.lsrcb.dao.UserInfoDao;
import com.lsrcb.pojo.UserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 颜锐 on 2017/5/11
 * Author： 颜锐
 * Email： jeff.lsnsh@gmail.com
 * Mobile：13915138816
 * All rights resered @CopyRight
 */
@RestController
public class InsertUser {
    @Autowired
    private UserInfoDao userInfoDao;
    @RequestMapping("/adduser")
    public  void InsertOne()
    {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUsername("YanRui");
        userInfo.setPassword("123456");
        userInfoDao.insertOne(userInfo);
        System.out.println("用户名"+userInfoDao.getOne(9).getPassword());
    }


}
