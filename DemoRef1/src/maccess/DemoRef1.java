package maccess;
import java.util.*;
import test.*;
public class DemoRef1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		customer ob = new customer(); 
		System.out.println("Enter the CustName:");
		ob.custName = s.nextLine();
		System.out.println("Enter the custId:");
		ob.custId = s.nextLine();
		System.out.println("Enter the custCity: ");
		ob.custCity = s.nextLine();
		System.out.println("Enter the custMailId:");
		ob.ct.mailId = s.nextLine();
		System.out.println("Enter the CustPhoneNo:");
		ob.ct.phNo = s.nextLong();
		System.out.println("====Customer Details====");
		System.out.println(ob.toString());
		
        s.close();
	}

}
