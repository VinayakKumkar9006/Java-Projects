package test;

public class SubClass1 {

	public int a;
	public static int b;
	public SubClass1(int a,int b) 
	{
		this.a=a;
		SubClass1.b=b;
	} 
	public void m1 () 
	{
		System.out.println("====OuterClass m1()====");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static class SubClass2 
	{
		public int x;
		public static int y;
		public SubClass2(int x, int y) 
		{
			this.x=x;
			SubClass2.y=y;
		}
		public void m2() 
		{
			System.out.println("****InnerClass Instance m2()****");
			System.out.println("x:"+x);
			System.out.println("y:"+y);
			//System.out.println("a:"+a); Error 
			System.out.println("b:"+b);
		}
		public static void m22() 
		{
			System.out.println("****InnerClass Static m22()****");
			//System.out.println("a:"+a); Error
			System.out.println("b:"+b);
			//System.out.println("x:"+x); Error 
			System.out.println("y:"+y);
		}
	} //Static Member InerClass 
}//Outer class
