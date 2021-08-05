package interacaoSelenium;

import java.util.List;

import org.openqa.selenium.WebElement;

import exceptions.ClicarListaExceptions;
import exceptions.CliqueExceptions;


public interface IClique {
	
	default void clicar(WebElement elemento) {
		try{
			elemento.click();
			
		} catch (Exception e) {
			throw new CliqueExceptions();
		}
		
	}
	
	
	default void clicarNosElementos(List<WebElement> listaDeElementos) {
		try {
		listaDeElementos.forEach(element -> element.click());
		}catch (Exception e) {
		
			throw new ClicarListaExceptions();
		}
	}
}


