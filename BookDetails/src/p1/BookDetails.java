package p1;

public class BookDetails {
   public int code;
    public String name1,author;
   public BookDetails (int code,String name1,String author) 
   {
	   this.code=code;
	   this.name1=name1;
	   this.author=author;
   }
   public void getBookDetails() 
   {
	   System.out.println("====BookDetails====");
	   System.out.println("code:"+code);
	   System.out.println("name:"+name1);
	   System.out.println("author:"+author);
   }
}
