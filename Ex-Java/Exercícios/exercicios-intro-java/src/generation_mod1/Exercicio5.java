package generation_mod1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, idade; 
		
		System.out.println("Quantos anos voc� tem? ");
		anos = ler.nextInt();
		
		System.out.println("Que m�s voc� nasceu? ");
		meses = ler.nextInt();
		
		System.out.println("Que dia voc� nasceu? ");
		dias = ler.nextInt();
		
		idade = (anos-1)*365 + (meses+1)*30 + dias-1;
				
		System.out.println("Voc� tem " + idade + " dias de idade.");
	}
}
