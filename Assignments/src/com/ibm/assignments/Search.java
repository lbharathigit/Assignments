package com.ibm.assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://examples.codecharge.com/Store/Default.php");				
				System.out.println(driver.getTitle());
				
				driver.findElement(By.name("s_keyword")).sendKeys("Databases");
							
				driver.findElement(By.name("DoSearch")).click();
				
				Thread.sleep(3000);			
				driver.quit();    
			    	
				
				
			}

		}


	


