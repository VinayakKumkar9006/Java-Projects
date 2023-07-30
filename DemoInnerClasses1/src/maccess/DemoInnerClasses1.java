package maccess;
import test.*;
import java.util.*;
public class DemoInnerClasses1 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the Value a:");
		int a = s.nextInt();
		System.out.println("Enter the Value b:");
		int b = s.nextInt();
		System.out.println("Enter the Value x:");
		int x = s.nextInt();
		System.out.println("Enter the value y:");
		int y = s.nextInt();
		
		SubClass1 ob1 = new SubClass1(a,b);//Outer class object
		ob1.m1();//OuterClass Method_call
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2(x, y);
		//Static Member InnerClass Object
		ob2.m2();//Instance Method_Call
		SubClass1.SubClass2.m22();//Static Method_Call
		
        s.close();
	}

}
