package day14;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DulicateOptionsListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		Select listBox = new Select(driver.findElement(By.xpath("//select[@id='colors']")));
		Set<String> uniqueOption = new HashSet<String>();
		boolean flag = false;

		for (WebElement option : listBox.getOptions()) {
			String optionText = option.getText();
			if (!uniqueOption.add(optionText)) {
				System.out.println("Duplicate option found : " + optionText);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("No duplicate option are not found in the list box...");
		}
		driver.quit();

	}

}
