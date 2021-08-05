package pageFactory.funcionalidade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import pageFactory.config.Configuracao;
import pageFactory.paginas.PaginaLogin;

public class PaginaLoginFunc {
		
		private static final Logger log = LoggerFactory.getLogger(Configuracao.class);
	
		PaginaLogin login = new PaginaLogin();
		
		public void realizarLogin(String usuario1, String senha1) {
			log.info("Ralizando Login");
			login.digitaUsuario(usuario1);
			log.info("Ralizando Login com o usuario" + usuario1);
			login.digitaSenha(senha1);
			log.info("Ralizando Login com a senha" + senha1);
			login.entrar();
			log.info("clicou em entrar");
		}
}
