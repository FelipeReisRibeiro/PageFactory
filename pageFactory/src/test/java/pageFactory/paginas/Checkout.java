package pageFactory.paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interacaoSelenium.ISelenium;
import pageFactory.config.PaginaFactory;

public class Checkout extends PaginaFactory implements ISelenium {
	
	@FindBy(xpath = "//div//input[@id='first-name']")
	private WebElement txtNome;
	@FindBy(xpath = "//div//input[@id='last-name']")
	private WebElement txtSobrenome;
	@FindBy(xpath = "//div//input[@id='postal-code']")
	private WebElement txtCodigoPostal;
	@FindBy(xpath = "//div//input[@id='continue']")
	private WebElement btnContinue;
	@FindBy(xpath = "//div//button[@id='finish']")
	private WebElement btnFinish;

	static final Logger log = LoggerFactory.getLogger(CheckoutOverview.class);
	
	public void preencheNome(String nome) {
		esperarSerVisivel(txtNome, 5);
		escrever(txtNome, nome);
	}
	public void Sobrenome (String sobrenome) {
		escrever(txtSobrenome, sobrenome);
	}
	public void preencheCodigoPstal(String codigoPostal) {
		escrever(txtCodigoPostal, codigoPostal);
	}
	public void continuar() {
		esperarSerVisivel(this.btnContinue, 2);
		clicar(this.btnContinue);
	}		
	
}

