package com.example.ynascimento.tp6_pb_calculosalarioliquido;

public class CalculaIRPF {

    double descIRPFFaixa1, descIRPFFaixa2, descIRPFFaixa3, descIRPFFaixa4, descIRPFFaixa5,
            DescIRPF, valorFaixa1, valorMinFaixa2, valorMaxFaixa2, valorMinFaixa3, valorMaxFaixa3,
            valorMinFaixa4, valorMaxFaixa4, valorFaixa5;

    public double resultadoIRPF(double salarioSemIRPF){

        descIRPFFaixa1 = 0;
        descIRPFFaixa2 = 7.5/100;
        descIRPFFaixa3 = 15.0/100;
        descIRPFFaixa4 = 22.5/100;
        descIRPFFaixa5 = 27.5/100;

        valorFaixa1 = 1903.98;
        valorMinFaixa2 = 1903.99;
        valorMaxFaixa2 = 2826.65;
        valorMinFaixa3 = 2826.66;
        valorMaxFaixa3 = 3751.05;
        valorMinFaixa4 = 3751.06;
        valorMaxFaixa4 = 4664.68;
        valorFaixa5 = 4664.69;

        if (salarioSemIRPF <= valorFaixa1){
            DescIRPF = salarioSemIRPF * descIRPFFaixa1;

        } else if (salarioSemIRPF >= valorMinFaixa2 & salarioSemIRPF <= valorMaxFaixa2){
            DescIRPF = salarioSemIRPF * descIRPFFaixa2;

        } else if (salarioSemIRPF >= valorMinFaixa3 & salarioSemIRPF <= valorMaxFaixa3){
            DescIRPF = salarioSemIRPF * descIRPFFaixa3;

        } else if (salarioSemIRPF >= valorMinFaixa4 & salarioSemIRPF <= valorMaxFaixa4){
            DescIRPF = salarioSemIRPF * descIRPFFaixa4;

        } else if (salarioSemIRPF > valorFaixa5){
            DescIRPF = salarioSemIRPF * descIRPFFaixa5;
        }

        return DescIRPF;
    }
}
