package com.letscode.programmer;

import java.util.Scanner;

public class TicTacToe {

    String[][] matriz = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};

    public void mostrar(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void jogada(String jogador){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a linha: ");
        int linha = sc.nextInt();
        System.out.print("Insira a coluna: ");
        int coluna = sc.nextInt();
    }


    public boolean gameTie(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (matriz[i][j] == "-"){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean gameWon(){
        for (int linha = 0; linha < matriz.length; linha++){
            if (matriz[linha][0] != "-"){
                if (matriz[linha][0] == matriz[linha][1] && matriz[linha][0] == matriz[linha][2]){
                    return true;
                }
            }
        }
        for (int coluna = 0; coluna < matriz.length; coluna++){
            if (matriz[0][coluna] != "-"){
                if (matriz[0][coluna] == matriz[1][coluna] && matriz[0][coluna] == matriz[2][coluna]){
                    return true;
                }
            }
        }
        return false;
    }

    public String winnerIs(){
        String player;

        for (int linha = 0; linha < matriz.length; linha++){
            if (matriz[linha][0] != "-"){
                if (matriz[linha][0] == matriz[linha][1] && matriz[linha][0] == matriz[linha][2]){
                    return matriz[linha][0];
                }
            }
        }
        for (int coluna = 0; coluna < matriz.length; coluna++){
            if (matriz[0][coluna] != "-"){
                if (matriz[0][coluna] == matriz[1][coluna] && matriz[0][coluna] == matriz[2][coluna]){
                    return matriz[0][coluna];
                }
            }
        }
        return "";
    }

    public boolean gameOver(){
        if (this.gameWon() == true){
            return true;
        }
        if (this.gameTie() == true){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        TicTacToe jogo = new TicTacToe();
        String jogador1 = "x";
        String jogador2 = "o";
        jogo.mostrar();
        do{
            jogo.jogada(jogador1);
            jogo.mostrar();
            if (jogo.gameWon() == true){
                break;
            }
            if (jogo.gameTie() == true){
                break;
            }
            jogo.jogada(jogador2);
            jogo.mostrar();
            if (jogo.gameWon() == true){
                break;
            }
            if (jogo.gameTie() == true){
                break;
            }
        }while (jogo.gameOver() == false);

        if (jogo.gameTie() == true){
            System.out.println("EMPATOU!");
        }
        if (jogo.gameWon() == true){
            if (jogo.winnerIs() == "x"){
                System.out.println("Jogador1 venceu!");
            } else{
                System.out.println("Jogador2 venceu!");
            }
        }
    }
}