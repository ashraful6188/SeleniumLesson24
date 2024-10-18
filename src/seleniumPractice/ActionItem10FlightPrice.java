package seleniumPractice;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionItem10FlightPrice {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching web page
		driver.get("https://blazedemo.com");
		// capture web element portland
		WebElement dd_depature = driver.findElement(By.xpath("//select[@class='form-inline']"));
		// Declare Select class
		Select sc = new Select(dd_depature);
		// select portland
		sc.selectByVisibleText("Portland");
		// capture new york web element
		WebElement dd_arival = driver.findElement(By.xpath("//select[@name='toPort']"));
		// Declare Select class
		Select sc2 = new Select(dd_arival);
		// select New York
		sc2.selectByVisibleText("New York");
		// click find Flight
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		// Capture all price
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td[6]"));
		for (WebElement pr : prices) {
			System.out.println(pr.getText());
		}

	}

}
