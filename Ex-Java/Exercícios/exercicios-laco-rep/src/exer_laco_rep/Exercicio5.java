package exer_laco_rep;

import java.util.*;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, total=0, cont = 0, media;
		
		do {
			System.out.println("Informe o n�mero desejado: ");
			num = ler.nextInt();
			if(num%3==0 && num!=0) {
				total = total + num;
				cont++;
			}
		} while (num!=0); 
		
		media = total/cont;
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 � " + media);
	}
}
