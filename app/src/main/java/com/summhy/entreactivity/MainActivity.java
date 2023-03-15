package com.summhy.entreactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View v){
        Intent i = new Intent(this, MainActivity2.class);
        Bundle envioDatos = new Bundle();
        envioDatos.putString("curso","Android");
        i.putExtras(envioDatos);
        startActivity(i);
    }

}