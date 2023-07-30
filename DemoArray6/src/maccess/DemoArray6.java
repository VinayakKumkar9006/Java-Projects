package maccess;
import java.util.*;
public class DemoArray6 {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer ob[][] = new Integer[3][3];
		System.out.println("====Enter 3X3 elements====");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				ob[i][j]= new Integer(s.nextLine());
			}//inner loop
		}//outer loop
		System.out.println("===Disply 3X3 Elements===");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(ob[i][j].toString()+" ");
			}
			System.out.println();
		}//outer loop
		System.out.println("\n===Display 3X3 Elements (extended for)...===");
		for(Integer i[] : ob) 
		{
			for(Integer j : i) 
			{
				System.out.print(j.toString()+" ");
			}//inner loop
			System.out.println();
		}//Outer loop
		s.close();

	}

}
