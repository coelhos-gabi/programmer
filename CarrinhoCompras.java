package com.letscode.programmer;

import java.util.Scanner;

public class CarrinhoCompras {
    public static void main(String[] args) {
        String[] carrinho = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos adicionar 5 frutas no carrinho de compras");
        for (int i = 0; i < carrinho.length; i++){
            System.out.printf("Digite a fruta %d:",i+1);
            String item = sc.nextLine();
            carrinho[i] = item;
        }
        System.out.println();
        System.out.print("Seu carrinho de frutas contém: ");
        for (String frutas : carrinho){
            System.out.print(frutas+ " ");
        }
    }
}
