package vet_mat_poo;

//2.Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.   

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int linha, coluna; 
		System.out.printf("Escreva a quantidade de linhas: ");
		linha = ler.nextInt();
		System.out.printf("Escreva a quantidade de colunas: ");
		coluna = ler.nextInt();
		
		int[][] N1 = new int[linha][coluna], N2 = new int[linha][coluna], M1 = new int[linha][coluna], M2 = new int[linha][coluna];
		
		System.out.printf("\nMatriz N1[" + linha + "][" + coluna + "]\n");
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				System.out.printf("Escreva o valor N1[%d][%d]: ", x+1, y+1);
				N1[x][y] = ler.nextInt();
			}
		}
		
		System.out.printf("\nMatriz N2[" + linha + "][" + coluna + "]\n");
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				System.out.printf("Escreva o valor N2[%d][%d]: ", x+1, y+1);
				N2[x][y] = ler.nextInt();
			}
		}		
		
		System.out.println("\nA matriz M1 é: ");
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				M1[x][y] = (N1[x][y] + N2[x][y]);
				System.out.print("[" + M1[x][y] + "] ");
			}
			System.out.println();
		}
		System.out.println("\nA matriz M2 é: ");
		for(int x = 0; x < linha; x++) {
			for(int y = 0; y < coluna; y++) {
				M2[x][y] = (N1[x][y] - N2[x][y]);
				System.out.print("[" + M2[x][y] + "] ");
			}
			System.out.println();
		}
	}
}
