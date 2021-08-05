package pageFactory.paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import interacaoSelenium.ISelenium;
import pageFactory.config.PaginaFactory;

public class PaginaLogin extends PaginaFactory implements ISelenium {
	
	
	@FindBy(xpath ="//div//input[@id='user-name']")
	private WebElement txtUsuario;

	@FindBy(xpath ="//div//input[@id='password']")
	private WebElement txtsenha;

	@FindBy(xpath ="//div//input[@class='submit-button btn_action']")
	private WebElement btnEntrar;

	@FindBy(css ="div#login_credential h4")
	private WebElement lblUser;
	
	public void digitaUsuario(String usuario) {
		esperarSerVisivel(this.txtUsuario, 5);
		escrever(this.txtUsuario,usuario);
	}
	public void digitaSenha(String senha) {
		esperarSerVisivel(this.txtsenha,5);
		escrever(this.txtsenha,senha);
	}
	public String labelLogin() {
		String titulo = lblUser.getText();
		return titulo;
	}
	
	public void entrar() {
		esperarSerClicavel(this.btnEntrar,5);
		clicar(this.btnEntrar);
	}
	
}
