package generation_mod1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idadeEmDias, anos, meses, dias; 
		
		System.out.println("Entre com sua idade em dias: ");
		idadeEmDias = ler.nextInt();
		
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = (idadeEmDias%365)%30;
		
		System.out.println("Voc� tem " + anos + " ano(s), " + meses + " m�s(es) e "
				+ dias + " dia(s) de vida. Parab�ns!");
	}
}