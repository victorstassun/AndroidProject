package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.senai.medianotas.R;

public class sumMedia extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma_media);

        TextView resultado = (TextView) findViewById(R.id.textoResultado);
        TextView textoMedia = (TextView) findViewById(R.id.textoMedia);

        Intent it = getIntent();

        Double soma, media;
        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                soma = params.getDouble("nota1") + params.getDouble("nota2") +
                        params.getDouble("nota3") + params.getDouble("nota4");
                media = soma / 4;
                if (media >= 7) {
                    resultado.setText("Aprovado!");
                } else {
                    resultado.setText("Reprovado!");
                }

                textoMedia.setText(media.toString());
            }
        }

        Button btnVoltar = (Button) findViewById(R.id.btnVoltarMedia);
        btnVoltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, gradeScreen.class);

        startActivity(it);
    }
}

