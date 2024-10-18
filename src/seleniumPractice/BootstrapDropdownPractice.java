package seleniumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdownPractice {

	public static void main(String[] args) {

		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[contains(@class, '-native-select')]")).click();
		// Capture and Find number of text label
		List<WebElement> dropList = driver.findElements(By.xpath("//ul[contains(@class, 'dropdown-menu')]//label"));
		System.out.println("Number of label: " + dropList.size());
		// print all label
		for (WebElement la : dropList) {
			String opt = la.getText();
			System.out.println(opt);
			if (opt.equals("C#") || opt.equals("MS SQL Server")) {
				la.click();
			}
		}

	}

}
