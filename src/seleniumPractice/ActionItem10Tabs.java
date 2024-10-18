package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionItem10Tabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://testautomationpractice.blogspot.com/");
		// type "Caltech" word
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Caltech");
		// click in search box
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		// capture all options
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']"));
//		for (WebElement ops : options) {
//			String opsName = ops.getText();
//			System.out.println(opsName);
//			if (opsName.equals("Caltech Employees Federal Credit Union")) {
//				ops.click();
//				break;
//
//			}
//		}

		for (int i = 0; i < options.size(); i++) {
			String ops = options.get(i).getText();
			System.out.println(ops);
			if (ops.equals("Caltech 101")) {
				options.get(i).click();
				break;
			}
		}
	}

}
