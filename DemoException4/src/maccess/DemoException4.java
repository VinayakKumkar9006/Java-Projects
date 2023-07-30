package maccess;
import java.util.*;
import test.*;
@SuppressWarnings("serial")
public class DemoException4 extends Exception{
	public DemoException4(String msg)
	{
	   super(msg);	
	}
	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int count=0;
    xyz:
    while(true)
    {
    	try
    {
     System.out.println("Enter the pinN1234O:");
     int pinNo=s.nextInt();
     PinNoLength pnl = new PinNoLength();
     int len = pnl.length(pinNo);
     
     if(len!=4) {//Exception Condition
    	 DemoException4 de = new DemoException4("Invalid PinNo");
    	 throw de;
     }
       CheakPinNo cpn = new CheakPinNo();
       boolean k = cpn.verify(pinNo);
       if(!k) {//Exception Condition
    	   DemoException4 de = new DemoException4("Invalid PinNo");
    	   throw de;
       }
    	   System.out.println("===Choice===");
    	   System.out.println("1.Withdraw\n2.Deposit");
    	   System.out.println("Enter the Choice:");
    	   switch(s.nextInt()) {
    	   case 1:
    		    System.out.println("Enter the amt:");
    		    int a1=s.nextInt();
    		    if(a1>0 && a1%100==0) {//Exception Condition
    		      DemoException4 de = new DemoException4("Invalid Amount");
    		      throw de;
    		    }
    		    	  WithDraw wd = new WithDraw("");
    		    	  wd.process(a1);
    		          break xyz;//stop loop
    	   case 2:
    		   System.out.println("Enter the amt:");
    		   int a2=s.nextInt();
    		   if(!(a2>0 && a2%100==0)) {
    			   DemoException4 de = new DemoException4("Invalid Amount");
    			   throw de;
    		   }
    		   Deposit dp = new Deposit();
    		   dp.process(a2);
    		  break xyz;
    	   default:
    		   System.out.println("Invalid Choice...");
    		   break xyz;
    	   }
    }
    	catch(DemoException4 de) 
    	{
    		System.out.println(de.getMessage());
    		if(de.getMessage().equals("Invalid Amount")) 
    		{
    			break;//Stop the loop
    		}
    
     count++;   
     if(count==3)
     {
    	 System.out.println("Sorry ! Transaction blocked");
    	 break;//stop the loop
     }

	}
    	catch(WithDraw ob) 
    	{
    	  System.out.println(ob.getMessage());
    	  break;//stop the loop
    }
    	catch(InputMismatchException ime) 
    	{
    		System.out.println("Only Integer Value");
    		break;//stop loop
    	}
    	
   }//End of loop
    
 }
	
}
