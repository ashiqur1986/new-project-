package com.talentect.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class RegisterUser {
	
	WebDriver driver;
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
		
		
  System.setProperty("webdriver.chrome.driver","/Users/mdashiqurrahman/Downloads/chromedriver");
		
  driver=new ChromeDriver();
  driver.get("http://www.newtours.demoaut.com/");
	    
	}

	@When("^user click on register link$")
	public void user_click_on_register_link() throws Throwable {
	    
	}

	@When("^user enter user name, password, confirm password$")
	public void user_enter_user_name_password_confirm_password() throws Throwable {
	    
	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
	    
	}

	@Then("^user receives a confirmation$")
	public void user_receives_a_confirmation() throws Throwable {
	    
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	    
	}


}
