package maccess;

class Btest {
	
	int a = 10;
	static int b =20;
	
	{
	    a++;
	    b++;
	
	   System.out.println("====Instance Block()====");
	   System.out.println("The Value of a"+a);
	   System.out.println("The Value Of b"+b);
	}
	
}

public class DemoBlock3 {

	public static void main(String[] args) {
		
		Btest ob1 = new Btest();
		Btest ob2 = new Btest();

	}

}
