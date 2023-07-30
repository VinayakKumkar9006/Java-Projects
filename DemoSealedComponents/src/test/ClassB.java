package test;

public final class ClassB extends PClass implements Itest {

	public void m3(int b) 
	{
		System.out.println("===ClassB m3(b)===");
		System.out.println("The Value b:"+b);
	}
	
	public void dis(int k)
	{
		System.out.println("===dis(k)===");
		System.out.println("The Value of k:"+k);
	}
}
