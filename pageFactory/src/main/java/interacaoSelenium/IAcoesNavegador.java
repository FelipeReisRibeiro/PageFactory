package interacaoSelenium;

import drivers.DriverManager;
import exceptions.AcoesNavegadorExceptions;


public interface IAcoesNavegador {

	default void acessarUrl(String textoDaUrl) {
		try {
			DriverManager.getDriver().navigate().to(textoDaUrl); // metodo para chamar a URL
		} catch (Exception e) {
			throw new AcoesNavegadorExceptions();
		}
		
		
	}
}
