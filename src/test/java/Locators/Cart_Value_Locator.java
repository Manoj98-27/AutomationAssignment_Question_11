package Locators;

import org.openqa.selenium.By;

public class Cart_Value_Locator {

	//CaseNo.17
	//Faded Short Sleeve T-shirt 
    
	public static By HoverButtonElement = By.xpath("//div[@class='product-container']");
	
	public static By ClickAddToCartButtonElement = By.xpath("//div[@class='button-container']/a[@data-id-product='1']/span");
	
	public static By ClickContinueShoppingButtonEle = By.xpath("//div[@class='clearfix']//div//span[@title='Continue shopping']"); 
	
	// Blouse
	
	public static By HoverButtonElement2 = By.xpath("//div[@class='product-container']/div/div/a[@title='Blouse']");
	
	public static By ClickAddToCartButtonOnBlouse = By.xpath("//div[@class='button-container']/a[@data-id-product='2']/span");
	
	
	//Chiffon Printed Dress
	
	public static By HoverButtonOnchiffonDress = By.xpath("//div[@class='product-container']/div/div/a[@title='Printed Chiffon Dress']");
	
	public static By clickAddToCartChiffonDressButtonElement = By.xpath("//div[@class='button-container']/a[@data-id-product='7']");
	

	
	public static By ProductQuntityButtonElement = By.xpath("//div[@class='shopping_cart']//span[@class='ajax_cart_quantity unvisible']");
	
	//Case No.18
	
	public static By HoveronAddedProButtonElement = By.xpath("//div[@class='shopping_cart']//span[@class='ajax_cart_quantity unvisible']");
	public static By BlousevalidateButtonElement = By.xpath("//div[@class='product-name']/a[@title='Blouse']");
	public static By PrintedChiffonButtonElement = By.xpath("//div[@class='product-name']/a[@title='Printed Chiffon Dress']");
	public static By FadedShirtButtonElement = By.xpath("//div[@class='product-name']/a[@title='Faded Short Sleeve T-shirts']");
	
	
	//Case No.19
	
	public static By PrintAllProductOfPrice = By.xpath("//span[@class='price']");
	
	public static By TotalPriceOfProductButton = By.xpath("//span[@class='price cart_block_total ajax_block_cart_total']");
	
	public static By ShippingPriceButtonElement = By.xpath("//div[@class='cart-prices']//div/span");
}
