package laco_condicional;

import java.util.Scanner;

	public class Exercicio8 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int num;
						
			System.out.println("Entre com o valor: ");
			num = ler.nextInt();

			if(num>100){
				System.out.println("O n�mero digitado � " + num);
			} else {
				System.out.println("O valor digitado � considerado inv�lido. Retorno = 0");
			}
		}
	}