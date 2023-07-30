package test;

public non-sealed class ClassA extends PClass implements Itest {

	public void m2(int a) 
	{
		System.out.println("===m2(a)===");
		System.out.println("The Value of a:"+a);
	}
	public void dis(int k) 
	{
		System.out.println("===dis(k)===");
		System.out.println("The Value of k:"+k);
	}
}
