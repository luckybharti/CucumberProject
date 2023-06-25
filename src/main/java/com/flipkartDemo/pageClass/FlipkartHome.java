package com.flipkartDemo.pageClass;

import org.openqa.selenium.support.PageFactory;

import com.flipkartDemo.base.BaseClass;

public class FlipkartHome extends BaseClass {

	public FlipkartHome() {
	
		PageFactory.initElements(driver, this);	
	
}


}
