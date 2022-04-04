package com.letscode.programmer;

import java.util.Scanner;

public class ImparMaiusculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String entrada = sc.nextLine();
        for (int i = 0; i < entrada.length(); i++){
            if (i % 2 == 0){
                System.out.print(Character.toUpperCase(entrada.charAt(i)));
            }
        }
    }
}
