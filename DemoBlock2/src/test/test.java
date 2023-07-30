package test;

public class test 
{
     public static int z;
     
     static 
     {
    	System.out.println("****Static Block****");
    	System.out.println("The value of z:"+z);
     }
     public static int getvalue() {
    	 return z;
     }
}
