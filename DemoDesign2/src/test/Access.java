package test;

public class Access {

	public static Itest getRef() 
	{
		//Anonymous InnerClass as implemented Class
		Itest ob = new Itest()
		{
			@Override
			public void m1(int x) {
				System.out.println("====m1(x)====");
				System.out.println("x:"+x);	
			}
		};
          return ob;
	}//OuterClass Method
}//OuterClass
