package maccess;
import java.util.*;
import test.*;
public class DemoInterface2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value 1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2:");
		int v2 = s.nextInt();
		System.out.println("===Choice===");
		System.out.println("1.GreaterValue\n2.Smaller Value");
		System.out.println("Enter the Choice:");
		switch(s.nextInt()) 
		{
		   case 1:
			   GreaterValue gv = new GreaterValue();
			   int r1 = gv.compareTo(v1, v2);
			   System.out.println("Greater Value:"+r1);
			   break;
		   case 2:
			   SmallerValue sv = new SmallerValue();
			   int r2 = sv.compareTo(v1 , v2);
			   System.out.println("Smaller Value:"+sv);
			   break;
			default :
				System.out.println("===Invalid Choice===");
			   
		}//end of choice
		s.close();

	}

}
