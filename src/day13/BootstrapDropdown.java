package day13;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
// Bootstrap and multiselect dropdown
public class BootstrapDropdown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");

		// Click on the dropdown button
		driver.findElement(By.xpath("//span[contains(@class, 'multiselect-native')]")).click();
		// select a single element from the list- Java
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		// count how many options are available
		List<WebElement> avaailableOptions = driver
				.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		// printing the number of options
		System.out.println("Available options are :" + avaailableOptions.size());

		// print all the options
		for (WebElement ops : avaailableOptions) {
			System.out.println(ops.getText());
		}
		// Select multiple options
		for (WebElement ops : avaailableOptions) {
			String option = ops.getText();
			if (option.equals("java") || option.equals("Oracle")) {
				ops.click();
			}
		}

	}

}
