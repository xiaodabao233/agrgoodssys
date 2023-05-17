package com.nsu.vo;

public class UserSignUpForm {



    private String userNick;
    private String userName;
    private String userPass;
    private String userEmail;
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

    public UserSignUpForm(String userName, String userPass, String userEmail) {
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
    }

    public UserSignUpForm(String userNick, String userName, String userPass, String userEmail, String code) {
        this.userNick = userNick;
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
        this.code = code;
    }

    @Override
    public String toString() {
        return "UserSignForm{" +
                "userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
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
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }}
