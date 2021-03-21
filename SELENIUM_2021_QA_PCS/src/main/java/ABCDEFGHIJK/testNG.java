package ABCDEFGHIJK;

import org.testng.annotations.Test;

public class testNG {

@Test(priority = 1)
	public void setup() {

		System.out.println("Opening Browser");
	}
	@Test(priority = 3)
	public void login() {
		System.out.println("This is Login test");
	}
	@Test(priority = 2)
	public void tearDown() {
		System.out.println("Closeing the Browser");
	}

}
