package Locators;

import org.openqa.selenium.By;

public class ProductDetails_Locator {
	
	public static By SearchButtonElement = By.id("search_query_top");
	
	public static By ProductListButtonElement = By.xpath("//div[@class='ac_results']//li");
	
	public static By UpperButtonElement = By.xpath("//div[@id='block_top_menu']/ul/li[2]/a");
	
	public static By PriceButtonElement = By.xpath("//ul[@class='product_list grid row']//div[@class='right-block']//span[@class='price product-price']");
	
}
