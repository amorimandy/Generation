package vet_mat_poo;

//1.Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
//e apresente também quantas foram as ocorrências da maior pontuação.

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
		System.out.println("\nA média dos números rolados no dado é " + media + "."
				+ " \nO maior valor é " + maiorPont + ", ele aparece " + maiorViews + " vezes.");
	}
}
