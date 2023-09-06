package CombineOrderParallelBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CombineOrderParallelBrowserTesting {
	public WebDriver driver;

	@Test(priority = 1)
	public void ChromeTest() throws InterruptedException {
		// Initialize the chrome driver
		driver = new ChromeDriver();
		driver.get("https://www.boibazar.com/");
		Thread.sleep(3000);
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		// Click on a book for add to cart
		driver.findElement(By.xpath("//div[@id='module']//div[9]//div[1]//div[7]//div[1]//div[2]//a[1]")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/homeAssets/cartIcon.png']"))
				.click();
		Thread.sleep(9000);

		// Click on next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		Thread.sleep(9000);

		// Click on next button again to complete order
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/cartIconWeb.png']")).click();
		Thread.sleep(9000);

		// Click on delete button to delete thi item
		driver.findElement(By.xpath("//div[@class='col-md-1 cart_delete desk_cart_product']//a//img")).click();
		Thread.sleep(9000);

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}

	@Test(priority = 2)
	public void OperaTest() throws InterruptedException {
		// Initialize the Opera driver
		driver = new OperaDriver();
		driver.get("https://app.boutiquetree.com/login");
		Thread.sleep(3000);
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		// Click on a book for add to cart
		driver.findElement(By.xpath("//div[@id='module']//div[9]//div[1]//div[7]//div[1]//div[2]//a[1]")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/homeAssets/cartIcon.png']"))
				.click();
		Thread.sleep(9000);

		// Click on next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		Thread.sleep(9000);

		// Click on next button again to complete order
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/cartIconWeb.png']")).click();
		Thread.sleep(9000);

		// Click on delete button to delete thi item
		driver.findElement(By.xpath("//div[@class='col-md-1 cart_delete desk_cart_product']//a//img")).click();
		Thread.sleep(9000);

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}

	@Test(priority = 3)
	public void SafariTest() throws InterruptedException {
		// Initialize the Safari driver
		driver = new SafariDriver();
		driver.get("https://app.boutiquetree.com/login");
		Thread.sleep(3000);
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		// Click on a book for add to cart
		driver.findElement(By.xpath("//div[@id='module']//div[9]//div[1]//div[7]//div[1]//div[2]//a[1]")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/homeAssets/cartIcon.png']"))
				.click();
		Thread.sleep(9000);

		// Click on next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		Thread.sleep(9000);

		// Click on next button again to complete order
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/cartIconWeb.png']")).click();
		Thread.sleep(9000);

		// Click on delete button to delete thi item
		driver.findElement(By.xpath("//div[@class='col-md-1 cart_delete desk_cart_product']//a//img")).click();
		Thread.sleep(9000);

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}

	@Test(priority = 4)
	public void InternetExplorerTest() throws InterruptedException {

		// driver = new FirefoxDriver();

		// Initialize the Internet Explorer driver
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://app.boutiquetree.com/login");
		Thread.sleep(3000);
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		// Click on a book for add to cart
		driver.findElement(By.xpath("//div[@id='module']//div[9]//div[1]//div[7]//div[1]//div[2]//a[1]")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/homeAssets/cartIcon.png']"))
				.click();
		Thread.sleep(9000);

		// Click on next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		Thread.sleep(9000);

		// Click on next button again to complete order
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/cartIconWeb.png']")).click();
		Thread.sleep(9000);

		// Click on delete button to delete thi item
		driver.findElement(By.xpath("//div[@class='col-md-1 cart_delete desk_cart_product']//a//img")).click();
		Thread.sleep(9000);

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}

	@Test(priority = 5)
	public void MicrosoftEdgeTest() throws InterruptedException {
		// Initialize the Microsoft Edge driver
		driver = new EdgeDriver();
		driver.get("https://app.boutiquetree.com/login");
		Thread.sleep(3000);
		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(6000);

		// Click on a book for add to cart
		driver.findElement(By.xpath("//div[@id='module']//div[9]//div[1]//div[7]//div[1]//div[2]//a[1]")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/homeAssets/cartIcon.png']"))
				.click();
		Thread.sleep(9000);

		// Click on next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		Thread.sleep(9000);

		// Click on next button again to complete order
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(9000);

		// Click on cart
		driver.findElement(By.xpath("//img[@src='https://www.boibazar.com/asset/images/cartIconWeb.png']")).click();
		Thread.sleep(9000);

		// Click on delete button to delete thi item
		driver.findElement(By.xpath("//div[@class='col-md-1 cart_delete desk_cart_product']//a//img")).click();
		Thread.sleep(9000);

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}

}