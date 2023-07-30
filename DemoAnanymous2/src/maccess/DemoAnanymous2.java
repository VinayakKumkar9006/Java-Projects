package maccess;
import test.*;
public class DemoAnanymous2 {

	public static void main(String[] args) {
		//Anonymous InnerClass as Implementation Class
		Itest ob = new Itest() 
		{
			public void m1(int x) 
			{
				System.out.println("====Implemented m1(x)====");
				System.out.println("The Value x:"+x);
			} 
			public void m3(int z) 
			{
				System.out.println("====Non Implemented m3(z)====");
				System.out.println("The Value z:"+z);
			}
		};
		ob.m1(12);
		ob.m2(14);
		//ob.m3(25);

	}

}
