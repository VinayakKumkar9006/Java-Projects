package maccess;
import test.*;
public class DemoSealedComponents {

	public static void main(String[] args) {
		ClassA ob1 = new ClassA();
		ob1.m1(11);
		ob1.m2(12);
		ob1.dis(13);
		ClassB ob2 = new ClassB();
		ob2.m1(25);
		ob2.m3(58);
		ob2.dis(45);
		ClassE ob3 = new ClassE();
		ob3.m1(25);
		ob3.m5(85);
		ob3.m6(78);
		ob3.dis(65);

	}

}
