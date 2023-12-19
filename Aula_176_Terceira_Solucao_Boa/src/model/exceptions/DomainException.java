package model.exceptions;

public class DomainException extends Exception {

	private static final long serialVersionUID = 1L; // Obrigatório número de versão
	
	public DomainException (String msg) {
		super(msg);
	}

}

// Extends Exception preciso tratar a exceção
// Extends RunTimeException não preciso tratar a exceção
