package maccess;
import java.util.*;
public class DemoString4 {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the String:");
	   String str = s.nextLine();
	   int len = str.length();
	   int m=0;
	   int z = len-1;//Last Index of Length
	   for (int i=0;i<=len-1;i++) 
	   {
		 char ch1 = str.charAt(i);
		 char ch2 = str.charAt(z);
		 if(ch1==ch2) 
		 {
			 m++;
		 }
		 z--;
	   }
	   if (m==len) 
	   {
		  System.out.println("Palendrome String"); 
	   }
	   else 
	   {
		   System.out.println("Not Palendrome Sring");
	   }
	    
	   
	   s.close();

	}

}
