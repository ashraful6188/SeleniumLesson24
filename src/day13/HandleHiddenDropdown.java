package day13;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");// username
        driver.findElement(By.name("password")).sendKeys("admin123");// password
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Click on PIM
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Chief Executive Officer']")).click();
	}

}
