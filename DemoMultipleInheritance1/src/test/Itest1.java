package test;

public interface Itest1 {

	public abstract void m1(int x);
	public static void m2(int y) 
	{
		System.out.println("====Itest1 Static m2(y)====");
		System.out.println("Value of y:"+y);
	}
	public default void m3(int z) 
	{
	  System.out.println("====Itest1 Default m3(z)====");
	  System.out.println("The Value of z:"+z);
	} 
}
