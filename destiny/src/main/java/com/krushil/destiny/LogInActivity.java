package com.krushil.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    TextView forgotPassTxt;
    ImageButton backImgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        forgotPassTxt=(TextView)findViewById(R.id.forgot_password_txt);
        backImgBtn=(ImageButton)findViewById((R.id.backLI_btn));

        forgotPassTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LogInActivity.this,ForgotPassword.class);
                startActivity(intent);
            }
        });

        backImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LogInActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
