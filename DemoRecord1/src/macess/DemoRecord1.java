package macess;
import java.util.*;
import test.TransLog;
public class DemoRecord1 {

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
				System.out.println("====Log Details====");
				System.out.println("hAccNo:"+ob.hAccNo());
				System.out.println("bAccNo:"+ob.bAccNo());
				System.out.println("Amt:"+ob.amt());
				System.out.println("Date-Time:"+ob.dTime());
		        s.close();
				} catch(Exception e) {e.getMessage();}
			}
			  
			  
			}


	   }


