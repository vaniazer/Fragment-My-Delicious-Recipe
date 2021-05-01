package com.example.mydeliciousrecipe;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView tvNamaDetail, tvLamaDetail, tvOrangDetail, tvBahanDetail, tvCaraDetail;
    ImageView tvGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNamaDetail = findViewById(R.id.tv_detail_nama);
        tvLamaDetail = findViewById(R.id.tv_detail_lama);
        tvOrangDetail = findViewById(R.id.tv_detail_orang);
        tvBahanDetail = findViewById(R.id.tv_detail_bahan);
        tvCaraDetail = findViewById(R.id.tv_detail_cara);


        tvNamaDetail.setText(getIntent().getStringExtra("nama"));
        tvLamaDetail.setText(getIntent().getStringExtra("lama"));
        tvOrangDetail.setText(getIntent().getStringExtra("orang"));
        tvBahanDetail.setText(getIntent().getStringExtra("bahan"));
        tvCaraDetail.setText(getIntent().getStringExtra("cara"));


    }
}