package pageFactory.paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interacaoSelenium.ISelenium;
import pageFactory.config.PaginaFactory;

public class CheckoutOverview extends PaginaFactory implements ISelenium {

	@FindBy(id="finish")
	private WebElement btnFinalizar;
	
	@FindBy(css="h2.complete-header")
	private WebElement compraConcluida;
	
	public void finalizaCompra() {
		esperarSerVisivel(this.btnFinalizar, 5);
		clicar(this.btnFinalizar);
	}
	
	public String compraConcluida() {
		esperarSerVisivel(this.compraConcluida, 5);
		return this.compraConcluida.getText();
	}
	
}
	