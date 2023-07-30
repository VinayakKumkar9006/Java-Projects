package test;

public interface Itest {

	public static class subClass2 
	{
		public static void m2(int x) 
		{
		  	System.out.println("****m2(x)****");
		  	System.out.println("x:"+x);
		}
	}// Static member InnerClass
	
	public default void dis(int y)  
	{
		class subclass22
		{
			public void m22(int y) 
			{
				System.out.println("****m22(y)****");
				System.out.println("y:"+y);
			}
		}//Local InnerClass
		subclass22 ob22 = new subclass22();
		ob22.m22(y);
	
 	}//default method
	}//Outer Interface