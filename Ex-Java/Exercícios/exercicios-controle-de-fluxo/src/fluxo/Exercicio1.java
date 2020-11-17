package fluxo;

import java.util.*;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int valor1, valor2, maior=0;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Informe o segundo valor: ");
		valor2 = ler.nextInt();
						
		if(valor1>valor2) {
			maior=valor1;
		} else {
			maior=valor2;
		} 
		
		if(valor1==valor2){
			System.out.println("Os valores são idênticos, insira valores diferentes.");
		} else {
			System.out.println("Dentre os valores informados, o número " + maior + " é o maior.");
		}
	}
}
