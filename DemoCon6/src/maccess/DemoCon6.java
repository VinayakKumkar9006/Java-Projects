package maccess;
import java.util.*;
class Product 
{
	int code;
	String name;
	void getProduct() 
	{
		System.out.println("====ProductDetails====");
		System.out.println("Product Code: "+code);
		System.out.println("Product Name: "+name);
	}
}

public class DemoCon6 {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  Product ob = new Product();
	  System.out.println("Enter the Product Code");
	  ob.code = Integer.parseInt(s.nextLine());
	  System.out.println("Enter the Product Name");
	  ob.name = s.nextLine();
	  ob.getProduct();
	  s.close();

	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
