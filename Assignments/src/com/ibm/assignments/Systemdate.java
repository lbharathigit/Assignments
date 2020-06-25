package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Systemdate {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://www.newtours.demoaut.com");				
								
				System.out.println(driver.findElement(By.xpath("//form/table/tbody/tr[1]/td[1]")).getText());
			
							
				
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
				
			}

		}


	


