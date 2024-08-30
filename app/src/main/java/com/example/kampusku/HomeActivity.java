package com.example.kampusku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class HomeActivity extends AppCompatActivity{

    Button btnDataMahasiswa;
    Button btnInputData;
    Button btnInformsi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDataMahasiswa = (Button) findViewById(R.id.btnlihat);
        btnDataMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toData = new Intent(HomeActivity.this, DataMahasiswa.class);
                startActivity(toData);
            }
        });

        btnInputData = (Button) findViewById(R.id.btnInput);
        btnInputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInput = new Intent(HomeActivity.this, InputData.class);
                startActivity(toInput);
            }
        });

        btnInformsi = (Button) findViewById(R.id.btnInfo);
        btnInformsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toInfo = new Intent(HomeActivity.this, Informasi.class);
                startActivity(toInfo);
            }
        });
    }
}
