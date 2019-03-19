package com.example.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }



    public void goToMainActivity (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
