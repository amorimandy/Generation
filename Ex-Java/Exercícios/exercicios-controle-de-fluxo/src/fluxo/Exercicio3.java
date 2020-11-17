package fluxo;

import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int qtd;
		double valor;
		
		System.out.println("Informe a quantidade de maçãs: ");
		qtd = ler.nextInt();
		
		if(qtd>=12) {
			valor = qtd * 0.25;
		} else {
			valor = qtd * 0.3;
		}
		
		System.out.println("O preço total das maçãs é de R$ " + valor);
	}
	
}