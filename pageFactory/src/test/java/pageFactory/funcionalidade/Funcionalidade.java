package pageFactory.funcionalidade;

import drivers.DriverManager;
import exceptions.EscreverExceptions;
import interacaoSelenium.ISelenium;
import pageFactory.paginas.PaginaLogin;

public class Funcionalidade implements ISelenium {
	
	
	public void acessarSistema(String site) {
		try {
		acessarUrl(site);
		} catch(Throwable e){
			throw new EscreverExceptions();
		}
		finally {
			DriverManager.fechar();
		}
		
	
	}
}
