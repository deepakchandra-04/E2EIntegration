package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_005 {
	
	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uat.enalytix.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sup090123@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("India@123");
		
	}

}
