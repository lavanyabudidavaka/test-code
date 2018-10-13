package com.abc.magento;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {
	public static void main(String[] args) throws Exception {
		String url="http://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		FileInputStream fis = new FileInputStream("src\\com\\abc\\utilities\\Keyword.Properties");
		Properties p=new Properties();
		p.load(fis);
		
		String myacc=p.getProperty("Myacc");
		String email=p.getProperty("email");
		String pwd=p.getProperty("pwd");
		String login=p.getProperty("login");
		String logout=p.getProperty("logout");
		System.out.println(myacc);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(login);
		System.out.println(logout);
		driver.findElement(By.xpath(myacc)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(email)).sendKeys("subramanyaraj87@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pwd)).sendKeys("Welcome123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(login)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(logout)).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
