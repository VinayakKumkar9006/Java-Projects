package maccess;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class DemoSet1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try {
				Set<Integer> ob = null;
				String name = null;
				while(true) 
				{
					System.out.println("===Choice==");
					System.out.println("\t1.HashSet<E>"+"\n\t2.LinkedHashSet<E>"+
		 			"\n\t3.TreeSet<E>"+"\n\t4.exit");
					System.out.println("Enter the Choice.");
					switch(s.nextInt()) 
					{
					  case 1:
						   ob = new HashSet<Integer>();
						   name = "HashSet<E>";
						   break;
						   
					  case 2:
						  ob = new LinkedHashSet<Integer>();
						  name = "LinkedHashSet<E>";
						  break;
						  
					  case 3:
						  ob = new TreeSet<Integer>();
						  name = "TreeSet<E>";
						  break;
						  
					  case 4:
						  System.out.println("Set<E> Opertaion Stopped");
						  
						  System.exit(0);
						  
					  default:
					
						  System.out.println("Invalid Choice..");
						  
					}
					System.out.println("Perform Operations on "+name);
					xyz:
						while(true) 
						{
							System.out.println("\t1.add(E)"+"\n\t2.remove(Object)"+"\n\t3.Display"+"\n\t4.Exit");
							System.out.println("Enter the Choice.");
							
							switch(s.nextInt()) 
							{
							  case 1:
								  System.out.println("Enter the Element..");
								  ob.add(new Integer(s.nextInt()));
								  //Adding Element to Set<E>
								  System.out.println(ob.toString());
								  break;
							
							  case 2:
								  if(ob.isEmpty()) 
								  {
									  System.out.println("Set<E> is Empty");
								  }else 
								  {
									  System.out.println("Enter the Elements to be Removed ");
									  if(ob.remove(new Integer(s.nextInt()))) 
									  {
										  System.out.println("Element Removed..");
										  System.out.println(ob.toString());
									  }else 
									  {
										  System.out.println("Elements not Available");
									  }
									  
								  }
								  break;
							    case 3:
							    	if(ob.isEmpty()) 
							    	{
							    		System.out.println("Set<E> is Empty");
							    	} else 
							    	{
							    		System.out.println("===Iterator<E> (old)===");
							    		Iterator<Integer> it1 = ob.iterator();
							    		while(it1.hasNext()) 
							    		{
							    			System.out.println(it1.next()+" ");
							    		}//End Of Loop
							    	}
								  System.out.println("\n===Iterator<E> (Java 8)===");
								  Iterator it2 = ob.iterator();
								  it2.forEachRemaining((k)->
								  {
									 System.out.println(k.toString()+" ");
								  });
								  System.out.println("\n===Iterator<E> (Java 8)");
								  ob.forEach((k)->
								  {
									System.out.println(k.toString()+"  ");  
								  });
								  
								  break;
							    case 4:
							    	System.out.println(name+"Operations Stopped...");
							    	break xyz;
							    	default:
							    		System.out.println("Invalid Choice..");
							    	
								  
							}//End of Switch
						}//End of While
					
				}//End of Loop
				
				
			}catch (Exception e) {e.printStackTrace();}
		}//End of Try With Resource

   s.close();
	}

}
