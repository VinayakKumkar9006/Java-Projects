package test;

public class SubClass1 {

	private class SubClass2{
		public void m2(int x) 
		{
			System.out.println("===m2(x)===");
			System.out.println("The Value x:"+x);
		}
	}//private Instance member InnerClass
	   private static class SubClass22{
	   public  void m22(int y) 
	{
		System.out.println("===m22(y)===");
		System.out.println("The Value y:"+y);
	}
	}//private static member InnerClass
	
   public void access(int x, int y) 
   {
	   SubClass2 ob2 = new SubClass2();
	   SubClass22 ob22 = new SubClass22();
	   ob2.m2(x);
	   ob22.m22(y);
   } 
}
