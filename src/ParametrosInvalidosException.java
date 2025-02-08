
public class ParametrosInvalidosException extends Exception{
	
	/*
     * Exceção personalizada com construtores versáteis para permitir mensagens
     * padrão ou detalhadas, facilitando a comunicação de erros específicos.
     */
	
	private static final String DEFAULT_MESSAGE = "O segundo parâmetro deve ser maior que o primeiro";
	
	public ParametrosInvalidosException() {
		super(DEFAULT_MESSAGE);
	}
	
	public ParametrosInvalidosException(String message) {
		super(message);
	}
	
	public ParametrosInvalidosException(int parametroUm, int parametroDois) {
		super("Parâmetros inválidos: o parâmetroUm (" + parametroUm + ") não pode ser maior que o parâmetroDois (" + parametroDois + ").");
	}

	
}
