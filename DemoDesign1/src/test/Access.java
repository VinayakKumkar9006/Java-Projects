package test;

public class Access {

	public static Itest getRef() 
	{
		class IClass implements Itest
		{

			@Override
			public void m1(int x) {
				System.out.println("====m1(x)====");
				System.out.println("x:"+x);
				
			}//Local InnerClass
			
			
		}
          IClass ob = new IClass();
          return ob;
		
	}//OuterClass Method
}//OuterClass
