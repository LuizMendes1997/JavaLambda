package lambda.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
public class LambdaNumeros {
	public static void main(String[] args) {
	ArrayList<Integer> valores = new ArrayList<>();
	ArrayList<Integer> dobro = new ArrayList<>();
	ArrayList<Integer> par = new ArrayList<>();
	ArrayList<Integer> impar = new ArrayList<>();
	
	valores.add(1);
	valores.add(2);
	valores.add(3);
	valores.add(4);
	valores.add(5);
	valores.add(6);
	
	//Consumer<Integer> dobrar = (V) -> {dobro.add(V*2);};
	//valores.forEach(dobrar);
	valores.forEach((v) -> {
		dobro.add(v*2);
		if(v%2 == 0) {
			par.add(v);
		}
		else {
			impar.add(v);
		}
	});
	
	
	System.out.println(valores);
	System.out.println(dobro);
	System.out.println(par);
	System.out.println(impar);
	}
}