package maccess;
import java.util.*;
import test.*;
public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the Number of Customers:");
	    int n = Integer.parseInt(s.nextLine());
	    customer ob[] = new customer[n];
	    System.out.println("Enter the"+n+"Customer Details:");
	    for(int i=0;i<ob.length;i++) 
	    {
	    	System.out.println("Enter customer"+(i+1)+"Details");
	    	ob[i] = new customer();
	    	System.out.println("Enter the CustName:");
	    	ob[i].custName = s.nextLine();
	    	System.out.println("Enter the custId:");
	    	ob[i].custId = s.nextLine();
	    	System.out.println("Enter the custCity:");
	    	ob[i].custCity = s.nextLine();
	    	System.out.println("Enter the CustMailId:");
	    	ob[i].ct.mailId = s.nextLine();
	    	System.out.println("Enter the CustPhoneNo:");
	    	ob[i].ct.phNo = Long.parseLong(s.nextLine());
	    	
	    }
	    System.out.println("====Customer Details====");
	    for(customer k : ob) 
	    {
	    	System.out.println(k.toString());
	    }
        s.close();
	}

}
