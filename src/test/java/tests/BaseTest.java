package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
//hello mangesh ready code for testing
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void init() {
		
		WebDriverManager.chromedriver().setup();
		
		//step-1 launch browser
		 driver=new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//step-3 open webpage
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//step-4 wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}

}
