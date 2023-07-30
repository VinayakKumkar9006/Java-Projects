package test;
public class WithDraw implements Transaction {
  public void process(int amt) {
    if(amt<=b.bal) {
    	System.out.println("Amt WithDrawn:"+amt);
    	b.bal=b.bal-amt;
    	System.out.println("Balance amt:"+b.getbalance());
    	System.out.println("Transaction Completed..");
    }else {
    	System.out.println("Insufficient Fund...");
    }
  }

}
