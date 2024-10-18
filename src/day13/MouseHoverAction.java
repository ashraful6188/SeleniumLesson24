package day13;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		       // it would launch firefox browser
				WebDriver driver = new FirefoxDriver();
				// maximize the window
				driver.manage().window().maximize();
				// add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// launching page
				driver.get("https://www.mortgagecalculator.org/");
				WebElement calc = driver.findElement(By.xpath("//a[text()='Mortgage Calcs']"));
				WebElement fixed = driver.findElement(By.xpath("//a[normalize-space()='15 yr Fixed']"));
				// create an object of action class
				Actions act = new Actions(driver);
				// mouse hover action
				//act.moveToElement(calc).moveToElement(fixed).click().build().perform();
				act.moveToElement(calc).moveToElement(fixed).click().perform();
	}

}
