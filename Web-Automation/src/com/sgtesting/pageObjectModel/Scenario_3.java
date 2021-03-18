package com.sgtesting.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_3 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		creatCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}

	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe" );
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}
		catch (Exception e) {
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
	public static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void creatCustomer()
	{
		try
		{
			oPage.getTask().click();
			Thread.sleep(2000);
			oPage.getaddNewButton().click();
			Thread.sleep(2000);
			oPage.getcreateNewCustomer().click();
			Thread.sleep(2000);
			oPage.getEnterCustomerName().sendKeys("PREETAM");
			Thread.sleep(2000);
			oPage.getCustomerDescription().sendKeys("Project tasks are ");
			Thread.sleep(2000);
			oPage.getCustomerCommitBtn().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oPage.geteditButton1().click();
			Thread.sleep(2000);
			oPage.getactionButton1().click();
			Thread.sleep(2000);
			oPage.getDeleteCheckBox1().click();;
			Thread.sleep(2000);
			oPage.getDeletePermanently1().click();
			Thread.sleep(2000);

		}catch (Exception e)
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
}


