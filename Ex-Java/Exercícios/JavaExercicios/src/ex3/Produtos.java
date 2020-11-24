package ex3;

public class Produtos {
	
	private String nome;
	
	private float preco;

	public Produtos(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "[" + nome + ", " + preco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
