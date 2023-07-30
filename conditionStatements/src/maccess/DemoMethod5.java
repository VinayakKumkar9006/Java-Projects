package maccess;
import java.util.*;
public class DemoMethod5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value 1");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2");
		int v2 = s.nextInt();
		
		if (v1>0 && v2>0) {
			
			if(v1==v2) {
				
				System.out.println("Values are Equal");
			}
			else {
				
				System.out.println("===Choice===");
				System.out.println("1.Greater Value/n2.Smaller Value");
				System.out.println("Enter the Choice");
				int Choice = s.nextInt();
				switch(Choice) {
				      
				case 1:
					GreterValue gv = new GreterValue();
					int r1 = gv.greater(v1,v2);
					 System.out.println("Greater Value:"+r1);
					 break;
					 
				case 2:
					SmallerValue sv = new SmallerValue();
					int r2 = sv.smaller(v1, v2);
					System.out.println("Smaller Value:"+r2);
					break;
				}
			}
		}
		else
		{
			System.out.println("Invalid Values");
		}
		s.close();

	}

}
