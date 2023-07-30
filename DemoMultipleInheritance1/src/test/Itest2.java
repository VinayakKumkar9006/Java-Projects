package test;

public interface Itest2 {

	public abstract void m1(int x);
	public static void m2(int y) 
	{
		System.out.println("====Itest2 Static m2(y)====");
		System.out.println("The value of y:"+y);
	}
	public default void m33(int z) 
	{
		System.out.println("====Itest2 Default m3(z)====");
		System.out.println("The value of z:"+z);
	}
}
