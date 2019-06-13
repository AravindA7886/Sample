package org.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgbvv\\eclipse-workspace\\org.sample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.sprint.com/");
	driver.manage().window().maximize();
	
	WebElement shop = driver.findElement(By.xpath("//span[text()='My Sprint']"));
	 
	  Actions a= new Actions(driver);
	  a.moveToElement(shop).perform();
	  
	  WebElement btn = driver.findElement(By.xpath("//a[@class='js-nav-link'][39]")); 	  		
	  btn.click();
	  
	}

}
