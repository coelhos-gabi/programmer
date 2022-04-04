package com.letscode.programmer;

import java.util.Scanner;

public class PolegadaEmCm {
    public static final float CONVERSOR_POLEGADAS = 2.54f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor em polegadas:");
        float valorPolegada = sc.nextFloat();
        float conversao = valorPolegada*CONVERSOR_POLEGADAS;
        System.out.printf("%.2f polegadas em centímetros é: %.2f", valorPolegada, conversao);

    }
}
