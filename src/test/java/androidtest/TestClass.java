package androidtest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainInterfacePage;
public class TestClass {
	
	
	AppiumDriver driver;
	MainInterfacePage mainPage;
	
	@BeforeClass
	public void startUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		mainPage = new MainInterfacePage(driver);

	}
	
	@Test(priority=1)
	public void TestAllDigitButtons() {
		
		mainPage.allButton();
		
		String actualResult = mainPage.DisplayBox();
		String expectedResult = "1234567890";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test(priority=2)
	public void TestAddition() {
		mainPage.Five();
		mainPage.Plus();
		mainPage.Six();
		String actualResult = mainPage.ResultBox();
		String expectedResult = "11";
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test(priority=3)
	public void TestSubtraction() {
		mainPage.Nine();
		mainPage.Minus();
		mainPage.Five();
		String actualResult = mainPage.ResultBox();
		String expectedResult = "4";
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test(priority=4)
	public void TestMultiplication() {
		mainPage.Eight();
		mainPage.MultiplyBy();
		mainPage.Five();
		String actualResult = mainPage.ResultBox();
		String expectedResult = "40";
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test(priority=5)
	public void Division() {
		mainPage.Eight();
		mainPage.DividedBy();
		mainPage.Five();
		
		String actualResult = mainPage.ResultBox();
		String expectedResult = "1.6";
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	
	@Test(priority=6)
	public void delete()
	{
		mainPage.Five();
		mainPage.Five();
		String actualResult = mainPage.DisplayBox();
		String expectedResult = "55";
		Assert.assertEquals(actualResult, expectedResult,"Before Delete");
		mainPage.Delete();
		String actualResult2 = mainPage.DisplayBox();
		String expectedResult2 = "5";
		Assert.assertEquals(actualResult2, expectedResult2,"After delete");
	}
	
	@AfterMethod
	public void ClearData() {
		mainPage.EqualTo();
		mainPage.CLR();
	}
	
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
