package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverManager;

public class CommonActions extends DriverManager{
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public void driverLaunch() {
		getDriver();
	}
	
	public void launchApp() {
		driver.get("https://www.facebook.com/");
	}
	
	public void enterText(String locator, String text) {
		if (locator.startsWith("#")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator.replace("#", "")))).sendKeys(text);
		}
		else if (locator.startsWith("//")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).sendKeys(text);
		}
		else {
			System.out.println("the locator does not match with either id nor xpath");
		}
	}
	public void click(String locator ) {	
		if (locator.startsWith("#")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator.replace("#", "")))).click();
		}
		else if (locator.startsWith("//")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).click();
		}
		else {
			System.out.println("the locator does not match with either id nor xpath");
		}
	}
	public void getText(String locator) {
		if (locator.startsWith("#")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator.replace("#", "")))).click();
		}
		else if (locator.startsWith("//")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).click();
		}
		else {
			System.out.println("the locator does not match with either id nor xpath");
		}
	}
	
	
	

}
