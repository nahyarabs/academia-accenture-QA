import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacao {
			
		public static void main (String[] args) {

			// especificar caminho
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nahyara Batista\\Downloads\\academia-seleniumwebdriver-base\\academia-seleniumwebdriver-base\\src\\test\\resources\\drivers\\chromedriver.exe");
					
			//criar projeto
			WebDriver driver = new ChromeDriver();
			
			//comandos basicos do navegador
			driver.get("http://automationpractice.com/index.php"); //abre o navegador
			driver.manage().window().maximize();
			
			WebElement linkSingIn = driver.findElement(By.linkText("Sign in"));
			linkSingIn.click();
			
			//WebElement linkSingIn = driver.findElement(By.partialLinkText("Sign"));
			//linkSingIn.click();
			
			//WebElement txtEmail = driver.findElement(By.id("email_create"));
			//txtEmail.sendKeys("Mafra1000@gmail.com");
			
			//WebElement txtNewsletter = driver.findElement(By.id("newsletter-input"));
			//txtNewsletter.sendKeys("cssl@acc.com.br");
			
			WebElement linkContact = driver.findElement(By.id("contact-link"));
			linkContact.click();
			
			//System.out.println(driver.getTitle()); //imprime no console o título da página
			//driver.navigate().refresh(); // regacarrega a página
			//driver.quit(); //fecha o navegador
				
		

	}


}
