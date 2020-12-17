package com.example.day01.presenter;

import com.example.day01.contract.LoginContract;
import com.example.day01.model.LoginModel;

public class LoginPresenter implements LoginContract.ILoginPresenter {

    private LoginContract.ILoginView loginView;
    private final LoginModel loginModel;

    public LoginPresenter(LoginContract.ILoginView loginView) {
        loginModel = new LoginModel(this);
        this.loginView = loginView;
    }

    @Override
    public void login(String name, String pwd) {
        loginModel.getLoginData();
    }

    @Override
    public void loginResult(String result) {
        loginView.getLoginData(result);
    }
}