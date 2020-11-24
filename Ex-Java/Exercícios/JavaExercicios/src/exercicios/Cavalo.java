package exercicios;

public class Cavalo extends Animal{

	private boolean deveCorrer;

	public Cavalo() {
		super();
	}

	public Cavalo(String nome, int idade, boolean deveCorrer) {
		super(nome, idade);
		this.deveCorrer = deveCorrer;
	}

	public String getEmiteSom() {
		return "relincho";
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	
}
