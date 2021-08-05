package exceptions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class CliqueExceptions extends StaleElementReferenceException {

	
	private static final long serialVersionUID = 1L;
	
	public CliqueExceptions() {
		super("O elemento informado é invalido" );
	}
	public CliqueExceptions (WebElement elemento) {
		super("O elemento informado é invalido" + elemento );
		
	}
	public CliqueExceptions (WebElement elemento, Throwable causa) {
		super("O elemento informado é invalido" + elemento + "\n" + causa.getCause());
	
}
	
}