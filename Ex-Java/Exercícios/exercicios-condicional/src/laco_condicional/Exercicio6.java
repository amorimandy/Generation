package laco_condicional;

	import java.util.Scanner;

	public class Exercicio6 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int idade;
		
			System.out.println("Entre com a idade do(a) aluno(a): ");
			idade = ler.nextInt();
			
			if(idade>=5 && idade<=7){
				System.out.println("A categoria do(a) aluno(a) � Infantil A.");
			} else if(idade>=8 && idade<=11){
				System.out.println("A categoria do(a) aluno(a) � Infantil B.");
			} else if(idade>=12 && idade<=13){
				System.out.println("A categoria do(a) aluno(a) � Juvenil A.");
			} else if(idade>=14 && idade<=17){
				System.out.println("A categoria do(a) aluno(a) � Juvenil B.");
			} else if(idade>=18){
				System.out.println("A categoria do(a) aluno(a) � Adultos.");
			} else { 
				System.out.println("O(a) aluno(a) n�o tem idade para ser inclu�do(a) em nenhuma das categorias.");
			}
		}
	}
