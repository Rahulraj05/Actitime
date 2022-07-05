package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.cchrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("open browser",true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("close browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin", "manager");
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setLogout();
				
	}

}
