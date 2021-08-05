package pageFactory.config;
	

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import drivers.DriverFactory;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
	public class Configuracao {
		
		private static final Logger log = LoggerFactory.getLogger(Configuracao.class);
		
		@Before
		public void inicializaDriver() {
		log.info("Inicializando o navegador");
		DriverFactory factory = new DriverFactory();
		WebDriver driver = factory.instanciaDriver("CHROME");
		DriverManager.setDriver(driver);
		System.out.println("imprime no console");
		}
		
		@After
		public void fecharNavegador() {
		//.info("Fechando o Navegador");
		//	DriverManager.fechar();
		}
		
	}