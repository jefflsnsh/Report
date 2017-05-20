package com.lsrcb.service;

import com.lsrcb.dao.UserInfoDao;
import com.lsrcb.pojo.UserInfo;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.Executors;

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
        userInfo.setPassword("34567");
        userInfoDao.insertOne(userInfo);
        System.out.println("用户名"+userInfoDao.getOne(9).getPassword());
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("测试系统日志");

    }


}
@Configuration
class MyWebConfiguratipon extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/js/");
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/css/");
    }

}
