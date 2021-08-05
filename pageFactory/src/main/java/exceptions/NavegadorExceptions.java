package exceptions;

public class NavegadorExceptions extends IllegalArgumentException {

	
	private static final long serialVersionUID = -8730748692001311769L;
	
	public NavegadorExceptions() {
		super("O navegador informado é invalido" );
	}
	public NavegadorExceptions (String navegador) {
	super("O navegador informado é invalido" + navegador );
		
}
public NavegadorExceptions (String navegador, Throwable causa) {
		super("O navegador informado é invalido" + navegador + "\n" + causa.getCause());
}
}