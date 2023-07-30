package maccess;

import java.util.Scanner;

public class RemoveDuplichars {

	public static void main(String[] args) {
		
		String  str;
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String r =s.nextLine();
		
		//Approach 1
		StringBuilder sb = new StringBuilder();
		r.chars().distinct().forEach(c-> sb.append((char)c));
		System.out.println(sb);
		
		//Approach 2
		StringBuilder sb1 = new StringBuilder();
		for(int i=0; i<r.length(); i++) {
			
			char ch = r.charAt(i);
			int idx = r.indexOf(ch, i+1);
			if(idx==-1) {
				sb1.append(ch);
				
			}
		}
        System.out.println(sb1);
	}

}
