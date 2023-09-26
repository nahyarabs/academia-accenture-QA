import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Constants;
import utils.DriverContext;

import actions.CreateAccountAction;

class TestAutomationPractice {

	WebDriver driver;
	CreateAccountAction account;

	@BeforeEach
	void SetUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new CreateAccountAction();
	}

	@Test
	void test() {
		account.clicarSignIn();
		account.preencherEmail("nahyara@gmail.com");
		account.preencherSenha("123nahyara");
		account.clicarSubmitLogin();
		account.preencherItem("dress");
		account.clicarPesquisar();
		account.selecionarItem();
		account.verOpcaoTamanho();
		account.selecionarTamanho();
		account.selecionarCor();
		account.addCarrinho();
		account.verResumoCompra();
		account.confirmarEndereco();
		account.escolherEnvio();
		account.permitirTermosServico();
		account.prosseguirCompra();
		account.pagarBoleto();
		account.concluirCompra();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

}
