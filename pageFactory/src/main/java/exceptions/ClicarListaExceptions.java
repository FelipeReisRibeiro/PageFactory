package exceptions;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class ClicarListaExceptions extends StaleElementReferenceException {

	
			
	private static final long serialVersionUID = 1L;
	
	public ClicarListaExceptions() {
		super("A lista de elementos informada é invalida" );
	}
	public ClicarListaExceptions (List<WebElement> listaDeElementos) {
		super("A lista de elementos informada é invalida" + listaDeElementos);
		
	}
	public ClicarListaExceptions (List<WebElement> listaDeElementos, Throwable causa) {
		super("A lista de elementos informada é invalida" + listaDeElementos + "\n" + causa.getCause());
	
}
	
} 

