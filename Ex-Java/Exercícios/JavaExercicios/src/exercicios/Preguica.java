package exercicios;

public class Preguica extends Animal{
	
	private boolean sobeArvore;

	public Preguica() {
		super();
	}
	
	public Preguica(String nome, int idade, boolean sobeArvore) {
		super(nome, idade);
		this.sobeArvore = sobeArvore;
	}
	
	public String getEmiteSom() {
		return "zZz";
	}
	
	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
}
