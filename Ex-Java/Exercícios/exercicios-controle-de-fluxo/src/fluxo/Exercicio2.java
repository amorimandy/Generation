package fluxo;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int senha = 1234, entrada;
		
		System.out.println("Informe a senha de 4 dígitos: ");
		entrada = ler.nextInt();
		System.out.print("****");
		
		if(entrada==senha) {
			System.out.println("\nACESSO PERMITIDO");
		} else {
			System.out.println("\nACESSO NEGADO");
		}
		
	}
}