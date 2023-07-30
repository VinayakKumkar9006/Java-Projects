package test;

public interface Itest {

	public static final int k=100;
	public abstract void m1(int x);
	public static void m2(int y)
	{
		System.out.println("====Static m2(y)====");
		System.out.println("The Value of y:"+y);
		System.out.println("The Value of k:"+k);
	}
	public default void m3(int z) 
	{
		System.out.println("====Default m3(z)====");
		System.out.println("The Value of z:"+z);
		System.out.println("The value of k:"+k);
	}
}
