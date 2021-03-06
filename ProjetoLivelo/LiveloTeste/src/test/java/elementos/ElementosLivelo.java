package elementos;

import org.openqa.selenium.By;

public class ElementosLivelo {

	
/////////CT01//////////
	// digitar o produto celular e clicar em pesquisar//
	public By digprod = By.cssSelector("#input-search");
	public By pesquisar = By.id("span-searchIcon");

	// clicar no produto celular//
	public By cookies = By.id("btn-authorizeCoookies");
	public By prodcelular = By.id("CC-product-list-name-LVL26907718-01");

	// digitar o cep e clicar//
	public By cep = By.xpath("//input[@id='inpt-cep__pdp']");
	public By buscarCep = By.cssSelector("#wi4300078-product-filter-box-catalog-id > div > div.cep-tab > div.form > div > span.body-text.body-text--small.search");
	// adicionar celular no carrinho//
	public By adicionarcarrinho = By.cssSelector("#CC-prodDetails-addToCart > button");


/////////CT02//////////
	// clicar no produto Panela//
	public By prodpanela = By.id("CC-product-list-name-LVL188691-01");
	public By voltagem = By.id("#option-2");
	
/////////CT03//////////
	// clicar no produto Brinquedo//	
	public By prodbrinquedo = By.id("CC-product-grid-title-LVL176471-00");
	
	//Remover itens do carrinho
	public By removercarrinhcel = By.xpath("/html/body/div[7]/main/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/a");
	public By removercarrinhpan = By.xpath("/html/body/div[7]/main/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/a");
	public By removercarrinhobrin = By.xpath("/html[1]/body[1]/div[7]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]");
	
	//validar pontos
	public By valPontocel = By.xpath("//span[text()=\"308.600 Pontos\"]");
	public By valPontopan = By.xpath("//span[text()=\"27.800 Pontos\"]");
	public By valPontobrin = By.xpath("//span[text()=\"13.400 Pontos\"]");
	
	//validar nome
	public By valdesccel = By.xpath("//a[text()=\"Smartphone Samsung Galaxy S21 5G Cinza 128GB, 8GB RAM, Tela Infinita de 6.2”, Câmera Traseira Tripla, Android 11 e Processador Octa-Core\"]");
	public By valdescpan = By.xpath("//a[text()=\"Panela Elétrica de Pressão Philco PPPV Digital 6 Litros Inox Red – Vermelho\"]");
	public By valdescbrin = By.xpath("//a[text()=\"LEGO Classic Caixa Média de Peças Criativas - 484 Peças 10696 -\"]");

	//validar carrinho vazio
	public By vaziocel = By.xpath("//h2[text()=\"Ainda não existem itens no seu carrinho\"]");



}
