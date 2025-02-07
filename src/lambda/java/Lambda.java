package lambda.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

interface OperacaoMatematica{
	int calcular(int a, int b);
}

interface manipuladoDeString {
	String manipular(String str);
}

public class Lambda {
	//expressao lambda "->"
	public static void main(String[] args) {
	OperacaoMatematica soma = new OperacaoMatematica() {
		@Override
		public int calcular(int a, int b) {
			return a + b;
		}};
	System.out.println(soma.calcular(5 , 3));
	
	OperacaoMatematica somaLambda = (a, b) -> a +b;
	System.out.println(somaLambda.calcular(5 , 3));
	
	//manipulação de String sem Lambda
	manipuladoDeString maiuscula = new manipuladoDeString() {
		@Override
		public String manipular(String str) {
			// TODO Auto-generated method stub
			return str.toUpperCase(Locale.ROOT);
		}
	};
	System.out.println(maiuscula.manipular("luiz"));

	// com lambda
	manipuladoDeString maiusculaLdba = str -> str.toUpperCase(Locale.ROOT);
	System.out.println(maiusculaLdba.manipular("luiz"));
	
	//usando Filter
	
	List<String> palavras = Arrays.asList("Java", "lambda", "javanautas", "spring");
	
	List<String> palavrasFiltradas = new ArrayList<>();
	for(String palavra: palavras) {
		if(palavra.length()> 5) {
			palavrasFiltradas.add(palavra);
		}
	}
	System.out.println(palavrasFiltradas);
	
	
	List<String> palavrasFiltradasLbda = palavras.stream().filter( s -> s.length()> 5).toList();
	System.out.println(palavrasFiltradasLbda);
	
	//filtro com objetos
	List<Pessoa> pessoas = Arrays.asList(
			new Pessoa ("Luix", 25),
			new Pessoa ("kau", 28),
			new Pessoa ("Judite", 51));
	List<String> nomes = pessoas.stream().map(pessoa -> pessoa.getNome()).toList();
	List<Integer> idade = pessoas.stream().map(Pessoa::getIdade).toList();
	System.out.println(nomes + " idade: " + idade);
	

}}