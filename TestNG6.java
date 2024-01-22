package automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	@Test
	public void a() {
		System.out.println("hello a test method");
	}

	@Test(invocationCount = 2, priority = -1, enabled = false & true)
	public void b() {
		System.out.println("hello b method");
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("hello c method");
    }
	
	@BeforeMethod
	public void d() {
		System.out.println("hello d method");
}
}