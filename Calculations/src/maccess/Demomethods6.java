package maccess;
import java.util.*;
import test.*;
public class Demomethods6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Value 1");
		int v1 = s.nextInt();
		System.out.println("Enter the Value 2");
		int v2 = s.nextInt();
		
		if(v1>0 && v2>0) {
			
			System.out.println("====Choice====");
			System.out.println("1.add/n2.sub/n3.mul/n4.div/n5.modDiv");
			System.out.println("Enter the Choice");
			int choice = s.nextInt();
			
			switch(choice){
				    
			      case 1:
			    	  Addition ad = new Addition();
			    	  int r1 = ad.add(v1,v2);
			    	  System.out.println("sum:"+r1);
			    	  break;
			    	  
			      case 2:
			    	  Substraction sb = new Substraction();
			    	  int r2 = sb.sub(v1, v2);
			    	  System.out.println("sum"+r2);
			    	  break;
			    	  
			      case 3:
			    	  Multiplication ml = new Multiplication();
			    	  float r3 = ml.mul(v1, v2);
			    	  System.out.println("sum:"+r3);
			    	  break;
			    	  
			      case 4:
			    	  Division dv = new Division();
			    	  float r4 = dv.div(v1, v2);
			    	  System.out.println("sum:"+r4);
			    	  
			      case 5:
			    	  ModDivision md = new ModDivision();
			    	  float r5 = md.modDiv(v1, v2);
			    	  System.out.println("sum:"+r5);
			    	  break;
			    	  
			      default :
			    	  System.out.println("Invalid Choice");
			}
			
			
		} 
		
		else {
			   System.out.println("Invalid Values");
			   s.close();
	
		
		}

	}

}
