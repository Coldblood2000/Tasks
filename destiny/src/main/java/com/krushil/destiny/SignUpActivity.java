package com.krushil.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    ImageButton backImgBtn;
    Button next_btn;
    CheckBox chkTermsAndConditions;
    RadioButton radioMale,radioFemale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        backImgBtn=(ImageButton)findViewById(R.id.backSU_img_btn);
        chkTermsAndConditions=findViewById(R.id.checkBox);
        radioMale=findViewById(R.id.radioMale);
        radioFemale=findViewById(R.id.radioFemale);
        next_btn=findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkTermsAndConditions.isChecked()) {
                    Bundle bundle=new Bundle();
                    if (radioMale.isChecked()){
                        bundle.putString("gender","male");
                    }
                    else {
                        bundle.putString("gender","female");
                    }
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(SignUpActivity.this, "Please accept terms and conditions.", Toast.LENGTH_SHORT).show();
                }
                }
        });

    }
}
