package test;

public class pClass {
      public void m(int a, int b) 
      {
    	 this.m(a);
    	 System.out.println("====m(a,b)====");
    	 System.out.println("The Value b:"+b);
      }
      public void m(int a) 
      {
    	  System.out.println("====m(a,b)====");
    	  System.out.println("The value a:"+a);
      }
}
