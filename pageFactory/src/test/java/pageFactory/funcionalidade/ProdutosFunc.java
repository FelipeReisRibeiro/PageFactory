package pageFactory.funcionalidade;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pageFactory.config.Configuracao;
import pageFactory.paginas.Produtos;

public class ProdutosFunc {
	
	private static final Logger log = LoggerFactory.getLogger(Configuracao.class);
	
		Produtos prod = new Produtos();
		
		public void validarTelaProdutos() {
			log.info("Validar o titulo da tela de produtos");
			String titulo = prod.TituloDaPagina();
			log.info("o texto capturado do titulo " + titulo);
			Assert.assertEquals("PRODUCTS", titulo);
		}
		public void selecionarProduto(int numeroProduto, String nomeProduto, String preco) {
			Assert.assertEquals(nomeProduto,prod.obtemTituloProduto(numeroProduto));
			//Assert.assertEquals(preco, prod.obtemPrecoDoProduto(numeroProduto));
		    prod.selecionarProduto(numeroProduto);
		}
		public void abrirCarrinho() {
			prod.selecionarCarrinho();
		}
}
