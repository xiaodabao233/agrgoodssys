package com.nsu.dto;

public class UserSignUpResult {
    private boolean isSuccess;
    private String uAccount;

    public UserSignUpResult(boolean isSuccess, String uAccount) {
        this.isSuccess = isSuccess;
        this.uAccount = uAccount;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }
}
