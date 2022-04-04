package com.letscode.programmer;

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        //Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
        double[] numeros = new double[5];
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;
        double media;
        for (int i = 0; i < 5; i++){
            System.out.printf("Insira o numero %d:",i+1);
            double numero = sc.nextDouble();
            numeros[i] = numero;
        }
        double maior = numeros[0];
        double menor = numeros[0];
        for (double numero : numeros){
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
            soma += numero;
        }
        media = soma/ numeros.length;

        System.out.println("O maior número é: "+ maior);
        System.out.println("O menor número é: "+menor);
        System.out.println("A média dos números é: " + media);
    }
}
