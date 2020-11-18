package exer_laco_rep;

import java.util.*;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int total = 2, sal, maiorSal = 0, somaSal = 0, filhos, totalFil = 0, qtd100 = 0;
		float mediaFil = 0, mediaSal = 0, perc100 = 0;
		
		for(int i=0; i<total; i++) {
			System.out.println("Qual seu salário? " );
			sal = ler.nextInt();
			System.out.println("Quantos filhos você tem? " );
			filhos = ler.nextInt();
					
			somaSal = somaSal + sal;						
			if(sal>maiorSal) {
				maiorSal = sal; 
			} 
			if(sal<100){
				qtd100++;
			}
			totalFil = totalFil + filhos;
			mediaFil = totalFil/(float)total;						
			mediaSal = somaSal/(float)total;
			perc100 = qtd100*100/(float)total;

		}
		System.out.println("A média salarial dos habitantes é de R$ " + mediaSal + "0.");
		System.out.println("A média da quantidade de filhos por habitante é de " + mediaFil + " filhos.");
		System.out.println("O maior salário nessa lista equivale a R$ " + maiorSal + ",00.");
		System.out.println("O percentual de pessoas com salário até R$100,00 é de " + perc100 + "%.");		
	}
}