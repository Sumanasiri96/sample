package Xpathbutton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class buttonXpathObjects extends selenium.DriverInitialitation{
	
	@FindBy(id = "home")
	public static WebElement B1;
	
	@FindBy(xpath = "//*[@id=\"home\"]")
	public static WebElement B2;
	
	@FindBy(id = "position")
	public static WebElement B3;
	
	@FindBy(xpath ="/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[2]/div/button")
	public static WebElement B5;
	
	public static WebElement B4;
	
	
	
	
}