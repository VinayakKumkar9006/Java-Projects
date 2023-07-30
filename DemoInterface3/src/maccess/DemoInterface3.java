package maccess;
import test.*;
public class DemoInterface3 {

	public static void main(String[] args) {
		IClass ob = new IClass();
        ob.m1(12);//Implements Method Call
       // IClass.m2(15); Error
        Itest.m2(13);//Static Concrete method Call
        
        ob.m3(25);//Default Concrete method Call
	}

}
