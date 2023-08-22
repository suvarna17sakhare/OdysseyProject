package com.springernature.qa.sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.springernature.qa.pages.CAtool;
import com.springernature.qa.pages.CTPage;
import com.springernature.qa.pages.HomePage;

public class CAtest {
	
    
	static CAtool cat=null;

	
	@Test
	void checkCA()
	{
		cat=HomeTest.ca;
      Assert.assertEquals(cat.checkCAPage(), true);
	   System.out.println("Assertion is passed for CA");
	  	//Assert.assertEquals(cat.checkdesktop(),true);
		 //System.out.println("Assertion is passed for desktop");
	}
	

	@Test(priority = 1)
	void shelf() throws InterruptedException
	{
		 //String msg;
		Thread.sleep(5000);
		cat.clickonshelf();
		Thread.sleep(5000);
		Assert.assertEquals(cat.warningcheck(), true);
		System.out.println("Assertion is passed for Shelf");
        //
	}
	
	@Test(priority = 2)
	void incoming() throws InterruptedException
	{
		Thread.sleep(5000);
		cat.clickonincoming();
		Thread.sleep(5000);
		Assert.assertEquals(cat.checkincomimg(), true);
		System.out.println("Assertion is passed for incoming");
		
	}
	
	@Test(priority = 3)
	void query() throws InterruptedException
	{
		Thread.sleep(5000);
		cat.clickonquery();
		Thread.sleep(5000);
		Assert.assertEquals(cat.checkquery(), true);
		System.out.println("Assertion is passed for query");
		
	}
	@Test(priority = 4)
	void QC() throws InterruptedException
	{
		Thread.sleep(5000);
		cat.clickonQC();
		Thread.sleep(5000);
		Assert.assertEquals(cat.checkQC(), true);
		System.out.println("Assertion is passed for QC");
		
	}
	
	@Test(priority = 5)
	void ItemSearch() throws InterruptedException
	{
		cat.searchitem();
	}
	
	@Test(priority = 6)
	void CAclose()
	{
		cat.CloseCA();
       		
	}
	
	

}
