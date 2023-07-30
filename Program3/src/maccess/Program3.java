package maccess;
import java.util.*;
import test.test;
public class Program3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the Value ");
		int v = s.nextInt();
		test t = new test();
		int z = t.oddRounder(v);
		System.out.println("Status:"+z);
		s.close();

	}

}
