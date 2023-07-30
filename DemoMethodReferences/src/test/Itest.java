package test;

public interface Itest {

	public abstract void dis(int k);
	public default void m2(int z) {
		System.out.println("====default m2(z)====");
		System.out.println("The Value z:"+z);
	}
	
}
