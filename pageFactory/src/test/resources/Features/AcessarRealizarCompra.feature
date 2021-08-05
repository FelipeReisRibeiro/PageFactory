Feature: Acessar o SwagLabs e realizar uma compra
@Ctag1
Scenario: realizar uma compra
	Given que acesse o sistema "http://saucedemo.com"
	When preencho  o usuario "standard_user" e senha "secret_sauce"
	And opto por selecionar o produto 1 com a descrição "Sauce Labs Backpack" preço "29.99" 
	And opto por validar a tela do carrinho
	And opto por preencher nome
	And opto por preencher sobrenome
	And opto por preencher codigo postal
	And opto por finalizar a compra
	Then o sistema apresenta a mensagem "THANK YOU FOR YOUR ORDER"
	
	