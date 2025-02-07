package lambda.java;

import java.util.Arrays;
import java.util.List;

public class LambdaMediaAluno {
	public static void main(String[] args) {
		List<Aluno> aluno =  Arrays.asList(new Aluno("Luiz",  Arrays.asList(7.5, 8.0, 6.5)),
				new Aluno("Kau", Arrays.asList(8.3, 9.0, 7.8)),
				new Aluno("Judite", Arrays.asList(9.2, 8.8, 9.5)));
		aluno.forEach(alunos -> {
            double media = alunos.calcularMedia();  // Calcula a média do aluno
            System.out.println(alunos.getNome() + " - Média: " + media);
        });
	}
}
