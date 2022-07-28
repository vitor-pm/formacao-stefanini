package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class Lambda {

	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min, max);
	}

	public static void main(String[] args) {

		List<String> nomes = Arrays.asList("Vitor", "Luciana", "Antonio", "Marcos");

		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(10, 40)))
				.collect(Collectors.toList());

		pessoas.forEach((p) -> System.out.println(p));


		
		List<Pessoa> ordenado = pessoas.stream().sorted((p1, p2) -> p2.getIdade() - p1.getIdade()).collect(Collectors.toList());

		System.out.println("ordenado");
		ordenado.forEach((p)-> System.out.println(p.toString()));

	}

}
