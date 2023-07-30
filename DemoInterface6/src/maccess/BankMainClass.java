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
     System.out.println("Enter the pinNO:");
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
    		      WithDraw wd = new WithDraw();
    		      wd.process(a1);
    		  }else {
    			  System.out.println("Invalid amt..");
    		  }
    		    break xyz;//stop loop
    	   case 2:
    		   System.out.println("Enter the amt:");
    		   int a2=s.nextInt();
    		   if(a2>0 && a2%100==0) {
    		   Deposit dp = new Deposit();
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
