package pageFactory.funcionalidade;

import org.junit.Assert;

import pageFactory.paginas.CheckoutOverview;

public class CheckoutOverviewFunc {
		
	CheckoutOverview over = new CheckoutOverview();
	
	public void finalizaCompra() {
		over.finalizaCompra();
	}
	public void validaCompra(String mensagem) {
		String complete = over.compraConcluida();
		Assert.assertEquals(mensagem, complete.toUpperCase());
	}
}
