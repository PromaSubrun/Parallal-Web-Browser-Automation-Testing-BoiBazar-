package BoiBazar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		// Initializing the firefox driver
		driver = new FirefoxDriver();

	}

	@Test
	public void ChromeTest() {
		// Initialize the chrome driver
		driver = new ChromeDriver();
	


	}
}
