package macces;
import java.util.*;
 @SuppressWarnings("serial")
public class DemoExeption1 extends Exception 
{
	 public DemoExeption1 (String msg)
	 {
		 super(msg);
	 }	 

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		try
		{
		System.out.println("Enter the bSal:");
		int bSal = s.nextInt();
		
		if(bSal >12000)
		{
			DemoExeption1 ob = new DemoExeption1("Invalid bSal:");
			throw ob;
		}
		float totSal = bSal + (0.93F * bSal) +(0.63F * bSal);
		System.out.println("BSal :"+bSal);
		System.out.println("TotalSal :"+totSal);
		}
		catch (InputMismatchException ime) 
		{	
		
			System.out.println("Enter only Integer Value:");
		}
		catch (Exception ob) {
		
			System.out.println(ob.getMessage());
		}
		s.close();

	}

}
