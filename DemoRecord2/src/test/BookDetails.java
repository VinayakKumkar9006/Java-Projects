package test;

public record BookDetails(String code, String name,String Author,float price,int qty) {

	public BookDetails {
		if(price<0) {
			throw new IllegalArgumentException("Invalid Price");
		}
		
		if(qty<0) 
		{
			throw new IllegalArgumentException("Invalid qty");
		}
	}
}
