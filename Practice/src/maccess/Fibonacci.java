package maccess;

import java.util.Scanner;

public class Fibonacci {
	
	//Fibonacci Series 0,1 = 0+1=1
	                 //1,2 = 1+2=3
	
	public static void main(String[] args) {
	  
		int a=0,b=1,c,term;
		System.out.println("Enter term");
		Scanner r = new Scanner(System.in);
		term= r.nextInt();
		
		for(int i=0; i<=term; i++) {
			System.out.print(a+" ");
		        c=a+b;
		        a=b;
		        b=c;
		}

	}

}
