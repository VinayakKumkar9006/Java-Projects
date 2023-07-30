package test;

public abstract class AClass {
   public class subclass3 {
	   public void m3(int p) 
	   {
		   System.out.println("===m3(p)===");
		   System.out.println("The Value p:"+p);
	   }
   }//Instance Member InnerClass
   public static class subclass33 {
	   public void m33(int q) {
		   System.out.println("===m33(q)===");
		   System.out.println("The Value q:"+q);
	   }
   }//static member InnerClass
	
}//outer abstract class
