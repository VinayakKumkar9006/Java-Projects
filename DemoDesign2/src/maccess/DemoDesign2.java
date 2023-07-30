package maccess;

import test.*;

public class DemoDesign2 {

	public static void main(String[] args) {
	Itest ob = Access.getRef();	
    ob.m1(12);
    ob.m2(25);
	}

}
