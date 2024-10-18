package day13;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://jqueryui.com/datepicker/");
		// switch to the frame
		driver.switchTo().frame(0);
//		// Method 1 : sendkeys
//		// 10/27/2025
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/27/2025");

		// Method 2: using date picker
		// 10/27/2025
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
//		String year = "2025";
//		String month = "October";
//		String date = "27";
//		selectFutureDate(driver, year, month, date);

		String year = "2020";
		String month = "April";
		String date = "4";
		selectPasteDate(driver, year, month, date);
	}

// Select Future date
	public static void selectFutureDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actualMonth
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actualYear
			if (currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

// Select past date
	public static void selectPasteDate(WebDriver driver, String year, String month, String date) {

		while (true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actualMonth
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actualYear
			if (currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}

	}

}
