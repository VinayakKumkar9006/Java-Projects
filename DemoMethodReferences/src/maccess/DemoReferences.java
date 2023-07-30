package maccess;
import test.*;
public class DemoReferences {

	public static void main(String[] args) {
		System.out.println("===Reference to Constructor===");
        Itest ob1 = Display :: new;
        ob1.dis(122);
        ob1.m2(900);
        
        System.out.println("====Reference to Instance Method====");
        Display d = new Display(100);
        Itest ob2 = d :: m1;
        ob2.dis(544);
        ob2.m2(855);
        
        System.out.println("===Reference to Static Method===");
        Itest ob3 = Display ::m2;
        ob3.dis(566);
        ob3.m2(522);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
