package com.nsu.entity;

import java.util.Date;

public class UserAccount {
    private String uid;

    private String unickname;

    private String uaccount;

    private String upassword;

    private Integer roleflag;

    private Date updatetime;

    private Integer status;

    public UserAccount() {
    }


    public UserAccount(String userNick, String userName, String userPass) {
        this.unickname = userNick;
        this.uaccount = userName;
        this.upassword = userPass;
    }

    public UserAccount(String userId, String userNick, String userName, String userPass) {
        this.uid = userId;
        this.unickname = userNick;
        this.uaccount = userName;
        this.upassword = userPass;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname == null ? null : unickname.trim();
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount == null ? null : uaccount.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Integer getRoleflag() {
        return roleflag;
    }

    public void setRoleflag(Integer roleflag) {
        this.roleflag = roleflag;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}