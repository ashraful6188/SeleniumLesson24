package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoublrClickAction {

	public static void main(String[] args) {

		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching page
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

		// switch to the frame
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

		// clear box1
		box1.clear();
		box1.sendKeys("Welcome to Selenium");
		// create a object of Actions class
		Actions act = new Actions(driver);
		// perform double click operation on button
		act.doubleClick(button).perform();
		// validation : in box2
		String text = box2.getAttribute("value");
		boolean validation = text.equals("Welcome to Selenium");
		if (validation) {
			System.out.println("Text copied............!!");
		} else {
			System.out.println("Text did not get copied !!");
		}

	}

}
