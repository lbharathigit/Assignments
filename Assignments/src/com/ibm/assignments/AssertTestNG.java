package com.ibm.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.junit.Assert;


public class AssertTestNG {
	WebDriver driver;	

		@BeforeMethod(alwaysRun=true)
		public void setup(){
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);								
			driver.get("http://www.newtours.demoaut.com");
		}
		
		@AfterMethod(alwaysRun=true)
		public void close(){
			
			driver.quit();
		
		}

		@Test(groups= {"g1"})
		public void Asserttile () {

			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Welcome: Mercury Tours";
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			System.out.println(ActualTitle);
			
			}	
			
		
	}




	


