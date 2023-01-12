package com.example.loginform2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = "rizky";
        String password = "kiera";

        EditText edUsername = (EditText) findViewById(R.id.edUsername);
        EditText edPassword = (EditText) findViewById(R.id.edPassword);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edUsername.getText().toString().trim().isEmpty() || edPassword.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Input cannot be emty",Toast.LENGTH_SHORT).show();
                } else {
                    if(edUsername.getText().toString().trim().equals(username) && edPassword.getText().toString().trim().equals(password)) {
                        Toast.makeText(getApplicationContext(), "Error Input", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent landingPage = new Intent(MainActivity.this, LandingPage.class);
                        landingPage.putExtra("username", username);
                        startActivity(landingPage);
                    }
                }
            }
        });
    }
}