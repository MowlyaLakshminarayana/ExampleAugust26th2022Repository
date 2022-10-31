package com.sgtesting.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser() ;
		navigate();
		MouseMovements();

	}
	private static void launchBrowser() 
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void MouseMovements()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
			Actions o1=new Actions(oBrowser);
			o1.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Realme")).click();
			//oBrowser.findElement(By.linkText("Memory Cards")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
