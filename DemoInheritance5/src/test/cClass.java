package test;

public class cClass extends pClass{
    public static int z;
    static
    {
    	System.out.println("===cClass Static Block()===");
    	System.out.println("The Value of k:"+k);
    	System.out.println("The Value of z:"+z);
    }
    {
    	System.out.println("===cClass Instance Block()===");
    	System.out.println("The Value Of k:"+k);
    	System.out.println("The Value of z:"+z);
    }
}
