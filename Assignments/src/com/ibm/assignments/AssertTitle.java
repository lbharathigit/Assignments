package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTitle {

	public void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://www.newtours.demoaut.com");		
				
				String ActualTitle = driver.getTitle();
				String ExpectedTitle = "Welcome: Mercury Tours";
				Assert.assertEquals(ExpectedTitle, ActualTitle);
				
												
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
				
			}

		}


	


