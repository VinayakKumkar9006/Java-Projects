package maccess;

public class WrapperClass2 {
 @SuppressWarnings("removal")
	public static void main(String[] args) {
		//Boxing Process
	   Integer ob1 = new Integer(12);
	   Integer ob2 = new Integer(13);
	   Float ob3 = new Float(12.34F);
	   Float ob4 = new Float(234.56);
	   Float ob5 = new Float("11.23F");
	   Character ob6 = new Character('A');
	   Boolean ob7 = new Boolean(true);
	   Boolean ob8 = new Boolean(true);
	   //unboxing Process
	   int i1 = ob1.intValue();
	   int i2 = Integer.parseInt(ob2.toString());
	   float f1 = ob3.floatValue();
	   double d = ob4.doubleValue();
	   float f3 = Float.parseFloat(ob5.toString());
	   char ch = ob6.charValue();
	   boolean b1 = ob7.booleanValue();
	   boolean b2 = Boolean.parseBoolean(ob8.toString());
	   System.out.println("=====Display the Values====");
	   System.out.println("i1:"+i1);
	   System.out.println("i2:"+i2);
	   System.out.println("f1:"+f1);
	   System.out.println("d:"+d);
	   System.out.println("f3:"+f3);
	   System.out.println("ch:"+ch);
	   System.out.println("b1:"+b1);
	   System.out.println("b2:"+b2);
	   
	   

	}

}
