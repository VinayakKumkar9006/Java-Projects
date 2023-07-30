package maccess;
import test.*;
import java.util.Scanner;

public class employeeMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmployeeData ed = new EmployeeData();
		EmployeeAdress ea = new EmployeeAdress();
		EmployeeContact ec = new EmployeeContact();
		System.out.println("Enter the EmpId");
		ed.empId = s.nextLine();
		System.out.println("Enter the Name");
		ed.empName = s.nextLine();
		System.out.println("Enter the Designation");
		ed.empDesg = s.nextLine();
		System.out.println("Enter the Bsal");
		ed.empBsal = Integer.parseInt(s.nextLine());
		System.out.println("Enter the House NO");
		ea.hNo = s.nextInt();
		System.out.println("Enter the Street name");
		ea.sName = s.nextLine();
		System.out.println("Enter the City");
		ea.city = s.nextLine();
		System.out.println("Enter the Pincode");
		ea.pinCode =Integer.parseInt(s.nextLine());
		System.out.println("Phone No");
		ec.phoneNo = Long.parseLong(s.nextLine());
		System.out.println("Enter the mailId");
		ec.mailId = s.nextLine();
		
	ed.getEmployeeData();
	ec.getEmployeeContact();
	ea.getEmployeeAdress();
	s.close();
		

	}

}
