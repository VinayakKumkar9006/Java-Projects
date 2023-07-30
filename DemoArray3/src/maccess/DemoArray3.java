package maccess;
import java.util.*;
import test.*;
public class DemoArray3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Products:");
		int n =Integer.parseInt(s.nextLine());
		product ob[] = new product[n];
		System.out.println("Enter the"+n+"Product Details");
		for(int i=0;i<ob.length;i++) 
		{
			System.out.println("****Details of Product:"+(i+1)+"****");
			System.out.println("Enter the Product Name:");
			String pName = s.nextLine();
			System.out.println("Enter the Product Code:");
			String pCode = s.nextLine();
			System.out.println("Enter the Product Price:");
			float pPrice = Float.parseFloat(s.nextLine());
			System.out.println("Enter the Product Qty:");
			int pQty = Integer.parseInt(s.nextLine());
			ob[i] = new product(pCode,pName,pPrice,pQty);
			//Adding objects to the array
		}
		System.out.println("****Product Detils****");
		for(product k:ob) 
		{
			System.out.println(k.toString());
		}
        s.close();
	}

}
