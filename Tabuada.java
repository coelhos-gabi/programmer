package com.letscode.programmer;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número:");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 10){
            while (!(numero >= 1 && numero <= 10)){
                System.out.println("Inserir somente números entre 1 e 10");
                System.out.println("Insira um número:");
                numero = sc.nextInt();
            }
        }
        System.out.println("Tabuada do número " + numero);
        for (int i = 1; i <= 10; i++){
            int produto = i * numero;
            System.out.println(numero + " x " + i + " : "+produto);
        }
    }
}
