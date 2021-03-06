package com.tc.ak.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tc.ak.base.Initialization;
import com.tc.ak.base.PredefinedActions;

public class TestBase {
	private WebDriver driver;
	
//	TestBase(){
//		
//	}
//	
//	TestBase(WebDriver driver){
//		this.driver = driver;
//	}
	
	void start() {
	     driver = PredefinedActions.start();
	}
	
	void start(String url) {
		
	     driver = PredefinedActions.start(url);
	}
	
	void gotoRegistrationPage() {
		driver.findElement(By.id("registration2")).click();
	}

	void gotoBasicElementsPage() {
		
	}
	
	void closeSession() {
		driver.close();
	}
	
}

