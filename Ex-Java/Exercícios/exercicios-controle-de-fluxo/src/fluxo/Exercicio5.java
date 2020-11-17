package fluxo;

import java.util.*;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numLados;
		double area, ml, h, b;
		
		System.out.println("Informe a quantidade de lados: ");
		numLados = ler.nextInt();
		System.out.println("Informe a medida do lado (em cm): ");
		ml = ler.nextInt();
		
		if(numLados<3) {
			System.out.println("NÃO É UM POLÍGONO.");
		} 
		if(numLados>5) {
			System.out.println("POLÍGONO NÃO IDENTIFICADO.");
		}
		
		if(numLados==3) {
			System.out.println("Informe a medida da altura (em cm): ");
			h = ler.nextInt();
			area = ml * h / 2;
			System.out.println("A área total do triângulo em centímetros é " + area + "cm².");
		} else if(numLados==4) {
			area = ml*ml;
			System.out.println("A área total do quadrado em centímetros é " + area + "cm².");
		} else if(numLados==5) {
			System.out.println("É um pentágono.");
			//a = ler.nextInt();
			//area = 5*ml*a;
			//System.out.println("A área total do pentágono em centímetros é " + area + "cm².");
		}
	}
}