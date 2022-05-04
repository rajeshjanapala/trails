package com.page.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.pageobjects.Fpage1;
import com.pageobjects.Freindsdata;
import com.pageobjects.Loginpage;

public class Testcaese001fbcom extends Baseclasforfb {

	@Test

	public void logintest() throws InterruptedException {
		driver.get(baseurl);

		Loginpage ln = new Loginpage(driver);
		ln.Setusername(username);
		ln.Setuserpass(password);
		ln.clickmethod();
		
		Fpage1 fn = new Fpage1(driver);
		fn.myprofilepage();
		fn.myfriends();
		fn.myhomepage();

		Freindsdata fds= new Freindsdata(driver);
		fds.allfriendsinprofile();
		fds.myhomepage1();
	}

	
	@Test
	public void display()
	{
		System.out.println("hi rajesh");
	}
	@Test
	public void champiotaa()
	{
		System.out.println("hi rja");
	}
	
	
	
	
	
	
	
	
	
	
}
