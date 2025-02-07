package lambda.java;

import java.util.List;

public class Aluno {
	private String nome;
	private List<Double> notas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Double> getNotas() {
		return notas;
	}
	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	public Aluno(String nome, List<Double> notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}
	public Aluno() {
		super();
	}
	   public double calcularMedia() {
	        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
	    }
	
}
