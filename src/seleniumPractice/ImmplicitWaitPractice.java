package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImmplicitWaitPractice {
	
	public static void main(String[]args) {
		
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching the application
		driver.get("https://testautomationpractice.blogspot.com/");
		// capture the element
		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		// pass the a String value
		element.sendKeys("AA");
		
		// Quit the browser
	    driver.quit();
		
		
	}
	

}
