package com.nsu.service;

import com.nsu.dto.CheckResult;
import com.nsu.dto.UserSignInResult;
import com.nsu.dto.UserSignUpResult;
import com.nsu.entity.UserAccount;
import com.nsu.vo.UserSignUpForm;
import com.nsu.vo.UserSignlnForm;

import java.util.List;

public interface UserAccountService {
    UserSignUpResult signUp(UserSignUpForm userSignUpForm,String codeSession);

    CheckResult checkUaccountIsExist(String uaccount);


    UserSignInResult signIn(UserSignlnForm userSignInForm, String codeSession);

    public List<UserAccount> getAll();

    public void deleteBatch(List<String> del_uids);

    public void deleteUserAccount(String uid);

    public void changeStatus(UserAccount userAccount);

    public UserAccount getUserAccountByUaccount(String uaccount);
}
