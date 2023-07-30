package maccess;
import test.*;
public class DemoAnonymous1 {

	public static void main(String[] args) {
	
		PClass ob = new PClass() 
		{
			public void m1(int x) 
			{
				System.out.println("====CClass m1(x)====");
				System.out.println("The Value x:"+x);
			}
			public void m3(int z) 
			{
				System.out.println("====CClass m3(z)====");
				System.out.println("The Value Z:"+z);
			}
		};
		ob.m1(12);
		ob.m2(14);
		//ob.m3(15); 

	}

}
