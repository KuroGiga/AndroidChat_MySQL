package com.ezxb.account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    /**
     *
     * Make Your Code EZY
     * Visit My WEB : https://ezxb.com
     * Owner : https://github.com/KuroGiga
     *
     * */

    private TextView set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        set = findViewById(R.id.set);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name = findViewById(R.id.name);
                Intent i = new Intent(Login.this,MainActivity.class);
                i.putExtra("location",name.getText().toString());
                startActivity(i);
            }
        });
    }
}
