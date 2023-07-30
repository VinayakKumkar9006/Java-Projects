package maccess;
import java.util.*;
public class Functions{
	//public static int calculateSum(int a, int b) {
	  //  int sum= a+b;
		//return sum;
	public static int calculateproduct(int a, int b) {
		return a * b;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("product of 2 number is:"+calculateproduct(a,b));
				
		s.close();
    

	}

}
