package com.letscode.programmer;

import java.util.Scanner;

public class ConverteDolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a cotação do dólar do dia:");
        float dolar = sc.nextFloat();
        System.out.println("Insira o valor em reais a ser convertido:");
        float reais = sc.nextFloat();
        float conversao = reais/dolar;
        System.out.printf("Conversão: R$%.2f equivale a U$%.2f",reais,conversao);

    }
}
