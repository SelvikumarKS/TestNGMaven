package testNG;

import org.testng.annotations.Test;

public class SkipDemo {

	@Test(priority = 0)
	public void firsttestcase() {
		System.out.println("FIrest test case");
	}

	@Test(priority = 1)
	public void secondtestcase() {
		System.out.println("FIrest test case");
	}

	@Test(priority = 2)
	public void thirdtestcase() {
		System.out.println("FIrest test case");
	}

	@Test(priority = 3, enabled = false)
	public void forthtestcase() {
		System.out.println("FIrest test case");
	}

}
