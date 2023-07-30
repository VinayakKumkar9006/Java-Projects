package maccess;
import java.util.*;
import test.*;
  @SuppressWarnings("serial")
public class DemoException2 extends Exception 
{
	public DemoException2(String msg)
	{
		super(msg);
	}
	

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try 
		{
			System.out.println("Enter the StuName:");
			String sName = s.nextLine();
			System.out.println("Enter the RollNo:");
			String rollNo = s.nextLine();
			if(rollNo.length()!=10) //Exception Condition 
			{
				DemoException2 de = new DemoException2("Invalid rollNo");
				throw de;
			}
			GenerateBranchByCode gb = new GenerateBranchByCode();
			String br = gb.generate(rollNo.substring(6,8));
			if(br ==null)//Exception-Condition 
			{
				DemoException2 de = new DemoException2
						("RollNo Holding Invalid BranchCode");
				throw de;
			}
			System.out.println("Enter the Branch:");
			String branch = s.nextLine().toUpperCase();
			CheakBranch  cb = new CheakBranch();
			boolean k = cb.verify(branch);
			if(!k) //Exception-Condition
			{
				DemoException2 de = new DemoException2
						("Invalid Branch");
				throw de;
			}
			{
				if(!(br.equals(branch))) //Exception-Condition
				{
					DemoException2 de = new DemoException2
							("RollNo Not Matched with Branch:");
					throw de;
				}
				System.out.println("====Details====");
				System.out.println("StuName"+sName);
				System.out.println("RollNo:"+rollNo);
				System.out.println("Branch:"+branch);
			}
			catch(DemoException2 de) 
			{
				System.out.println(de.getMessage());
			}
			
			finally 
			{
				s.close();
			}
			
		}

	


