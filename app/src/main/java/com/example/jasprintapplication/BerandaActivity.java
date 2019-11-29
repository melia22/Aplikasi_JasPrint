package com.example.jasprintapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BerandaActivity extends AppCompatActivity {

    Button mButtonProfil;
    Button mButtonPrice;
    Button mButtonOrder;
    Button mButtonHistory;
    ImageButton mButtonHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        mButtonProfil = (Button) findViewById(R.id.profil);
        mButtonPrice = (Button) findViewById(R.id.price);
        mButtonOrder = (Button) findViewById(R.id.order);
        mButtonHistory = (Button) findViewById(R.id.history);
        mButtonHome = (ImageButton) findViewById(R.id.id_home);

        mButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilHome = new Intent(BerandaActivity.this, HomeActivity.class);
                startActivity(profilHome);
            }
        });

        mButtonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilInten = new Intent(BerandaActivity.this, ProfilActivity.class);
                startActivity(profilInten);
            }
        });


        mButtonHistory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent historyIntent = new Intent(BerandaActivity.this,HistoryActivity.class);
                startActivity(historyIntent);
            }
        });


        mButtonOrder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent orderIntent = new Intent(BerandaActivity.this,OrderActivity.class);
                startActivity(orderIntent);
            }
        });

        mButtonPrice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent priceIntent = new Intent(BerandaActivity.this,PriceActivity.class);
                startActivity(priceIntent);
            }
        });

    }
}
