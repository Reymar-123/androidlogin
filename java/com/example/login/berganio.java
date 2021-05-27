package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class berganio extends AppCompatActivity {


    TextView displayname, idno;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berganio);

        displayname = findViewById(R.id.displayname);
        idno = findViewById(R.id.idno);

        logout = findViewById(R.id.buttonLogout);
        logout.setOnClickListener(new View.OnClickListener()



        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(berganio.this, MainActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(berganio.this, "Successfully Log Out", Toast.LENGTH_SHORT).show();
            }
        });

    }
}