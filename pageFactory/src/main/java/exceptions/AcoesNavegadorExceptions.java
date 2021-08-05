package exceptions;

public class AcoesNavegadorExceptions extends NullPointerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AcoesNavegadorExceptions() {
		super("O navegador informado não foi encontrada" );
	}
	public AcoesNavegadorExceptions (String textoDaUrl) {
		super("O navegador informado não foi encontrada " + textoDaUrl );
		
	}
	public AcoesNavegadorExceptions (String textoDaUrl, Throwable causa) {
		super("O navegador informado não foi encontrada " + textoDaUrl + "\n" + causa.getCause());
		
		
	}
}



