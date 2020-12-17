package com.example.day01.model;

import com.example.day01.contract.LoginContract;

public class LoginModel implements LoginContract.ILoginModel {
    private LoginContract.ILoginPresenter loginPresenter;

    public LoginModel(LoginContract.ILoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void getLoginData() {
        loginPresenter.loginResult("登录成功");
    }
}
