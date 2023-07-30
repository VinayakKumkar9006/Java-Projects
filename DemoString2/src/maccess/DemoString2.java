package maccess;
import java.util.*;
public class DemoString2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		System.out.println("====Reverse of String====");
		for(int i=len-1;i>=0;i--) 
		{
			char ch = str.charAt(i);
			System.out.print(ch+"");
		}
		s.close();
		

	}

}
