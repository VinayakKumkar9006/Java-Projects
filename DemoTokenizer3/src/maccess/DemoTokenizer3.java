package maccess;
import java.util.*;
public class DemoTokenizer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		StringTokenizer ob = new StringTokenizer(str+" ");
		System.out.println("====Result====");
		while(ob.hasMoreElements()) 
		{
			String tk = ob.nextToken();
			char ch = tk.charAt(0);
			int z = (int)ch;
			if(z>=65 && z<=90 || z>=97 && z<=122) 
			{
			   switch(ch) 
			   {
			    case 'a':
			    case 'A':
			    case 'e':
			    case 'E':
			    case 'i':
			    case 'I':
			    case 'o':
			    case 'O':
			    case 'u':
			    case 'U':
			    	break;
			    default :
			    	StringBuffer sb = new StringBuffer(tk);
			    	System.out.print(sb.reverse()+" ");
			   }
			}
			System.out.print(tk.toString()+" ");
		}
        s.close();
	}

}
