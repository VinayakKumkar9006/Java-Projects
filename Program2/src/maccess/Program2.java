package maccess;
import java.util.*;
import test.test;
public class Program2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value 1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2:");
		int v2 = s.nextInt();
		test t = new test();
		int z = t.getGreatest(v1, v2);
		System.out.println("Status:"+z);
		s.close();

	}

}
