package maccess;

import java.util.Scanner;
import test.*;
public class Palendrome {
	//Palendrome = 454=454 yes 
	//Not Palendrome = 253=352 No

	public static void main(String[] args) {
		
	int n=0, c,r,s=0;
	System.out.println("Enter Any Number:");
	Scanner ref = new Scanner(System.in);
	n = ref.nextInt();
	c=n;
	
	while (n>0) 
	{
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
	
	if(c==s) 
	{
		System.out.println("Palendrome..");
	}else
	{
		System.out.println("Not Palendrome..");
	}
	}
}
