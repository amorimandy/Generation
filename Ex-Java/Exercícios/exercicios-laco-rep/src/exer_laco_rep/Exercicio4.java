package exer_laco_rep;

import java.util.*;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, total=0;
		
		do {
			System.out.println("Informe o número desejado: ");
			num = ler.nextInt();
			total = total+num;
		} while (num!=0); 
		
		System.out.println("A soma dos números digitados é " + total);
	}
}
