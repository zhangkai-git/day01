package com.example.exercise2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private TextView num;
    private Disposable subscribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.iv_image);
        num = findViewById(R.id.tv_num);

        initView();
    }

    private void initView() {
        subscribe = Flowable.intervalRange(0, 3, 0, 1, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        Log.e("TAG", "开始倒计时");
                        num.setText("剩余" + (3 - aLong) + "秒");
                    }
                })
                .doOnComplete(new Action() {
                    @Override
                    public void run() throws Exception {
                        Log.e("TAG", "倒计时结束");
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }
                })
                .subscribe();

        //点击按钮时,调用此方法关闭倒计时,
//        subscribe.dispose();
    }
}