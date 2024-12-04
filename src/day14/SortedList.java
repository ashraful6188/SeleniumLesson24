package day14;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='colors']")));

		ArrayList orginalList = new ArrayList();
		ArrayList temporayList = new ArrayList();

		List<WebElement> options = dropDown.getOptions();

		for (WebElement option : options) {
			orginalList.add(option.getText());
			temporayList.add(option.getText());
		}

		System.out.println("Before sorted : ");
		System.out.println("\t Orginal List: " + orginalList);
		System.out.println("\t Temporay List: " + temporayList);

		// Sortted temprary list
		Collections.sort(temporayList);

		System.out.println("After sorted : ");
		System.out.println("\t Orginal List: " + orginalList);
		System.out.println("\t Temporay List:  " + temporayList);

		if (orginalList.equals(temporayList)) {
			System.out.println("List box are sorted....");
		} else
			System.out.println("List box are not sorted ....");
	//	driver.quit();

	}

}
