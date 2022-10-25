package com.example.savepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    Button buttonAdd, buttonGoogle1, buttonGoogle2, buttonGoogle3, buttonSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        buttonAdd = (Button) findViewById(R.id.homePageAddItem);
        buttonGoogle1 = (Button) findViewById(R.id.homePageGogle1);
        buttonGoogle2 = (Button) findViewById(R.id.homePageGogle2);
        buttonGoogle3 = (Button) findViewById(R.id.homePageGogle3);
        buttonSetting = (Button) findViewById(R.id.homePageSetting);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddPage();
            }
        });

        buttonGoogle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openItemPage();
            }
        });

        buttonGoogle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openItemPage();
            }
        });

        buttonGoogle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openItemPage();
            }
        });

        buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void openAddPage() {
        Intent intent = new Intent(this,AddItemPage.class);
        startActivity(intent);
    }

    public void openItemPage() {
        Intent intent = new Intent(this,ItemPage.class);
        startActivity(intent);
    }
}