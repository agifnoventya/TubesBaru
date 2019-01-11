package com.example.makoto.tubesbaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //membuat loading screen
        Thread thread = new Thread(){
            public void run(){
                try{
                    //waktu splash screen
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    //pindah ke halaman Login
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
