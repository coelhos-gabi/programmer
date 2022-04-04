package com.letscode.programmer;

import java.util.Scanner;

public class MaiorNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Cadastro de 5 convidados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o nome:");
            String nome = sc.nextLine();
            nomes[i] = nome;
        }
        String maiorNome = nomes[0];
        for (String nome : nomes){
            if (nome.length() > maiorNome.length()){
                maiorNome = nome;
            }
        }
        int contador = 0;
        for (String nome : nomes){
            if(nome.length() == maiorNome.length()){
                contador += 1;
            }
        }
        String[]maioresNomes = new String[contador];
        int k = 0;
        for (String nome : nomes){
            if(nome.length() == maiorNome.length()){
                maioresNomes[k] = nome;
                k++;
            }
        }
        System.out.println("Nome mais longo:");
        for (String nome : maioresNomes) {
            System.out.println(nome);
        }
    }
}