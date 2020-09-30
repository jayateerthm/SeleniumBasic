package com.mercury.qa.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.Base.TestMercury_Base;
import com.mercury.qa.pages.LoginPageMercury;

public class LoginPageMercuryTest extends TestMercury_Base {
LoginPageMercury login;

public LoginPageMercuryTest() throws IOException {
		super();
		}
@BeforeMethod
public void setUp() throws IOException
{
	initialization();
	login=new LoginPageMercury();
}
@Test(priority=1)
public void validateLoginPageTitleTest()
{
	String title=login.validateLoginPageTitle();
	Assert.assertEquals("Welcome: Mercury Tours", title);
}
@Test(priority=2)
public void validateMercuryLogotest()
{
	boolean flag=login.validateMercuryLogo();
	Assert.assertTrue(flag);
}
@Test(priority=3)
public void validateLoginTest()
{
	login.validateLogin(props.getProperty("Username"), props.getProperty("Password"));
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
