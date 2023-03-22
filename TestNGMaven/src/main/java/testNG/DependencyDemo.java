package testNG;

import org.testng.annotations.Test;

public class DependencyDemo {
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods="highSchool")
	public void highSecondary() {
		System.out.println("Higher Secondary School");
	}
	@Test(dependsOnMethods="highSecondary")
	public void artsAndScience() {
		System.out.println("college");
	}
	@Test(dependsOnMethods="artsAndScience")
	public void job() {
		System.out.println("Going to job");
	}
}
