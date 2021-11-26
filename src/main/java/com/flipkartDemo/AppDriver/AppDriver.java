package com.flipkartDemo.AppDriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class AppDriver{

	 WebDriver driver;
	 public String driverPath =null; 
	 public String locatorPath =null;
	 
	
	public WebDriver appDriverSetup() {
		propertiesReader();
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver =  new ChromeDriver();
		return driver;
    
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
public String fetchData(String strElement) throws ParserConfigurationException, SAXException, IOException {
		propertiesReader();
		//File locatorFile = new File("C:\\Users\\Lenovo\\Desktop\\lucky\\FlipkartDemoCucumberProject\\src\\main\\resources\\locator\\locator.xml");
		String retval= "";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 Document doc = builder.parse(locatorPath);
		 doc.getDocumentElement().normalize();
		 
		 NodeList nList = doc.getElementsByTagName("elementName");
		 for(int temp =0; temp < nList.getLength(); temp++) {
			 Node nNode = nList.item(temp);
			 if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element eElement = (Element) nNode;
				
				if(nNode.getAttributes().getNamedItem("name").toString().contains(strElement)) {
					 retval = eElement.getElementsByTagName("locator").item(0).getTextContent();
					
					break;
				} 
			 }
		 }
		return retval;
		 
		 
		
	}
	public void propertiesReader(){
	
      String filePath="C:\\Users\\Lenovo\\Desktop\\lucky\\FlipkartDemoCucumberProject\\src\\main\\resources\\Data\\configuration.properties";
	  Properties prop = new Properties() ;
	  	try {
	  			FileInputStream file= new FileInputStream(filePath);
	  			prop.load(file);
	  		} catch (FileNotFoundException e) {
	  			System.out.println("Configuration File not found");
	  		} catch (IOException e) {
	  			System.out.println("Configuation File not load Sucessflly");
		
			}
	
	  		driverPath = prop.getProperty("driverPath");
	  		//System.out.println(driverPath);
	  		locatorPath = prop.getProperty("locatorPath");
	  		//System.out.println(locatorPath);
	
}
	
}
