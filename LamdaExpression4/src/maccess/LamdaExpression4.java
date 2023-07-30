package maccess;
import test.*;
import java.util.*;
public class LamdaExpression4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value 1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2:");
		int v2 = s.nextInt();
		System.out.println("====Choice====");
		System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.modDiv");
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		IArithmetic ob = Access.getRef(choice);
		if(ob==null) 
		{
			System.out.println("Invalid Choice...");
		}else 
		{
			System.out.println("Result:"+ob.calculate(v1, v2));
		}
        s.close();
	}

}
