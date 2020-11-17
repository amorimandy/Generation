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
			System.out.println("N�O � UM POL�GONO.");
		} 
		if(numLados>5) {
			System.out.println("POL�GONO N�O IDENTIFICADO.");
		}
		
		if(numLados==3) {
			System.out.println("Informe a medida da altura (em cm): ");
			h = ler.nextInt();
			area = ml * h / 2;
			System.out.println("A �rea total do tri�ngulo em cent�metros � " + area + "cm�.");
		} else if(numLados==4) {
			area = ml*ml;
			System.out.println("A �rea total do quadrado em cent�metros � " + area + "cm�.");
		} else if(numLados==5) {
			System.out.println("� um pent�gono.");
			//a = ler.nextInt();
			//area = 5*ml*a;
			//System.out.println("A �rea total do pent�gono em cent�metros � " + area + "cm�.");
		}
	}
}