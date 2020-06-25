package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://demowebshop.tricentis.com");				
				System.out.println(driver.getTitle());
				
				driver.findElement(By.linkText("Register")).click();
				System.out.println(driver.getTitle());
				
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys("Sample firstname");
				driver.findElement(By.id("LastName")).sendKeys("Sample lastname");
				driver.findElement(By.id("Email")).sendKeys("testing@test123.com");
				driver.findElement(By.id("Password")).sendKeys("Pass123$");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("Pass123$");
				driver.findElement(By.id("register-button")).click();
				
				driver.findElement(By.linkText("Log out")).click();
				
				driver.quit();    
			
				
			}

		}


	


