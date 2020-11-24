package com.example.switchbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        TextView txtName=(TextView)findViewById(R.id.txtName);
        TextView txtEmail = (TextView)findViewById(R.id.txtEmail);
        Button btnClose = (Button)findViewById(R.id.btnClose);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        Log.e("Second Screen", name + "."+ email);

        txtName.setText(name);
        txtEmail.setText(email);

        btnClose.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

                finish();
            }

        });


    }
}
