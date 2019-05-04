package com.basic.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	
	WebDriver driver;
	@Given("the user is on facebook login page")
	public void the_user_is_on_facebook_login_page(){
		System.out.println("In Setup");
		System.setProperty("webdriver.chrome.driver","D:\\Radical_Selenium\\"
				+ "chromedriver_win32_B45\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_as_user_name(String username) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(username);
	}

	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String pass) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	@Then("^he clicks button$")
	public void he_clicks_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox() throws Throwable {
	    WebElement profile;
	    try{
			    WebDriverWait dw=new WebDriverWait(driver,20);
			    profile=dw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Pravin']")));
			    if(profile.isDisplayed()){
			    	System.out.println("Login Successful!");
			    }
		    }catch(Exception e){
		    	System.out.println("Login Failed! invalid User id/password!");
		    }
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}
}
