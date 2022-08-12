package classes;
import interfaces.*;
import java.lang.*;

public abstract class Product implements IQuantity
{
	//access modifier,dataType,variable name
	protected String pid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	//Setter & Getter Method
	public void setPid(String pid)
	{
		this.pid=pid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public String getPid(){return pid;}
	public String getName(){return name;}
	public int getAvailableQuantity(){return availableQuantity;}
	public double getPrice(){return price;}
	
	public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
		   availableQuantity+=amount;
		}
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 &&amount<=availableQuantity)
		{
		   availableQuantity-=amount;
		}
	}
	
}