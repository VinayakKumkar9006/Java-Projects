package maccess;

import java.util.Scanner;

public class ArmStrong {

	
// ArmStrong = 153 = (1*1*1 + 5*5*5 + 3*3*3) = 153
	
	public static void main(String [] args) {
		
	  int n,c,rem,arm=0;
	  System.out.println("Enter Any Number:");
	  Scanner r= new Scanner(System.in);
	  n=r.nextInt();
	  
	  c=n;
	  
	  while(n>0) 
	  {
		  rem=n%10;
		  arm=(rem*rem*rem)+arm;
		  n=n/10;
	  }
	  
	  if(c==arm) {
		  System.out.println("ArmStrong");
	} else 
	{
		System.out.println("Not ArmStrong");
		}
	}
		
}
