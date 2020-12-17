package com.example.exercisegson4.contract;

import com.example.exercisegson4.UserBean;
import com.example.exercisegson4.base.BaseView;
import com.example.exercisegson4.utils.net.INetCallBack;

public class MainContract {
    public interface IMainView extends BaseView {
        void getData(UserBean userBean);
    }

    public interface IMainPresenter{
        void getData();
    }
    public interface ImainModel{
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
}
