package maccess;
import test.*;
import java.util.Scanner;

public class DemoRecord2 {

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		try(s;){
			try {
		
		System.out.println("Enter the BookCode:");
		String code = s.nextLine();
		System.out.println("Enter the BookName:");
		String name = s.nextLine();
		System.out.println("Enter the BookAuthor:");
		String Author = s.nextLine();
		System.out.println("Enter the BookPrice:");
		float price = s.nextFloat();
		System.out.println("Enter the BookQuantity:");
		int qty = s.nextInt();
	
		BookDetails bd = new BookDetails( code, name , Author, price, qty);
		Display d = new Display();
		d.dis(bd);
        s.close();
        
	} catch (Exception e){
	   System.out.println(e.getMessage());
		}
}// end try with resource
}
}
