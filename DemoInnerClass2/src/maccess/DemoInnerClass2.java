package maccess;
import test.*;
import java.util.*;
public class DemoInnerClass2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		int a = s.nextInt();
		System.out.println("Enter the Value of b:");
		int b = s.nextInt();
		System.out.println("Enter the Value of x:");
		int x = s.nextInt();
		System.out.println("Enter the Value of y:");
		int y = s.nextInt();
		
		SubClass1 ob1 = new SubClass1(a,b);//Outer Class
		ob1.m1();//Outer Class Method_Call
		SubClass1.SubClass2 ob2 = ob1.new SubClass2(x,y);
		ob2.m2();//Instance_Method_Call
		SubClass1.SubClass2.m22();//Static Method_Call
        s.close();
	}

}
