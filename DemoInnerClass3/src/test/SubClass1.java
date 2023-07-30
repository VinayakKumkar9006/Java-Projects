package test;

public class SubClass1 {

	public int a = 10;
	public static int b = 20;
	public void m1() 
	{
		class SubClass2{
			
			public void m2() 
			{
				System.out.println("**Local InnerClass Method m2()**");
				System.out.println("a:"+a);
				System.out.println("b:"+b);
			}
		}//Local InnerClass (Instance member InnerClass)
		
		SubClass2 ob2 = new SubClass2();
		ob2.m2();
	} //End of Instance Method
	public static void m11() 
	{
		class SubClass22
		{
			public void m22() 
			{
				System.out.println("***Local Member InnerClass m22()***");
				//System.out.println("a:"+a);
				System.out.println("b:"+b);
			}
		}//Local InnerClass (Static member InnerClass )
		SubClass22 ob22 = new SubClass22();
		ob22.m22();
	}//End of Static method
} //OuterClass  
