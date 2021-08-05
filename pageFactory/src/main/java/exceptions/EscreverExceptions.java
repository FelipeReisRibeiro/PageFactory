package exceptions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class EscreverExceptions extends IllegalArgumentException {

	
	private static final long serialVersionUID = 1L;
	
	public EscreverExceptions() {
		super("Ocorreu um erro ao realizar a ação de escrever" );
	}
	public EscreverExceptions (WebElement elemento) {
		super("O elemento informado é invalido" + elemento );
		
	}
	public EscreverExceptions (WebElement elemento, Throwable causa) {
		super("O elemento informado é invalido" + elemento + "\n" + causa.getCause());
	
}
	public EscreverExceptions(String texto) {
		super("Ocorreu um erro ao realizar a ação de escrever" );
	
}
}