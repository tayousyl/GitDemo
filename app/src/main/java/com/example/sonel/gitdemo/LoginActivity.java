package com.example.sonel.gitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void mlogin(View view){
        Toast.makeText(this,"You are now log in",Toast.LENGTH_SHORT);
    }
}
