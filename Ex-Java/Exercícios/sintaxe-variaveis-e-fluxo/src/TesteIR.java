
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3760.0;

		if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("A sua aliquota � de 7.5%");
			System.out.println("Voc� pode deduzir at� R$ 142.80");
		}

		if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("A sua aliquota � de 15%");
			System.out.println("Voc� pode deduzir at� R$ 354.80");
		}

		if (salario >= 3751.06 && salario <= 4664.68) {
			System.out.println("A sua aliquota � de 22.5%");
			System.out.println("Voc� pode deduzir at� R$ 636.13");
		}
		
		if (salario >= 4664.68) {
			System.out.println("A sua aliquota � de 27.5%");
			System.out.println("Voc� pode deduzir at� R$ 869.36");
		}


	}
}