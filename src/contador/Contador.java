package contador;

import java.util.Scanner;

public class Contador {

	private static int scanned1;
	private static int scanned2;

	static void capturaEntrada() {
		var scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		scanned1 = scan.nextInt();
		System.out.println("Informe o segundo número");
		scanned2 = scan.nextInt();

	}

	static void contar(int numero1, int numero2)
			throws ParametrosInvalidosException {
		if (numero1 > numero2) {
			throw new ParametrosInvalidosException();
		} else if (numero1 == numero2) {
			throw new ParametrosInvalidosException();
		} else {
			System.out.println();
			System.out.println("O Numero 2" + " é maior");
			System.out.println();
			var contador = numero2 - numero1;
			System.out
					.println("Teremos um laço com " + contador + " repetições");
			for (var i = 0; i < contador; i++) {
				System.out.println((i + 1) + "ª Repetição");

			}
			System.out.println();
			System.out.println("Fim do Programa de Contagem");

		}
	}

	public static void main(String[] args) {
		capturaEntrada();
		try {
			contar(scanned1, scanned2);
		} catch (ParametrosInvalidosException e) {
			e.getMessage();
			e.printStackTrace();
			main(args);
		}

	}
}
