package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.senai.medianotas.R;

public class mainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContinuar = (Button) findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, gradeScreen.class);

        EditText nome = (EditText) findViewById(R.id.inputNome);

        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        it.putExtras(params);

        startActivity(it);
    }
}