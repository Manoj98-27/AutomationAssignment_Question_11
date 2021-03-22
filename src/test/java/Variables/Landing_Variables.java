package Variables;

import java.util.ArrayList;

public class Landing_Variables {
	
	public static final String URLRedirection = "http://automationpractice.com/index.php";
	
	public static final String LandingPageTitle = "My Store";
	
	public static final String LogoHeight = "99";
	
	public static final String LogoWidth = "350";
	
	public static ArrayList<String> ProductCategories()
	{
		ArrayList<String> ProCategoryList = new ArrayList<>();
		ProCategoryList.add("WOMEN");
		ProCategoryList.add("DRESSES");
		ProCategoryList.add("T-SHIRTS");
		
		return ProCategoryList;
	}
	
	
}
