package day14;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Number of linklist :" + linklist.size());
		int numOfBrokenLink = 0;

		for (WebElement link : linklist) {
			String linkattvalue = link.getAttribute("href");
			if (linkattvalue == null || linkattvalue.isEmpty()) {
				System.out.println("This link does not have value, it can not be check");
				continue;
			}
			try {
				URL linkURL = new URL(linkattvalue);// converting herfvalue to URL format
				HttpURLConnection cnect = (HttpURLConnection) linkURL.openConnection();// open the connection
				cnect.connect(); // connect to the server and send request to the server
				if (cnect.getResponseCode() >= 400) {
					System.out.println(linkattvalue + "====> This is broken link ");
					numOfBrokenLink++;
				} else {
					System.out.println(linkattvalue + "====>This is not broken link");
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Number of brokenlink: "+numOfBrokenLink);
		driver.close();

	}

}
