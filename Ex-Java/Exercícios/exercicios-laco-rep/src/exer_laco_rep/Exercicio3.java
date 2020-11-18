package exer_laco_rep;

import java.util.*;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade = 0, maior50 = 0, menor21 = 0, end = -99;
		
		while(idade != end) {
			System.out.println("Escreva sua idade: " );
			idade = ler.nextInt();
			if(idade<21) {
				menor21++;
			} else if(idade>50) {
				maior50++;
			}
		}
		System.out.println("Nessa lista tem " + (menor21-1) + " menores de 21 anos.");
		System.out.println("Nessa lista tem " + maior50 + " maiores de 50 anos.");
	}
}
