package test;

public class Display2 {

	private static Display2 ob=null;
	private Display2() {}
	public static Display2 getRef() 
	{
		if(ob==null) 
		{
			ob=new Display2();
		}
		return ob;
	    }
	 
	 public static void dis(int k) 
	 {
		 System.out.println("===dis(k)===");
		 System.out.println("The Value of k:"+k);
	 }
}
