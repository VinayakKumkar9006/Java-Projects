package maccess;
import test.*;
public class DemoMultipleInheritance1 {

	public static void main(String[] args) {
	  Iclass ob = new Iclass();
      ob.m1(12);
      Itest1.m2(13);
      Itest2.m2(15);
      ob.m3(14);
      ob.m33(25);
	}

}
