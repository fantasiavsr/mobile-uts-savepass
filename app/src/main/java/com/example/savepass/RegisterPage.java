package com.example.savepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterPage extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        button = (Button) findViewById(R.id.buttonDaftar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuccessRegisterPage();
            }
        });
    }

    public void openSuccessRegisterPage() {
        Intent intent = new Intent(this,SuccessRegister.class);
        startActivity(intent);
    }
}