package Utilities;


import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {
	
	private static final String AttributeName = null;
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Properties prop;
	Utils utils;
	

	public ElementActions(WebDriver driver)
	{
		this.driver = driver;
		utils = new Utils();
		prop = utils.init_prop();
		
		action = new Actions(this.driver);
		wait = new WebDriverWait(this.driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		
	}
	
	public String doGetcurrentURL() {
		String text = null;
		text = driver.getCurrentUrl();
		return text;
	}
	
	public String doGetPageTitle() 
	{ 
		return driver.getTitle();
	}
	
	public List<WebElement> getElementsList(By locator) 
	{
		List<WebElement> element = null;
		element = driver.findElements(locator);
		return element;
	}
	
	public boolean doIsDisplayed(By locator) 
	{
		boolean flag = false;
		flag = getElement(locator).isDisplayed();
		return flag;
	}
	
	public String getAttributeValue(By locator, WebDriver driver)
	{
		WebElement attributeValue = driver.findElement(locator);
		return attributeValue.getAttribute(AttributeName);
	}
	
	public void selectByValueFromDropDown(By locator, String Value)
	{
		Select selectElement = new Select(getElement(locator));
		selectElement.selectByValue(Value);
	}
	
	public void waitForElementVisible(By locator) 
	{
		WebElement ele = getElement(locator);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	
	public WebElement getElement(By locator) 
	{
		
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public void doClick(By locator) throws InterruptedException 
	{
		getElement(locator).click();
		
		
	}

//	public boolean doIsenable(By locator) {
//		boolean flag = false;
//		flag = getElement(locator).isEnabled();
//		return flag;
//	}

	public void waitForElementClickable(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public List<String> getWindowList(WebDriver driver)
	{
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		return windowHandlesList;
	}

	public void switchToWindowId(WebDriver driver, int windowNumber)
	{
		List<String> windowList = getWindowList(driver);
		driver.switchTo().window(windowList.get(windowNumber));
	}
	
	public void selectByVisibleTextFromDropDown(By locator, String Value)
	{
		Select selectElement = new Select(getElement(locator));
		selectElement.selectByVisibleText(Value);
	}
	
	public void doSendKeys(By locator, String value) 
	{
		getElement(locator).sendKeys(value);
		
	}
	
	public void doMoveToElement(By locator)
	{
		action.moveToElement(getElement(locator)).build().perform();
	}
	
	public String doGetText(By locator) {
		String text = null;
		text = getElement(locator).getText();
		return text;
	}
	
	public String getAttributeValue(By locator, String AttributeName)
	{
		WebElement attributeValue = driver.findElement(locator);
		return attributeValue.getAttribute(AttributeName);
	}
	
	public String getAttributeValue(By locator, String AttributeName, WebDriver driver)
	{
		WebElement attributeValue = driver.findElement(locator);
		return attributeValue.getAttribute(AttributeName);
	}
	
	
	
	
}
