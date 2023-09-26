package stepdefinitions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import actions.CreateAccountAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import utils.DriveManager;

public class compraStep {

	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	CreateAccountAction action = PageFactory.initElements(driver, CreateAccountAction.class);

	@When("usuario abrir site {string}")
	public void usuario_abrir_site(String url) {
		driver.get(url);
	}

	@And("usuario clicar no botao Sign in")
	public void usuario_clicar_no_botao_sign_in() {
		action.clicarSignIn();
	}

	@And("escrever {string} no campo E-mail")
	public void escrever_no_campo_e_mail(String e_mail) {
		action.preencherEmail(e_mail);
	}

	@And("escrever {string} no campo Senha")
	public void escrever_no_campo_senha(String senha) {
		action.preencherSenha(senha);
	}

	@And("usuario clicar no botao Entrar")
	public void usuario_clicar_no_botao_entrar() {
		action.clicarSubmitLogin();
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		assertEquals("My account - My Store", driver.getTitle());
//		utilizei um assert para confirmar se
//		apos o login o usuario seria direcionado para a pagina correta
	}

	@And("inserir nome do {string} no campo de busca")
	public void inserir_nome_do_no_campo_de_busca(String item) {
		action.preencherItem(item);
	}

	@And("clicar no icone para realizar pesquisa")
	public void clicar_no_icone_para_realizar_pesquisa() {
		action.clicarPesquisar();
	}

	@And("clicar no item escolhido")
	public void clicar_no_item_escolhido() {
		action.selecionarItem();
	}

	@And("ver opcoes de tamanho")
	public void ver_opcoes_de_tamanho() {
		action.verOpcaoTamanho();
	}

	@And("selecionar tamanho")
	public void selecionar_tamanho() {
		action.selecionarTamanho();
	}

	@And("selecionar cor")
	public void selecionar_cor() {
		action.selecionarCor();
	}

	@And("adcionar item escolhido ao carrinho")
	public void adcionar_item_escolhido_ao_carrinho() {
		action.addCarrinho();
	}

	@And("clicar ver resumo da compra")
	public void clicar_ver_resumo_da_compra() {
		action.verResumoCompra();
	}

	@And("clicar para confirmar endereco")
	public void clicar_para_confirmar_endereco() {
		action.confirmarEndereco();
	}

	@And("clicar para escolher envio")
	public void clicar_para_escolher_envio() {
		action.escolherEnvio();
	}

	@And("aceitar os temos de servico")
	public void aceitar_os_temos_de_servico() {
		action.permitirTermosServico();
	}

	@And("clicar para continuar compra")
	public void clicar_para_continuar_compra() {
		action.prosseguirCompra();
	}

	@And("escolher a forma de pagamento")
	public void escolher_a_forma_de_pagamento() {
		action.pagarBoleto();
	}

	@And("clicar para concluir compra")
	public void clicar_para_concluir_compra() {
		action.concluirCompra();
		String msgSucessoCompra = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
		assertEquals("Your order on My Store is complete.", msgSucessoCompra);
		System.out.println(msgSucessoCompra);
//		utilizei outro assert para confirmar a mensagem de sucesso
//		apos a conclusao da compra. para isso, fiz o mapeamento
//		dentro desse proprio metodo
	}

	@And("encerrar navegacao")
	public void encerrar_navegacao() {
		driver.close();
		driver.quit();
	}

}
