package test;

import java.util.Date;

public record TransLog(long hAccNo,long bAccNo,float amt,Date dTime) {
    public TransLog {
    	
    	if(amt<=0) 
    	{
    		throw new IllegalArgumentException("Invalid Amount");
    	}
    }
}
