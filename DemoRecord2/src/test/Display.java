package test;

public class Display {

	public void dis(BookDetails bd) 
	{
		System.out.println("====Book Details====");
		System.out.println("BookCode:"+bd.code());
		System.out.println("Bookname:"+bd.name());
		System.out.println("BookAuthor:"+bd.Author());
		System.out.println("BookPrice:"+bd.price());
		System.out.println("BookQuantity:"+bd.qty());
	}
}
