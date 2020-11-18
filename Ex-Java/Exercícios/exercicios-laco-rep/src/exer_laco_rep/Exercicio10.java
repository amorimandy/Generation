package exer_laco_rep;

import java.util.*;

public class Exercicio10 {
	public static void main(String[] args) {
		int num = 228;
		
		do {
			num=num+5;
			System.out.println(num);
			while (num>=300 && num<=400) {
				num=num+3;
				System.out.println(num);
			} 
		} while (num<=452);
	}
}
