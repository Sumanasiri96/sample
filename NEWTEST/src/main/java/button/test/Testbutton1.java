package button.test;

import java.awt.Point;

import org.openqa.selenium.support.PageFactory;

import Xpathbutton.buttonXpathObjects;


public class Testbutton1 extends buttonXpathObjects 
{
	public static void main(String[] args) {

			buttonXpathObjects	 but = new buttonXpathObjects();
			but.DriverInit();

//			PageFactory.initElements(driver, but);
//			B2.click();
			
			PageFactory.initElements(driver, but);
			org.openqa.selenium.Point xValue = B5.getLocation();
			
			org.openqa.selenium.Point yValue = B5.getLocation();
			System.out.println("x : "+xValue.getX()+ " y : "+yValue.getY());
	}
	

}
