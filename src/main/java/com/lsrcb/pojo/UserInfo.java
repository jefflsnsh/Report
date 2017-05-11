package com.lsrcb.pojo;

/**
 * Created by 颜锐 on 2017/5/11
 * Author： 颜锐
 * Email： jeff.lsnsh@gmail.com
 * Mobile：13915138816
 * All rights resered @CopyRight
 */
public class UserInfo {
    private int id;
    private String username;


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
