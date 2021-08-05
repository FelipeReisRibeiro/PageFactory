package pageFactory.funcionalidade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interacaoSelenium.ISelenium;
import pageFactory.config.Configuracao;

public class SauceDemo implements ISelenium {
	
	private static final Logger log = LoggerFactory.getLogger(Configuracao.class);
	
	public void acessarSauce(String site) {
		log.info(String.format("Acessando o site: %s", site));
		acessarUrl(site);
		log.info("Aguardando o site carregar por completo");
		
		
	}
}
