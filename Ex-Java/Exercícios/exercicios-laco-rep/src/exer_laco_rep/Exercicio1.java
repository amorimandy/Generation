package exer_laco_rep;

public class Exercicio1 {

	public static void main(String[] args) {
				
		int valor, cont=0;
		
		for(int i=1000; i<=1999; i++) {
			valor = i % 11;
			if(valor==5)
			cont++;
			{
			System.out.println(i);
			}
		} 
		System.out.println("A quantidade de n�meros que divididos por 11 obt�m 5 de resto, �: " + cont);
	}
}