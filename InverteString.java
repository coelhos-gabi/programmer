package com.letscode.programmer;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um texto:");
        String texto = sc.nextLine();
        for (int i = texto.length() - 1 ; i >= 0; i--){
            System.out.print(texto.charAt(i));
        }
    }
}
