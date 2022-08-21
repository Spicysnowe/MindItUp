package com.techtastic.minditup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act2_Onboarding_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act2_onboarding_register);
        Button register = findViewById(R.id.register);
        getSupportActionBar().hide();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Act2_Onboarding_register.this, Act3_Assessment.class);
                startActivity(i);

            }
        });
    }
}