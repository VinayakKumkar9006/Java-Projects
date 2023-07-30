package maccess;

public class WrapperClass4 {
  @SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer ob1 = 12;
		Integer ob2 = 12;
		Integer ob3 = new Integer(13);
		Integer ob4 = new Integer(13);
		System.out.println(ob1==ob2);
		System.out.println(ob3==ob4);

	}

}
