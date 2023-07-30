package maccess;
import java.util.*;
public class DemoArray2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size Array to hold the String Ojects:");
		int n = Integer.parseInt(s.nextLine());
		String a[] = new String[n];
		System.out.println("Enter the"+n+"String Objects:");
		for(int i=0;i<a.length;i++) 
		{
			a[i] = new String(s.nextLine());//Adding String Objects to Array 
		}
		System.out.println("====Display from Array Using Old for Loop====");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i].toString()+" ");
		}
		System.out.println("\n====Display from Array Using Extended for(Java5)====");
		for(String k:a) 
		{
			System.out.print(k.toString()+" ");
		}
        s.close();
	}

}
