package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args)throws NoAlertPresentException,InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgbvv\\eclipse-workspace\\org.sample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
	driver.manage().window().maximize();
	
	WebElement a = driver.findElement(By.name("proceed"));
	a.click();
	Alert al = driver.switchTo().alert();
	
	String text = al.getText();
	System.out.println(text);
	al.accept();
	
	}
}
