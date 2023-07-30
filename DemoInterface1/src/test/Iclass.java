package test;

public class Iclass implements Itest{
	public void m1(int x) //implementation Method
	{
		System.out.println("====m1(x)====");
		System.out.println("The Value of X:"+x);
	}
	public void m2(int y)//implementation Method 
	{
		System.out.println("====m2(y)====");
		System.out.println("The Value of Y:"+y);
	}
    public void m3(int z) //Non-Implementation Method
    {
    	System.out.println("====m3(z)====");
    	System.out.println("The value of z:"+z);
    }
}
