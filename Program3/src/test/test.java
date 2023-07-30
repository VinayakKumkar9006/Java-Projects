package test;

public class test {
  public int oddRounder(int n) 
  {
	  if(n<0) return -1;
	  if(n==0) return -2;
	  if (n%2==0) return n;
	  else return(((n/10)+1)*10);
  } 
}
