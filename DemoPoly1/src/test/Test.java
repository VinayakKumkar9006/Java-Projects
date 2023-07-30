package test;

public class Test {

	private int k=200;
	private static int z=400;
	private Test() {}
	public static Test ob = new Test();
	private void m1() 
	{
		System.out.println("====Instance Private m1()====");
		System.out.println("The value k:"+k);
		System.out.println("The Value z:"+z);
	}
	private static void m2() 
	{
		System.out.println("====Static private m2()====");
		//System.out.println("The Value k:"+k);
		System.out.println("The Value z:"+z);
	}
	public void Access() 
	{
		System.out.println("The Value k:"+k);
		System.out.println("The Value z:"+z);
	    this.m1();
	    Test.m2();
	}
}
