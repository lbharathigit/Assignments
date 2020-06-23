package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://demo.guru99.com/test/delete_customer.php");				
								
				driver.findElement(By.name("cusid")).sendKeys("123");
				
				driver.findElement(By.name("submit")).click();
				
				driver.switchTo().alert().accept();
				
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
				
			}

		}


	


