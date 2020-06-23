package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Copytext {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");				
								
				driver.findElement(By.name("user_login")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
							
				driver.findElement(By.name("user_password")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
				
						
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
			}

		}


	


