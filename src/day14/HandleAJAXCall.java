package day14;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAJAXCall {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		driver.findElement(By.xpath("//button[@id='loadContent']")).click();

		// declare explicit wait
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loadedElement = myWait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
		System.out.println(loadedElement.getText());

//               // Fluent wait declaration
//				Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(15))
//				.pollingEvery(Duration.ofSeconds(3))
//				.ignoring(NoSuchElementException.class);
//				
//				WebElement loadedElement = mywait.until(new Function<WebDriver, WebElement>() {
//					public WebElement apply(WebDriver driver) {
//						WebElement loadedElement = driver
//						.findElement(By.xpath("//div[@id='ajaxContent']/h2"));
//						return loadedElement;
//					}
//				});
//				System.out.println(loadedElement.getText());

		driver.quit();

	}

}
