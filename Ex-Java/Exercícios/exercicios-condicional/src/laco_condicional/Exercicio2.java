package laco_condicional;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int horasTrabalhadas, salario, valorExc, excessoSalario;
		String nome, codigo; 
		
		System.out.println("Entre com o c�digo do(a) funcion�rio(a): ");
		codigo = ler.nextLine();
		System.out.println("Entre com o nome do(a) funcion�rio(a): ");
		nome = ler.nextLine();
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		horasTrabalhadas = ler.nextInt();
				
		if(horasTrabalhadas>50){
			valorExc = horasTrabalhadas - 50;
			excessoSalario = valorExc * 20;
			salario = 50*10;
		} else {
			salario = horasTrabalhadas * 10;
			valorExc = 0;
			excessoSalario = 0;
		}		
		System.out.println("O(a) funcion�rio(a) " + nome + ", cadastrado(a) no c�digo " + codigo + " receber� o sal�rio de R$ "
				+ salario + " e o valor excedente de R$ " + excessoSalario + " por " + valorExc + " hora(s) extra(s) trabalhada(s)."
						+ " O valor total do sal�rio de " + nome + " � de R$ " + (salario + excessoSalario));	
	}
}
