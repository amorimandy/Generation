package laco_condicional;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int[] n = new int[4]; 
		
		for(int i=0; i<=3; i++){
			System.out.println("Entre com o número: ");
			n[i] = ler.nextInt();
		} 
		
		if(n[2]*n[2]>=1000){
			System.out.println("O terceiro valor é " + n[2] + " e sua potência é " + n[2]*n[2]);				
		} else { 
			for(int i=0; i<=3; i++){
			System.out.println("O valor é " + n[i] + " e sua potência é " + n[i]*n[i]);
			}
		}
	}
}
