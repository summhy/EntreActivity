package com.summhy.entreactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle parametros = this.getIntent().getExtras();
        String valor = parametros.getString("curso");

        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();

    }

    public void anterior(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}