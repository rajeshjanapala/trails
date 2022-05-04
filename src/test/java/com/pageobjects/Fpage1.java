/**
 * 
 */
package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author rajeshjanapala
 *
 */
public class Fpage1 {

	WebDriver idriver;
	
	public Fpage1(WebDriver rdriver)
	{
	
	idriver = rdriver();
	
	PageFactory.initElements(rdriver, this);
	
}

	private WebDriver rdriver() {
		// TODO Auto-generated method stub
		return null;
	}

	
@FindBy(xpath="//span[text()='Rajesh Janapala']")
WebElement profilepage;
@FindBy (xpath="//span[text()='Edit Bio']")
WebElement freindsdata;
	
@FindBy(xpath="//a[@aria-label='Home']")
WebElement homepage;
	
	public  void myprofilepage()
	{
		profilepage.click();
	}
	public void myfriends()
	{
		freindsdata.click();
	}
public void myhomepage() {
	homepage.click();
}
	}

	
	
	
	
