package com.springernature.qa.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class CAtool {
	WebDriver driver;
			String CA_W;
			 String childwind_ser;
		
      public CAtool(WebDriver driver)
      {
    	  this.driver=driver;
      }
      
   
     public boolean checkCAPage()
       {
    	   	 boolean Status = driver.findElement(By.xpath("//div[(@class='app_title') and contains(text(),'content.acquisition')]")).isDisplayed();
    	   	 return Status;
           
       }
	
     public boolean checkdesktop()
     {
    	    	 boolean desktop=driver.findElement(By.xpath("//div[@id='MyDesktop'and @class='portlet']")).isDisplayed();
    	     	 return desktop;
         
     }
	public void clickonshelf()
    {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='summaryTheShelf']")));
    	 //driver.findElement(By.xpath("//div[@id='summaryTheShelf']")).click();
     }
     
     public boolean warningcheck()
     {
    	 boolean msg=driver.findElement(By.xpath("//img[@src='/AdisCAWeb/Content/Images/magnifier.png']")).isDisplayed();
    	 return msg;
    	 
     }
     
     public void clickonincoming()
     {
    	 JavascriptExecutor j=(JavascriptExecutor)driver;
    	 j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='summaryIncoming']")));
     }
     
     public boolean checkincomimg()
     {
    	 boolean ms=driver.findElement(By.xpath("//div[@id='Incoming'and @class='portlet']")).isDisplayed();
    	 return ms;
	}
     
     public void clickonquery()
     {
    	 JavascriptExecutor j=(JavascriptExecutor)driver;
    	 j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='summaryQueries']")));
     }
     
     public boolean checkquery()
     {
    	 boolean ms=driver.findElement(By.xpath("//div[@id='Queries'and @class='portlet']")).isDisplayed();
    	 return ms;
	}

     public void clickonQC()
     {
    	 JavascriptExecutor j=(JavascriptExecutor)driver;
    	 j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='summaryQualityControl']")));
     }
     
     public boolean checkQC()
     {
    	 boolean ms=driver.findElement(By.xpath("//div[@id='QualityControl'and @class='portlet']")).isDisplayed();
    	 return ms;
	}
     
     
     public void searchitem() throws InterruptedException
     {
    	 JavascriptExecutor j=(JavascriptExecutor)driver;
    	 j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//li[@onclick='ca.start.ShowItemSearch()']")));
         CA_W =driver.getWindowHandle();
    	 Set<String> wind=driver.getWindowHandles();
     	Iterator<String> I1=wind.iterator();
     	
     	while(I1.hasNext())
     	{
     		 childwind_ser=I1.next();
     		
     		if (!CA_W.equals(childwind_ser))
     		{
     			driver.switchTo().window(childwind_ser);
     		}
     	}
     	Thread.sleep(5000);
     	driver.switchTo().window(childwind_ser);
     	driver.close();
     	
     	     	
     }
     
     public void CloseCA()
     {
    	 driver.switchTo().window(CA_W).close();
    	  	// driver.switchTo().defaultContent();
    	 
     }
     
    }
