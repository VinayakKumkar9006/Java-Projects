package maccess;

	class Ctest1 {
		
		int k =12;
		Ctest1() {
			
		    System.out.println("====Ctest1====");
			System.out.println("The Value of k: "+k);
			
		}
		void dis(){
			System.out.println("====dis()====");
			System.out.println("The Value of k: "+k);
		}
	}

public class Ctest {

	public static void main(String[] args) {
		Ctest1 ob = new Ctest1();
		ob.dis();
		

	}

}
