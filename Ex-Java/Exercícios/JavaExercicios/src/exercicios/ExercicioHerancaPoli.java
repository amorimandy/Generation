package exercicios;

public class ExercicioHerancaPoli {
	
	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro("dog", 8, true);
		
		Cavalo cav1 = new Cavalo("Pé de pano", 15, true);
		
		Preguica preg1 = new Preguica("Cid", 2, true);
		
		System.out.println(dog1.getEmiteSom());
		System.out.println(cav1.getEmiteSom());
		System.out.println(preg1.getEmiteSom());
		
	}
}

