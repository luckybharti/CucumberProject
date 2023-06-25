package stepDefinition;

import com.flipkartDemo.base.BaseClass;

import io.cucumber.java.en.*;

public class FlipkartHomeTest extends BaseClass {

	@Given("User on home page")
	public void user_on_home_page() {
	    
		intialization();
		
	}

	@When("Login by User")
	public void login_by_user() {
	
	
	}

	@When("User lands on profile page")
	public void user_lands_on_profile_page() {
	}

	@Then("The profile page displays the user’s personal info")
	public void the_profile_page_displays_the_user_s_personal_info() {
	
	driver.quit();
	}


}


