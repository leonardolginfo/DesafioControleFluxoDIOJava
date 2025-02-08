import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			montarLista(contar(parametroUm, parametroDois));
		} catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		boolean ehValido = parametroUm < parametroDois;
		int contagem = 0;
		if (ehValido) {
			contagem = parametroDois - parametroUm;
			return contagem;
		} else {
			throw new ParametrosInvalidosException();
		}

	}

	static void montarLista(int contagem) {
		for (int cont = 0; contagem > cont; cont++) {
			System.out.println("Némero: " + (cont + 1));
		}
	}
}