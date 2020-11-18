package exer_laco_rep;

import java.util.*;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, soma = 0, incremento = 0;
				
		System.out.println("Informe o número desejado: ");
		num = ler.nextInt();
		
		do{
			soma += incremento++;
		} while (incremento<=num);
		System.out.println(soma);
	}
}