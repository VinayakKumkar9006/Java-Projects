package maccess;
import test.*;
public class LamdaExpression {

	public static void main(String[] args) {
		Itest ob = (int x)->
		{
			System.out.println("====Implemented m2(y)====");
			System.out.println("The Value x:"+x);
			System.out.println("The Value K:"+Itest.k);
		};
		ob.m1(12);
		ob.m2(14);

	}

}
