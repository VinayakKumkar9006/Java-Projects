package maccess;
import java.util.*;
public class DemoBuffer4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = s.nextLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		String str2 = new String(sb);
		if(str1.equals(str2)) 
		{
			System.out.println("Palendrome String...");
		}else 
		{
			System.out.println("Not Palendrome String...");
		}
		
        s.close();
	}

}
