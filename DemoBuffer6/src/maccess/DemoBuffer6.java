package maccess;
import java.util.*;
public class DemoBuffer6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer("NIT-HYD");
		StringBuffer sb2 = new StringBuffer(sb1);
		System.out.println("====Status Of Sb2====");
		System.out.println("Default Capacity:"+sb2.capacity());
		System.out.println("Length of sb2:"+sb2.length());
		sb2.append("-Program");
		System.out.println("Data in sb2:"+sb2.toString());
		s.close();

	}

}
