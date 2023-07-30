package test;
import java.util.*;
public class Writer {
   public StringBuffer sb=null;
   public Writer(StringBuffer sb)
   {
	   this.sb=sb;
   }
      public void write(Scanner s)
   {
	   System.out.println("Enter the Number of String:");
	   int n = Integer.parseInt(s.nextLine());
	   for(int i=0;i<=n;i++) 
	   {
		   System.out.println("Enter String-"+i);
		   sb.append(s.nextLine()+" : ");
		   System.out.println("String Appended to StringBuffer Succesully");
	   }
   }
}
