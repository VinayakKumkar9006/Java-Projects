package test;

public class customer {
  public String custName,custId,custCity;
  public Contact ct = new Contact();
  public String toString() 
  {
	  return custName+"\t"+custId+"\t"+custCity+ct.mailId+
			  "\t"+ct.phNo;
  }
}
