package com.test.com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo2 {
	
	@BeforeTest
	
	public void homeloan()
	{
		System.out.println("this is homeloan");
	}
	
@Test(groups="smoke test")
public void personalloan()
{
	System.out.println("this is personal loan");
}
	
@Test(groups="sanity test")
public void mobileloan()
{
	System.out.println("this is mobileloan");
}

@AfterTest

public void vehicleloan()
{
	System.out.println("this is vehicle loan");
}
}
	

