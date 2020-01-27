package com.test.com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testngdemo {
	
	@BeforeTest
public void first()
{
	System.out.println("first test");
}
	
	@Test(groups="sanity test")
 public void setup()

{
	System.out.println("1st tc");
	
		/*
		 * SoftAssert sa= new SoftAssert(); sa.assertEquals(true, false);
		 * sa.assertTrue(false); sa.assertFalse(false); sa.assertAll();
		 */

}
 @Test(groups="sanity test")
 public void setup1()
 {
	  System.out.println("2nd tc");
 }
 
	/*
	 * @Test(groups="sanity test")
	 * 
	 * @Parameters({"URL","API key"}) public void setup3(String urlname,String key)
	 * { System.out.println(urlname); System.out.println(key);
	 * 
	 * }
	 */
 
 @AfterTest
 public void second()
 {
	 System.out.println("second test");
 }
 
 
 

}
