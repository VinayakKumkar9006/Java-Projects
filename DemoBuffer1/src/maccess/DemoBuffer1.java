package maccess;
import java.util.*;
public class DemoBuffer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		System.out.println("=====Status Of Buffer=====");
		System.out.println("Default Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		while(true) 
		{
			System.out.println("*****Choice*****");
			System.out.println("1.append(int)\n2.insert(int,String)\n3.delete(int,int)\n4.reverse()\n5.exit");
			System.out.println("Enter the Choice:");
			switch(Integer.parseInt(s.nextLine())) 
			{
			case 1:
				System.out.println("Enter the data to be added in the Buffer:");
				sb.append(s.nextLine());
				System.out.println("data in sb:"+sb.toString());
				System.out.println("Capacity:"+sb.capacity());
				System.out.println("Length:"+sb.length());
			case 2:
				if(sb.length() != 0) 
				{
					System.out.println("Enter the index where data is added:");
					int index = Integer.parseInt(s.nextLine());
					if(index>=0 && index<sb.length()) 
					{
						System.out.println("Enter the Data to be Inserted:");
						sb.insert(index,s.nextLine());
						System.out.println("Data in Sb:"+sb.toString());
					}else 
					{
						System.out.println("Invalid Index Value: ");
					}
				}else 
				{
					System.out.println("String Buffer is empty: ");
				}
				break;
			case 3:
				if(sb.length() !=0) 
				{
					System.out.println("Enter the Begining Index:");
					int bIndex = Integer.parseInt(s.nextLine());
					 if(bIndex>=0 && bIndex<sb.length()) 
					 {
						 System.out.println("Enter ending Index: ");
					     int eIndex = Integer.parseInt(s.nextLine());
					     if(eIndex>=bIndex && bIndex<sb.length()) 
					     {
					    	sb.delete(eIndex, bIndex);
					    	System.out.println("Data in sb :"+sb.toString());
					     } else 
					     {
					    	 System.out.println("Invalid ending index...");
					     }
					 } else 
					 {
						 System.out.println("Invalid Begineing Index...");
					 }
					
				} else 
				{
					System.out.println("String Buffer is Empty..");
				}
				break;
			case 4:
				if(sb.length() !=0) 
				{
					System.out.println("Data in sb:"+sb.toString());
				} else 
				{
					System.out.println("String Buffer is Empty...");
				}
				break;
			case 5:
				System.out.println("Opertions On Buffer Stoped..");
				System.exit(0);
			default:
				System.out.println("Invalid Choice...");
			}
			s.close();
		}
       
	}
     
}
