package maccess;

import test.*;

public class DemoInnerClass4 {

	public static void main(String[] args) {
	   System.out.println("===InnerClass in InterFace:===");
	   Itest.subClass2 ob2 = new Itest.subClass2();
	   Itest ob = new Itest() 
	   {
		   //Empty
	   };
         ob.dis(14);//default method call
         
         System.out.println("===InnerClass in Abstract Classes===");
         AClass obb = new AClass() 
         {
        	//Empty 
         };
         AClass.subclass3 ob3 = obb.new subclass3();
         ob3.m3(25);
         AClass.subclass33 ob33 = new AClass.subclass33();
         ob33.m33(85);
	}

}
