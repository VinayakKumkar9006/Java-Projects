package test;

public interface Itest {

	public static final int k=100;
	public abstract void m1(int x);
	public default void m2(int y) 
	{
		System.out.println("====Default m2(y)====");
		System.out.println("y:"+y);
		System.out.println("k:"+k);
	}
}
