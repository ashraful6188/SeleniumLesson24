package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Scrolling : by pixels
 *             to a specific element
 *             to the bottom of the screen
 */
public class ScrollingDemo {

	public static void main(String[] args) {

		// it would launch firefox browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://www.target.com/");

		// type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// scrolling by pixel
		js.executeScript("window.scrollBy(0, 800)");

//		// scroll to an element
//		WebElement targetElement = driver
//				.findElement(By.xpath("//body//div[@id='__next']//div//div[2]//div[1]//a[1]//div[2]//img[1]"));
//		js.executeScript("arguments[0].scrollIntoView();", targetElement);

//		// scroll to the end of the page
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
