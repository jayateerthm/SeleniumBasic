package com.mercury.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mercury.qa.util.TestUtil;

public class TestMercury_Base {
public static WebDriver driver;
public static Properties props;

public TestMercury_Base() throws IOException {
	props=new Properties();
	FileInputStream fi=new FileInputStream("E:\\Workspaces\\Java-Workspace\\POM_Mercury\\src\\main\\java\\com\\mercury\\qa\\config\\config.property");
	props.load(fi);

}

public static void initialization()
{
	String browsername=props.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayateerth\\Desktop\\ChromeDriver_Sep\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("FF"))
	{
		
	}
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait_time, TimeUnit.SECONDS);
	
}
}
