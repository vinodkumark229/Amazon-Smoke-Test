package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewAccountAmazon {
	
	WebDriver driver;
	
	
	@Given("user on the amazon home page")
	public void user_on_the_amazon_home_page() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	    
	}

	@When("click on sign in and account tab")
	public void click_on_sign_in_and_account_tab() {
		WebElement HelloSigninBtn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		HelloSigninBtn.click();
	}

	@When("click on create a new account")
	public void click_on_create_a_new_account() {
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		CreateNewAcc.click();
	    
	}

	@When("enter Your name as {string}")
	public void enter_your_name_as(String username) {
	 WebElement EnterUsserName = driver.findElement(By.xpath("//input[@id = 'ap_customer_name']"));
			 EnterUsserName.sendKeys(username);   
	    
	}

	@When("enter Email address as {string}")
	public void enter_email_address_as(String email) {
	WebElement EnterEmail = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
			EnterEmail.sendKeys(email);    
	    
	}

	@When("enter password as {string}")
	public void enter_password_as(String pass) {
	    WebElement EnterPass = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
	    EnterPass.sendKeys(pass);
	    
	}

	@When("re enter password {string}")
	public void re_enter_password(String repass) {
	    WebElement Repass = driver.findElement(By.xpath("//input[@id = 'ap_password_check']"));
	    Repass.sendKeys(repass);
	    
	    
	}

	@Then("the user can create new account sucessfully")
	public void the_user_can_create_new_account_sucessfully() {
	    WebElement Countinue = driver.findElement(By.xpath("//input[@id = 'continue']"));
	    Countinue.click();
	   
	}

		
		
		
		
		
		

}
