package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {

	public static void main(String[] args) {
		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		WebElement min_slider = driver.findElement(By.xpath("//span[contains(@style, 'left: 0%')]"));
		System.out.println(min_slider.getLocation());// (59, 287)
		
		Actions act = new Actions(driver);
		//slide the min slider
		act.dragAndDropBy(min_slider, 100, 287).perform();
		System.out.println("Location after slideing minimum"+min_slider.getLocation());
		// slide the maximum
		WebElement max_slider = driver.findElement(By.xpath("//span[contains(@style, 'left: 100%;')]"));
		System.out.println(max_slider.getLocation());//(612, 287)
		act.dragAndDropBy(max_slider, -100, 287).perform();
		System.out.println("Location after slideing maximum"+max_slider.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
