package interacaoSelenium;

import org.openqa.selenium.WebElement;
import exceptions.EscreverExceptions;

public interface IEscrever {

	default void escrever(WebElement elemento, String texto) {
		try {
			elemento.sendKeys(texto);
		}catch (EscreverExceptions | NullPointerException e) {
			throw new EscreverExceptions(texto);
		}
		
		}
	
		default void limparCampo(WebElement elemento) {
			elemento.clear();
			
			
			}
		}

