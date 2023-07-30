package test;

public class Access {

	public static IArithmetic getRef(int choice) 
	{
		return switch(choice) 
		{
		 case 1 : yield (int x, int y)->x+y;
		 case 2 : yield (int x, int y)->x-y;
		 case 3 : yield (int x, int y)->x*y;
		 case 4 : yield (int x, int y)->(double)x/y;
		 case 5 : yield (int x, int y)->x%y;
		 default: yield null;
	    };
		
	}
}
