package seleniumPractice;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionItem10CompanyNames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching web page
		driver.get("https://money.rediff.com/gainers/bse/daily/groupz");
		// Capture and click the Z group
		driver.findElement(By.xpath("//strong[text()='Group Z']")).click();
		// Capture and print all company name
		List<WebElement> text = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td[1]"));
		for (WebElement names : text) {
			System.out.println(names.getText());

		}
	}

}
