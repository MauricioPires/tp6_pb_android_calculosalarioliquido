package com.example.ynascimento.tp6_pb_calculosalarioliquido;

public class CalculaINSS {

    double descINSSFaixa1, descINSSFaixa2, descINSSFaixa3, descINSSFaixa4,
            DescINSS, valorFaixa1, valorMinFaixa2, valorMaxFaxia2, valorMinFaixa3,
            valorMaxFaixa3, valorFaixa4;

    public double resultadoINSS(double salarioSemINSS){

        descINSSFaixa1 =  0.08;
        descINSSFaixa2 = 0.09;
        descINSSFaixa3 = 0.11;
        descINSSFaixa4 = 608.44;

        valorFaixa1 = 1659.38;
        valorMinFaixa2 = 1659.39;
        valorMaxFaxia2 = 2765.66;
        valorMinFaixa3 = 2765.67;
        valorMaxFaixa3 = 5531.31;
        valorFaixa4 = 5531.32;

        if (salarioSemINSS <= valorFaixa1){
            DescINSS = salarioSemINSS * descINSSFaixa1;

        } else if (salarioSemINSS >= valorMinFaixa2 & salarioSemINSS <= valorMaxFaxia2){
            DescINSS = salarioSemINSS * descINSSFaixa2;

        } else if (salarioSemINSS >= valorMinFaixa3 & salarioSemINSS <= valorMaxFaixa3){
            DescINSS = salarioSemINSS * descINSSFaixa3;

        } else if (salarioSemINSS > valorFaixa4){
            DescINSS = descINSSFaixa4;
        }

        return  DescINSS;
    }

}
