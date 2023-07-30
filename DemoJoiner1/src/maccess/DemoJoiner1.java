package maccess;
import java.util.*;
public class DemoJoiner1 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		StringJoiner sj1 = new StringJoiner("/");
		sj1.setEmptyValue("User Joining Details not Available");
		System.out.println("Enter the Date:");
		sj1.add(s.nextLine());
		System.out.println("Enter the Month:");
		sj1.add(s.nextLine());
		System.out.println("Enter the year:");
		sj1.add(s.nextLine());
		System.out.println("User DOJ:"+sj1.toString());
		StringJoiner sj2 = new StringJoiner("-");
		System.out.println(sj2.toString());
		System.out.println("****Update User Adress****");
		sj2.setEmptyValue("User Adress is not Available:");
		System.out.println("Enter the City: ");
		sj2.add(s.nextLine());
		System.out.println("Enter the State:");
		sj2.add(s.nextLine());
		System.out.println("Enter the Pincode:");
		sj2.add(s.nextLine());
		System.out.println("User Adress:"+sj2.toString());
		System.out.println("*****After Merging*****");
		sj1.merge(sj2);
		System.out.println("User Details:"+sj1.toString());
	    System.out.println("Length :"+sj1.length());
        s.close();
	}

}
