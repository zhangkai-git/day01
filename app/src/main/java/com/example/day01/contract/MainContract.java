package com.example.day01.contract;

public class LoginContract {
    public interface ILoginModel {
        void getLoginData();
    }
    public interface ILoginPresenter {
        void login(String name, String pwd);
        void loginResult(String result);
    }
    public interface ILoginView {
        String getUserName();
        String getPassword();
        void getLoginData(String string);
    }
}