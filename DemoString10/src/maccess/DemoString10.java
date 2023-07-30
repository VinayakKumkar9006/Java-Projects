package maccess;

public class DemoString10 {

	public static void main(String[] args) {
		String s1 = new String("Hyd");
		String s2 = new String("Hyd");
		System.out.println("****New Oprator Process****");
		if(s1==s2) 
		{
			System.out.println("Strings are Eqaual");
		}else 
		{
			System.out.println("Strings are NOT Equal");
		}
         String s3 = "nit";
         String s4 = "nit";
         System.out.println("****String Literal Process****");
         if(s3==s4) 
         {
        	 System.out.println("Strings are Equal");
         }else 
         {
        	 System.out.println("Strings are Not Equal");
         }
	}

}
