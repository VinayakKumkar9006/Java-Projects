package maccess;
import java.util.*;
public class DemoBuffer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("NIT");
		System.out.println("default Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		System.out.println("Data in Sb :"+sb.toString());
		sb.append("programminglanguage");
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		System.out.println("Data in Sb :"+sb.toString());
		s.close();

	}

}
