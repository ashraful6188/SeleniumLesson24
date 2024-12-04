package day14;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountElementsScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.booksbykilo.in/new-books");
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		Actions act = new Actions(driver);

		int curentCount = 0;
		int previousCount = 0;

		while (true) {
			List<WebElement> allBook = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			curentCount = allBook.size();
			if (curentCount == previousCount) {
				break;
			}
			previousCount = curentCount;

			// Scrolling by JavascriptExecutor
			// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			// Scrolling by Actions class
			act.sendKeys(Keys.END).perform();
			Thread.sleep(3000);

		}
		System.out.println("Totall number of books : " + curentCount);
		driver.quit();

	}

}
