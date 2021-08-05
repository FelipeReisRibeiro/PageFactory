package pageFactory.config;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import drivers.DriverManager;

public class PaginaFactory {
	
	public PaginaFactory() {
		int timeOut = 10;
		PageFactory.initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(), timeOut), this);
	}
	
}
