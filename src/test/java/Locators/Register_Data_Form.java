package Locators;

import org.openqa.selenium.By;

public class Register_Data_Form {

	public static By CreateAnAccountButtonElement = By.xpath("//div[@id='noSlide']/h1[contains(text(),'Create an account')]");
	
	public static By MaleGenderButtonElement = By.id("id_gender1");
	
	public static By FirstNameButtonElement = By.id("customer_firstname");
	
	public static By UserLastNameButtonElement = By.id("customer_lastname");
	
	public static By UserPasswordButtonelement = By.id("passwd");
	
	public static By DOBDayDropDownButtonElement = By.id("days");
	
	public static By DOBMonthDropDownButtonElement = By.id("months");
	
	public static By DOBYearDropDownButtonElement = By.id("years");
	
	public static By signUpForNewsLetterCheckBoxButtonElement = By.id("newsletter");
	
	public static By specialOfferEmailRecCheckBoxButtonElement = By.id("optin");
	
//	public static By AddressFirstNameButtonElement = By.id("firstname");

//	public static By AddressLastNameButtonElement = By.id("lastname");
	
	public static By AddressComanyNameButtonElement = By.id("company");
	
	public static By AddressLineFirstButtonElement = By.id("address1");
	
	public static By AddressLineSecondButtonElement = By.id("address2");
	
	public static By AddressCityButtonElement = By.id("city");
	
	public static By AddressStateButttonElement = By.id("id_state");
	
	public static By AddressZipCodeButtonElement = By.id("postcode");
	
	public static By AddressCountryButtonElement = By.id("id_country");
	
	public static By AddressAdditionalInfoButtonElement = By.id("other");
	
	public static By AddressHomePhoneButtonElement = By.id("phone");
	
	public static By AddressMobilePhoneButtonElement = By.id("phone_mobile");
	
	public static By AliasAddressButtonElement = By.id("alias");
	
	public static By registerFormButtonElement = By.id("submitAccount");
}
