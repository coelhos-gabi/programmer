package com.letscode.programmer;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em graus Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8 + 32);
        System.out.printf("A temperatura %.1fºC em Fahrenheit é: %.1f", celsius, fahrenheit);
    }
}
