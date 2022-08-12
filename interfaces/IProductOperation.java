package interfaces;
import java.lang.*;
import classes.*;

public interface IProductOperation
{
	void insertProduct(Product p);
	void removeProduct(Product p);
	Product getProduct(String pid);
	void showAllProducts();
	
}