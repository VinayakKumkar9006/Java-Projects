package maccess;

public class DemoInheritance9 {

	public static void main(String[] args) {
		DemoInheritance9.main(123.45F);
		System.out.println("****Standard main(args[]****)");

		for(String z : args) 
		{
			System.out.println(z.toString());
		}
	}

	private static void main(float k) {
		System.out.println("****Overloded main (k)****");
		System.out.println("The Value of k:"+k);
		
	}

}
