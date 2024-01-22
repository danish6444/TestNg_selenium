package automation;

import org.testng.annotations.*;

import junit.framework.Assert;

public class TestNG7 {
	
	@Test
	public void z() {
		Assert.assertTrue(3 > 12);
		System.out.println("z test method");
	}
    @Test(dependsOnMethods = "z")
	public void b() {
		System.out.println("b test method");
	}
}
