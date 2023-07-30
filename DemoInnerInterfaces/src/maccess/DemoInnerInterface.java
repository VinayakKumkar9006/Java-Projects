package maccess;

import test.AClass;
import test.Itest;
import test.SubClass;

public class DemoInnerInterface {

	public static void main(String[] args) {
		System.out.println("Interface in Class");
		SubClass.Itest2 ob2 = (int x)->
		{
			System.out.println("====m2(x)====");
			System.out.println("The Value x:"+x);
		};
        ob2.m2(11);
        
        SubClass.Itest22 ob22 = (int y)->
        {
        	System.out.println("====m22(y)====");
        	System.out.println("The Value y:"+y);
        };
        ob22.m22(12);
        
        System.out.println("Interface in Interface");
        Itest.Itest3 ob3 = (int p)->
        {
        	System.out.println("====m3(p)====");
        	System.out.println("The Value p:"+p);
        };
        ob3.m3(13);
        
        System.out.println("Interface in Abstract Class");
        AClass.Itest4 ob4 = (int a)->
        {
        	System.out.println("====m4(a)====");
        	System.out.println("The Value a:"+a);
        };
        ob4.m4(14);
        AClass.Itest44 ob44 =(int b)->
        {
        	System.out.println("====m44(b)====");
        	System.out.println("The Value b:"+b);
        };
        ob44.m44(15);
        
        
	}

}
