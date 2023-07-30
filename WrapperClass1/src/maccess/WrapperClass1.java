package maccess;

public class WrapperClass1 {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing Process
		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer(23);
		Float ob3 = new Float(12.34F);
		Float ob4 = new Float(234.56);
		Float ob5 = new Float("11.23F");
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean(true);
		System.out.println("====Display From Objects====");
		System.out.println("Ob1:"+ob1.toString());
		System.out.println("Ob2:"+ob2.toString());
		System.out.println("Ob3:"+ob3.toString());
		System.out.println("Ob4:"+ob4.toString());
		System.out.println("Ob5:"+ob5.toString());
		System.out.println("Ob6:"+ob6.toString());
		System.out.println("Ob7:"+ob7.toString());
		System.out.println("Ob8:"+ob8.toString());

	}

}
