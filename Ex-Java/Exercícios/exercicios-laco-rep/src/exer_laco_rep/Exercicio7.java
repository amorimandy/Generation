package exer_laco_rep;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int numImp = 0, soma = 0; 
		
		for(int i=1; i<=500; i++) {
			if(i%2!=0 && i%3==0) {
				soma += i;
			} 
		}
		System.out.println("A soma dos números ímpares multiplos de 3 é " + soma + ".");
	}
}