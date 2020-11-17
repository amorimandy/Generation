package generation_mod1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, idade; 
		
		System.out.println("Quantos anos você tem? ");
		anos = ler.nextInt();
		
		System.out.println("Que mês você nasceu? ");
		meses = ler.nextInt();
		
		System.out.println("Que dia você nasceu? ");
		dias = ler.nextInt();
		
		idade = (anos-1)*365 + (meses+1)*30 + dias-1;
				
		System.out.println("Você tem " + idade + " dias de idade.");
	}
}
