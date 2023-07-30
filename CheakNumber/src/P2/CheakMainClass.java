package P2;
import java.util.*;
import P1.*;
public class CheakMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		CheakNumber ob = new CheakNumber();
		boolean b =ob.verify(num);
		if(b) 
		{
		   System.out.println("Even Number");	
		}
		else 
		{
			System.out.println("Odd Number");
		}
        s.close();
	}

}
