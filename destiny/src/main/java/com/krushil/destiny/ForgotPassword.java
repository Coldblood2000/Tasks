package com.krushil.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ForgotPassword extends AppCompatActivity {

    ImageButton backImgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        backImgBtn = (ImageButton) findViewById(R.id.backFP_btn);

        backImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ForgotPassword.this,LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}
