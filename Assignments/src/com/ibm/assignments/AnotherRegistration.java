package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AnotherRegistration {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");				
								
				driver.findElement(By.name("user_login")).sendKeys("testlogin");
							
				driver.findElement(By.name("user_password")).sendKeys("testpass");
				
				driver.findElement(By.name("first_name")).sendKeys("testfirstname");
				
				driver.findElement(By.name("last_name")).sendKeys("testlastname");
				
				driver.findElement(By.name("email")).sendKeys("testemail@test123.com");
				
				Select country = new Select(driver.findElement(By.name("country_id")));
				country.selectByIndex(0);
				
				Select gender = new Select(driver.findElement(By.name("gender_id")));
				gender.selectByIndex(0);
				
				driver.findElement(By.name("Insert")).click();
								
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
			}

		}


	


