package laco_condicional;

import java.util.Scanner;

	public class Exercicio4 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int num;
			String parImpar, negPos;
			
			System.out.println("Entre com o valor: ");
			num = ler.nextInt();
			
			if(num%2==0){
				parImpar = "par";
			} else { 
				parImpar = "ímpar";
			}
			
			if(num<0) {
				negPos = "negativo";
			} else {
				negPos = "positivo";
			}
			
			System.out.println("O número " + num + " é " + parImpar + " e " + negPos + ".");
		}
	}