package automation;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	
	//@Test -1st way
	public void a() {
		System.out.println("hello a test method");
	}
    //widely used in market
	@Test(enabled = false)
	public void b() {
		System.out.println("hello b method");
	}
	
	@Test(enabled = true)
	public void c() {
		System.out.println("hello c method");
    }
	
	//invocationcount - 2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("hello d method");
	}
	//invocationcount - o times -3rd way
		@Test(invocationCount = 0)
		public void e() {
			System.out.println("hello e method");
			
		}
	  
		//create way - not recommended
		@Test
		public void f() {
			System.out.println("hello f method");
			throw new SkipException("Skipping f test method");
		}
	
}
