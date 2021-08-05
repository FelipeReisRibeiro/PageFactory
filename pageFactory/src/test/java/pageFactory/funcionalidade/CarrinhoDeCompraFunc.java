package pageFactory.funcionalidade;


import org.junit.Assert;

import pageFactory.paginas.CarrinhoDeCompra;
import pageFactory.paginas.Checkout;
import pageFactory.paginas.CheckoutOverview;
public class CarrinhoDeCompraFunc {

	CarrinhoDeCompra car = new CarrinhoDeCompra();
	Checkout check = new Checkout();
	
	public void validarTeleCarrinho() {
		String titulo = car.tituloDaTela();
		Assert.assertEquals("YOUR CART", titulo.toUpperCase());
	}
	
	public void prosseguir() {
		car.checkout();
	}
	
	public void cadastroNome(String campo) {
		check.preencheNome(campo);
	}
	
	public void cadastroSobrenome(String campo) {
		check.Sobrenome(campo);
	}
	
	public void cadastroCodigo(String campo) {
		check.preencheCodigoPstal(campo);
		check.continuar();
	}
	}