package com.nsu.dto;

public class UserSignInResult {
    private boolean isSuccess;
    private String uaccount;

    public UserSignInResult(boolean isSuccess, String uaccount) {
        this.isSuccess = isSuccess;
        this.uaccount = uaccount;
    }

    @Override
    public String toString() {
        return "UserSignInResult{" +
                "isSuccess=" + isSuccess +
                ", userName='" + uaccount + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }
}
