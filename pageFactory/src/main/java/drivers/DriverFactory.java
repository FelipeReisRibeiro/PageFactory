package drivers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import exceptions.NavegadorExceptions;
import interacaoSelenium.IDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;


public class DriverFactory implements IDriver{

	@Override
	public WebDriver instanciaDriver(String navegador) {
		WebDriver vDriver = null;
		try {
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.args","--disable-logging");
			DriverManagerType nomeDoNavegador = DriverManagerType.valueOf(navegador);
			WebDriverManager.getInstance(nomeDoNavegador).setup();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			vDriver = new ChromeDriver();
		} catch (Exception e) {
			throw new NavegadorExceptions(navegador);
		}
		return vDriver;
	}
		
		
		// caso fosse dois navegadores diferentes 
		// switch (navegador){
		//case "CHROME":
		//
		//	WebDriverManager.getInstance(nomeDoNavegador).setup();
		//	vDriver = new ChormeDriver();
		//	break;
			
		//case "FIREFOX":
		//
		//	WebDriverManager.getInstance(nomeDoNavegador).setup();
		// vDriver = new FirefoxDriver();
		//*	break;}
		
	}


