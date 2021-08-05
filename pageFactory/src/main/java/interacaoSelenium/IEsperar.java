package interacaoSelenium;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;
import exceptions.ErroDeAutomacao;
import io.netty.handler.timeout.TimeoutException;

public interface IEsperar {

default WebDriverWait getWait(Duration duracao) {
	return new WebDriverWait(DriverManager.getDriver(),duracao);
}

default void esperarSerVisivel(WebElement element, long tempo) {
	try {
		getWait(Duration.ofSeconds(tempo))
		.until(ExpectedConditions.visibilityOf(element));
	} catch (TimeoutException e) {
		throw new ErroDeAutomacao("Ocorreu um erro na captura do elemento");
	}
	
	
}
default void esperarSerClicavel(WebElement element, long tempo) {
	try {
		getWait(Duration.ofSeconds(tempo))
		.until(ExpectedConditions.elementToBeClickable(element));
	} catch (TimeoutException e) {
		throw new ErroDeAutomacao("Ocorreu um erro na captura do elemento");
	}
	
}
			
}
