package test;

public class pClass {
     public static int k;
     static 
     
     {
    	System.out.println("===pClass Static Block()===");
    	System.out.println("The Value of k:"+k);
     }
     
     {
    	 System.out.println("===pClass Instance Block()===");
    	 System.out.println("The value of k:"+k);
     }
}
