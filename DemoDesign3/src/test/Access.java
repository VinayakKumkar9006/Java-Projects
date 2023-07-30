package test;

public class Access {

	public static Itest getRef() 
	{
		//LamdaExpression
		return (int x)->
		
		    {
				System.out.println("====m1(x)====");
				System.out.println("x:"+x);	
			};
		
	}//OuterClass Method
}//OuterClass
