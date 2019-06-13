package org.sample;
import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class Screenshot {
	private static final String FilUtils = null;

	public static void main(String[] args) throws IOException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgbvv\\eclipse-workspace\\org.sample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot t = (TakesScreenshot)driver;
	File s= t.getScreenshotAs(OutputType.FILE);
	System.out.println(s);
	File d = new File("C:\\pic");
	Files.copy(s, d);
	driver.quit();
	

}
}
