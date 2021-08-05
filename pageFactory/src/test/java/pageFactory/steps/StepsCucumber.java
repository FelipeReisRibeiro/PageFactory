package pageFactory.steps;

import interacaoSelenium.ISelenium;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.config.Configuracao;
import pageFactory.funcionalidade.CarrinhoDeCompraFunc;
import pageFactory.funcionalidade.Funcionalidade;
import pageFactory.funcionalidade.PaginaLoginFunc;
import pageFactory.funcionalidade.ProdutosFunc;
import pageFactory.funcionalidade.SauceDemo;
import pageFactory.paginas.CarrinhoDeCompra;
import pageFactory.paginas.CheckoutOverview;
import pageFactory.paginas.PaginaLogin;
import pageFactory.paginas.Produtos;

public class StepsCucumber {

	
	
	
	@Given("que acesse o sistema {string}")
	public void que_acesse_o_sistema(String site) {
	   new SauceDemo().acessarSauce(site);
	   
	}
	@When("preencho  o usuario {string} e senha {string}")
	public void preencho_o_usuario_e_senha(String usuario, String senha) {
		PaginaLoginFunc login = new PaginaLoginFunc();
		login.realizarLogin(usuario, senha);
	}
	@When("opto por selecionar o produto {int} com a descrição {string} preço {string}")
	public void opto_por_selecionar_o_produto_com_a_descrição_preço(Integer numero, String descricao, String preco) {
		ProdutosFunc produto = new ProdutosFunc();
		produto.validarTelaProdutos();
		produto.selecionarProduto(numero, descricao, preco);
		produto.abrirCarrinho();
	}

	@When("opto por validar a tela do carrinho")
	public void opto_por_validar_a_tela_do_carrinho() {
	    CarrinhoDeCompraFunc car = new CarrinhoDeCompraFunc();
	    car.validarTeleCarrinho();
	    car.prosseguir();
	}

	@When("opto por preencher nome")
	public void opto_por_preencher_nome() {
	   	CarrinhoDeCompraFunc car = new CarrinhoDeCompraFunc();
		car.cadastroNome("Felipe");
		
	}
	@When("opto por preencher sobrenome")
	public void opto_por_preencher_sobrenome() {
		CarrinhoDeCompraFunc car = new CarrinhoDeCompraFunc();
		car.cadastroSobrenome("Ribeiro");
	}
	@When("opto por preencher codigo postal")
	public void opto_por_preencher_codigo_postal() {
	    CarrinhoDeCompraFunc car = new CarrinhoDeCompraFunc();
		car.cadastroCodigo("11045360");
	}

	@When("opto por finalizar a compra")
	public void opto_por_finalizar_a_compra() {
		CheckoutOverview over = new CheckoutOverview();
		over.finalizaCompra();
	}

	@Then("o sistema apresenta a mensagem {string}")
	public void o_sistema_apresenta_a_mensagem(String string) {
	   
	}
	
}

