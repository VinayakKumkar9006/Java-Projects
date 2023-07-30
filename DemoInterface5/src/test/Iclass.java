package test;

public class Iclass implements Itest2 {

	public void m1(int x) 
	{
		System.out.println("====m1(x)====");
		System.out.println("The Value of x:"+x);
	}

	@Override
	public void m2(int y) {
		System.out.println("====m2(y)====");
		System.out.println("The Value of y:"+y);
		
	}
}
