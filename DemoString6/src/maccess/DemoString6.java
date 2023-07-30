package maccess;
import java.util.*;
public class DemoString6 {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter the String");
	  String str = s.nextLine();
	  int len = str.length();
	  int sum =0;
	  for(int i=0;i<=len-1;i++) 
	  {
		  char ch = str.charAt(i);
		  int z = (int)ch;// char to ASCII code
		  if(z>=48 && z<=57) 
		  {
			  String s1 = String.valueOf(ch);
			  int k = Integer.parseInt(s1);
			  sum=sum+k;
		  }// end of if
	  }// end of loop
	  
	     System.out.println("Sum of Numbers : "+sum);
	     
	  s.close();

	}

}
