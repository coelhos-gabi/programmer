package com.letscode.programmer;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]nomes = new String[5];
        double[]pesos = new double[5];
        double[]alturas = new double[5];
        double[]imcs = new double[5];
        // imc = peso / altura*altura
        double imc;
        System.out.println("--- Cadastro de 5 pessoas com suas alturas e pesos ---");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Insira o nome:");
            String nome = sc.nextLine();
            nomes[i] = nome;
            System.out.println("Insira a altura:");
            double altura = sc.nextDouble();
            alturas[i] = altura;
            System.out.println("Insira o peso:");
            double peso = sc.nextDouble();
            pesos[i] = peso;
            sc.nextLine();
        }
        for (int i = 0; i<nomes.length; i++){
            imc = pesos[i]/(alturas[i]*alturas[i]);
            imcs[i] = imc;
        }
        for (int i = 0; i < imcs.length; i++){
            if (imcs[i] < 18.5 || imcs[i] > 25){
                System.out.printf("%s está com peso fora do ideal com IMC = %.2f%n",nomes[i],imcs[i]);
            }
        }
    }
}
