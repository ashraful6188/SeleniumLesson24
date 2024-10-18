package day14;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {

		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching page
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		// create a object of Actions class
		Actions act = new Actions(driver);
		// Right click on the button
		act.contextClick(button).perform();
		// click on copy
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		// close the alert box
		driver.switchTo().alert().accept();

	}

}
