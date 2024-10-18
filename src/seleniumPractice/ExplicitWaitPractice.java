package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {
		
		// Create a object and lunch the firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// declare Explicit wait
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Lancing the application
		driver.get("https://testautomationpractice.blogspot.com/");
		//use the myWaiand find the element
		WebElement element = myWait
		.until(ExpectedConditions
		.visibilityOfElementLocated(By.xpath("//textarea[@id='textarea']")));
		// send the value
		element.sendKeys("Test");
		
		// close the driver
		driver.quit();
		
		
		

	}

}
