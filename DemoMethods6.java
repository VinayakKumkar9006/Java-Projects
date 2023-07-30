
import java.util.scanner;
class Addition
{
	int add(int x,int y)

	{
		return x+y;
	}
}
class Subtraction
{
    int sub(int x,int y)
	{
		return x*y;
	}
}
class Division
{
	float div(int x,inty)
	{
        return float(x/y);
	}

}
class ModDivision
{
	ModDiv int(int x, int y)
	{
		return x%y;
	}
}
class DemoMethods6
{
	public static void main(string[] args)
	{
		scanner s = new (system.in);
		system.out.println("Enter the int value1:");
		int v1 = s.nextInt();
		if(v1>0 && v2>0)
		{
			system.out.println("****Choice****");
			system.out.println("1.add\n2.sub\n3.mul\n4.div\n5.ModDiv");
			system.out.println("Enter the choice:");
			int choice = s.nextInt();
			switch (choice)
			{

		
			case 1:
				       Addition ad = new Addition();
			     int r1 = ad.add(v1,v2);
				       system.out.println("Sum:"+r1);
				           break;

		    case 2:
					   Subtraction sub = new Subtraction();
				  int r2 = sb.sub(v1,v2);
					   system.out.println("Sub:"+r2);
					       break;

		    case 3:
					   
                       Multiplication Ml = new Multiplication();
			      int r3 = ml.mul(v1,v2);
					   system.out.println("Mul:"+r3);
						   break;

			case 4:

					   Division dv = new Division();
					   float r4 = dv.div(v1,v2);
					   system.out.println("Div:"+r4);
					   break;

			case 5:
				  
			           ModDivision md = new ModDivision();
				       int r5 = md.ModDiv(v1,v2);
					   system.out.println("ModDiv:+r5");
					   break;

					   system.out.println("Invalid Choice...");

			}

			

}

 else
            { 
	                   system.out.println("Invalid Values...");
            }
	}
}


	
