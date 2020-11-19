package vet_mat_poo;

//1.Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
//e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int[] lancamentos = new int[10]; 
		int i, maiorPont = 0, soma = 0, min = 1, max = 6, maiorViews = 0;
		float media;
		
		Scanner ler = new Scanner (System.in);
			
		for(i=0; i<lancamentos.length; i++) {
			lancamentos[i] = (int)(Math.random() * (max - min +1) + min);
			if(maiorPont==lancamentos[i]) {
				maiorViews++;
			}
			if(maiorPont<lancamentos[i]) {
				maiorPont=lancamentos[i];
				maiorViews = 1;
			}
			soma = soma+lancamentos[i];
			System.out.print(lancamentos[i] + " ");
		}
		media = soma/(float)10;
		System.out.println("\nA m�dia dos n�meros rolados no dado � " + media + "."
				+ " \nO maior valor � " + maiorPont + ", ele aparece " + maiorViews + " vezes.");
	}
}
