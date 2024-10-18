package seleniumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo {

	public static void main(String[] args) {
		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		// capture country dropdown list
		WebElement countryList = driver.findElement(By.xpath("//select[@id='country-list']"));
		// create instance of Select class
		Select country = new Select(countryList);
		// capture all the options of country
		List<WebElement> countryOption = country.getOptions();
		System.out.println("Number of country on the option: " + countryOption.size());
		// print all the options
		for (WebElement opt : countryOption) {
			System.out.println(opt.getText());
		}
		// select USA
		country.selectByIndex(5);
		System.out.println("====================");
		// capture state dropdown list
		WebElement statList = driver.findElement(By.xpath("//select[@id='state-list']"));
		// Create State instance of Select class
		Select state = new Select(statList);
		// capture all the option of state
		List<WebElement> stateOption = state.getOptions();
		System.out.println("Number of state: "+ stateOption.size());
		// print all the option
		for(WebElement opt2: stateOption) {
			System.out.println(opt2.getText());
		}
		// select New York
		state.selectByVisibleText("New York");

	}

}
