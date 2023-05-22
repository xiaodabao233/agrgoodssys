package com.nsu.vo;

import com.nsu.common.IDCommon;

public class UserSignUpForm {



    private String userId;
    private String userNick;
    private String userName;
    private String userPass;
    private String code;

    //表单里添加验证码
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserSignUpForm() {
    }

    public UserSignUpForm(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public UserSignUpForm(String userNick, String userName, String userPass, String code) {
        this.userNick = userNick;
        this.userName = userName;
        this.userPass = userPass;
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserSignUpForm{" +
                "userId='" + userId + '\'' +
                ", userNick='" + userNick + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getUserId() {
        userId = IDCommon.createID();
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }}
