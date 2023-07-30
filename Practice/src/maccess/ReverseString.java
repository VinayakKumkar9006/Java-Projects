package maccess;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		//Approach 1
		String str;
		System.out.print("Enter the String..");
		Scanner s = new Scanner(System.in);
		String r =s.nextLine();
		
	//Approach 1
		char[] chArr = r.toCharArray();
		for(int i=r.length()-1; i>=0; i--) {
			
			System.out.print(chArr[i]+" ");
		}

		System.out.println();
		
		//Approach 2
		for (int i=r.length()-1; i>=0; i--) {
			
			System.out.print(r.charAt(i)+" ");
		}
		
		System.out.println();
		
		//Approach 3
		StringBuffer sb = new StringBuffer(r);
		System.out.println(sb.reverse()+" ");
		
		//Approach 4
		StringBuilder sbuilder = new StringBuilder(r);
		System.out.println(sbuilder.reverse());
	}
       
}
