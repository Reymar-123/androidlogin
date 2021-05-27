package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername, inputPassword;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsername = (EditText) findViewById(R.id.inputUsername);
        inputPassword = (EditText) findViewById(R.id.inputPassword);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();

                if (inputUsername.getText().toString().equals("Reymar Obedoza") && inputPassword.getText().toString().equals("20192021"))
                {

                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), obedoza.class);
                    startActivity(intent);
                }

                else if (!inputUsername.getText().toString().equals("Reymar Obedoza") && inputPassword.getText().toString().equals("20192021"))
                {
                Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("Reymar Obedoza") && !inputPassword.getText().toString().equals("20192021"))
                {
                Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }


                else if (inputUsername.getText().toString().equals("Lara Mae Moises") && inputPassword.getText().toString().equals("20193146"))
                {
                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), moises.class);
                    startActivity(intent);
                }
                else if (!inputUsername.getText().toString().equals("Lara Mae Moises") && inputPassword.getText().toString().equals("20193146"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("Lara Mae Moises") && !inputPassword.getText().toString().equals("20193146"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                }


                else if (inputUsername.getText().toString().equals("John Angelo Marquez") && inputPassword.getText().toString().equals("20193133"))
                {
                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), marquez.class);
                    startActivity(intent);
                }
                else if (!inputUsername.getText().toString().equals("John Angelo Marquez") && inputPassword.getText().toString().equals("20193133"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                }
                else if (inputUsername.getText().toString().equals("John Angelo Marquez") && !inputPassword.getText().toString().equals("20193133"))
                {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();

                }

                else if (inputUsername.getText().toString().equals("Christian Jay Berganio") && (inputPassword.getText().toString().equals("20194925"))) {
                    Toast.makeText(MainActivity.this, "Welcome to Dashboard", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), berganio.class);
                    startActivity(intent);
                } else if (!inputUsername.getText().toString().equals("Christian Jay Berganio") && (inputPassword.getText().toString().equals("20194925"))) {
                    Toast.makeText(MainActivity.this, "Invalid Username", Toast.LENGTH_SHORT).show();

                } else if (inputUsername.getText().toString().equals("Christian Jay Berganio") && (!inputPassword.getText().toString().equals("20194925"))) {
                    Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();

                }








                else
                    {
                    Toast.makeText(MainActivity.this, " Invalid Credentials", Toast.LENGTH_SHORT).show();
                }











            }
        });

    }
}