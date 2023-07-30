package maccess;
import java.util.*;
public class Demoinput2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name  = s.nextLine();
		System.out.println("Enter the phoneNo:");
		long phoneNo = Long.parseLong(s.nextLine());
		System.out.println("Enter the Email Id:");
		String mailId = s.nextLine();
		System.out.println("Name :"+name);
		System.out.println("PhoneNO :"+phoneNo);
		System.out.println("EmailId :"+mailId);
		s.close();

	}

}
