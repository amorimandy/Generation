package fluxo;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int valor1, valor2, valor3, maior=0;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Informe o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.println("Informe o terceiro valor: ");
		valor3 = ler.nextInt();
						
		if(valor1>valor2 && valor1>valor3) {
			maior=valor1;
		} else if(valor2>valor1 && valor2>valor3) {
			maior=valor2;
		} else {
			maior=valor3;
		}
		
		if(valor1==valor2 || valor2==valor3 || valor3==valor1){
			System.out.println("Os valores são idênticos, insira valores diferentes.");
		} else {
			System.out.println("Dentre os valores informados, o número " + maior + " é o maior.");
		}
	}
}