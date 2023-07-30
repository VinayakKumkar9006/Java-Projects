package test;

public class cClass extends pClass {
    static 
    {
    	System.out.println("===cClass Static Block()===");
    }
    
    {
    	System.out.println("===cClass Instance Block()===");
    }
}
