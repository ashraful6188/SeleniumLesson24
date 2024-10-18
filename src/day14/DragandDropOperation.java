package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropOperation {

	public static void main(String[] args) {
		// it would launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching page
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		// drag and drop 1
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();
		// drag and drop 2
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		act.dragAndDrop(madrid, spain).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
