package com.letscode.programmer;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
        Scanner sc = new Scanner(System.in);
        int[]numeros = new int[5];
        int i = 0;
        do{
            System.out.println("Insira um número: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
            i++;
        }while (i < 5);

        System.out.print("Números Ímpares:");
        for (int j = 0; j < numeros.length; j++){
            if (numeros[j] % 2 != 0) System.out.print(" " + numeros[j]);
        }
        System.out.println();
        System.out.print("Números Pares:");
        for (int j = 0; j < numeros.length; j++){
            if (numeros[j] % 2 == 0) System.out.print(" " + numeros[j]);
        }
    }
}
