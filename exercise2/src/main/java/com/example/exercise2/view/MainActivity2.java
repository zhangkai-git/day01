package com.example.exercise2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exercise2.contract.MainContract;

public class MainActivity2 extends AppCompatActivity implements MainContract.MainView {

    private EditText name;
    private EditText pwd;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.et_name);
        pwd = findViewById(R.id.et_pwd);
        login = findViewById(R.id.btn_login);



    }

    public void LoginButton(View view){
        if (!TextUtils.isEmpty(getUserName())&&!TextUtils.isEmpty(getPassword())){
            if (getUserName().equals("H2003xs")&&getPassword().equals("H2003")){
                
            }else {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    public String getUserName() {
        return name.getText().toString();
    }

    @Override
    public String getPassword() {
        return pwd.getText().toString();
    }

    @Override
    public void getLoginData() {

    }
}