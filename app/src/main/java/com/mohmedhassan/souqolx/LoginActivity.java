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

public class LoginActivity extends AppCompatActivity {

    Button btnLogin_login;
    TextView tv_login_register,tv_forgetPassword;
    CheckBox checkboxPassword_Login;
    EditText password_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin_login = findViewById(R.id.btnLogin_login);
        tv_login_register = findViewById(R.id.tv_login_register);
        tv_forgetPassword = findViewById(R.id.tv_forgetPassword);
        password_login = findViewById(R.id.password_login);
        checkboxPassword_Login = findViewById(R.id.checkboxPassword_Login);

        checkboxPassword_Login.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    password_login.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    password_login.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

        btnLogin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                startActivity(intent);
            }
        });
        tv_login_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        tv_forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
                startActivity(intent);
            }
        });

    }
}
