package test;

public interface Itest {

	public abstract void m1(int x);
	private  void m2(int y) 
	{
		System.out.println("====Private m(y)====");
		System.out.println("The Value of y:"+y);
	}
	private static void m3(int z) //Static Method
	{
		System.out.println("====Private m3(z)====");
		System.out.println("The Value of z:"+z);
	}
	public default void access (int y,int z) //Non Private Method
	{
		this.m2(y);
		Itest.m3(z);
		
	}
}
