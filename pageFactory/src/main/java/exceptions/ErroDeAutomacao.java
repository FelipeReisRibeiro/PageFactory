package exceptions;

public class ErroDeAutomacao extends AssertionError{


	private static final long serialVersionUID = 3L;
	private final static String mensagemDefault = "Ocorrreu uum erro no fluxo da automação de teste:";
	
	public ErroDeAutomacao() {
		super(mensagemDefault);
	}
	public ErroDeAutomacao(String mensagem) {
		super(String.format("ocorreu um erro na automação [%s]", mensagem));

	}
	public ErroDeAutomacao(String mensagem, Throwable e) {
		super(String.format("ocorreu um erro na automação [%s]", mensagem));
	
}
}