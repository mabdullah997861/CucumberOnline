package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTestSteps 
{
	public WebDriver driver;
	
	public LoginTestSteps()
	{
		driver = Hooks.driver;
	}
	
	@Given("^I navigate to \"(.*?)\"$")
	public void iNavigateTo(String url) throws Throwable
	
	{
		driver.get(url);
	}
	@Then("^I sign in with \"(.*?)\"$")
	public void iSigninWith(String url) throws Throwable
	
	{
		driver.findElement(By.linkText("Sign in")).click();
		// test
		driver.findElement(By.id("email")).sendKeys("Username");
		driver.findElement(By.id("passwd")).sendKeys("password");
		
	}
}
