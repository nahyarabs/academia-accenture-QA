package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import utils.DriverContext;

public class CreateAccountAction extends CreateAccountPage {

	protected WebDriverWait wait;

	public CreateAccountAction() {
		wait = new WebDriverWait(DriverContext.getDriver(), 50);

	}

	public void clicarSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}

	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}

	public void preencherSenha(String senha) {
		wait.until(ExpectedConditions.visibilityOf(txtSenha)).sendKeys(senha);
	}

	public void clicarSubmitLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSubmitLogin)).click();
	
	}

	public void preencherItem(String item) {
		wait.until(ExpectedConditions.visibilityOf(txtPesquisarItem)).sendKeys(item);
	}

	public void clicarPesquisar() {
		wait.until(ExpectedConditions.elementToBeClickable(linkPesquisar)).click();
	}

	public void selecionarItem() {
		wait.until(ExpectedConditions.elementToBeClickable(linkPrintedDress)).click();
	}

	public void verOpcaoTamanho() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTamanho)).click();
	}

	public void selecionarTamanho() {
		wait.until(ExpectedConditions.elementToBeClickable(linkAddTamanho)).click();
	}

	public void selecionarCor() {
		wait.until(ExpectedConditions.elementToBeClickable(linkAddCor)).click();
	}

	public void addCarrinho() {
		wait.until(ExpectedConditions.elementToBeClickable(linkAddCarrinho)).click();
	}

	public void verResumoCompra() {
		wait.until(ExpectedConditions.elementToBeClickable(linkResumoCompra)).click();
	}

	public void confirmarEndereco() {
		wait.until(ExpectedConditions.elementToBeClickable(linkConfirmarEndereco)).click();
	}

	public void escolherEnvio() {
		wait.until(ExpectedConditions.elementToBeClickable(linkEcolherEnvio)).click();
	}

	public void permitirTermosServico() {
		wait.until(ExpectedConditions.elementToBeClickable(chekboxTermosServico)).click();
	}

	public void prosseguirCompra() {
		wait.until(ExpectedConditions.elementToBeClickable(linkProsseguirCompra)).click();
	}

	public void pagarBoleto() {
		wait.until(ExpectedConditions.elementToBeClickable(linkPagarBoleto)).click();
	}

	public void concluirCompra() {
		wait.until(ExpectedConditions.elementToBeClickable(linkConcluirCompra)).click();
	}

}
