import java.util.*;

public class exemple_switch {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
			
	int entrada;
	final int senha = 1234;
			
		System.out.println("Informe sua senha: ");
		entrada = ler.nextInt();
		
		switch(entrada) {
		case senha:
				System.out.println("ACESSO PERMITIDO!");
				break;
		default:
				System.out.println("ACESSO NEGADO!");
				break;
		}
	}
}

