package com.page.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseclasforfb {


public String baseurl ="https://www.facebook.com/";
public String username= "rajesh.janapala@gmail.com";
public String password= "RJSHj@12345";
public static WebDriver driver;

@Parameters("browsername")
@BeforeClass

public void browser(String browsername)
{
//System.setProperty("webdriver.chrome.driver", "/Users/rajeshjanapala/Downloads/sel learn/jstpratice/drivers/chromedriver");
//driver = new ChromeDriver();
switch (browsername) {
case "chrome":
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	break;
case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	break;
case "edge":
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

default:  
	System.out.println("br is ivalid");
	break;
}



}








	
@AfterClass

public void teardown() throws InterruptedException {
	Thread.sleep(10000);
	driver.quit();
	
}
		
}	
	

	

