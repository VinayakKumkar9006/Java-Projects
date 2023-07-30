package P2;
import java.util.*;
import P1.*;
public class EmpMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the bSal :");
		int bSal =s.nextInt();
		EmploeeSalary es = new EmploeeSalary();
		float totSal = es.calculateSalary(bSal);
		System.out.println("bsal:"+bSal);
		System.out.println("totSal:"+totSal);
		s.close();

	}

}
