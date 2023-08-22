package com.springernature.qa.pages;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.Iterator;
import java.util.Set;

import org.apache.hc.client5.http.entity.mime.AbstractContentBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {

    WebDriver driver;
    public String ody;
public void lunchBrowser()
{
		// TODO Auto-generated method stub
	
	 System.setProperty("webdriver.ie.driver", "D:\\Selenium Practice\\Odyssey Project\\IEDriverServer.exe");
     System.setProperty("webdriver.edge.driver", "D:\\Selenium Practice\\Odyssey Project\\msedgedriver.exe");
     InternetExplorerOptions ieOptions = new InternetExplorerOptions();
     ieOptions.attachToEdgeChrome();
     //ieOptions.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");


  // Start Edge Session
 
     driver = new InternetExplorerDriver(ieOptions);

     driver.get("http://sntpseditorialtest.springernature.com/adis2000www/");
     driver.manage().window().maximize();
     driver.switchTo().frame("navbar");
     ody =driver.getWindowHandle();
     
}

    public CAtool clickonCA()
     {
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Content Acquisition 2')]")).click();
    	Set<String> wind=driver.getWindowHandles();
    	Iterator<String> I1=wind.iterator();
    	
    	while(I1.hasNext())
    	{
    		String child_wind=I1.next();
    		
    		if (!ody.equals(child_wind))
    		{
    			driver.switchTo().window(child_wind);
    		}
    	}
    	
    	       	
    	return new CAtool(driver);
     }
    
    
   public boolean checkheading()
    {
    	//driver.switchTo().frame("navbar");
        boolean Status = driver.findElement(By.xpath("//div[contains(text(),'QA/TEST')]")).isDisplayed();
         return Status;
    
    }
   
   
     
   public void closebrowser()
   {
	  	   driver.switchTo().window(ody).close();
   }
   
	 public CTPage clickonCT()
	   {
		  driver.switchTo().window(ody);
		   driver.switchTo().frame("navbar");
		   driver.findElement(By.xpath("//a[@href='/AdisCTWeb/']")).click();
		   return new CTPage(driver);
		   
	   }
  

}
