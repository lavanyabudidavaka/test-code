package com.abc.magento;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {
public static void main(String[] args) throws Exception {
	
	FileInputStream fis=new FileInputStream("src\\com\\abc\\utilities\\datadriven.properties");
	
	
	Properties p=new Properties();
	p.load(fis);
	
	String url=p.getProperty("url");
	System.out.println(url);
	
	String un=p.getProperty("un");
	System.out.println(un);
	
	String pw=p.getProperty("pw");
	System.out.println(pw);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
	driver.findElement(By.linkText("My Account")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("email")).sendKeys(un);
	Thread.sleep(3000);
	
	driver.findElement(By.id("pass")).sendKeys(pw);
	Thread.sleep(3000);
	
	driver.findElement(By.id("send2")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Log Out")).click();
	Thread.sleep(5000);
	
	driver.quit();
	
	
}
}