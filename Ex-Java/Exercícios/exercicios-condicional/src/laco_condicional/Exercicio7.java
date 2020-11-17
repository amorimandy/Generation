package laco_condicional;

import java.util.Scanner;

	public class Exercicio7 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			float base, altura, area;
						
			System.out.println("Entre com o valor da base: ");
			base = ler.nextFloat();
			System.out.println("Entre com o valor da altura: ");
			altura = ler.nextFloat();
			
			if(base>0 && altura>0){
				area = base*altura/2;			
				System.out.println("A área do triangulo é " + area + ".");
			} else {
				System.out.println("Os valores não são válidos.");
			}
		}
	}