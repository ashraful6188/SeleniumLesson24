package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		
		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get("https://text-compare.com/");
		driver
		.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("we are learnimg selenium");
		
		// create a object
		Actions act = new Actions(driver);
		// Ctrl + A-----select the text area
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();	
		// Ctrl+C ..... copies the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		// TAB---shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();	
		// Ctrl+V..... paste in the 2nd area
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
