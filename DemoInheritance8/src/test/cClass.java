package test;

public class cClass extends pClass {
    public void m(int a,int b,int c,int d) 
    {
    	this.m(a, b, c);//method call from the same class 
    	System.out.println("====m(a,b,c,d)====");
    	System.out.println("The value of d:"+d);
    }
    public void m(int a,int b,int c) 
    {
    	super.m(a, b);//method call from the pClass
    	System.out.println("====m(a,b,c)====");
    	System.out.println("The value c:"+c);
    }
}
