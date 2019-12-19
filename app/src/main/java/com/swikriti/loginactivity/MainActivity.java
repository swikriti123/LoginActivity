package com.swikriti.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Info;
    private Button login;
    private int Counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.etName);
        final EditText password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvinfo);
        login = (Button) findViewById(R.id.btnLogin);

        /*Info.setText("No of attempts remaining:5");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((name.getText().toString() == "admin") &&
                        (password.getText().toString() == "admin") )
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                else {
                    //show error message
                }
            }
        });*/
    }
}

