package com.letscode.programmer;

import java.util.Scanner;

public class NomeIdade {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]nomes = new String[5];
        int[]idades = new int[5];
        int soma = 0;
        float media;
        int idadeMaior;
        int idadeMenor;
        System.out.println("Cadastro de 5 pessoas com suas idades:");
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Insira o nome:");
            String nome = sc.nextLine();
            nomes[i] = nome;
            System.out.println("Insira a idade:");
            int idade = sc.nextInt();
            idades[i] = idade;
            sc.nextLine();
        }
        idadeMaior = idades[0];
        idadeMenor = idades[0];
        int contadorIdadeMaior = 0;
        int contadorIdadeMenor = 0;
        for (int idade : idades){
            soma += idade;
            if (idade >= idadeMaior){
                idadeMaior = idade;
            }
            if(idade < idadeMenor){
                idadeMenor = idade;
            }
        }
        for (int idade : idades){
            if (idade == idadeMaior){
                contadorIdadeMaior += 1;
            }
            if(idade == idadeMenor){
                contadorIdadeMenor += 1;
            }
        }
        String[]maisVelhos = new String[contadorIdadeMaior];
        String[]maisNovos = new String[contadorIdadeMenor];
        int j = 0;
        int k = 0;
        for (int i = 0; i< idades.length; i++){
            if (idades[i] == idadeMaior){
                maisVelhos[j] = nomes[i];
                j++;
            }
            if(idades[i] == idadeMenor){
                maisNovos[k] = nomes[i];
                k++;
            }
        }
        media = ((float)soma/ nomes.length);
        System.out.println("A pessoa mais nova é:");
        for (String nome : maisNovos){
            System.out.println(nome+ " " + idadeMenor + " anos");
        }
        System.out.println("A pessoa mais velha é:");
        for (String nome : maisVelhos){
            System.out.println(nome + " " + idadeMaior + " anos");
        }
        System.out.println("A média das idades é: "+media);
    }
}
