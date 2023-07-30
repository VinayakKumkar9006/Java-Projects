package maccess;
import java.util.*;
public class DemoArray1 {
  @SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array size to hold Integer Objects");
		int n = s.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("Enter "+n+"Integer elements");
		for(int i=0;i<a.length;i++) 
		{
			a[i] = new Integer(s.nextInt());
		}
		System.out.println("====Disply From Array using Old For loop====");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i].toString()+" ");
		}
		System.out.println("====Display from array using Extended for(Java 5)");
		for(Integer k : a) 
		{
			System.out.print(k.toString());
		}
         s.close();
	}

}
