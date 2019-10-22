package com.example.borgerkong;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BurgerDetailActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView calTextView;
    private TextView descriptionTextView;
    private TextView amtTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_detail);

        Intent intent = getIntent();

        int burgerID = intent.getIntExtra("BurgerID", 0);
        Burger burger = FakeDatabase.getBurgerById(burgerID);

        nameTextView = findViewById(R.id.detailname);
        calTextView = findViewById(R.id.detailcal);
        descriptionTextView = findViewById(R.id.detailcontent);
        amtTextView = findViewById(R.id.detailprice);

        nameTextView.setText(burger.getItemName());
        calTextView.setText(burger.getCalorie());
        descriptionTextView.setText(burger.getDescription());
        amtTextView.setText(Integer.toString(burger.getPrice()));


    }

}
