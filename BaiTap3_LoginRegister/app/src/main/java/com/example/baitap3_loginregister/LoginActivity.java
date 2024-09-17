package com.example.baitap3_loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextInput,editTextInputPass;
    private Button buttonShow;
    private TextView textViewOutput,textViewOutput1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextInput = findViewById(R.id.inputUsername);
        editTextInputPass = findViewById(R.id.inputPassword);
        buttonShow = findViewById(R.id.btnLogin);
        textViewOutput = findViewById(R.id.textView3);
        textViewOutput1 = findViewById(R.id.textView4);// Kiểm tra ID trong layout

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString(); // Lấy nội dung từ EditText
                textViewOutput.setText(inputText); // Hiển thị nội dung trong TextView
                String inputText1 = editTextInputPass.getText().toString(); // Lấy nội dung từ EditText
                textViewOutput1.setText(inputText1);
            }
        });

        TextView btnSignup = findViewById(R.id.tvSignup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class)); // Chuyển đến RegisterActivity
            }
        });
    }
}