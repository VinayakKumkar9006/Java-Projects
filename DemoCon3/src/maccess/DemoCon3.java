package maccess;
import java.util.*;

class Ctest3
{
	Ctest3(int x,int y,int z)
	{
		System.out.println("====Ctest3(x,y,z)====");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
	
	Ctest3(int x,int y)
	{
		System.out.println("===Ctest3(x,y)===");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	
	Ctest3(int x)
	{
		System.out.println("===Ctest3(x)===");
		System.out.println("x:"+x);
	}
}

public class DemoCon3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of x:");
		int x = s.nextInt();
		System.out.println("Enter the Value of y:");
		int y = s.nextInt();
		System.out.println("Enter the Value of z:");
		int z = s.nextInt();
		System.out.println("====Choice====");
		System.out.println("1.Ctest3(x,y,z)\n2.Ctest3(x,y)\n3.Ctest(z)");
		System.out.println("Enter The Choice:");
		int choice = s.nextInt();
		switch(choice) 
		{
		   case 1:
			   Ctest3 ob1 = new Ctest3(x,y,z);
			   break;
			   
		   case 2:
			   Ctest3 ob2 = new Ctest3(x,y);
			   break;
			   
		   case 3:
			   Ctest3 ob3 = new Ctest3(x);
			   break;
			   
		   default:
			   System.out.println("Invalid Choice");
		}

	}

}
