package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMandatoryFields_PsuedoElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/en-gb?route=account/register");

		List<WebElement> elements = driver.findElements(By.xpath("//form[@id='form-register']//label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (WebElement element : elements) {
			String script = "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content')";
			String content = js.executeScript(script, element).toString();
			if (content.contains("*")) {
				System.out.println(element.getText() + " = Mandatory field");
			} else {
				System.out.println(element.getText() + " = Not Mandatory filed");
			}
		}

		driver.quit();

	}

}
