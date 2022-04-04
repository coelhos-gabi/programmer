package com.letscode.programmer;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        System.out.printf("A soma dos números %d e %d é: %d%n",num1, num2, soma);
        System.out.printf("A subtracao de %d e %d é: %d %n",num1, num2, subtracao);
        System.out.printf("O produto de %d e %d é: %d %n", num1, num2, multiplicacao);
        if (num2 > 0) {
            float divisao = ((float)num1/num2);
            System.out.printf("A divisao de %d e %d é: %.2f %n", num1, num2, divisao);
        }
        else System.out.printf("Não é possivel divisão %d e %d%n",num1, num2);
    }
}
