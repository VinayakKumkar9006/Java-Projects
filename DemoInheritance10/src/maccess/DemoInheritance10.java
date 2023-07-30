package maccess;
import test.*;
public class DemoInheritance10 {

	public static void main(String[] args) {
		System.out.println("****Generlization Process**** ");
		PClass ob1 = (PClass)new CClass();
		ob1.m1(12);
		ob1.m1(13);
		//ob1.m3(14);
		System.out.println("****Specilzation Process****");
		CClass ob2 = (CClass)new PClass();

	}

}
