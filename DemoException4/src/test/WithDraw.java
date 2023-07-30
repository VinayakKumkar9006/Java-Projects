package test;
public class WithDraw extends Exception implements Transaction {
	public WithDraw(String msg) 
	{
		super(msg);
	}
	
  public void process(int amt) throws WithDraw {
	  try {
	  
    if(amt>b.bal) {
    	WithDraw wd = new WithDraw("Insufficiant Fund");
    	throw wd;
    }
    	b.bal=b.bal-amt;
    	System.out.println("Balance amt:"+b.getbalance());
    	System.out.println("Transaction Completed..");
    }//End of Try
    catch (WithDraw wd)
	  {
    	throw wd;//Exception re-throwing
    }
  }
}
