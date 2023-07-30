package maccess;
import java.util.*;
public class DemoTokenizer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		System.out.println("Enter the Delimiter(Break Specification):");
		String del = s.nextLine();
		StringTokenizer ob = new StringTokenizer(str,del);
		System.out.println("Number of Tokens:"+ob.countTokens());
		System.out.println("====Display Tokens====");
		while(ob.hasMoreElements()) 
		{
			String tk = ob.nextToken();
			System.out.println(tk);
			System.out.println("Number of Tokens"+ob.countTokens());
		}//end of loop
		s.close();
	}

}
