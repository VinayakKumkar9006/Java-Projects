package maccess;

class User
{
  String name,mailid;
  void getUserDetails()
  {
	  System.out.println("name" + name);
	  System.out.println("Mailid" + mailid);
  }
	}

public class UserMainClass {

	public static void main(String[] args) 
	{
	  User u = new User();
	  u.name = "Raj";
	  u.mailid = "raj@gmail.com";
	  u.getUserDetails();

	}

}
