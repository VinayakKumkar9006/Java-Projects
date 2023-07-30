package maccess;
import java.util.*;
import test.TransLog;
public class DemoPoly3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	  try(s;){
		
		try {
				
		System.out.println("Enter the hAccNo:");
		long hAccNo = s.nextLong();
		System.out.println("Enter the bAccNo:");
		long bAccNo = s.nextLong();
		System.out.println("Enter the Amount to be Transsfered");
		float amt = s.nextFloat();
		Date d = new Date();
		TransLog ob = new TransLog(bAccNo, bAccNo, amt, d);
		// Immutable Object
		System.out.println("====Display Details====");
		System.out.println("hAccNo:"+ob.gethAccNo());
		System.out.println("bAccNo:"+ob.getbAccNo());
		System.out.println("Amt:"+ob.getamt());
		System.out.println("Date-Time:"+ob.getdTime());
        s.close();
		} catch(Exception e) {e.printStackTrace();}
	}
	}
}
