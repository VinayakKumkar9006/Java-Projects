package maccess;
import java.util.*;
public class DemoTokenizer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		StringTokenizer ob = new StringTokenizer(str,"");
		System.out.println("====Result====");
		while(ob.hasMoreTokens())
		{
			String tk = ob.nextToken();
			StringBuffer sb = new StringBuffer(tk);
			System.out.println(sb.reverse()+" ");
		}
        s.close();
	}

}
