package lambda.java;

public class Produtos {
	private String nome;
	private double preco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public Produtos() {
		super();
	}
	
}
