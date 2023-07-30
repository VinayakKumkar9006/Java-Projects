package p2;
import java.util.*;
import p1.BookDetails;
public class MainClass {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the code:");
	 int code = Integer.parseInt(s.nextLine());
	 System.out.println("Enter the Book Name:");
	 String name = s.nextLine();
	 System.out.println("Enter the Author Name:");
	 String author =s.nextLine();
	 
	 BookDetails ob = new BookDetails(code,name, author);
	 ob.getBookDetails();
	 s.close();

	}

}
