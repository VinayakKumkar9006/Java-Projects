package test;

public sealed class PClass permits ClassA,ClassB,ClassD 
{
 public void m1(int x) 
 {
	 System.out.println("===PClass m(x)===");
	 System.out.println("The Value of x:"+x);
 }
 	
}
