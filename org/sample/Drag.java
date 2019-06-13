package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Drag 
 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgbvv\\eclipse-workspace\\org.sample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement source = driver.findElement(By.id("credit2"));
	WebElement t = driver.findElement(By.id("bank"));
	 
	  Actions a= new Actions(driver);
	 a.dragAndDrop(source,t).perform();
	  

}
 }
