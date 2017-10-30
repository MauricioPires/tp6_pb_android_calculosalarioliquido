package com.example.ynascimento.tp6_pb_calculosalarioliquido;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView vResultadoSalario, vResultadoDescontos, vResultadoPorcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        vResultadoSalario = (TextView) findViewById(R.id.resultadoSalario);
        vResultadoDescontos = (TextView) findViewById(R.id.resultadoDescontos);
        vResultadoPorcentagem = (TextView) findViewById(R.id.resultadoPorcentagem);

        String salarioliquido = getIntent().getExtras().getString("salarioliquido");
        //vResultadoSalario.setText(String.format("%.2f", salarioliquido));
        vResultadoSalario.setText(salarioliquido);

        String totalDescontos = getIntent().getExtras().getString("totaldescontos");
        vResultadoDescontos.setText(totalDescontos);

        String totalPorcentagemDescontos = getIntent().getExtras().getString("porcentagemdescontos");
        vResultadoPorcentagem.setText(totalPorcentagemDescontos + " %");

    }
}
