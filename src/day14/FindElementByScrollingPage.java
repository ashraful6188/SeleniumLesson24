package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElementByScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.booksbykilo.in/new-books");
		
	// JavascriptExecutor js= (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		 boolean found = false;
		 while(!found) {
			 List<WebElement> allBook = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			 for(WebElement book:allBook) {
				 if(book.getText().equals("Sunny")) {
					 System.out.println("Book found...!");
					 found=true;
					 break;
				 }
				 // Using JavascriptExecutor method
				 //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				 // Using Actions class method
				 act.sendKeys(Keys.END).perform();
				
			 }
			 	 
		 }
		 driver.quit();
	}

}
