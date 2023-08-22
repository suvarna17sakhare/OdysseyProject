package com.springernature.qa.sanity;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.springernature.qa.pages.CAtool;
import com.springernature.qa.pages.CTPage;
import com.springernature.qa.pages.HomePage;


public class HomeTest {
	HomePage HP=new HomePage();
	public static CAtool ca;
	public static CTPage  CT;

	@BeforeTest
	void testbrowser()
	{
				
		HP.lunchBrowser();
	}
	
	
	@Test(priority = 1)
	void checkhomepage()
	{
      	//HP.checkheading();
      	//Assert.assertTrue(HP.checkheading());
		Assert.assertEquals(HP.checkheading(), true);
	   System.out.println("Assertion is passed for Home");
	}

	@Test(priority = 2)
	void loadCA()
	{
		ca=HP.clickonCA();
		
	}
	
	
	/*@AfterTest
	void closedriver()
	{
		HP.closebrowser();
	}*/

}
