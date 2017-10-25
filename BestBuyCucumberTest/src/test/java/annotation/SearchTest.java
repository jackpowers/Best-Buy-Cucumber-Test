package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import static org.junit.Assert.*;

import org.junit.Test;


public class SearchTest {

	WebDriver driver = null;

	@Given("^I am on Best Buy home page$")

	public void goToBestBuy() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.bestbuy.com/");
//		Refresh avoids black friday pop-up
		driver.get("https://www.bestbuy.com/");
	}

	@When("^I enter search Term as \"([^\"]*)\"$")
	   public void enterTerm(String arg1) {
		
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys(Keys.RETURN);
		
	}
	

	@Then("^search page should display \"([^\"]*)\"$")
	
	public void checkPage(String arg1) {
		
		
		
		WebElement result = driver.findElement(By.xpath("//h1[@class='type-page-label-alt result-for']"));
		
		assertEquals(result.getText().replaceAll("^\"|\"$", ""), arg1);
		driver.close();
		
	}

	
}
