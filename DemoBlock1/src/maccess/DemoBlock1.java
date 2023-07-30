package maccess;

public class DemoBlock1 
{
	static int k=200;

	public static void main(String[] args) 
	{
		   System.out.println("****main()@@@@");
		   System.out.println("The value of k:"+k);

	}
	
   static
   {
	   System.out.println("****Static Block***");
	   System.out.println("The Value of K:"+k);
   }

}
