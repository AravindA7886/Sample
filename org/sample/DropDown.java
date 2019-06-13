package org.sample;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args)throws NoAlertPresentException,InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgbvv\\eclipse-workspace\\org.sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	//	WebElement day = driver.findElement(By.id("day"));
	//	Select s= new Select(day);
		//s.selectByIndex(18);
		
		WebElement month = driver.findElement(By.id("month"));

		Select s1= new Select(month);
		java.util.List<WebElement> emp= s1.getOptions();
		//for(int i=0;i<emp.size();i++) {
		//	WebElement w= emp.get(i);
		//	String value = w.getText();
		//	System.out.println(value);
			
			boolean b = s1.isMultiple();
			System.out.println(b);
			driver.quit();
		}
		//s1.selectByVisibleText("Sept");
		
		
		
}
