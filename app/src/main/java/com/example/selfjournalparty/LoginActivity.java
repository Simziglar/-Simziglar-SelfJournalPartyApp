package com.example.selfjournalparty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {
    private Button signInButton, createAccButton;
    private AutoCompleteTextView emailEditText, passwordText;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signInButton = findViewById(R.id.email_sign_in_button);
        createAccButton = findViewById(R.id.create_acct_button);
        emailEditText = findViewById(R.id.emailEdit);

        progressBar = findViewById(R.id.login_progress);

        createAccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}