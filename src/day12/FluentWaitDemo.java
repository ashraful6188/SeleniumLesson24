package day12;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();

		// Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(15))
		.pollingEvery(Duration.ofSeconds(3))
		.ignoring(NoSuchElementException.class);
		// launching the application
		driver.get("https://testautomationpractice.blogspot.com/");
		// implement fluent wait
		WebElement username = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement username = driver
				.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
				return username;
			}
		});
	    // pass admin value username filed
		username.sendKeys("Admin");
		
		driver.close();

	}

}
