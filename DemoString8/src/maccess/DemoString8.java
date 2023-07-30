package maccess;
import java.util.*;
import test.*;
public class DemoString8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the StuName:");
		String stuName = s.nextLine();
		System.out.println("Enter the Branch(CIVIL/EEE/MECH/ECE/CSE):");
        String stuBranch = s.nextLine();
        CheakBranch cb = new CheakBranch();
        boolean k = cb.verify(stuBranch);
        if(k) 
        {
        	System.out.println("Enter the RollNo:");
        	String rollNo = s.nextLine();
        	if(rollNo.length()==10) 
        	{
        		String brCode =rollNo.substring(6,8);
        		GenerteBranchByCode ob = new GenerteBranchByCode();
        		String gBr = ob.generate(brCode);
        		if(gBr==null) 
        		{
        			System.out.println("Roll no Holding Invalid branch Code");
        		}
        		else 
        		{
        			if(gBr.equals(stuBranch)) 
        			{
        				System.out.println("Enter the 6 sub Marks:");
        				int i=1,totMarks=0;
        				boolean p=false;
        				while(i<=6) 
        				{
        					System.out.println("Enter the Marks Of Sub:"+i);
        					int sub = s.nextInt();
        					if(i<0 && i>100) 
        					{
        						System.out.println("Invalid Marks..");
        						continue;//Skip the below lines from Iteration
        					}
        					if(sub>0 && sub<34) 
        					{
        						p=true;
        					}
        					totMarks=totMarks+sub;
        					i++;
        					
        				}
        				System.out.println("stuName:"+stuName);
        				System.out.println("stuBranch:"+stuBranch);
        				System.out.println("stuRollNo:"+rollNo);
        				System.out.println("TotMarks"+totMarks);
        				float per = (float)totMarks/6;
        				System.out.println("Percentage:"+per);
        				StudentResult sr = new StudentResult();
        				String res = sr.result(per, p);
        				System.out.println("Result:"+res);
        			}
        			else
        			{
        				System.out.println("Roll no Not Matched with the Branch");
        			}
        		}
        		
        	}
        	else 
        	{
        		System.out.println("Invalid RollNo");
        	}
        }
        else 
        {
        	System.out.println("Invalid Branch...");
        }
        s.close();
	}



	}


