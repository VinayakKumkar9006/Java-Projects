package maccess;
import java.util.*;

import test.*;
public class Demomethods7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee Name");
		String empName = s.nextLine();
		System.out.println("Enter the Emp Desg");
		String empDesg = s.nextLine().toUpperCase();
		CheakDesignation cd = new CheakDesignation();
		boolean k =cd.verify(empDesg);
		if(k) {
		
			System.out.println("Enter the empId");
			String empId = s.nextLine();
			int len = empId.length();
			if(len==4) 
			{
				System.out.println("Enter the bsal:");
				int bSal = s.nextInt();
				if(bSal>12000) 
				{
					System.out.println("Enter the HRA:");
					float h =s.nextInt();
					float hra =(h*bSal)/100;
					System.out.println("Enter the DA:");
					float d =s.nextFloat();
					float da =(d*bSal)/100;
					if(hra>0 && da>0) 
					{
						EmpTotalSalary ob = new EmpTotalSalary();
						float totSal =ob.calculate(bSal,hra,da);
						System.out.println("EmpName:"+empName);
						System.out.println("EmpDesg:"+empDesg);
						System.out.println("EmpId:"+empDesg);
						System.out.println("bSal:"+bSal);
						System.out.println("TotalSal:"+totSal);
					}
					else {
						System.out.println("Invalid HRA and DA..");
					}
				} else {
					 System.out.println("Invalid bSal..");
				}
			} else {
				  System.out.println("Invalid EmpId..");
			}
		} else {
			 System.out.println("Invalid Empdesg..");
		}
		s.close();

	}

}
