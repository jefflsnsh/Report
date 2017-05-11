package com.lsrcb.dao;

import com.lsrcb.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 颜锐 on 2017/5/11
 * Author： 颜锐
 * Email： jeff.lsnsh@gmail.com
 * Mobile：13915138816
 * All rights resered @CopyRight
 */

public interface UserInfoDao  {
    @Select("select * from userinfo where id=#{id}")
    public UserInfo getOne(@Param("id") int id);
    @Insert("insert into userinfo(username,password) values (#{username},#{password})")
    public  void insertOne(UserInfo userInfo);
}
