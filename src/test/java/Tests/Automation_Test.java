package Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.Cart_Value_Locator;
import Locators.FinalRegistration_validatin;
import Locators.Image_change_color;
import Locators.LandingPage_Locator;
import Locators.New_LoginPage;
import Locators.ProductDetails_Locator;
import Locators.Register_Data_Form;
//import Locators.Landing_Locator_page;
import Locators.SocialMedia;
import Utilities.ElementActions;
import Utilities.Utils;
import Variables.Add_To_Cart_Variables;
import Variables.Landing_Variables;
import Variables.Login_Variables;
import Variables.Product_Validation_assignment;
import Variables.Register_FillData_Form;
import Variables.Sign_up_variable;
import Variables.Social_Media_Variable;


public class Automation_Test {

private static final Properties Price = null;

//	private static final int i = 0;

	WebDriver driver;

	Properties prop;
	Utils utils;
	ElementActions elemementActions;
	WebDriverWait wait;

	@Before
	public void setUp() {
		utils = new Utils();
		prop = utils.init_prop();
		driver = utils.init_driver(prop);
		elemementActions = new ElementActions(driver);
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));

	}
	
	@Ignore
	@Test
	public void redirecturl()
	
		{
			Assert.assertEquals("Url redirection is Does Not Match",Landing_Variables.URLRedirection, elemementActions.doGetcurrentURL());
			System.out.println("Url Redirection is Match");
		}
	@Ignore
	@Test
	public void landingTitlepage()
	{
		Assert.assertEquals("The MY STORE Title is Does Not Match",Landing_Variables.LandingPageTitle, elemementActions.doGetPageTitle());
		System.out.println("The MY STORE Title is Match");
	}
	@Ignore
	@Test
	public void ListofProducts()
	{
		ArrayList<String> ProCategoryList = Landing_Variables.ProductCategories();
		List<WebElement> NewProductCategoryList = elemementActions.getElementsList(LandingPage_Locator.ListButtonElement);
		
		for(int i=0; i<ProCategoryList.size(); i++)
		{
			Assert.assertEquals("Product No"+(i+1)+"is not matching",ProCategoryList.get(i),NewProductCategoryList.get(i).getText());
			System.out.println(NewProductCategoryList.get(i).getText());
		}
		System.out.println("All Category are Displayed");
		
	}
	@Ignore
	@Test
	public void Logo()
	{
		Assert.assertEquals("The logo is Not Displayed",true,elemementActions.doIsDisplayed(LandingPage_Locator.LogoDisplayButtonElement));
		System.out.println("The logo is Displayed");
	}
	
	@Ignore
	@Test
	public void LogoHeight()
	{
		Assert.assertEquals("Logo Height is not Match",Landing_Variables.LogoHeight, elemementActions.getAttributeValue(LandingPage_Locator.LogoHeight_WidthButtonElement,"Height"));
		System.out.println("Logo Height Are Match");
	}
	
	@Ignore
	@Test
	public void LogoWidth()
	{
		Assert.assertEquals("Logo Width is not Match",Landing_Variables.LogoWidth,elemementActions.getAttributeValue(LandingPage_Locator.LogoHeight_WidthButtonElement,"Width"));
		System.out.println("Logo Width is Match");
	}
	
	@Ignore
	@Test
	public void Signup() throws InterruptedException
	{
		elemementActions.doClick(New_LoginPage.SignupButtonElement);
		
		Assert.assertEquals("Page title Does Not Matcch",Sign_up_variable.SignInPage,elemementActions.doGetPageTitle());
		System.out.println("Page Title is Match");
	}
	
	@Ignore
	@Test
	public void NewLogin() throws InterruptedException
	{
		 Signup();
		 
		elemementActions.doSendKeys(New_LoginPage.EmailidButtonElement, Sign_up_variable.LoginWithEmail);
		
		elemementActions.doClick(New_LoginPage.CreateanAccButtonElement);
		
		Assert.assertEquals("\"Create an account\" text is not displayed on register user details page",Register_FillData_Form.CreateAnAccountValidation, elemementActions.doGetText(Register_Data_Form.CreateAnAccountButtonElement));
		
		elemementActions.doClick(Register_Data_Form.MaleGenderButtonElement);
		
		elemementActions.doSendKeys(Register_Data_Form.FirstNameButtonElement,Register_FillData_Form.FirstNameAccVarification);
		
		elemementActions.doSendKeys(Register_Data_Form.UserLastNameButtonElement,Register_FillData_Form.lastNameAccVarification);
		
		elemementActions.doSendKeys(Register_Data_Form.UserPasswordButtonelement,Register_FillData_Form.PasswordAccVarification);
		
		elemementActions.selectByValueFromDropDown(Register_Data_Form.DOBDayDropDownButtonElement, Register_FillData_Form.BirthDayButtonElement);
		
		elemementActions.selectByValueFromDropDown(Register_Data_Form.DOBMonthDropDownButtonElement, Register_FillData_Form.BirthMonthButtonElement);
		
		elemementActions.selectByValueFromDropDown(Register_Data_Form.DOBYearDropDownButtonElement, Register_FillData_Form.BirthYearButtonElement);
		
		if(Register_FillData_Form.SignUpForNewsLetterButtonElement)
		{
			elemementActions.doClick(Register_Data_Form.signUpForNewsLetterCheckBoxButtonElement);
		}
		
		if(Register_FillData_Form.specialOfferEmailButtonElement)
		{
			elemementActions.doClick(Register_Data_Form.specialOfferEmailRecCheckBoxButtonElement);
		}
		
		elemementActions.doSendKeys(Register_Data_Form.AddressComanyNameButtonElement,Register_FillData_Form.AddressComanyName);
		
		elemementActions.doSendKeys(Register_Data_Form. AddressComanyNameButtonElement,Register_FillData_Form.AddressLinefirstButtonName);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressLineFirstButtonElement,Register_FillData_Form.AddressLinefirstButtonName);	
		
		elemementActions.doSendKeys(Register_Data_Form.AddressLineSecondButtonElement,Register_FillData_Form.AddressLinesecondButtonName);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressCityButtonElement,Register_FillData_Form.AddressCityButtonElement);
		
		elemementActions.selectByVisibleTextFromDropDown(Register_Data_Form.AddressStateButttonElement,Register_FillData_Form.AddressStateButtonElement);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressZipCodeButtonElement,Register_FillData_Form.AddressZipCodeButtonElement);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressAdditionalInfoButtonElement,Register_FillData_Form.AddressAdditionalInfoButtonElement);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressHomePhoneButtonElement,Register_FillData_Form.AddressHomePhone);
		
		elemementActions.doSendKeys(Register_Data_Form.AddressMobilePhoneButtonElement,Register_FillData_Form.AddressMobilePhone);
		
		elemementActions.doSendKeys(Register_Data_Form.AliasAddressButtonElement,Register_FillData_Form.AdddressAliasAddress);
		
		elemementActions.doClick(Register_Data_Form.registerFormButtonElement);
		
		elemementActions.waitForElementVisible(FinalRegistration_validatin.AvalidationpageButtonElement);
		
		Assert.assertEquals("The Registration Name and Account User Name is Not Same",Register_Data_Form.FirstNameButtonElement+" "+ Register_Data_Form.UserLastNameButtonElement,
				elemementActions.doGetText(FinalRegistration_validatin.AvalidationpageButtonElement));
		
		System.out.println("Registration Successfull"+ Register_Data_Form.FirstNameButtonElement +" "+ Register_Data_Form.UserLastNameButtonElement);
		
		System.out.println("All Test Are Successfully Passed");
		
	}
	
	@Ignore
	@Test
	public void ProductList()
	{
		int Dress = 0;
		
		elemementActions.waitForElementClickable(ProductDetails_Locator.SearchButtonElement);
		
		elemementActions.doSendKeys(ProductDetails_Locator.SearchButtonElement,Product_Validation_assignment.ProductSearchButtonElement);
		
		List <WebElement> SearchListofProduct = elemementActions.getElementsList(ProductDetails_Locator.ProductListButtonElement);
		
		for(int i = 0; i<SearchListofProduct.size();i++)
		{
			
			System.out.println((i+1)+SearchListofProduct.get(i).getText());
			 if(SearchListofProduct.get(i).getText().contains("Dress"))
			 {
				Dress++; 
			 }
		}
		
		
		 System.out.println("Total Dress product : " + Dress); 
		 Assert.assertEquals("Product List is does not match",Dress,5);
		 System.out.println("Product list is match");
	}
	
	@Ignore
	@Test
	public void Uppercase() throws InterruptedException
	{
		String TextToBeClicked = "Dress";
		
		elemementActions.doClick(ProductDetails_Locator.UpperButtonElement);
		
		Assert.assertEquals("Category Name is not in upper case","DRESSES",elemementActions.doGetText(ProductDetails_Locator.UpperButtonElement));
		System.out.println("Category Name is in upper case");
		
		List <WebElement> Price = elemementActions.getElementsList(ProductDetails_Locator.PriceButtonElement);
		float addition = 0;
		for(int i=0; i<Price.size(); i++)
		{
			System.out.println("All Product " + Price.get(i).getText());
			addition = addition + Float.parseFloat(Price.get(i).getText().substring(1));
		}
		
		System.out.println("Total price : " +TextToBeClicked+"is +-> $" +addition);
		

		Assert.assertEquals("The total price are wrong",152.87);
		System.out.println("The total price are right");

		
	}
	@Ignore
	@Test
	public void Sign_in_userTest() throws InterruptedException 
	{
		elemementActions.doClick(LandingPage_Locator.SigninButtonElement);
//		Thread.sleep(3000);

		elemementActions.doSendKeys(LandingPage_Locator.LoginButtonElement, Login_Variables.Useremail);
//		Thread.sleep(3000);

		elemementActions.doSendKeys(LandingPage_Locator.LoginButtonElementpass, Login_Variables.pass);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.Sign_Up_Button);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.T_shirtButtonElement);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.Hover_ButtonElement);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.MoreButtonElement);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.SendButtonElement);
//		Thread.sleep(3000);

		elemementActions.doSendKeys(LandingPage_Locator.NameButtonElement, Login_Variables.FrdName);
//		Thread.sleep(3000);

		elemementActions.doSendKeys(LandingPage_Locator.EmailButtonElement, Login_Variables.Frdemail);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.SendButtonElem);
//		Thread.sleep(3000);

		elemementActions.doClick(LandingPage_Locator.MsgButtonElement);
//		Thread.sleep(3000);

		Assert.assertEquals("Your message is not match", Login_Variables.Msg,elemementActions.doGetText(LandingPage_Locator.MsgButtonElement));
		System.out.println("YOUR MESSAGE IS MATCH");

		elemementActions.doClick(LandingPage_Locator.OkButtonElement);
//		Thread.sleep(3000);

	}
	
	@Ignore
	@Test
	public void image_using_Color() throws InterruptedException 
	{
		elemementActions.doClick(Image_change_color.TshirtButtonElement);
//		Thread.sleep(3000);

		elemementActions.doClick(Image_change_color.MoveButtonElement);
//		Thread.sleep(3000);

		String redShirt = elemementActions.getAttributeValue(Image_change_color.RedTshirtImg, "src");
		System.out.println(redShirt);
//		Thread.sleep(3000);

		elemementActions.doClick(Image_change_color.Image_change);
//		Thread.sleep(3000);

		String blueShirt = elemementActions.getAttributeValue(Image_change_color.Image_change_check, "src");
		System.out.println(blueShirt);
//		Thread.sleep(3000);

		if (redShirt.equals(blueShirt)) 
		{
			System.out.println("Images are not changed");

		} 
		else
		{
 			System.out.println("Images are Changed");
		}

	}
	
	@Ignore
	@Test
	public void Social_Media_Facebook() throws InterruptedException
	{
		elemementActions.doClick(SocialMedia.FacebookButtonElement);
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		String parentID = it.next();
		String childID = it.next();
		
//		System.out.println("The Parent Window Id is:-"+parentWindowId);
		driver.switchTo().window(childID);
		
		Assert.assertEquals("These Title Is Not Match",Social_Media_Variable.SocialFbIcon,elemementActions.doGetText(SocialMedia.FacebookValidationButton));
		System.out.println("These FaceBook Title is Match");
		
		driver.close();	
		
		driver.switchTo().window(parentID);
		
	}
	
	@Ignore
	@Test
	public void Social_Media_Twitter() throws InterruptedException
	{
		elemementActions.doClick(SocialMedia.TwitterButtonElement);
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		String parentID = it.next();
		String childID = it.next();
		
//		System.out.println("The Parent Window Id is:-"+parentWindowId);
		driver.switchTo().window(childID);
		
		Assert.assertEquals("These Title Is Not Match",Social_Media_Variable.SocialTwitterIcon,elemementActions.doGetText(SocialMedia.TwitterValidationButton));
		System.out.println("These Twitter Title is Match");
		
		driver.close();	
		
		driver.switchTo().window(parentID);
		
	}
	@Ignore
	@Test
	public void Social_Media_Youtube() throws InterruptedException
	{
		elemementActions.doClick(SocialMedia.YoutubeButtonElement);
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		String parentID = it.next();
		String childID = it.next();
		
//		System.out.println("The Parent Window Id is:-"+parentWindowId);
		driver.switchTo().window(childID);
		
		Assert.assertEquals("These Title Is Not Match",Social_Media_Variable.SocialYoutubeIcon,elemementActions.doGetText(SocialMedia.FacebookValidationButton));
		System.out.println("These Twitter Title is Match");
		
		driver.close();	
		
		driver.switchTo().window(parentID);
	}

	@Ignore
	@Test
	public void Subscription() throws InterruptedException
	{
		elemementActions.doSendKeys(SocialMedia.EmailidButtonElement,Social_Media_Variable.SubsciptionEmailid);
		
		elemementActions.doClick(SocialMedia.EmailClickButtonElement);
		
		Assert.assertEquals("The Title Is Not Match", Social_Media_Variable.FinalValidationButton,elemementActions.doGetText(SocialMedia.FinalValidationButtonElement));
		System.out.println("The Title Is Match");
	}
	
//	@Ignore
	@Test
	public void Addtocart() throws InterruptedException
	{
		elemementActions.doMoveToElement(Cart_Value_Locator.HoverButtonElement);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.ClickAddToCartButtonElement);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.ClickContinueShoppingButtonEle);
		Thread.sleep(3000);
		
		elemementActions.doMoveToElement(Cart_Value_Locator.HoverButtonElement2);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.ClickAddToCartButtonOnBlouse);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.ClickContinueShoppingButtonEle);
		Thread.sleep(3000);
		
		elemementActions.doMoveToElement(Cart_Value_Locator.HoverButtonOnchiffonDress);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.clickAddToCartChiffonDressButtonElement);
		Thread.sleep(3000);
		
		elemementActions.doClick(Cart_Value_Locator.ClickContinueShoppingButtonEle);
		Thread.sleep(3000);
		
		Assert.assertEquals("The Product Quantity does Not Match",Add_To_Cart_Variables.CartTotalProductQuantity,elemementActions.doGetText(Cart_Value_Locator.ProductQuntityButtonElement));
				System.out.println("The Total Product Quantity is :- 3");
		
	}
	
//	@Ignore
	@Test
	public void Validate_Cart() throws InterruptedException
	{
		Addtocart();
		
		elemementActions.doMoveToElement(Cart_Value_Locator.HoveronAddedProButtonElement);
//		Thread.sleep(3000);
		
		Assert.assertEquals("The product are not added",Add_To_Cart_Variables.FadedShirtButtonElement,elemementActions.getAttributeValue(Cart_Value_Locator.FadedShirtButtonElement,"title"));
		System.out.println("The product of Faded Shirt are added");
		
		Assert.assertEquals("The product are not added",Add_To_Cart_Variables.PrintedChiffonButtonElement,elemementActions.getAttributeValue(Cart_Value_Locator.PrintedChiffonButtonElement,"title"));
		System.out.println("The product Chiffon Dress are added");
		
		Assert.assertEquals("The product are not added",Add_To_Cart_Variables.BlouseButtonElement,elemementActions.getAttributeValue(Cart_Value_Locator.BlousevalidateButtonElement,"title"));
		System.out.println("The product Blouses are added");
		
	}
	
//	@Ignore
	@Test
	public void  TotalOfProducts() throws InterruptedException
	{
		Addtocart();
		
		float A = 0;
		elemementActions.doMoveToElement(Cart_Value_Locator.HoveronAddedProButtonElement);
		
		List <WebElement> TotalOfProduct = elemementActions.getElementsList(Cart_Value_Locator.PrintAllProductOfPrice);
		
		for(int i = 0; i<TotalOfProduct.size();i++)
		{
			System.out.println((i+1)+TotalOfProduct.get(i).getText());
			
			A = A + Float.parseFloat(TotalOfProduct.get(i).getText().substring(1));
		}
		
		A =  A +  Float.parseFloat(elemementActions.doGetText(Cart_Value_Locator.ShippingPriceButtonElement).substring(1));
		System.out.println(A);
		Assert.assertEquals("The Total Of Product is not match",Add_To_Cart_Variables.TotalPriceofButtonElement,elemementActions.doGetText(Cart_Value_Locator.TotalPriceOfProductButton));
		System.out.println("The Price Is Match Included of shipping Charges");
		
		}
	
	
	
	
	@After
	public void bottom() 
	{
		driver.quit();
	}

}
