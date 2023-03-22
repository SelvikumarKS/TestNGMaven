package testNG;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=0)
	public void firsttestcase() {
		System.out.println("FIrest test case");
	}
@Test(priority=1)
	public void secondtestcase() {
		System.out.println("FIrest test case");
	}
@Test(priority=3)
	public void thirdtestcase() {
		System.out.println("FIrest test case");
	}
@Test(priority=2)
	public void forthtestcase() {
		System.out.println("FIrest test case");
	}


}
