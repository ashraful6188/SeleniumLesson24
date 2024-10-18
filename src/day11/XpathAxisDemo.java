package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxisDemo {
	public static void main(String[]args) {
	WebDriver driver = new FirefoxDriver();// it would launch firefox browser
	// maximize the window
	driver.manage().window().maximize();
	// launching google home page
	driver.get("https://www.google.com/");
	// find element
	WebElement searchBox = driver.findElement(By.xpath("//textarea[contains(@id, 'APjFqb')]"));
	searchBox.sendKeys("Olympic 2024");
	searchBox.sendKeys(Keys.ENTER);
	// searchBox.click()
	}
}
