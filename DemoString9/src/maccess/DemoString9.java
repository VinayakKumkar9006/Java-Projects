package maccess;
import java.util.*;
public class DemoString9 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1 = s.nextLine().trim();
		System.out.println("Enter the String 2");
		String s2 = s.nextLine().trim();
		int z = s1.compareToIgnoreCase(s2);
		if(z==0) 
		{
			System.out.println("Strings are Equal");
			
		} else if(z>0) 
		{
			System.out.println("s1 are greater than s2");
		} else if(z<0) 
		{
			System.out.println("s1 are less than s2");
		}
		s.close();

	}

}
