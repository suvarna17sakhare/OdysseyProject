package com.springernature.qa.sanity;

import org.testng.annotations.Test;

import com.springernature.qa.pages.CAtool;
import com.springernature.qa.pages.CTPage;
import com.springernature.qa.pages.HomePage;

public class CTtest 
{
	
	
	HomePage H=new HomePage();
	static CTPage CTP;
	@Test
	void checkCT()
	{
		CTP=H.clickonCT();
		CTP=HomeTest.CT;
		
		
	}
	
}
