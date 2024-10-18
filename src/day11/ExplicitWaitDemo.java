package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// Explicit wait declaration
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		FluentWait<WebDriver> myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// launching the application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// use of expilicit wait
		WebElement username = myWait
		.until(ExpectedConditions.visibilityOfElementLocated(By
		.xpath("//input[@name='username']")));

		// pass admin value to username field
		username.sendKeys("admin");

	}

}
