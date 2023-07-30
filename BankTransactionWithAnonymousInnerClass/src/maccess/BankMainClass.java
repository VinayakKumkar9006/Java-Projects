package maccess;
import java.util.*;
import test.*;
public class BankMainClass {
	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int count=0;
    xyz:
    while(true)
    {
     System.out.println("Enter the pinN1234O:");
     int pinNo=s.nextInt();
     PinNoLength pnl = new PinNoLength();
     int len = pnl.length(pinNo);
     
     if(len==4) {
       CheakPinNo cpn = new CheakPinNo();
       boolean k = cpn.verify(pinNo);
       if(k) {
    	   System.out.println("===Choice===");
    	   System.out.println("1.Withdraw\n2.Deposit");
    	   System.out.println("Enter the Choice:");
    	   switch(s.nextInt()) {
    	   case 1:
    		    System.out.println("Enter the amt:");
    		    int a1=s.nextInt();
    		    if(a1>0 && a1%100==0) {
    		     //Anonymous InnerClass as Implementation Class 
    		       Transaction wd = new Transaction() 
    		       {

					@Override
					public void process(int amt) {
						if(amt <=b.bal) 
						{
							System.out.println("Amount WithDrawn:"+amt);
							b.bal =b.bal-amt;
							System.out.println("Balance amount:"+b.getbalance());
							System.out.println("Transaction Completed:");
						}else 
						{
							System.out.println("Insufficient Fund");
						}
						
					}
    		    	   
    		       } ;
    		       
    		      wd.process(a1);
    		  }else {
    			  System.out.println("Invalid amt..");
    		  }
    		    break xyz;//stop loop
    	   case 2:
    		   System.out.println("Enter the amt:");
    		   int a2=s.nextInt();
    		   if(a2>0 && a2%100==0) {
    		   //Anonymous InnerClass as Implementation Class
    			   Transaction dp = new Transaction() {

					@Override
					public void process(int amt) {
					  System.out.println("Amount Deposited:"+amt);
					  b.bal = b.bal+amt;
					  System.out.println("Balance Amount:"+b.getbalance());
					  System.out.println("Transaction Completed..");
					}
    				   
    			   };
    		   dp.process(a2);
    		 }else {
    			 System.out.println("Invalid amt..");
    		 }
    		  break xyz;
    	   default:
    		   System.out.println("Invalid Choice...");
    		   break xyz;
    	   }
    	   }else {
    		   System.out.println("InCorrect pinNo..");
    		   count++;
    	   }
       }else {
    	   System.out.println("Invalid pinNo...");
    	   count++;
       
     }
     if(count==3)
     {
    	 System.out.println("Sorry ! Transaction blocked");
    	 break;//stop the loop
     }

	}
 }
}
