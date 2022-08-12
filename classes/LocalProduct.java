package classes;
import java.lang.*;

public class LocalProduct extends Product
{
	//access modifier,dataType,variable name
	private double discountRate;
	
	//Setter & Getter Method
	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	
	public void showInfo()
	{
		System.out.println("Product Name: "+getName());
		System.out.println("Product Pid: "+getPid());
		System.out.println("Product Price: "+getPrice());
		System.out.println("Product Available Quantity: "+getAvailableQuantity());
		System.out.println("Discount Rate : "+discountRate);
		System.out.println();
	}
}