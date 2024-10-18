package seleniumPractice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPractice {

	public static void main(String[] args) {
		// lunch firefox browser
		WebDriver driver = new FirefoxDriver();
		// Declare fluent wait
		Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(21))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		// lunching application
		driver.get("https://testautomationpractice.blogspot.com/");
		// use the fluent wait
		WebElement element = myWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver
				.findElement(By.xpath("//h1[@class='title']"));
				return element;
			}

		});
		boolean el = element.isDisplayed();
		System.out.println(el);
		
		// close the driver
		driver.close();

	}

}
