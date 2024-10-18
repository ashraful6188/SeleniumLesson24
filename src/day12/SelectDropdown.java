package day12;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://testautomationpractice.blogspot.com/");
		// clicking on the country dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));

		// create an object of Select class
		Select countryDropdown = new Select(dropdown);

		//Select by value
		countryDropdown.selectByValue("canada");
		// Select by index
		countryDropdown.selectByIndex(0);
		//select by visible text
		countryDropdown.selectByVisibleText("Brazil");

	}

}
