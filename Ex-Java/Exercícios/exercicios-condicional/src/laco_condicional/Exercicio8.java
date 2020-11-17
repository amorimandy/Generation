package laco_condicional;

import java.util.Scanner;

	public class Exercicio8 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int num;
						
			System.out.println("Entre com o valor: ");
			num = ler.nextInt();

			if(num>100){
				System.out.println("O número digitado é " + num);
			} else {
				System.out.println("O valor digitado é considerado inválido. Retorno = 0");
			}
		}
	}