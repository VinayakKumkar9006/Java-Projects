package test;

public class customer {
  public String custName,custId,custCity;
  public contact ct = new contact();
  public String toString() 
  {
	  return custName+"\t"+custId+"\t"+custCity+ct.mailId+
			  "\t"+ct.phNo;
  }
}
