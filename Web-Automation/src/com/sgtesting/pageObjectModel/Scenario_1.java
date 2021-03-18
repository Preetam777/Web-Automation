package com.sgtesting.pageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		deleteUser1();
		logout();
		closeApplication();
	}

	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser1()
	{
		try
		{
			oPage. getCreateUser().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFN().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getLN().sendKeys("AAAA");
			Thread.sleep(2000);
			oPage.getUN().sendKeys("user11");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("User1@gmail.com");
			Thread.sleep(2000);
			oPage.getPSWD().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getRe_PSWD().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getUsercommitButton().click();
			Thread.sleep(2000);			
		}catch( Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser1()
	{
		try
		{
			oPage.getdeleteTakBar().click();
			Thread.sleep(2000);
			oPage.getDeleteUser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			oAlert.accept();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


