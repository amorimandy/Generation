package exer_laco_rep;

import java.util.*;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numPar = 0, numImp = 0, num;
		
		System.out.println("Escreva 10 n�meros: " );
		for(int i=0; i<10; i++) {
			num = ler.nextInt();
			if(num%2==0) {
				numPar++;
			} else {
				numImp++;
			}
		}
		System.out.println("Nessa lista tem " + numImp + " n�meros �mpares.");
		System.out.println("Nessa lista tem " + numPar + " n�meros pares.");
	}
}