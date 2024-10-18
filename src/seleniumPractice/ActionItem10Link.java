package seleniumPractice;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionItem10Link {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://demoblaze.com/index.html");
		// Capture all link on the page
		List<WebElement> link = driver.findElements(By.tagName("a"));
		// Count number of link
		int totalLink = link.size();
		// print the link number
		System.out.println(totalLink);
		// Capture all images on the page
		List<WebElement> imges = driver
				.findElements(By.xpath("//img[@class='card-img-top img-fluid'" + "and contains(@src,'.jpg')]"));
		// Count the number of images
		int totalImages = imges.size();
		// print the images number
		System.out.println(totalImages);
		// Click a links
		driver.findElement(By.partialLinkText("galaxy s7")).click();
		

	}

}
