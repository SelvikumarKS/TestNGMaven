
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BeforeSuiteEx {

	@Test
	public void openGoogle() throws InterruptedException {

		//long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\TestNGMaven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		//long endTime = System.currentTimeMillis();
		//long totalTime = endTime - startTime;
		//System.out.println("Total time taken" + totalTime);
	}

	/*@Test
	public void openGmail() {

		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.close();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken" + totalTime);
	}

	@Test
	public void openYahoo() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.close();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken" + totalTime);
	}*/

}
