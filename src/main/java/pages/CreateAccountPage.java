package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class CreateAccountPage {

	public CreateAccountPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	protected WebElement linkSignIn;

	@FindBy(how = How.ID, using = "email")
	protected WebElement txtEmail;

	@FindBy(how = How.ID, using = "passwd")
	protected WebElement txtSenha;

	@FindBy(how = How.ID, using = "SubmitLogin")
	protected WebElement linkSubmitLogin;

	@FindBy(how = How.ID, using = "search_query_top")
	protected WebElement txtPesquisarItem;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchbox\"]/button")
	protected WebElement linkPesquisar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")
	protected WebElement linkPrintedDress;

	@FindBy(how = How.ID, using = "uniform-group_1")
	protected WebElement comboboxTamanho;

	@FindBy(how = How.XPATH, using = "//*[@id=\"group_1\"]/option[2]")
	protected WebElement linkAddTamanho;

	@FindBy(how = How.ID, using = "color_24")
	protected WebElement linkAddCor;

	@FindBy(how = How.ID, using = "add_to_cart")
	protected WebElement linkAddCarrinho;

	@FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement linkResumoCompra;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement linkConfirmarEndereco;

	@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement linkEcolherEnvio;

	@FindBy(how = How.ID, using = "uniform-cgv")
	protected WebElement chekboxTermosServico;

	@FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button")
	protected WebElement linkProsseguirCompra;

	@FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	protected WebElement linkPagarBoleto;

	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement linkConcluirCompra;

}
