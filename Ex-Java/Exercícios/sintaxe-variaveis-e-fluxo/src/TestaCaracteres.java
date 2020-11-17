
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65; 
		System.out.println(valor);
		//não compila, char só guarda dentro dele um número
		
		//valor = valor + 1; errado
		//System.out.println(valor);
		
		valor = (char) (valor + 1); //correto
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
