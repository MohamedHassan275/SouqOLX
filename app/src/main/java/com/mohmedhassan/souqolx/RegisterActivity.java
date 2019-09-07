package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button btnLogin_register;
    TextView Tv_login_register;
    CheckBox checkBoxShowPassword;
    EditText password_register,confirm_password_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnLogin_register = findViewById(R.id.btnLogin_register);
        Tv_login_register = findViewById(R.id.tv_login_register);
        checkBoxShowPassword = findViewById(R.id.checkboxPassword_Register);
        password_register = findViewById(R.id.password_register);
        confirm_password_register = findViewById(R.id.confirm_password_register);

        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    password_register.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    confirm_password_register.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    password_register.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    confirm_password_register.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        btnLogin_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this, HomeScreenActivity.class);
                startActivity(intent);
            }
        });

        Tv_login_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
