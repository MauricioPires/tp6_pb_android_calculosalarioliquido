package com.example.ynascimento.tp6_pb_calculosalarioliquido;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double salarioLiquido, salarioBruto, pensaoAlimenticia, planoDeSaude, outrosDescontos, dependentes,
            totalDescontos, totalPorcentagemDescontos;
    String fSalarioLiquido, fTotalDescontos, fTotalPorcentagem;
    EditText vSalarioBruto, vDependentes, vPensaoAlimenticia, vPlanoDeSaude, vOutrosDescontos;
    TextView vResultado;
    CalculaSalario calculaSalario = new CalculaSalario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vSalarioBruto = (EditText) findViewById(R.id.campoSalarioBruto);
        vDependentes = (EditText) findViewById(R.id.campoDependentes);
        vPensaoAlimenticia = (EditText) findViewById(R.id.campoPensao);
        vPlanoDeSaude = (EditText) findViewById(R.id.campoPlanoSaude);
        vOutrosDescontos = (EditText) findViewById(R.id.campoOutrosDescontos);

    }

    protected void btnCalculaSalario(View v){

        if (vSalarioBruto.getText().length() == 0){
            Toast.makeText(this, "Preencher o Salário Bruto!", Toast.LENGTH_LONG).show();
        } else {

            salarioBruto = Double.parseDouble(vSalarioBruto.getText().toString());
            dependentes = Double.parseDouble(vDependentes.getText().toString());
            pensaoAlimenticia = Double.parseDouble(vPensaoAlimenticia.getText().toString());
            planoDeSaude = Double.parseDouble(vPlanoDeSaude.getText().toString());
            outrosDescontos = Double.parseDouble(vOutrosDescontos.getText().toString());

            salarioLiquido = calculaSalario.resultadoDescontos(
                    salarioBruto, outrosDescontos, pensaoAlimenticia,dependentes);

            totalDescontos = calculaSalario.inss + calculaSalario.irpf + calculaSalario.totalDependentes +
                    calculaSalario.totalPensaoAlimenticia + calculaSalario.totalOutrosDescontos;

            totalPorcentagemDescontos = (totalDescontos * 100) / salarioBruto;

            DecimalFormat df2 = new DecimalFormat(".##");

            fSalarioLiquido = df2.format(salarioLiquido);
            fTotalDescontos = df2.format(totalDescontos);
            fTotalPorcentagem = df2.format(totalPorcentagemDescontos);


            Intent goResultado = new Intent(getApplicationContext(), ResultadoActivity.class);
            goResultado.putExtra("salarioliquido", fSalarioLiquido);
            //goResultado.putExtra("salarioliquido", salarioLiquido);
            goResultado.putExtra("totaldescontos", fTotalDescontos);
            goResultado.putExtra("porcentagemdescontos", fTotalPorcentagem);
            startActivity(goResultado);
        }
    }
}
