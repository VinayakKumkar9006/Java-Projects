package maccess;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import test.Product;

public class DemoSet2 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try(s;){
			
			try{
				Set<Product> ob=null;
				String name = null;
				while(true) 
				{
					System.out.println("===Choice===");
					System.out.println("\t1.HashSet<E>"+"\n\t2.LinkedHashSet"+"\n\t3.TreeSet"+"\n\t4.exit");
					System.out.println("Enter the Choice:");
					switch(Integer.parseInt(s.nextLine())) {
					case 1:
					    ob = new HashSet<Product>();
					    name = "HashSet<E>";
					    break;
					case 2:
						ob = new LinkedHashSet<Product>();
						name = "LinkedHashSet<E>";
						break;
					case 3:
						ob = new TreeSet<Product>();
						name = "TreeSet<E>";
						break;
					case 4:
						System.out.println("Set<E> Operation Stopped.");
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice..");
					
					}//End Of Switch
					
					System.out.println("Perform Operations on "+name);
					xyz:
						while(true) {
							
							System.out.println("\n***Choice***");
							System.out.println("\t1.add(E)"
									+ "\n\t2.remove(Object)"+
									"\n\t3.display"+"\n\t4.exit");
							
							System.out.println("Enter the Choice:");
							switch(Integer.parseInt(s.nextLine())) {
							  case 1:
								  System.out.println("Enter the Code");
								  int code = Integer.parseInt(s.nextLine());
								  System.out.println("Enter the Name");
								  String pName = s.nextLine();
								  System.out.println("Enter the Price.");
								  float price = Float.parseFloat(s.nextLine());
								  System.out.println("Enter the Qty");
								  int qty = Integer.parseInt(s.nextLine());
								  ob.add(new Product(code,pName,price,qty));
								  //Adding Element to Set object
								  System.out.println("Product Added..");
								  break;
							  case 2:
								  if(ob.isEmpty()) {
									  System.out.println("<Set> is Empty...");
									  
								  }else {
									   System.out.println("Enter the Product Code Remove Product");
									   Integer code2 = new Integer(Integer.parseInt(s.nextLine()));
									   Iterator<Product> it3 = ob.iterator();
									   while(it3.hasNext()) {
										   Product p = (Product)it3.next();
										   if(p.code== code2) {
											   it3.remove();
											   System.out.println("Product Removed...");
											   break;
											   
										   }
										   
									   }//End Of Loop
								  }
								  break;
							  case 3:
								  if(ob.isEmpty()) {
									  System.out.println("Set<E> is Empty..");
								  }else {
									  System.out.println("===Iterator<E> (old)===");
									  Iterator<Product> it1 = ob.iterator();
									  //creating implementation object for Iterator<E>
									  while(it1.hasNext()) {
										  System.out.println(it1.next()+" ");
									  }//End of Loop
									  System.out.println("\n===Iterator<E>(java 8)===");
									  Iterator<Product> it2 = ob.iterator();
									  it2.forEachRemaining((k)->{
										  System.out.println(k.toString()+" ");
									  });
									  
									  System.out.println("\n===forEach()(java 8)===");
									    ob.forEach((k)->{
									    	System.out.println(k.toString()+" ");
									    });
								  }
								  break;
							  case 4 :
								  System.out.println(name+"Operations Stopped..");
								  break xyz;
								  
							  default :
								  System.out.println("Invalid Choice..");
							}//End Switch
						}//End of While
				}//end of loop
				
			} catch(Exception e) {e.printStackTrace();}
		}//end try with resource
        s.close();
	}

}
