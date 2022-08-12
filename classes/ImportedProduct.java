package classes;
import java.lang.*;

public class ImportedProduct extends Product
{
	//access modifier,dataType,variable name
	private String countryName;
	
	//Setter & Getter Method
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void showInfo()
	{
		System.out.println("Product Name: "+getName());
		System.out.println("Product Pid: "+getPid());
		System.out.println("Product Price: "+getPrice());
		System.out.println("Product Available Quantity: "+getAvailableQuantity());
		System.out.println("Imported Country :"+countryName);
		System.out.println();
	}
}