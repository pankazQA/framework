 package com.practic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//amazon website example //
public class DropDown {

public static void main(String[] args) {	
WebDriver driver;
System.setProperty("webdriver.chrome.driver","./Browser/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.amazon.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

Select all=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
all.selectByVisibleText("Amazon Fresh");
WebElement fresh=all.getFirstSelectedOption();
System.out.println(fresh);

List<WebElement>list=all.getOptions();
System.out.println(list.size());
//hello

for(int i=0;i<list.size();i++) {
System.out.println(list.get(i).getText());

}	

}
}