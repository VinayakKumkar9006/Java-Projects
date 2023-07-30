package maccess;
import java.util.*;
public class DemoBuffer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		StringBuffer nsb = new StringBuffer();
		StringBuffer osb = new StringBuffer();
		StringBuffer csb = new StringBuffer();
		for (int i=0;i<=len-1;i++) 
		{
			char ch = str.charAt(i);
			int z = (int)ch;
			if(z>=48 && z<=57) 
			{
			  nsb.append(ch+"");	
			}
			else if(z>=65 && z<=90 || z>=97 && z<=122) 
			{
				switch (ch) 
				{
				 case 'a':
			     case 'A':osb.append(ch+"");
			     break;
			     case 'e':
			     case 'E':osb.append(ch+"");
			     break;
			     case 'i':
			     case 'I':osb.append(ch+"");
			     break;
			     case 'o':
			     case 'O':osb.append(ch+"");
			     case 'u':
			     case 'U':osb.append(ch+"");
			     default :csb.append(ch+"");
				}//end of switch
			}//switch of if
		} //end of loop
		System.out.println("Numbers :"+nsb.toString());
		System.out.println("Vowels :"+osb.toString());
		System.out.println("Consonents :"+csb.toString());
        s.close();
	}

}
