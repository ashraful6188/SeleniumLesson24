package seleniumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxesPractice {

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

//		// select specific element 
//		driver.findElement(By.xpath("//td[text()='$10.99']/following-sibling::td/input")).click();

		// capture multiple element
		List<WebElement> myElements = driver.findElements(By.xpath("//input[@type='checkbox']/parent::td/input"));
		System.out.println(myElements.size());

//		// all check box select
//		for(WebElement check : myElements) {
//			check.click();
//		}

		// select  first three checkbox
		for(int i = 0; i<3; i++) {
			myElements.get(i).click();
		}

//		// select last two check
//		for(int i = 3;i<myElements.size();i++ ) {
//			myElements.get(i).click();
//		}

		// de-select checkbox
		for (WebElement sel : myElements) {
			if (sel.isSelected()) {
				sel.click();
			}
		}

	}

}
