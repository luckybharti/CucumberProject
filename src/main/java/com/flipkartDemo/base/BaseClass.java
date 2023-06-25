package com.flipkartDemo.base;

import java.util.HashMap;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class BaseClass{
	
	public WebDriver driver;
	public String chromeDriverPath="C:\\Users\\Lenovo\\Desktop\\lucky\\CucumberProject\\src\\main\\resources\\Driver\\chromedriver.exe";	
	public String applicationURL ="https://www.flipkart.com/";
	
//	public BaseClass() {
//		intialization();
//	}


	public void intialization() {
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");	
	driver = new ChromeDriver(options);
	driver.get(applicationURL);
	
	}

	
	
	

}