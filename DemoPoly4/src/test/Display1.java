package test;

public class Display1 {
  
	private static Display1 ob=null;
	private Display1() {}
    static 
    {
    	ob= new Display1();
    } 
    public static Display1 getRef() 
    {
    	return ob;
    }
    public static void dis(int k) 
    {
    	System.out.println("===dis()===");
    	System.out.println("The Value k:"+k);
    }
}
