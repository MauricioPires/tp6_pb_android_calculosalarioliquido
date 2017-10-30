package com.example.ynascimento.tp6_pb_calculosalarioliquido;



public class CalculaSalario {

    double totalPensaoAlimenticia, totalDependentes, totalOutrosDescontos, salarioComDescontos,inss, irpf;
    double valorPorDependente = 189.59;
    CalculaINSS calculaINSS = new CalculaINSS();
    CalculaIRPF calculaIRPF = new CalculaIRPF();

    public double resultadoDescontos(double valorSalarioBruto,
                                     double outrosDescontos ,
                                     double pensaoAlimenticia,
                                     double qtdDependentes){

        totalPensaoAlimenticia = pensaoAlimenticia;
        totalDependentes = qtdDependentes * valorPorDependente;
        totalOutrosDescontos = outrosDescontos;
        inss = calculaINSS.resultadoINSS(valorSalarioBruto);
        irpf = calculaIRPF.resultadoIRPF(valorSalarioBruto);

        salarioComDescontos = valorSalarioBruto -
                            totalPensaoAlimenticia -
                            totalDependentes -
                            totalOutrosDescontos -
                            inss -
                            irpf;

        return salarioComDescontos;
    }
}
