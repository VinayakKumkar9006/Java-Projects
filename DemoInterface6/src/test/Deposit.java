package test;
public class Deposit implements Transaction {
	public void process(int amt) {
	System.out.println("Amt deposited:"+amt);
	b.bal=b.bal+amt;
	System.out.println("Balance Amt:"+b.getbalance());
	System.out.println("Transaction Completed..");
	}

}
