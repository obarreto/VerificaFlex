package com.ozkhwarizmi.verificaflex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ozkhwarizmi.verificaflex.entities.Avaliacao;

public class ResultActivity extends AppCompatActivity {

    TextView txtAlcool, txtGasolina, txtMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //É um arquivo "pacote" que vem de outra tela e resgata o que se foi passado
        Bundle bundle = getIntent().getExtras();
        Avaliacao avaliacao = (Avaliacao) bundle.getSerializable("avaliacao");

        this.txtAlcool = findViewById(R.id.txtAlcool);
        this.txtGasolina = findViewById(R.id.txtGasolina);
        this.txtMensagem = findViewById(R.id.txtMensagem);
        //
        this.txtAlcool.setText(String.valueOf(avaliacao.getValorAlcool()));
        this.txtGasolina.setText(String.valueOf(avaliacao.getValorGasolina()));

        this.txtMensagem.setText(avaliacao.getMensagem());
    }
}
