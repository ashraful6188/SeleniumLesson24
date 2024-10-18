package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionItem10RadioButton {

	public static void main(String[] args) {

		// launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize windows
		driver.manage().window().maximize();
		// add pageLoadTimeout for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launch the application
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='gender' and @class='form-check-input']"));
		for (WebElement data : radio) {
			String values = data.getAttribute("value");
			System.out.println(values);
			if (values.equalsIgnoreCase("Male")) {
				data.click();
			}
		}

	}

}
