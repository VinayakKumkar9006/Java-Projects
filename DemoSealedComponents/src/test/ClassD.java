package test;

public sealed class ClassD extends PClass implements Itest
permits ClassE{

	public void m5(int d) 
	{
		System.out.println("===m5(d)===");
		System.out.println("The Value of d:"+d);
	}
	
	public void dis(int k) 
	{
		System.out.println("===dis(k)===");
		System.out.println("The Value of k:"+k);
	}
}
