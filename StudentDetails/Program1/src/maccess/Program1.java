package maccess;
import java.util.*;
import test.test;
public class Program1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int v = s.nextInt();
		if(v>0) 
		{
			test t = new test();
			int z = t.isEven(v);
			System.out.println("Status:"+z);
		} else 
		{
			System.out.println("Invalid Value...");
		}
		s.close();

	}

}
