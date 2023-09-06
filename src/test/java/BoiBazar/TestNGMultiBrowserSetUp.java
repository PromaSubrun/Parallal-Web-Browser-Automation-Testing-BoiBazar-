package BoiBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class TestNGMultiBrowserSetUp {
    
    WebDriver driver = null;
    // String projectPath =
    // System.getProperty("C:\Users\CSL-0\eclipse-workspace\ParallelTesting");
    String projectPath = System.getProperty("./ParallelTesting");
    
    @Parameters("browserName")
    @BeforeTest

    public void setup(String browserName) {
        System.out.println("Browser name is: " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver", ".//IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("Opera")) {
            System.setProperty("webdriver.Opera.driver", ".//operadriver.exe");
            WebDriver driver = new OperaDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", ".//msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        }

    }

    @AfterTest
    public void teardown() {
        driver.close();
        System.out.println("Test Completed Successfully");
    }
}