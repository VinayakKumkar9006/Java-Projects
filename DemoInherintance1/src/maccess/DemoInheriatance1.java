package maccess;
import test.*;
public class DemoInheriatance1 {

	public static void main(String[] args) {
		cClass ob = new cClass();//normal inheritance Process
        ob.m1();//instance method
        cClass.m11();//Static Method
        ob.m2();//Instance method
        cClass.m22();//Static method
	}

}
