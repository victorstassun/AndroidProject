package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.senai.medianotas.R;

public class gradeScreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_notas);

        TextView txtNome = (TextView) findViewById(R.id.textNome);


        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                txtNome.setText(params.getString("nome") + "!");
            }
        }

        Button btnContinuar = (Button) findViewById(R.id.btnCalcular);
        btnContinuar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, sumMedia.class);

        EditText nota1 = (EditText) findViewById(R.id.inputNotaUm);
        EditText nota2 = (EditText) findViewById(R.id.inputNotaDois);
        EditText nota3 = (EditText) findViewById(R.id.inputNotaTres);
        EditText nota4 = (EditText) findViewById(R.id.inputNotaQuatro);

        Bundle params = new Bundle();
        params.putDouble("nota1", Double.parseDouble(nota1.getText().toString()));
        params.putDouble("nota2", Double.parseDouble(nota2.getText().toString()));
        params.putDouble("nota3", Double.parseDouble(nota3.getText().toString()));
        params.putDouble("nota4", Double.parseDouble(nota4.getText().toString()));
        it.putExtras(params);

        startActivity(it);
    }
}