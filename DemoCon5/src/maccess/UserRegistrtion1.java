package maccess;
import java.util.*;
public class UserRegistrtion1 {

	String userName,passWord,firstName,lastName;
	UserRegistrtion1(String userName,String passWord,String firstName,String lastName, String PassWord, String UserName, String LastName, String FirstName)
	{
		this.userName=userName;
		this.passWord=passWord;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	  public UserRegistrtion1(String uName, String pword, String fName, String lName) {
		// TODO Auto-generated constructor stub
	}

	void getUserDetails()
	{
		System.out.println("====UserRegistrationDetails====");
		System.out.println("UserName:"+userName);
		System.out.println("PassWord:"+passWord);
		System.out.println("FirstName:"+firstName);
		System.out.println("lastName:"+lastName);
		
	}
}
   class DemoCon5
   {
	   public static void main(String [] args) 
	   {
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter The UserName");
		   String uName = s.nextLine();
		   System.out.println("Enter the PassWord");
		   String pword = s.nextLine();
		   System.out.println("Enter the FirstName");
		   String fName = s.nextLine();
		   System.out.println("Enter The LastName");
		   String lName = s.nextLine();
		   
		   UserRegistrtion1 ob = new UserRegistrtion1(uName,pword,fName,lName);
		   ob.getUserDetails();
		   s.close();
	   }
	   
   } 
