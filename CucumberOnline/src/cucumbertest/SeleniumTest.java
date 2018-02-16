package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\muhammad.abdullah\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("sf-with-ul")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		driver.quit();
	}
}
