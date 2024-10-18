package day13;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// find out number of rows in table
		List<WebElement> listofRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rows = listofRow.size();
		System.out.println("Number of rows in BookTable is :" + rows);// 7
		// number of columns in booktable
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println("Colums in book table " + columns);
		// print all the values form book table
		for (int r = 2; r <= rows; r++) {
			for (int c = 1; c <= columns; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(value + " ");
			}
			System.out.println();
		}
		System.out.println();

		// print the books which are authored by Amit
		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]"))
					.getText();
			if (authorName.equals("Amit")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[\" + r + \"]/td[1]"))
						.getText();
				System.out.println(authorName + " >>" + bookName);
			}

			// calculate the total price of the all books from the table
			int total = 0;
			for (r = 2; r <= rows; r++) {
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[4]"))
						.getText();
				total = total + Integer.parseInt(price);
			}
			System.out.println("The total price is : " + total);// 7100

		}

	}

}
