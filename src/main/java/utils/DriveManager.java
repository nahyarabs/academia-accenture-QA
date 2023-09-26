package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveManager {

	private static WebDriver driver;

	public WebDriver AbrirUrl() {

		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		DriverContext.setDriver(driver);
		return driver;
	}
}