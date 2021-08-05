package pageFactory.paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import interacaoSelenium.ISelenium;
import pageFactory.config.PaginaFactory;

public class Produtos extends PaginaFactory implements ISelenium {
	
	@FindBy(css ="span.title")
	private WebElement lblProduto;

	@FindBy(css = "div.inventory_list > div")
	private List<WebElement> lstProduto;
	
	@FindBy(css = "div#shopping_cart_container > a")
	private WebElement carrinho;
	
	@FindBy(xpath = "div#Shopping_cart_container span")
	private WebElement itensDoCarrinho;
	
		
	public String TituloDaPagina() { // metodo para pegar numero do produto
		esperarSerVisivel(this.lblProduto, 5);
		return this.lblProduto.getText().toUpperCase(); //pega o texto na tela e deixa com o texto maiusculo
	}
	public int quantidadeDeProdutos() { //metodo para devolver a quantidade de produtos na tela
		return lstProduto.size();
	}
	public String obtemTituloProduto(int numeroDoProduto) { // metodo para pegar numero do produto
		WebElement produto = lstProduto.get(numeroDoProduto - 1)
				.findElement(By.cssSelector("div.inventory_item_label div.inventory_item_name"));
		return produto.getText();
	}
	public String obtemPrecoDoProduto(int precoDoProduto) { //metodo para pegar o preço do produto
		WebElement produto = lstProduto.get(precoDoProduto)
				.findElement(By.cssSelector("div.pricebar > div"));
		return produto.getText();
	}
	public void selecionarProduto(int selecionarProduto) {
		WebElement produto = lstProduto.get(selecionarProduto - 1)
				.findElement(By.cssSelector("div.pricebar > button"));
				clicar(produto);
	}
	public void selecionarCarrinho() {
		esperarSerClicavel(this.carrinho, 5);
		clicar(this.carrinho);
	}
	public int itensDoCarrinhos() {
		return Integer.valueOf(this.itensDoCarrinho.getText());
	}
	
}