package test;
public class CheakDesignation {
	
	public boolean verify(String empDesg){
		 return switch(empDesg){
		     
		 case"SE":yield true;
		 case"TE":yield true;
		 case"ME":yield true;
		 default :yield false;
		    	 
			 
		};
	}

}
