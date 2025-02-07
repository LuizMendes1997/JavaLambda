package lambda.java;

import java.util.Arrays;
import java.util.List;

public class LambdaProduto {
	public static void main(String[] args) {
		List<Produtos> produtos = Arrays.asList(
				new Produtos("Blusa", 50.99),
				new Produtos("Tenis", 54),
				new Produtos("Boné",105),
				new Produtos("óculos", 80),
				new Produtos("blusa santos", 70),
				new Produtos("Blusa palmeira", 200));
		produtos.forEach(produto -> {
			if(produto.getPreco() > 100) {
				System.out.println(produto.getNome() + " em promoção");
				double v = produto.getPreco() *0.80;
				System.out.println("De R$: " + produto.getPreco() + " para R$: " + v);
			}	
		});
		
						
		
	}
}
