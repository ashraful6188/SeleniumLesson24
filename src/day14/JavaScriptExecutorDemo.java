package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		// type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// send keys with JavascriptExecutor
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		WebElement gender = driver.findElement(By.xpath("//input[@id='male']"));
		// click on male
		js.executeScript("arguments[0].click()", gender);

	}

}
