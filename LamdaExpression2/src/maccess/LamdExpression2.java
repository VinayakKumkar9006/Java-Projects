package maccess;
import test.*;
import java.util.*;
public class LamdExpression2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value 1:");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2:");
		int v2 = s.nextInt();
		System.out.println("====Choice====");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.println("Enter the Choice:");
		switch(s.nextInt()) 
		{
		case 1 :
			//LamdaExpression
			IComparable gv = (int x, int y)->
			{
			  if(x>y) 
			  {
				  return x; 
			  }
			  
			  else {
				  
				  return y;
			  }
			  
			};
			int r1 = gv.compareTo(v1, v2);
			System.out.println("Greater Value:"+r1);
			break;
			
		      
		case 2 :
			//LamdaExpression
			IComparable sm = (int x, int y)->
			{
				if(x<y) 
				{
					return x;
				}else 
				{
					return y;
				}
			};
			int r2 = sm.compareTo(v2, v2);
			System.out.println("Smaller Value:"+r2);
			break;
			
			default :
				System.out.println("====Invlid Choice====");
					
		}//End Of Switch
		
        s.close();
	}

}
