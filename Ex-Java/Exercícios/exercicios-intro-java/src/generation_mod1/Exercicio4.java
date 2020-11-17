package generation_mod1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tempoEventoSeg, tempoEventoTotal, horas, minutos, segundos; 
		
		System.out.println("Entre com a duração do evento em segundos: ");
		tempoEventoSeg = ler.nextInt();
		
		horas = tempoEventoSeg/3600;
		minutos = (tempoEventoSeg%3600)/60;
		segundos = (tempoEventoSeg%3600)%60;
		
		System.out.println("O evento teve duração total de " + horas + " hora(s), " + minutos + " minutos e "
				+ segundos + " segundos");
	}
}
