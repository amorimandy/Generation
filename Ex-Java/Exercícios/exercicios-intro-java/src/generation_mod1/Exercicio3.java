package generation_mod1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A, B, C, R, S, D; 
		
		System.out.println("Entre com o valor de A: ");
		A = ler.nextInt(); 
		System.out.println("Entre com o valor de B: ");
		B = ler.nextInt(); 
		System.out.println("Entre com o valor de C: ");
		C = ler.nextInt(); 
		
		R = A*A + A*B*2 + B*B;
		S = B*B + B*C*2 + C*C;
		
		D = (R + S)/2;
		
		System.out.println("O valor de D é " + D);
	}
}
