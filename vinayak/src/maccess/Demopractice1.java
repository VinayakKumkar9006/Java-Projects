package maccess;
import java.util.Scanner;
public class Demopractice1 {
	public static void printFactorial(int n) {
		int factorial=1;
		if(n<0) {
		  System.out.println("Invalid number");
		  return;
		}
		for(int i=n;i>=1;i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return;
	}
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		printFactorial(n);
		 
	}

}
