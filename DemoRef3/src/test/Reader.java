package test;

public class Reader {

	public StringBuffer sb=null;
	public Reader(StringBuffer sb) 
	{
		this.sb=sb;
		
	}
	public void read() 
	{
		System.out.println("====Display from StringBuffer====");
		System.out.println(sb.toString());
	}
}
