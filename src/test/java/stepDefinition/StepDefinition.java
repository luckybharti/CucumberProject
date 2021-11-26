package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkartDemo.AppDriver.*;
import com.flipkartDemo.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
		
			WebDriver driver = appDriverSetup() ;
			
		 	@Given("User on home page")
			public void user_on_home_page() {
			    // Write code here that turns the phrase above into concrete actions
		 		 try {
		 		String url = "https://www.flipkart.com/";	
		 		 driver.manage().window().maximize();
		 		 driver.get(url);
		 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		 }
		 		 catch(Exception e) {
		 			 e.printStackTrace();
		 		 }
		 	 }
			
			@When("Login by User")
			public void login_by_User(){
				
				try {
				
				windowHandles();
				
				Thread.sleep(3000);
				String email = fetchData("userEmail");
				System.out.println(email);
				//WebElement emailID = getWhenVisible(By.xpath(email),10);
				WebElement emailID = driver.findElement(By.xpath(email));
				
				emailID.sendKeys("bhartilucky174@gmail.com");
				
				String userPassword = fetchData("userPassword");
				WebElement password = getWhenVisible(By.xpath(userPassword),10);
				password.sendKeys("BVP@9ueM");
				
				String login = fetchData("loginButton");
				WebElement loginButton = getWhenVisible(By.xpath(login),10);
				loginButton.click();
				}
				
				catch(Exception e)
					{
						e.printStackTrace();
					}
			
			}
			
			
			@And("User lands on profile page")
			public void user_lands_on_profile_page() throws InterruptedException {
				
				try {
				Thread.sleep(5000);
				String userName = fetchData("userName");
				WebElement userNameLink = getWhenVisible(By.xpath(userName),10);
				mouseHovering(userNameLink);
				
				String myProfileLink = fetchData("myProfileLink");
				WebElement myProfile =getWhenVisible(By.xpath(myProfileLink),10);
			    myProfile.click(); 
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			
			}
			
			
			@Then("The profile page displays the user’s personal info")
			public void the_profile_page_displays_the_user_s_personal_info() {
			    try {
			    
			    String myName = fetchData("myName");
				WebElement name = getWhenVisible(By.cssSelector(myName),10);
				String actualName =name.getText();
				System.out.println(actualName);
			    }
			    catch(Exception e) {
			    	e.printStackTrace();
			    	
			    }
			}
			
		}
		
	
	
