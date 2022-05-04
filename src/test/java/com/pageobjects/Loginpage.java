package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

WebDriver idriver;
	
	public Loginpage(WebDriver rdriver)
	{
	idriver = rdriver;
	PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")   
	WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement login;
	
	public void Setusername(String name)
	{
	username.sendKeys("rajesh.janapala@gmail.com");
	}
	
	
	public void Setuserpass(String pass)
	{
	password.sendKeys("RJSHj@12345");
	}
	public void clickmethod()
	{
	login.click();
	}
	
	
}
