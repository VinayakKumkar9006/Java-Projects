package maccess;

public class DemoCodes {

	public static void main(String[] args) {
		System.out.println("*****UpperCase Letters*****");
		for(int i=65;i<=90;i++) 
		{
			char ch = (char)i;
			System.out.print(ch+"");
		}
		System.out.println("\n*****LowerCase Letters*****");
        for(int i=97;i<=122;i++) 
        {
        	char ch = (char)i;
        	System.out.print(ch+"");
        }
        System.out.println("\n*****Numeric Values*****");
        for(int i=48;i<=57;i++) 
        {
        	char ch = (char)i;
        	System.out.print(ch+"");
        }
	}

}
