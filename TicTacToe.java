package com.letscode.programmer;

import java.util.Scanner;

public class TicTacToe {

    String[][] tabuleiro = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};

    public void mostrarTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro.length; j++){
                System.out.print(tabuleiro[i][j]);
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

        while (!this.jogadaValida(linha, coluna)) {
            this.mostrarTabuleiro();
            System.out.println("Jogada inválida");
            System.out.print("Insira a linha: ");
            linha = sc.nextInt();
            System.out.print("Insira a coluna: ");
            coluna = sc.nextInt();
        }
        tabuleiro[linha-1][coluna-1] = jogador;
        }

    public boolean jogadaValida(int linha, int coluna){
        if (tabuleiro[linha-1][coluna-1].equals("-")) return true;
        return false;
    }

    public boolean gameTie(){
        for (int i = 0; i < tabuleiro.length; i++){
            for (int j = 0; j < tabuleiro.length; j++){
                if (tabuleiro[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean gameWon(){
        for (int linha = 0; linha < tabuleiro.length; linha++){
            if (!tabuleiro[linha][0].equals("-")){
                if (tabuleiro[linha][0].equals(tabuleiro[linha][1]) &&
                        tabuleiro[linha][0].equals(tabuleiro[linha][2])){
                    return true;
                }
            }
        }
        for (int coluna = 0; coluna < tabuleiro.length; coluna++){
            if (!tabuleiro[0][coluna].equals("-")){
                if (tabuleiro[0][coluna].equals(tabuleiro[1][coluna]) &&
                        tabuleiro[0][coluna].equals(tabuleiro[2][coluna])){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe jogo = new TicTacToe();
        String jogador1 = "x";
        String jogador2 = "o";
        System.out.println("################");
        System.out.println("JOGO DA VELHA");
        jogo.mostrarTabuleiro();

        while (true) {
            jogo.jogada(jogador1);
            jogo.mostrarTabuleiro();
            if (jogo.gameWon()) {
                break;
            }
            if (jogo.gameTie()) {
                break;
            }
            jogo.jogada(jogador2);
            jogo.mostrarTabuleiro();
            if (jogo.gameWon()) {
                break;
            }
            if (jogo.gameTie()) {
                break;
            }
        }

        if (jogo.gameTie()){
            System.out.println("EMPATOU!");
        }

        System.out.println("Fim de jogo!");
    }
}