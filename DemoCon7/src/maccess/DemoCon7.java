package maccess;
import java.util.*;
class BookDetails
{
   int code;
   String name,author;
   void setCode(int code) 
   {
	   this.code = code;
   }
   void setName(String name) 
   {
	   this.name = name;
   }
   void setAuthor(String author) 
   {
	   this.author = author;
   }
   int getCode() 
   {
	   return code;
   }
   String getName() 
   {
	   return name;
   }
   String getAuthor() 
   {
	   return author;
   }
}

public class DemoCon7 {

	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    BookDetails ob = new BookDetails();
	    System.out.println("Enter the BookCode:");
	    int bcode = Integer.parseInt(s.nextLine());
	    ob.setCode(bcode);
	    System.out.println("Enter the BookName:");
	    String bname = s.nextLine();
	    ob.setName(bname);
	    System.out.println("Enter the AuthorName:");
	    String Aname = s.nextLine();
	    ob.setAuthor(Aname);
	    System.out.println("====BookDetails====");
	    System.out.println("Code :"+ob.getCode());
	    System.out.println("Name :"+ob.getName());
	    System.out.println("Autor :"+ob.getAuthor());
	    s.next();

	}

}
