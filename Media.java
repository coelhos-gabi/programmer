package com.letscode.programmer;

// import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.US); caso queira entrada de dado com . e não ,
        System.out.println("Informe a nota da primeira prova: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a nota da terceira prova: ");
        double nota3 = sc.nextDouble();
        System.out.println("Informe a nota da quarta prova: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Media do aluno: %f \n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno em recuperação");

        }

    }
}