package exer_laco_rep;

import java.util.*;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num=1, soma = 0, total = 0, media = 0;
		
		while(num>0) {
			System.out.println("Insira um n�mero: " );
			num = ler.nextInt();
			if(num>0) {
				soma = num + soma;
				total++;
//				total+=num;
			}
		} media = soma/total;
		
		System.out.println("A soma dos valores coletados � " + soma + ".");
		System.out.println("A m�dia dos valores coletados � " + media + ".");
		System.out.println("Ao total foram coletados " + total + " n�meros.");
	}
}
