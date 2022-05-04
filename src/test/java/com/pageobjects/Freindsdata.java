package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Freindsdata {

	WebDriver idriver;
	
 public Freindsdata(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Friends']")
	WebElement allfriends;
	
	@FindBy(xpath="//span[text()='Friend requests' and @class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql oi732d6d ik7dh3pa ht8s03o8 a5q79mjw g1cxx5fr ekzkrbhg oo9gr5id']")
	WebElement friendrequest;
	@FindBy(xpath="//a[@aria-label='Home']")
	WebElement homepage;
		
	
	public void allfriendsinprofile()
	{
		allfriends.click();
	}
	public void friendrqst()
	{
		friendrequest.click();
	}

	public void myhomepage1() {
		homepage.click();
	}
}
