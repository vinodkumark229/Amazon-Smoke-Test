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

public class ClickOnAmazonPharmacyBtn {
	WebDriver driver;
	@Given("user on the amazon homepage")
	public void user_on_the_amazon_homepage() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user click on pharmacy button")
	public void user_click_on_pharmacy_button() {
WebElement Pharmacybtn = driver.findElement(By.xpath("//a[contains(text(),'Pharmacy')]"));
Pharmacybtn.click();
	}

	@When("pharmacy tab will open")
	public void pharmacy_tab_will_open() {
		WebElement PharmacySignup = driver.findElement(By.xpath("//a[@class = 'nav-menu-cta button button-type-tertiary']"));
		PharmacySignup.click();
	}

	@Then("click on sign up button")
	public void click_on_sign_up_button() {

	}

}
