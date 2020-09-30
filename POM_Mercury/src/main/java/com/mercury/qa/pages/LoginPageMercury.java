package com.mercury.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.Base.TestMercury_Base;

public class LoginPageMercury extends TestMercury_Base{

@FindBy(name="userName")
WebElement username;

@FindBy(name="password")
WebElement password;
	
@FindBy(name="submit")
WebElement Submit;
	
@FindBy(xpath="//img[@alt='Mercury Tours']")
WebElement mercuryLogo;

public LoginPageMercury() throws IOException {
	PageFactory.initElements(driver, this);
}
	
public String validateLoginPageTitle()
{
	return driver.getTitle();
}
public boolean validateMercuryLogo()
{
	return mercuryLogo.isDisplayed();
}
public void validateLogin(String un,String pwd)
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	Submit.click();
	
}

}
