package com.example.wiradhikadwiputra.wiradhikadwiputra_1202151228_modul1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Wiradhika Dwi Putra on 2/4/2018.
 */

public class Review extends AppCompatActivity {
    TextView tv_restaurant, tv_menu, tv_portion, tv_price;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        tv_restaurant = findViewById(R.id.tv_restaurant);
        tv_menu = findViewById(R.id.tv_menu);
        tv_portion = findViewById(R.id.tv_portion);
        tv_price = findViewById(R.id.tv_price);
        Intent intent = getIntent();
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion",0);
        price = intent.getIntExtra("price",0);
        tv_restaurant.setText(restaurant);
        tv_menu.setText(menu);
        tv_portion.setText(""+portion);
        tv_price.setText("Rp."+price);

        Toast toast = null;
        if(price < 65000) {
            toast = Toast.makeText(getApplicationContext(), "Jumlah Memadai", Toast.LENGTH_SHORT);
        }else{
            toast = Toast.makeText(getApplicationContext(), "Jumlah Kurang", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
