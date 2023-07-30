package maccess;
import test.test;
public class DemoArray5 {
   @SuppressWarnings("removal")
	public static void main(String[] args) {
		Object o[] = new Object[3];
		o[0] = new Integer(12);//Integer WrapperClass Object
		o[1] = new String("NIT");//String Class Object
		o[2] = new test ("Core Java",1200);//User Defined Class Object
		System.out.println("====Display from Oject Array====");
		for(Object k:o) 
		{
			System.out.println(k.toString());
		}//end of loop
	}

}
