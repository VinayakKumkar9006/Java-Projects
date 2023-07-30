package test;

public class Display {

	public Display(int a) 
	{
		System.out.println("===Constructor Body===");
		System.out.println("The Value a:"+a);
	} 
	public void m1(int b) 
	{
		System.out.println("===Instance Method body===");
		System.out.println("The Value b:"+b);
	}
	public static void m2(int c) 
	{
		System.out.println("Static Method Body:");
		System.out.println("The Value c:"+c);
	}
}
