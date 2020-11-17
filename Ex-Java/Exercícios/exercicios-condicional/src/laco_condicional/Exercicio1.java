package laco_condicional;

import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int pesoTomates, excesso = 0, valorExc;
		
		System.out.println("Olá, João, entre com a quantidade total de kilos: ");
		pesoTomates = ler.nextInt();
				
		if(pesoTomates>50){
				excesso = pesoTomates - 50;
				valorExc = excesso * 4;
		} else {
			excesso = 0;
			valorExc = 0;
		}		
		System.out.println("O peso excedente é de " + excesso + " Kg "
				+ "e o valor da multa a ser paga é de R$ " + valorExc);
	}
}
