package Locators;

import org.openqa.selenium.By;

public class LandingPage_Locator {
	
	public static By ListButtonElement = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	
	public static By LogoDisplayButtonElement = By.xpath("//img[@class='logo img-responsive']");
	
	public static By LogoHeight_WidthButtonElement = By.xpath("//img[@class='logo img-responsive']");
	
	public static By SigninButtonElement = By.xpath("//div/a[contains(text(),'Sign in')]");
	
	public static By LoginButtonElement = By.xpath("//input[@id='email']");
	
	public static By LoginButtonElementpass = By.xpath("//input[@id='passwd']");
	
	public static By Sign_Up_Button = By.id("SubmitLogin");
	
	public static By T_shirtButtonElement = By.xpath("//div[@id='block_top_menu']/ul/li/a[contains(text(),'T-shirts')]");
	
	public static By Hover_ButtonElement = By.xpath("//div[@class='product-container']");
		
	public static By MoreButtonElement = By.xpath("//a[@class='button lnk_view btn btn-default']//span[contains(text(),'More')]");
	
	public static By SendButtonElement = By.xpath("//a[@id='send_friend_button']");
	
	public static By NameButtonElement = By.xpath("//input[@id='friend_name']");
	
	public static By EmailButtonElement = By.xpath("//input[@id='friend_email']");
	
	public static By SendButtonElem = By.xpath("//button[@id='sendEmail']");
	
	public static By MsgButtonElement = By.xpath("//div[@class='fancybox-inner']//p[contains(text(),'Your e-mail has been sent successfully')]");
	
	public static By OkButtonElement = By.xpath("//input[@class='button']");
	
	
	
	
	
	

}
	