package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {//public is access modifire
	
public WebDriver driver;//driver is instance(refarance variable )variable//webdriver is a selenium interface
public WebDriver getdriver() {
System.setProperty("webdriver.chrome.driver","./Browser/chromedriver");
driver=new ChromeDriver();// new is a keyword of create object// chromedriver is selenium class
driver.get("https://www.amazon.com");//get is a methods//we can aslo use driver.navigate
//driver.navigate().refresh(); for refresh
//driver.navigate().forward(); for forword
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//to overcome sycronaization issue
return driver;



}
}
