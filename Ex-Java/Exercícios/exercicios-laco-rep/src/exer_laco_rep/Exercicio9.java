package exer_laco_rep;

import java.util.*;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num, i = 0;
		
		System.out.println("Insira um número: " );
		num = ler.nextInt();
		System.out.print(num + " ");
		
		while(num<=100){
			num = num*3;
			System.out.print(num + " ");
		}
	}
}
