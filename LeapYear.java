package com.letscode.programmer;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) &&
            !(year % 100 == 0) || (year % 400 == 0)) {

            System.out.printf("O ano %d é bissexto", year);
        } else {

            System.out.printf("O ano %d não é bissexto", year);
        }

    }
}
