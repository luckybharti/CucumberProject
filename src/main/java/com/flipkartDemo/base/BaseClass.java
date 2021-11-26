package com.flipkartDemo.base;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkartDemo.AppDriver.AppDriver;

public class BaseClass extends AppDriver{
 
	WebDriver driver = appDriverSetup();
	public void windowHandles() {
		String mainWindow =driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> it = s1.iterator();
		
		while(it.hasNext()) {
			
			String childWindow = it.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		
		}

	public void mouseHovering(WebElement element){
		try {
			Actions ac = new Actions(driver);
			Action mousehover=ac.moveToElement(element).build();
			mousehover.perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		public WebElement getWhenVisible(By locator, int time){
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
		return element ;
	}
	
	public WebElement locateElement(By locator) {
		WebElement element =null;
		element =driver.findElement(locator);
		return element;
	}
	
	
}
