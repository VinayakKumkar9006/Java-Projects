package test;

public class StudentResult {
    public String result(float per, boolean p) 
        {
    	if(p) 
    	{
    		return "Fail";
    	}else if(per>=70 && per<=100) 
    	{
    		return "Distinction";
    	} else if(per>=60 && per<=70) 
    	{
    		return "First Class";
    	} else if(per>=50 && per<=60) 
    	{
    		return "Second Class";
    	} else  if(per>=35 && per<=50) 
    	{
    		return "Third Class";
    	}
    	else {
    		
    		return "Fail";
    	}
    }

}


