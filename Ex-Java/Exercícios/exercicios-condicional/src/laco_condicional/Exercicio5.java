package laco_condicional;

	import java.util.Scanner;

	public class Exercicio5 {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			
			float indicePol;
		
			System.out.println("Entre com o �ndice da polui��o coletado: (ex.: 0,3)");
			indicePol = ler.nextFloat();
			
			if(indicePol>=0.3 && indicePol<=0.39){
				System.out.println("A Secretaria de Meio Ambiente informa: 'A ind�stria 1 deve suspender suas atividades!'");
			} else if(indicePol>=0.4 && indicePol<=0.49){
				System.out.println("A Secretaria de Meio Ambiente informa: 'As ind�strias 1 e 2 devem suspender suas atividades!'");
			} else if(indicePol>=0.5){
				System.out.println("A Secretaria de Meio Ambiente informa: 'Todas as ind�strias devem suspender suas atividades!'");
			} else {
				System.out.println("A Secretaria de Meio Ambiente informa: 'As ind�strias est�o autorizadas a manter suas atividades!'.");
			}
		}
	}
