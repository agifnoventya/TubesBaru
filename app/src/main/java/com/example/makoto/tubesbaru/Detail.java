package com.example.makoto.tubesbaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    //Variabel global
    TextView txtJudul;
    ImageView imgBaju;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //inisialisasi layout
        txtJudul = (TextView)findViewById(R.id.txtJudul);
        imgBaju = (ImageView)findViewById(R.id.imgBaju);
        //mengambil data dari List fragment dengan kata kunci yang telah di tentukan
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        txtJudul.setText(receivedName);
        imgBaju.setImageResource(receivedImage);
    }
}
