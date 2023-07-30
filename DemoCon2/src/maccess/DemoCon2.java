package maccess;

class Ctest{
	
	Ctest(){
		
		System.out.println("====Ctest2()====");
		return;
	}
	
	{
		System.out.println("===Instance Block()===");
	}
	
	static 
	{
		System.out.println("===Static Block===");
	}
}
public class DemoCon2 {

	public static void main(String[] args) {
		Ctest ob = new Ctest();

	}

}
