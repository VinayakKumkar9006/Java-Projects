package maccess;
import java.util.*;
import test.*;
public class DemoArray4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Students:");
		int n = Integer.parseInt(s.nextLine());
		student []ob = new student[n];
		System.out.println("Enter the"+n+"Student Details:");
		for(int i=0;i<ob.length;i++) 
		{
			System.out.println("====Student-"+(i+1)+" Details====");
			ob[i]=new student();
			System.out.println("Enter the Name:");
			ob[i].name = s.nextLine();
			System.out.println("Enter the Branch(CIVIL/MECH/EEE/ESE/CSE)");
			ob[i].branch = s.nextLine().toUpperCase();
			CheakBranch cb = new CheakBranch();
		    boolean k = cb.verify(ob[i].branch);
		    if(k)
			{
				System.out.println("Enter the rollNo:");
				ob[i].rollNo = s.nextLine();
				if(ob[i].rollNo.length()==10) 
				{
					GenerateBranchByCode gc = new GenerateBranchByCode();
					String gBr = gc.generate(ob[i].rollNo.substring(6,8));
					if(gBr==null) 
					{
						System.out.println("RollNo Holding Invalid Branch Code");
						i--;
					}else 
					{
						if(gBr.equals(ob[i].branch)) {
						System.out.println("Enter 6 sub Marks:");
						int j=1 , totM=0;
						boolean p=false;
						while(j<6) 
						{
							System.out.println("Enter the Marks of-"+j);
							int sub = Integer.parseInt(s.nextLine());
							if(sub<0 && sub>100) 
							{
								System.out.println("Invalid Marks...");
								continue;
							}else if(sub>=0 && sub<=34) 
							{
								p=true;

							}
							j++;
							totM=totM+sub;
						}//end of loop
						ob[i].totMarks = totM;
						ob[i].per=(float)ob[i].totMarks/6;
						StudentResult sr = new StudentResult();
						ob[i].result = sr.result(totM, p);
						}else
						{
							System.out.println("Roll no not Matched With Branch:");
							i--;
						}
					}
				} else 
				{
					System.out.println("Invalid Roll No:");
					i--;
				}  
				
			} else 
			{
				System.out.println("Invalid Branch...");
				i--;
			}
		}
		System.out.println("===Student Details===");
		for(student c:ob) 
		{
			System.out.println(c.toString());
			
		}
		System.out.println("Enter the Roll no of 6 sub Marks:");
        s.close();
	}

}
