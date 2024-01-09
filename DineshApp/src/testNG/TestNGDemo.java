package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void testMethod1()
	{
		System.out.println("TestMethod1..");
	}
	@Test
	public void testMethod2()
	{
		System.out.println("TestMethod2..");

	}
	@BeforeMethod
	public void beforeMehod()
	{
		System.out.println("BeforeMethod...");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod...");
	}
	@BeforeClass
	public void beforeClass()
	{
	System.out.println("BeforeClass...");
    }
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass...");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest...");
	}
@AfterTest
public void afterTest()
{
	System.out.println("AterTest...");
}

@BeforeSuite
public void beforeSuite()
{
	System.out.println("BeforeSuite...");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("AfterSuite...");
}
}



















	
	
	
	
	
	
	
	
	
	
	
