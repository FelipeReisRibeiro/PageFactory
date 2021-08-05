package pageFactory.paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interacaoSelenium.ISelenium;
import pageFactory.config.PaginaFactory;

public class CarrinhoDeCompra extends PaginaFactory implements ISelenium {
	Produtos compra = new Produtos();
	
	@FindBy(xpath = "//div//button[@id='checkout']")
	private WebElement btnCheckout;
	@FindBy(css = "span.title")
	private WebElement lblTitulo;
	
	static final Logger log = LoggerFactory.getLogger(CarrinhoDeCompra.class);
	
	public String tituloDaTela() {
		esperarSerVisivel(this.lblTitulo, 5);
		return this.lblTitulo.getText();
	}
	public void checkout() {
		esperarSerClicavel(this.btnCheckout, 5);
		clicar(this.btnCheckout);
	}
	
	public String confirmaProdutos() { //metodo para devolver a quantidade de produtos na tela
		log.info("Confirmando se os produtos estao nos carrinhos");
		if (compra.quantidadeDeProdutos() >= 1){
			System.out.println("produto inseriodo no carrinho");
			clicar(btnCheckout);
		}else {
			System.out.println("seu carrinho esta vazio");
			
		}
		return null;
	}
}
