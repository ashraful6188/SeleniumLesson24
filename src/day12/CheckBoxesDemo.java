package day12;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxesDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching the application
		driver.get("https://testautomationpractice.blogspot.com/");

//		// select only one specific element		
//		   driver.findElement(By.xpath("//input[@id='sunday']")).click();

		// find out total number of check box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]"));
		System.out.println(checkboxes.size());

//		// select all the check box
//		for (int i = 0; i < checkboxes.size(); i++) {
//			// get each of the element of the list and perform click
//			checkboxes.get(i).click();
//		}
		
//		// select all the checkbox with for each loop
//		for(WebElement j : checkboxes ) {
//			j.click();
//			
//		}
		
//		// select last two checkbox
//		// total number of checlboxes- how many checkboxes want to select = stating index
//		// 7-2=5 (stating index)
//		for(int i=5; i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
	
//		// select first two checkbox
//		for(int i=0; i<2;i++) {
//			checkboxes.get(i).click();
//		}
		
//		// de-selecting checkbox if those are already selected
//		for(WebElement box: checkboxes) {
//			if(box.isSelected()) {
//				box.click();
//			}
//		}

		// select only  saturday and sunday check box
		for (int i = 0; i < checkboxes.size(); i++) {
			String data = checkboxes.get(i).getAttribute("value");
			if (data.equalsIgnoreCase("sunday") || data.equalsIgnoreCase("saturday")) {
				checkboxes.get(i).click();
			}

		}

//		 driver.quit();

	}

}
