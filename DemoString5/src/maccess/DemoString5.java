package maccess;
import java.util.*;
public class DemoString5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		int len = str.length();
		int acount =0; int vcount = 0;
		for(int i=0;i<=len-1;i++) 
		{
			char ch = str.charAt(i);
			switch(ch) 
			{
			   case 'a':
			   case 'A': vcount++;
			   break;
			   case 'e':
			   case 'E': vcount++;
			   break;
			   case 'i':
			   case 'I':vcount++;
			   break;
			   case 'o':
			   case 'O': vcount++;
			   break;
			   case 'u':
			   case 'U': vcount++;
			}//end of Switch
			int k = (int)ch;//char to ASCII
			if((k>=65 && k<=90)  || (k>=97 && k<=122)) 
			{
				acount++;
			}
			
		}// end of loop
		System.out.println("Count Of Alphabates:"+acount);
		System.out.println("Count Of Vowels:"+vcount);
		System.out.println("Count of Consonents:"+(acount-vcount));
		s.close();

	}

}
