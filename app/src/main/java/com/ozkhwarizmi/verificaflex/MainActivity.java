package com.ozkhwarizmi.verificaflex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

import com.ozkhwarizmi.verificaflex.entities.Avaliacao;

public class MainActivity extends AppCompatActivity {


    public static final long TEMPO_ESPERA = 3000; // em milessegundos

    EditText txtAlcool, txtGasolina;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activitysplash);
        //Como esconder actionbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_main);

                MainActivity.this.txtAlcool = findViewById(R.id.txtAlcool);
                MainActivity.this.txtGasolina = findViewById(R.id.txtGasolina);

                if (getSupportActionBar() != null) {
                    getSupportActionBar().show();
                }
            }
        }, TEMPO_ESPERA);
    }

            public void verificarCombustivel(View view){
            double alcool = Double.parseDouble(this.txtAlcool.getText().toString());
            double gasolina = Double.parseDouble(this.txtGasolina.getText().toString());
            double resultado = alcool/gasolina;
            String mensagem = "";
            if(resultado < 0.7){
                mensagem = "Utilizar Álcool";
            }else if(resultado > 0.7){
                mensagem = "Utilizar Gasolina";
              }else {
                mensagem = "Tanto faz";
            }

            //Essa linha só foi possível por conta do construtor
            Avaliacao avaliacao = new Avaliacao(alcool, gasolina, resultado, mensagem);

            //Aqui é principal para levar essa classe para outra activity
            Intent it = new Intent(this, ResultActivity.class);
            it.putExtra("avaliacao", avaliacao);
            startActivity(it);
        }
}