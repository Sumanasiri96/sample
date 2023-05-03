package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInitialitation {
	protected static WebDriver driver; 
public void DriverInit(){
	driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/buttons");
	
}
}