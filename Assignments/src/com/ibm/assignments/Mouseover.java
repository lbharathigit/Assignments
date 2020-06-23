package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://demowebshop.tricentis.com");				
				System.out.println(driver.getTitle());
								
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElementByClassName("Computers")).perform();
							
				driver.findElement(By.linkText("Accessories")).click();
				
				Thread.sleep(3000);
				driver.quit();    
			
				
			}

		}


	


