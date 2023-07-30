package test;

public class SmallerValue implements IComparable {

	public int compareTo(int x, int y) 
	{
		if(x<y) 
		{
			return y;
		}else 
		{
			return x;
		}
	}
}
