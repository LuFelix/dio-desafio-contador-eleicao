package contador;

public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException() {
		super("Verifique os numeros informados, o segundo numero deve ser maior que o primeiro");
	}

	public ParametrosInvalidosException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
