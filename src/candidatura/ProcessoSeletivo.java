package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	static String candidatos[] = {"Felipe", "Mônica", "Pedro", "Carmem",
			"Lúcio", "Jorge", "Maria", "Lucas", "Joaquim"};

	static void analisarCandidato(double salarioPretendido) {
		var salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out
					.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	/**
	 * Metodo usa a thread local para gerar um valor aleatorio entre os
	 * parametros passados. Nesse caso um double, podendo ser outros
	 *
	 * @return double valorSalarioPretendido
	 */
	static double geraValorSalarioPretendido() {
		var salarioPretendido = ThreadLocalRandom.current().nextDouble(1800.0,
				2200.0);
		return Math.round(salarioPretendido);
	}

	static void imprimirSelecionados(List<String> listaCandidatos) {
		System.out.println("Lista Completa de Proponentes");
		System.out.println();
		for (String candidato : candidatos) {
			System.out.println("Proponente: " + candidato);
		}
		System.out.println();
		System.out.println("Impressão da Lista Selecionada");
		System.out.println();
		for (var i = 0; i < listaCandidatos.size(); i++) {
			System.out.println(
					"Número: " + (i + 1) + " Nome: " + listaCandidatos.get(i));
		}
	}

	public static void main(String[] args) {
		System.out.println("Processo seletivo!");
		imprimirSelecionados(selecaoCandidatos());

	}

	static List<String> selecaoCandidatos() {
		List<String> candidatosSelecionados = new ArrayList<>();
		var contaCandidatosSelecionados = 0;
		var indiceCandidato = 0;
		var salarioBase = 2000.0;
		while (contaCandidatosSelecionados < 5
				&& indiceCandidato < candidatos.length) {
			var candidato = candidatos[indiceCandidato];
			var salarioPretendido = geraValorSalarioPretendido();
			System.out.println();
			System.out.println("Nome do proponente: " + candidato
					+ " Solicitou: R$ " + salarioPretendido);
			if (salarioPretendido <= salarioBase) {
				candidatosSelecionados.add(candidato);
				contaCandidatosSelecionados++;
				System.out.println("Parabéns " + candidato
						+ " você passou nos critérios de seleção!");
			}
			indiceCandidato++;

		}
		System.out.println();
		System.out.println(candidatosSelecionados);
		System.out.println();
		return candidatosSelecionados;
	}

}
