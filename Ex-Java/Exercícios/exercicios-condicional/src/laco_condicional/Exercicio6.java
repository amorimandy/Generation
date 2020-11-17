package laco_condicional;

	import java.util.Scanner;

	public class Exercicio6 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			int idade;
		
			System.out.println("Entre com a idade do(a) aluno(a): ");
			idade = ler.nextInt();
			
			if(idade>=5 && idade<=7){
				System.out.println("A categoria do(a) aluno(a) é Infantil A.");
			} else if(idade>=8 && idade<=11){
				System.out.println("A categoria do(a) aluno(a) é Infantil B.");
			} else if(idade>=12 && idade<=13){
				System.out.println("A categoria do(a) aluno(a) é Juvenil A.");
			} else if(idade>=14 && idade<=17){
				System.out.println("A categoria do(a) aluno(a) é Juvenil B.");
			} else if(idade>=18){
				System.out.println("A categoria do(a) aluno(a) é Adultos.");
			} else { 
				System.out.println("O(a) aluno(a) não tem idade para ser incluído(a) em nenhuma das categorias.");
			}
		}
	}
