package Utilities;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
@DataProvider(name = "Subcategorieslist")
	
public static Object[][] subcategories() {
	 		return new Object[][] { 
	        {"Accessories"},
	        {"DIY Fashion"},
	        {"Latest Trends: Western"},
	        {"Latest Trends: Indian"},
	        {"Celebrity Style"}};
	 
	  }


}
