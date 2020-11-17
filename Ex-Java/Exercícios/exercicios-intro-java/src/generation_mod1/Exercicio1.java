package generation_mod1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, soma, media;
		
		System.out.println("Entre com o valor da primeira nota: (separado por vírgula, ex.: 8,4) ");
		n1 = ler.nextFloat(); 
		System.out.println("Entre com o valor de segunda nota: (separado por vírgula, ex.: 8,4) ");
		n2 = ler.nextFloat();
		System.out.println("Entre com o valor de terceira nota: (separado por vírgula, ex.: 8,4) ");
		n3 = ler.nextFloat();
		
		soma = (n1*2) + (n2*3) + (n3*5);
		media = soma/10;
		
		System.out.println(media);
	}
}
