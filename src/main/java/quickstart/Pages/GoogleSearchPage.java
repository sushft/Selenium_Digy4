package quickstart.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Constants.TimeOuts;

public class GoogleSearchPage  {

	WebDriver driver;
	Properties properties;
	
	
	public GoogleSearchPage(WebDriver driver) throws IOException {
		this.driver=driver;
		this.properties= new Properties();
		String currDir= System.getProperty("user.dir");
		InputStream input= new FileInputStream(currDir+"\\src\\main\\java\\quickstart\\Pages\\GoogleSearchPage.properties");
		System.out.println("---------------------check the second directory----------------"+input);
		this.properties.load(input);
	}

//	 This method is for entering a keyword in an input field on the webpage
	
	
	public void enterKeyWord(String keyword) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='q']")));
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(keyword);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
	}

	public void waitForResultLink(String keyword) {
		String searchResultLink="//h3[contains(.,'"+keyword+"')]";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(TimeOuts.DEFAULT_TIMEOUT));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchResultLink)));		
	}

	public  void searchKeyword(String keyword) {

		this.enterKeyWord(keyword);
		this.waitForResultLink(keyword);	
		
	}


}
