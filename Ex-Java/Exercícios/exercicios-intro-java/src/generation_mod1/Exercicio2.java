package generation_mod1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoFab, custoConsum, porcDist = 28, porcImp = 45;
		
		System.out.println("Informe o custo de fábrica: ");
		custoFab = ler.nextDouble(); 
			
		custoConsum = ((custoFab*porcDist/100) + (custoFab*porcImp/100) + custoFab); 
		
		System.out.println("O valor total do carro é R$ " + custoConsum);
	}
}
