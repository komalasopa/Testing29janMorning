package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Maven {
	
	@BeforeClass 
	public void beforeClass() {
		System.out.println("before class TestClass 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod TestClass 1");
	}
	
	@Test (timeOut = 3000)
	public void testB() throws InterruptedException {
	System.out.println("test B TestClass 1");
	Thread.sleep(5000);
	System.out.println("hi");
	}
	
	@Test 
	public void testA() {
		System.out.println("test A TestClass 1");
		
	}
	
	@Test 
	public void testC() {
		System.out.println("test C TestClass 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod TestClass 1 ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass TestClass 1");
	}
}
