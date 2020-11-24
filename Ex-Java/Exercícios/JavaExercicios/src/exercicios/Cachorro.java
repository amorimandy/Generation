package exercicios;

public class Cachorro extends Animal{

	private boolean deveCorrer;

	public Cachorro() {
		super();
	}

	public Cachorro(String nome, int idade, boolean deveCorrer) {
		super(nome, idade);
		this.deveCorrer = deveCorrer;
	}

	public String getEmiteSom() {
		return "auau";
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
}
