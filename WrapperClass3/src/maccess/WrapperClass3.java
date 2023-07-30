package maccess;

public class WrapperClass3 {

	public static void main(String[] args) {
		Integer ob1 = 12;
		Float ob2 = 12.34F;
		Character ob3 = 'A';
		Boolean ob4 =true;
		//Autoboxing process
		int i = ob1;
		float f = ob2;
		char ch = ob3;
		boolean b = ob4;
		System.out.println("====Display the Values====");
        System.out.println("i:"+i);
        System.out.println("f:"+f);
        System.out.println("ch:"+ch);
        System.out.println("b:"+b);
	}

}
