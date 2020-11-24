package com.example.switchbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstScreenActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        inputName = (EditText)findViewById(R.id.name);
        inputEmail = (EditText)findViewById(R.id.email);
        Button btnNextScreen = (Button)findViewById(R.id.btnNextScreen);

        btnNextScreen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), SecondScreenActivity.class);

                nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("email",inputEmail.getText().toString());
                Log.e("n",inputName.getText()+"."+inputEmail.getText());

                startActivity(nextScreen);

            }
        });

    }
}
