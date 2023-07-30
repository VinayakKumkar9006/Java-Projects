package maccess;
import java.util.*;
public class LamdaExpresion5 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n = s.nextInt();
		Integer ob [] = new Integer[n];
		//Array Created To Hold n Integer Objects
		System.out.println("Enter "+n+" Array Elements:");
		for(int i=0;i<ob.length;i++) 
		{
			ob[i] = new Integer(s.nextInt());
			//Adding Integer Objects to Array	
		}//End of Loop
		System.out.println("====Old For Loop====");
		for(int i=0; i<ob.length;i++) 
		{
			System.out.print(ob[i].toString()+" ");
		}
		System.out.println("\n====Extended for (Java5)====");
		for(Integer z : ob) 
		{
			System.out.print(z.toString()+" ");
		}
		System.out.println("\n====Spliterator<T>(Java8)====");
		Spliterator<Integer> sp = Arrays.spliterator(ob);
		sp.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		s.close();

	}

}
