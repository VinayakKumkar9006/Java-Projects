package p2;
import java.util.Scanner;
import p1.EmployeeSalary;
public class EmpMainClass {
	public static void main(String[]args) {
     Scanner s= new Scanner(System.in);
     System.out.println("Enter the bSal");
     int bSal=s.nextInt();
     EmployeeSalary es = new EmployeeSalary();
     float totSal = es.calculate(bSal);
     System.out.println("BSal:"+bSal);
     System.out.println("TotSal:"+totSal);
     s.close();
     
		
	}

}
