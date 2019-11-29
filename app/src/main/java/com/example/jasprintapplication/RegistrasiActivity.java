package com.example.jasprintapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrasiActivity extends AppCompatActivity {

    Button btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        btnRegistrasi = findViewById(R.id.btn_regis);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regis = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(regis);
            }
        });
    }
}
