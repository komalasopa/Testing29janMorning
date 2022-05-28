package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Maven1 {

	@BeforeClass 
	public void beforeClass() {
		System.out.println("before class TestClass 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod TestClass 2");
	}
	
	@Test (timeOut = 3000)
	public void testB() throws InterruptedException {
	System.out.println("test B TestClass 2");
	Thread.sleep(5000);
	System.out.println("hi");
	}
	
	@Test 
	public void testA() {
		System.out.println("test A TestClass 2");
		
	}
	
	@Test 
	public void testC() {
		System.out.println("test C TestClass 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod TestClass 2 ");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass TestClass 2");
	}


		

	}


